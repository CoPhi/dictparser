grammar DictParser;

//options{
//backtrack=true;
//k=3;
//}

@lexer::header{
    package eu.himeros.dictparser.resources;
    import org.antlr.v4.runtime.*;
    import java.io.*;
}

@parser::header{
    package eu.himeros.dictparser.resources;
    import org.antlr.v4.runtime.*;
    import java.io.*;
}

@parser::members{
    static FileInputStream fis=null;
    static BufferedWriter bw=null;
    static boolean debug=true;
    public static void main(String[] args) throws Exception{
        //fis=new FileInputStream(new File("../in/w.txt"));
        //bw=new BufferedWriter(new FileWriter("out.txt"));
        fis=new FileInputStream(new File(args[0]));
	bw=new BufferedWriter(new FileWriter("out.txt"));
	ANTLRInputStream input=new ANTLRInputStream(fis);
	DictParserLexer lexer=new DictParserLexer(input);
	CommonTokenStream tokens=new CommonTokenStream(lexer);
	DictParserParser parser=new DictParserParser(tokens);
	parser.start();
	fis.close();
	bw.close();
    }
    private void write(String s){
	try{
		if(debug){
			System.out.println(s);
		}
		bw.write(s);
	}catch(Exception ex){ex.printStackTrace();}
    }
    private void openSlot(){}
    private void closeSlot(){}
}

//START lines
start	:	line+;


line	:	slot+
		|eol;
		
slot	:	
		({write("\n<slot>");}
		partLoc?
		loc?
		fort?
		loc?
		(vel?op)*
		(vel?op|ed greekSeq ed|loc|number|vel?auth)
		pmark?
		loc?
		op*
		vel?auth?
		pmark?
		op?
		{write("\n</slot>");});

op 	:	{openSlot();}
		lpar
		ed
		((t=LATIN_WORD{write("\n unproc="+$t.text);}
		(t=P_MARK{write($t.text);})?
		(t=LATIN_WORD{write(" "+$t.text);})*
		(t=NUMBER{write(" "+$t.text);})?)
		|t=OP_ADD{write("\n opAdd="+$t.text);}
		|t=OP_ADD_LAC{write("\n opAddLac="+$t.text);}
		|t=OP_DEL{write("\n opDel="+$t.text);}
		|t=OP_SUB{write("\n opSub="+$t.text);}
		|t=OP_TRS{write("\n opTrs="+$t.text);})+
		ed
		rpar;

inlineOp:	lpar
		vel?
		(((t=LATIN_WORD{write(" "+$t.text);})
		((t=P_MARK{write($t.text);})?
		(t=LATIN_WORD{write(" "+$t.text);}))*)
		|t=OP_ADD{write("\n opAdd="+$t.text);}
		|t=OP_DEL{write("\n opDel="+$t.text);}
		|t=OP_SUB{write("\n opSub="+$t.text);}
		|t=OP_TRS{write("\n opTrs="+$t.text);})+
		rpar;
	
number	:	lpar
		t=NUMBER {write("\nverseSeq=: "+$t.text);}
		rpar;

inlineNumber:	lpar
		t=NUMBER{write(" "+$t.text);}
		rpar;

eol	:	NEWLINE{write("\n");};

//eof	:

greekSeq:	{openSlot();}
		lpar
		{write("\n greekSeq=");}
		(t=GREEK_SEQ{write(" "+$t.text);})+
		vel*
		rpar;

inlineGreekSeq:	t=GREEK_SEQ{write(" "+$t.text);};

auth	:	lpar
		(t=EDITION{write("\n edition="+$t.text);})?
		(t=LOC{write("\n edition="+$t.text);})?
		t=AUTH{write("\n auth="+$t.text);}
		(t=P_MARK{write("\n pmark="+$t.text);})?
		rpar
		{closeSlot();};

ed	:	lpar
		(t=EDITION{write("\n edition="+$t.text);})?
		(t=P_MARK{write($t.text);})?
		rpar;

partLoc: 	{openSlot();}
		lpar
		t=PART_LOC{write("\n part_loc="+$t.text);}
		rpar;

loc	:	{openSlot();}
		lpar
		t=LOC{write("\n loc="+$t.text);}
		(inlineGreekSeq|inlineNumber)
		rpar
		;

