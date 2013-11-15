grammar DictParser;
//Extract information from dictionaries


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
    static int i=0;
    public static void main(String[] args) throws Exception{
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
start	:   line+ eof;

comment :   '##' star ARABIC_WORD+ '##';

line	:   UTF8_BOM comment* eol
            |star lemma root* sense1 eol
            |star lemma root* synonym1 eol
            |star lemma root* sense2 eol
            |star lemma root* synonym1 sense1 eol
            |star lemma root* sense1 example eol
            |star lemma root* expr_idiom
            |star lemma root* other eol;

star    :   '*';


lemma   :   lemma_item+ 
            (C_MARK{write(":");})? 
            lemma_item*
            t=(P_MARK|'،'){write("fine lemma "+$t.text);};

lemma_item  : t=ARABIC_WORD{write("lemma "+$t.text);};

glossa      : example? C_MARK? glossa_item+ P_MARK?;
glossa_item : t=ARABIC_WORD{write("primo senso "+$t.text);};

root    : t=root_set{write("root "+$t.text);};
root_set :  OPEN_PAR ARABIC_WORD CLOSED_PAR;

//**************caso del sinonimo unico ********************
synonym1    :   t=synonym1_set{write("synonym "+$t.text);};
synonym1_set    : NUMBER ARABIC_WORD P_MARK;

//**************caso sinonimo con costruzione***************
synonym2    :   t=synonym2_set{write("synonym2_set "+G_OPEN_PAR+$t.text+G_CLOSED_PAR);};
synonym2_set    :   gramm_constr ARABIC_WORD P_MARK;  

//**************caso con rimando ad altro lemma*************
synonym3    :   star ARABIC_WORD+ P_MARK '*ر.*©'; 

gramm_constr    : NUMBER sense_item+ C_MARK;

example_set :   t=example{write("esempio: "+$t.text);};
example     : '"' example_item+ '"';
example_item    : t=ARABIC_WORD{write($t.text);}; 

expr_idiom  :   t=expr_idiom_set{write("idiomatic sentence: "+$t.text);};
expr_idiom_set  :   example C_MARK;

sense1  :   gramm_constr P_MARK;
sense2  :   gramm_constr sense_item+ P_MARK;
sense3  :   gramm_constr example P_MARK;
sense4  :   expr_idiom C_MARK ARABIC_WORD P_MARK; 
sense_item    :  t=ARABIC_WORD{write($t.text);};

 
other   :   (t=ARABIC_WORD{write("parola "+$t.text);})+
            (t=C_MARK{write("duePunti "+$t.text);})?
            (t=Q_MARK{write("virgolette "+$t.text);})?
            (t=P_MARK{write("fine entrata "+$t.text);})?
            (t=ARABIC_WORD{write("parola "+$t.text);})*
            t=P_MARK{write("fine entrata "+$t.text);};
	

eol	:   NEWLINE{
        i++;
        write(i+"------------");
        };

eof	:   EOF;

//END lines

// START:tokens

fragment A:('A'|'a');fragment B:('B'|'b');fragment C:('C'|'c');fragment D:('D'|'d');fragment E:('E'|'e');fragment F:('F'|'f');
fragment G:('G'|'g');fragment H:('H'|'h');fragment I:('I'|'i');fragment J:('J'|'j');fragment K:('K'|'k');fragment L:('L'|'l');
fragment M:('M'|'m');fragment N:('N'|'n');fragment O:('O'|'o');fragment P:('P'|'p');fragment Q:('Q'|'q');fragment R:('R'|'r');
fragment S:('S'|'s');fragment T:('T'|'t');fragment U:('U'|'u');fragment V:('V'|'v');fragment W:('W'|'w');fragment X:('X'|'x');
fragment Y:('Y'|'y');fragment Z:('Z'|'z');

fragment LATIN_LETTER
	:	(A|B|C|D|E|F|G|H|I|J|K|L|M|N|O|P|Q|R|S|T|U|V|W|X|Y|Z);
fragment ARABIC_LETTER
        :       '\u060b'..'\u060f'|'\u061b'|'\u061e'..'\u064a'|'\u0660'..'\u06ff';
ARABIC_WORD    :  ARABIC_LETTER+;
P_MARK	:	'.'|'،';
Q_MARK	:	'"'|'\'';
C_MARK  :       ':';

OPEN_PAR    :   '(';
CLOSED_PAR  :   ')';

G_OPEN_PAR  :   '\{';
G_CLOSED_PAR	:   '\}';

DIGIT	:	'0'..'9';	
NUMBER	:	DIGIT '-';
UTF8_BOM    :   '\ufeff';//'ï»¿';
LATIN_WORD:	LATIN_LETTER+;

NEWLINE	: '\n'|'\r'|'\r\n';
WS	:	(' '|('\n')+|'\r\n'){skip();};
ML_COMMENT	:	'/*' (.)+? '*/'{skip();};
// END:tokens