lpar	:	(t=L_PAR {write("\n lpar="+$t.text);})?;

rpar	:	(t=R_PAR {write("\n rpar="+$t.text);})?
		(t=P_MARK {write($t.text);})?;

vel	:	lpar
		t=VEL{write("\n vel="+$t.text);}
		inlineGreekSeq?
		rpar;

velGreek:	lpar
		t=VEL{write("\n vel="+$t.text);}
		inlineGreekSeq
		rpar;

fort	:	{openSlot();}
		lpar
		t=FORT{write("\n fort="+$t.text);}
		rpar;
		
pmark	:	t=P_MARK{write("\n pmark="+$t.text);};



//END lines

// START:tokens

fragment A:('A'|'a');fragment B:('B'|'b');fragment C:('C'|'c');fragment D:('D'|'d');fragment E:('E'|'e');fragment F:('F'|'f');
fragment G:('G'|'g');fragment H:('H'|'h');fragment I:('I'|'i');fragment J:('J'|'j');fragment K:('K'|'k');fragment L:('L'|'l');
fragment M:('M'|'m');fragment N:('N'|'n');fragment O:('O'|'o');fragment P:('P'|'p');fragment Q:('Q'|'q');fragment R:('R'|'r');
fragment S:('S'|'s');fragment T:('T'|'t');fragment U:('U'|'u');fragment V:('V'|'v');fragment W:('W'|'w');fragment X:('X'|'x');
fragment Y:('Y'|'y');fragment Z:('Z'|'z');

fragment LATIN_LETTER
	:	(A|B|C|D|E|F|G|H|I|J|K|L|M|N|O|P|Q|R|S|T|U|V|W|X|Y|Z);
fragment GREEK_LETTER
	:	'-'|'|'|'\u0370'..'\u0386'|'\u0388'..'\u03ff'|'\u1f00'..'\u1fff'|'\u2019'|'&'('a'..'z')+';';
fragment GREEK_WORD
	:	('*'' '?)+|GREEK_LETTER+;
P_MARK	:	','|'.'|';'|'?'|'!'|':'|'\u0387'|Q_MARK;
fragment Q_MARK	:	'"'|'\'';

L_PAR	:	'('|'<'|'['|'\{';
R_PAR	:	')'|'>'|']'|'\}';
//fragment PAREN	:	L_PAR|R_PAR;

VEL	:	(V'el'|V'el potius'|'aut')' ';
L_TAG	:	'<'('a'..'z')+'>';
R_TAG	:	'</'('a'..'z')+'>';
LOC	:	A'nte'|P('ro'|'ost');
PART_LOC:	I'n '('schol'|'hyp')('.'|'a'..'z')*;
FORT	:	F'ort'('.'|'asse');
EDITION	:	O'lim'|P'ostea';
OP_ADD	:	A'dd'('a'..'z')*|I'nser'('a'..'z')*;
OP_ADD_LAC
	:	L'acun'('a'..'z')+(' stat'('a'..'z')*)?;
OP_DEL 	:	((D'el'|E'i''e'?'c')('a'..'z')+)|O'mi'('t'|'s')('a'..'z')+;
OP_SUB	:	S'ub'('a'..'z')+;
OP_TRS	:	T'rans'('a'..'z')+;
GREEK_SEQ
	:	V'ersum'|((GREEK_WORD)+(P_MARK)*' .. '?' '*NEWLINE?)+;
AUTH 	:	('A'..'Z')('.'?' '('A'..'Z')?)*('a'..'z'|'.'|'A'..'Z'|' - '|' et ')*
		|('schol. ')?'re''c'?'c.'
		|'b.'
		|'anon'('.'|'a'..'z')*;
DIGIT	:	'0'..'9';	
NUMBER	:	H'unc v.'|(V'.'' '?)?(DIGIT' et '?'-'?)+('.'|' ')?('sq''q'?'.')?;

LATIN_WORD
	:	LATIN_LETTER+;

NEWLINE	: '\n'|'\r'|'\r\n';
WS	:	(' '|('\n')+|'\r\n'){skip();};
ML_COMMENT	:	'/*' (.)+? '*/'{skip();};
// END:tokens
