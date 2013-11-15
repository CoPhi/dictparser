// Generated from C:\prove_java\dictparser\DictParser/src/eu/himeros/dictparser/resources/DictParser.g4 by ANTLR 4.0

    package eu.himeros.dictparser.resources;
    import org.antlr.v4.runtime.*;
    import java.io.*;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DictParserParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__3=1, T__2=2, T__1=3, T__0=4, ARABIC_WORD=5, P_MARK=6, Q_MARK=7, C_MARK=8, 
		OPEN_PAR=9, CLOSED_PAR=10, DIGIT=11, NUMBER=12, UTF8_BOM=13, LATIN_WORD=14, 
		NEWLINE=15, WS=16, ML_COMMENT=17;
	public static final String[] tokenNames = {
		"<INVALID>", "'،'", "'*'", "'##'", "'\"'", "ARABIC_WORD", "P_MARK", "Q_MARK", 
		"':'", "'('", "')'", "DIGIT", "NUMBER", "'\\ufeff'", "LATIN_WORD", "NEWLINE", 
		"WS", "ML_COMMENT"
	};
	public static final int
		RULE_start = 0, RULE_comment = 1, RULE_line = 2, RULE_star = 3, RULE_lemma = 4, 
		RULE_lemma_item = 5, RULE_example = 6, RULE_example_item = 7, RULE_glossa = 8, 
		RULE_glossa_item = 9, RULE_root = 10, RULE_root_set = 11, RULE_sense = 12, 
		RULE_sense_item = 13, RULE_other = 14, RULE_eol = 15, RULE_eof = 16;
	public static final String[] ruleNames = {
		"start", "comment", "line", "star", "lemma", "lemma_item", "example", 
		"example_item", "glossa", "glossa_item", "root", "root_set", "sense", 
		"sense_item", "other", "eol", "eof"
	};

	@Override
	public String getGrammarFileName() { return "DictParser.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }


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

	public DictParserParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public LineContext line(int i) {
			return getRuleContext(LineContext.class,i);
		}
		public List<LineContext> line() {
			return getRuleContexts(LineContext.class);
		}
		public EofContext eof() {
			return getRuleContext(EofContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DictParserListener ) ((DictParserListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DictParserListener ) ((DictParserListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(34); line();
				}
				}
				setState(37); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==2 || _la==UTF8_BOM );
			setState(39); eof();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CommentContext extends ParserRuleContext {
		public StarContext star() {
			return getRuleContext(StarContext.class,0);
		}
		public List<TerminalNode> ARABIC_WORD() { return getTokens(DictParserParser.ARABIC_WORD); }
		public TerminalNode ARABIC_WORD(int i) {
			return getToken(DictParserParser.ARABIC_WORD, i);
		}
		public CommentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DictParserListener ) ((DictParserListener)listener).enterComment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DictParserListener ) ((DictParserListener)listener).exitComment(this);
		}
	}

	public final CommentContext comment() throws RecognitionException {
		CommentContext _localctx = new CommentContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_comment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41); match(3);
			setState(42); star();
			setState(44); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(43); match(ARABIC_WORD);
				}
				}
				setState(46); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ARABIC_WORD );
			setState(48); match(3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LineContext extends ParserRuleContext {
		public TerminalNode UTF8_BOM() { return getToken(DictParserParser.UTF8_BOM, 0); }
		public LemmaContext lemma() {
			return getRuleContext(LemmaContext.class,0);
		}
		public GlossaContext glossa(int i) {
			return getRuleContext(GlossaContext.class,i);
		}
		public OtherContext other() {
			return getRuleContext(OtherContext.class,0);
		}
		public List<RootContext> root() {
			return getRuleContexts(RootContext.class);
		}
		public StarContext star() {
			return getRuleContext(StarContext.class,0);
		}
		public List<SenseContext> sense() {
			return getRuleContexts(SenseContext.class);
		}
		public RootContext root(int i) {
			return getRuleContext(RootContext.class,i);
		}
		public SenseContext sense(int i) {
			return getRuleContext(SenseContext.class,i);
		}
		public CommentContext comment(int i) {
			return getRuleContext(CommentContext.class,i);
		}
		public List<GlossaContext> glossa() {
			return getRuleContexts(GlossaContext.class);
		}
		public EolContext eol() {
			return getRuleContext(EolContext.class,0);
		}
		public List<CommentContext> comment() {
			return getRuleContexts(CommentContext.class);
		}
		public LineContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_line; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DictParserListener ) ((DictParserListener)listener).enterLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DictParserListener ) ((DictParserListener)listener).exitLine(this);
		}
	}

	public final LineContext line() throws RecognitionException {
		LineContext _localctx = new LineContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_line);
		int _la;
		try {
			int _alt;
			setState(83);
			switch (_input.LA(1)) {
			case UTF8_BOM:
				enterOuterAlt(_localctx, 1);
				{
				setState(50); match(UTF8_BOM);
				setState(54);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==3) {
					{
					{
					setState(51); comment();
					}
					}
					setState(56);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(57); eol();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(58); star();
				setState(59); lemma();
				setState(63);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==OPEN_PAR) {
					{
					{
					setState(60); root();
					}
					}
					setState(65);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(69);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				while ( _alt!=2 && _alt!=-1 ) {
					if ( _alt==1 ) {
						{
						{
						setState(66); glossa();
						}
						} 
					}
					setState(71);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
				}
				setState(75);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==NUMBER) {
					{
					{
					setState(72); sense();
					}
					}
					setState(77);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(79);
				_la = _input.LA(1);
				if (_la==ARABIC_WORD) {
					{
					setState(78); other();
					}
				}

				setState(81); eol();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StarContext extends ParserRuleContext {
		public StarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_star; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DictParserListener ) ((DictParserListener)listener).enterStar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DictParserListener ) ((DictParserListener)listener).exitStar(this);
		}
	}

	public final StarContext star() throws RecognitionException {
		StarContext _localctx = new StarContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_star);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(85); match(2);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LemmaContext extends ParserRuleContext {
		public Token t;
		public TerminalNode P_MARK() { return getToken(DictParserParser.P_MARK, 0); }
		public Lemma_itemContext lemma_item(int i) {
			return getRuleContext(Lemma_itemContext.class,i);
		}
		public List<Lemma_itemContext> lemma_item() {
			return getRuleContexts(Lemma_itemContext.class);
		}
		public TerminalNode C_MARK() { return getToken(DictParserParser.C_MARK, 0); }
		public LemmaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lemma; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DictParserListener ) ((DictParserListener)listener).enterLemma(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DictParserListener ) ((DictParserListener)listener).exitLemma(this);
		}
	}

	public final LemmaContext lemma() throws RecognitionException {
		LemmaContext _localctx = new LemmaContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_lemma);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(88); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(87); lemma_item();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(90); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
			setState(94);
			_la = _input.LA(1);
			if (_la==C_MARK) {
				{
				setState(92); match(C_MARK);
				write(":");
				}
			}

			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ARABIC_WORD) {
				{
				{
				setState(96); lemma_item();
				}
				}
				setState(101);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(102);
			((LemmaContext)_localctx).t = _input.LT(1);
			_la = _input.LA(1);
			if ( !(_la==1 || _la==P_MARK) ) {
				((LemmaContext)_localctx).t = (Token)_errHandler.recoverInline(this);
			}
			consume();
			write("fine lemma "+(((LemmaContext)_localctx).t!=null?((LemmaContext)_localctx).t.getText():null));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Lemma_itemContext extends ParserRuleContext {
		public Token t;
		public TerminalNode ARABIC_WORD() { return getToken(DictParserParser.ARABIC_WORD, 0); }
		public Lemma_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_lemma_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DictParserListener ) ((DictParserListener)listener).enterLemma_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DictParserListener ) ((DictParserListener)listener).exitLemma_item(this);
		}
	}

	public final Lemma_itemContext lemma_item() throws RecognitionException {
		Lemma_itemContext _localctx = new Lemma_itemContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_lemma_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105); ((Lemma_itemContext)_localctx).t = match(ARABIC_WORD);
			write("lemma "+(((Lemma_itemContext)_localctx).t!=null?((Lemma_itemContext)_localctx).t.getText():null));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExampleContext extends ParserRuleContext {
		public Example_itemContext example_item(int i) {
			return getRuleContext(Example_itemContext.class,i);
		}
		public List<Example_itemContext> example_item() {
			return getRuleContexts(Example_itemContext.class);
		}
		public ExampleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_example; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DictParserListener ) ((DictParserListener)listener).enterExample(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DictParserListener ) ((DictParserListener)listener).exitExample(this);
		}
	}

	public final ExampleContext example() throws RecognitionException {
		ExampleContext _localctx = new ExampleContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_example);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(108); match(4);
			write("   esempio: ");
			setState(111); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(110); example_item();
				}
				}
				setState(113); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ARABIC_WORD );
			setState(115); match(4);
			write("   fine esempio ");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Example_itemContext extends ParserRuleContext {
		public Token t;
		public TerminalNode ARABIC_WORD() { return getToken(DictParserParser.ARABIC_WORD, 0); }
		public Example_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_example_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DictParserListener ) ((DictParserListener)listener).enterExample_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DictParserListener ) ((DictParserListener)listener).exitExample_item(this);
		}
	}

	public final Example_itemContext example_item() throws RecognitionException {
		Example_itemContext _localctx = new Example_itemContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_example_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118); ((Example_itemContext)_localctx).t = match(ARABIC_WORD);
			write(".... parola in esempio "+(((Example_itemContext)_localctx).t!=null?((Example_itemContext)_localctx).t.getText():null));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GlossaContext extends ParserRuleContext {
		public TerminalNode P_MARK() { return getToken(DictParserParser.P_MARK, 0); }
		public List<Glossa_itemContext> glossa_item() {
			return getRuleContexts(Glossa_itemContext.class);
		}
		public Glossa_itemContext glossa_item(int i) {
			return getRuleContext(Glossa_itemContext.class,i);
		}
		public ExampleContext example() {
			return getRuleContext(ExampleContext.class,0);
		}
		public TerminalNode C_MARK() { return getToken(DictParserParser.C_MARK, 0); }
		public GlossaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glossa; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DictParserListener ) ((DictParserListener)listener).enterGlossa(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DictParserListener ) ((DictParserListener)listener).exitGlossa(this);
		}
	}

	public final GlossaContext glossa() throws RecognitionException {
		GlossaContext _localctx = new GlossaContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_glossa);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			_la = _input.LA(1);
			if (_la==4) {
				{
				setState(121); example();
				}
			}

			setState(125);
			_la = _input.LA(1);
			if (_la==C_MARK) {
				{
				setState(124); match(C_MARK);
				}
			}

			setState(128); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(127); glossa_item();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(130); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,14,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
			setState(133);
			_la = _input.LA(1);
			if (_la==P_MARK) {
				{
				setState(132); match(P_MARK);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Glossa_itemContext extends ParserRuleContext {
		public Token t;
		public TerminalNode ARABIC_WORD() { return getToken(DictParserParser.ARABIC_WORD, 0); }
		public Glossa_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_glossa_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DictParserListener ) ((DictParserListener)listener).enterGlossa_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DictParserListener ) ((DictParserListener)listener).exitGlossa_item(this);
		}
	}

	public final Glossa_itemContext glossa_item() throws RecognitionException {
		Glossa_itemContext _localctx = new Glossa_itemContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_glossa_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(135); ((Glossa_itemContext)_localctx).t = match(ARABIC_WORD);
			write("primo senso "+(((Glossa_itemContext)_localctx).t!=null?((Glossa_itemContext)_localctx).t.getText():null));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RootContext extends ParserRuleContext {
		public Root_setContext t;
		public Root_setContext root_set() {
			return getRuleContext(Root_setContext.class,0);
		}
		public RootContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DictParserListener ) ((DictParserListener)listener).enterRoot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DictParserListener ) ((DictParserListener)listener).exitRoot(this);
		}
	}

	public final RootContext root() throws RecognitionException {
		RootContext _localctx = new RootContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_root);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(138); ((RootContext)_localctx).t = root_set();
			write("root "+(((RootContext)_localctx).t!=null?_input.getText(((RootContext)_localctx).t.start,((RootContext)_localctx).t.stop):null));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Root_setContext extends ParserRuleContext {
		public TerminalNode ARABIC_WORD() { return getToken(DictParserParser.ARABIC_WORD, 0); }
		public TerminalNode OPEN_PAR() { return getToken(DictParserParser.OPEN_PAR, 0); }
		public TerminalNode CLOSED_PAR() { return getToken(DictParserParser.CLOSED_PAR, 0); }
		public Root_setContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root_set; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DictParserListener ) ((DictParserListener)listener).enterRoot_set(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DictParserListener ) ((DictParserListener)listener).exitRoot_set(this);
		}
	}

	public final Root_setContext root_set() throws RecognitionException {
		Root_setContext _localctx = new Root_setContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_root_set);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(141); match(OPEN_PAR);
			setState(142); match(ARABIC_WORD);
			setState(143); match(CLOSED_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SenseContext extends ParserRuleContext {
		public Token t;
		public TerminalNode Q_MARK() { return getToken(DictParserParser.Q_MARK, 0); }
		public List<TerminalNode> P_MARK() { return getTokens(DictParserParser.P_MARK); }
		public ExampleContext example(int i) {
			return getRuleContext(ExampleContext.class,i);
		}
		public Sense_itemContext sense_item(int i) {
			return getRuleContext(Sense_itemContext.class,i);
		}
		public List<Sense_itemContext> sense_item() {
			return getRuleContexts(Sense_itemContext.class);
		}
		public TerminalNode P_MARK(int i) {
			return getToken(DictParserParser.P_MARK, i);
		}
		public TerminalNode C_MARK(int i) {
			return getToken(DictParserParser.C_MARK, i);
		}
		public List<ExampleContext> example() {
			return getRuleContexts(ExampleContext.class);
		}
		public List<TerminalNode> C_MARK() { return getTokens(DictParserParser.C_MARK); }
		public TerminalNode NUMBER() { return getToken(DictParserParser.NUMBER, 0); }
		public SenseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sense; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DictParserListener ) ((DictParserListener)listener).enterSense(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DictParserListener ) ((DictParserListener)listener).exitSense(this);
		}
	}

	public final SenseContext sense() throws RecognitionException {
		SenseContext _localctx = new SenseContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_sense);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(145); ((SenseContext)_localctx).t = match(NUMBER);
			write((((SenseContext)_localctx).t!=null?((SenseContext)_localctx).t.getText():null)+"  inizio altro senso");
			setState(148); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(147); sense_item();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(150); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,16,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
			setState(154);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				{
				setState(152); ((SenseContext)_localctx).t = match(C_MARK);
				write("--> duePunti "+(((SenseContext)_localctx).t!=null?((SenseContext)_localctx).t.getText():null));
				}
				break;
			}
			setState(158);
			_la = _input.LA(1);
			if (_la==Q_MARK) {
				{
				setState(156); ((SenseContext)_localctx).t = match(Q_MARK);
				write("--> virgolette "+(((SenseContext)_localctx).t!=null?((SenseContext)_localctx).t.getText():null));
				}
			}

			setState(162);
			switch ( getInterpreter().adaptivePredict(_input,19,_ctx) ) {
			case 1:
				{
				setState(160); ((SenseContext)_localctx).t = match(P_MARK);
				write("--> punto "+(((SenseContext)_localctx).t!=null?((SenseContext)_localctx).t.getText():null));
				}
				break;
			}
			setState(167);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ARABIC_WORD) {
				{
				{
				setState(164); sense_item();
				}
				}
				setState(169);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(173);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==4) {
				{
				{
				setState(170); example();
				}
				}
				setState(175);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(178);
			_la = _input.LA(1);
			if (_la==C_MARK) {
				{
				setState(176); ((SenseContext)_localctx).t = match(C_MARK);
				write("duePunti "+(((SenseContext)_localctx).t!=null?((SenseContext)_localctx).t.getText():null));
				}
			}

			setState(180); ((SenseContext)_localctx).t = match(P_MARK);
			write((((SenseContext)_localctx).t!=null?((SenseContext)_localctx).t.getText():null)+"  fine altro senso");
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sense_itemContext extends ParserRuleContext {
		public Token t;
		public TerminalNode ARABIC_WORD() { return getToken(DictParserParser.ARABIC_WORD, 0); }
		public Sense_itemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sense_item; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DictParserListener ) ((DictParserListener)listener).enterSense_item(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DictParserListener ) ((DictParserListener)listener).exitSense_item(this);
		}
	}

	public final Sense_itemContext sense_item() throws RecognitionException {
		Sense_itemContext _localctx = new Sense_itemContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_sense_item);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183); ((Sense_itemContext)_localctx).t = match(ARABIC_WORD);
			write("--> senso "+(((Sense_itemContext)_localctx).t!=null?((Sense_itemContext)_localctx).t.getText():null));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OtherContext extends ParserRuleContext {
		public Token t;
		public TerminalNode Q_MARK() { return getToken(DictParserParser.Q_MARK, 0); }
		public List<TerminalNode> P_MARK() { return getTokens(DictParserParser.P_MARK); }
		public TerminalNode P_MARK(int i) {
			return getToken(DictParserParser.P_MARK, i);
		}
		public List<TerminalNode> ARABIC_WORD() { return getTokens(DictParserParser.ARABIC_WORD); }
		public TerminalNode C_MARK() { return getToken(DictParserParser.C_MARK, 0); }
		public TerminalNode ARABIC_WORD(int i) {
			return getToken(DictParserParser.ARABIC_WORD, i);
		}
		public OtherContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_other; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DictParserListener ) ((DictParserListener)listener).enterOther(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DictParserListener ) ((DictParserListener)listener).exitOther(this);
		}
	}

	public final OtherContext other() throws RecognitionException {
		OtherContext _localctx = new OtherContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_other);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(188); 
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(186); ((OtherContext)_localctx).t = match(ARABIC_WORD);
					write("parola "+(((OtherContext)_localctx).t!=null?((OtherContext)_localctx).t.getText():null));
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(190); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,23,_ctx);
			} while ( _alt!=2 && _alt!=-1 );
			setState(194);
			_la = _input.LA(1);
			if (_la==C_MARK) {
				{
				setState(192); ((OtherContext)_localctx).t = match(C_MARK);
				write("duePunti "+(((OtherContext)_localctx).t!=null?((OtherContext)_localctx).t.getText():null));
				}
			}

			setState(198);
			_la = _input.LA(1);
			if (_la==Q_MARK) {
				{
				setState(196); ((OtherContext)_localctx).t = match(Q_MARK);
				write("virgolette "+(((OtherContext)_localctx).t!=null?((OtherContext)_localctx).t.getText():null));
				}
			}

			setState(202);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(200); ((OtherContext)_localctx).t = match(P_MARK);
				write("fine entrata "+(((OtherContext)_localctx).t!=null?((OtherContext)_localctx).t.getText():null));
				}
				break;
			}
			setState(208);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==ARABIC_WORD) {
				{
				{
				setState(204); ((OtherContext)_localctx).t = match(ARABIC_WORD);
				write("parola "+(((OtherContext)_localctx).t!=null?((OtherContext)_localctx).t.getText():null));
				}
				}
				setState(210);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(211); ((OtherContext)_localctx).t = match(P_MARK);
			write("fine entrata "+(((OtherContext)_localctx).t!=null?((OtherContext)_localctx).t.getText():null));
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EolContext extends ParserRuleContext {
		public TerminalNode NEWLINE() { return getToken(DictParserParser.NEWLINE, 0); }
		public EolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eol; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DictParserListener ) ((DictParserListener)listener).enterEol(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DictParserListener ) ((DictParserListener)listener).exitEol(this);
		}
	}

	public final EolContext eol() throws RecognitionException {
		EolContext _localctx = new EolContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_eol);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(214); match(NEWLINE);

			        i++;
			        write(i+"------------");
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EofContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(DictParserParser.EOF, 0); }
		public EofContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eof; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof DictParserListener ) ((DictParserListener)listener).enterEof(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof DictParserListener ) ((DictParserListener)listener).exitEof(this);
		}
	}

	public final EofContext eof() throws RecognitionException {
		EofContext _localctx = new EofContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_eof);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(217); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\2\3\23\u00de\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b"+
		"\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t"+
		"\20\4\21\t\21\4\22\t\22\3\2\6\2&\n\2\r\2\16\2\'\3\2\3\2\3\3\3\3\3\3\6"+
		"\3/\n\3\r\3\16\3\60\3\3\3\3\3\4\3\4\7\4\67\n\4\f\4\16\4:\13\4\3\4\3\4"+
		"\3\4\3\4\7\4@\n\4\f\4\16\4C\13\4\3\4\7\4F\n\4\f\4\16\4I\13\4\3\4\7\4L"+
		"\n\4\f\4\16\4O\13\4\3\4\5\4R\n\4\3\4\3\4\5\4V\n\4\3\5\3\5\3\6\6\6[\n\6"+
		"\r\6\16\6\\\3\6\3\6\5\6a\n\6\3\6\7\6d\n\6\f\6\16\6g\13\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\6\br\n\b\r\b\16\bs\3\b\3\b\3\b\3\t\3\t\3\t\3\n"+
		"\5\n}\n\n\3\n\5\n\u0080\n\n\3\n\6\n\u0083\n\n\r\n\16\n\u0084\3\n\5\n\u0088"+
		"\n\n\3\13\3\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\6\16\u0097"+
		"\n\16\r\16\16\16\u0098\3\16\3\16\5\16\u009d\n\16\3\16\3\16\5\16\u00a1"+
		"\n\16\3\16\3\16\5\16\u00a5\n\16\3\16\7\16\u00a8\n\16\f\16\16\16\u00ab"+
		"\13\16\3\16\7\16\u00ae\n\16\f\16\16\16\u00b1\13\16\3\16\3\16\5\16\u00b5"+
		"\n\16\3\16\3\16\3\16\3\17\3\17\3\17\3\20\3\20\6\20\u00bf\n\20\r\20\16"+
		"\20\u00c0\3\20\3\20\5\20\u00c5\n\20\3\20\3\20\5\20\u00c9\n\20\3\20\3\20"+
		"\5\20\u00cd\n\20\3\20\3\20\7\20\u00d1\n\20\f\20\16\20\u00d4\13\20\3\20"+
		"\3\20\3\20\3\21\3\21\3\21\3\22\3\22\3\22\2\23\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"\2\3\4\3\3\b\b\u00e8\2%\3\2\2\2\4+\3\2\2\2\6U\3\2\2"+
		"\2\bW\3\2\2\2\nZ\3\2\2\2\fk\3\2\2\2\16n\3\2\2\2\20x\3\2\2\2\22|\3\2\2"+
		"\2\24\u0089\3\2\2\2\26\u008c\3\2\2\2\30\u008f\3\2\2\2\32\u0093\3\2\2\2"+
		"\34\u00b9\3\2\2\2\36\u00be\3\2\2\2 \u00d8\3\2\2\2\"\u00db\3\2\2\2$&\5"+
		"\6\4\2%$\3\2\2\2&\'\3\2\2\2\'%\3\2\2\2\'(\3\2\2\2()\3\2\2\2)*\5\"\22\2"+
		"*\3\3\2\2\2+,\7\5\2\2,.\5\b\5\2-/\7\7\2\2.-\3\2\2\2/\60\3\2\2\2\60.\3"+
		"\2\2\2\60\61\3\2\2\2\61\62\3\2\2\2\62\63\7\5\2\2\63\5\3\2\2\2\648\7\17"+
		"\2\2\65\67\5\4\3\2\66\65\3\2\2\2\67:\3\2\2\28\66\3\2\2\289\3\2\2\29;\3"+
		"\2\2\2:8\3\2\2\2;V\5 \21\2<=\5\b\5\2=A\5\n\6\2>@\5\26\f\2?>\3\2\2\2@C"+
		"\3\2\2\2A?\3\2\2\2AB\3\2\2\2BG\3\2\2\2CA\3\2\2\2DF\5\22\n\2ED\3\2\2\2"+
		"FI\3\2\2\2GE\3\2\2\2GH\3\2\2\2HM\3\2\2\2IG\3\2\2\2JL\5\32\16\2KJ\3\2\2"+
		"\2LO\3\2\2\2MK\3\2\2\2MN\3\2\2\2NQ\3\2\2\2OM\3\2\2\2PR\5\36\20\2QP\3\2"+
		"\2\2QR\3\2\2\2RS\3\2\2\2ST\5 \21\2TV\3\2\2\2U\64\3\2\2\2U<\3\2\2\2V\7"+
		"\3\2\2\2WX\7\4\2\2X\t\3\2\2\2Y[\5\f\7\2ZY\3\2\2\2[\\\3\2\2\2\\Z\3\2\2"+
		"\2\\]\3\2\2\2]`\3\2\2\2^_\7\n\2\2_a\b\6\1\2`^\3\2\2\2`a\3\2\2\2ae\3\2"+
		"\2\2bd\5\f\7\2cb\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2fh\3\2\2\2ge\3\2"+
		"\2\2hi\t\2\2\2ij\b\6\1\2j\13\3\2\2\2kl\7\7\2\2lm\b\7\1\2m\r\3\2\2\2no"+
		"\7\6\2\2oq\b\b\1\2pr\5\20\t\2qp\3\2\2\2rs\3\2\2\2sq\3\2\2\2st\3\2\2\2"+
		"tu\3\2\2\2uv\7\6\2\2vw\b\b\1\2w\17\3\2\2\2xy\7\7\2\2yz\b\t\1\2z\21\3\2"+
		"\2\2{}\5\16\b\2|{\3\2\2\2|}\3\2\2\2}\177\3\2\2\2~\u0080\7\n\2\2\177~\3"+
		"\2\2\2\177\u0080\3\2\2\2\u0080\u0082\3\2\2\2\u0081\u0083\5\24\13\2\u0082"+
		"\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\u0082\3\2\2\2\u0084\u0085\3\2"+
		"\2\2\u0085\u0087\3\2\2\2\u0086\u0088\7\b\2\2\u0087\u0086\3\2\2\2\u0087"+
		"\u0088\3\2\2\2\u0088\23\3\2\2\2\u0089\u008a\7\7\2\2\u008a\u008b\b\13\1"+
		"\2\u008b\25\3\2\2\2\u008c\u008d\5\30\r\2\u008d\u008e\b\f\1\2\u008e\27"+
		"\3\2\2\2\u008f\u0090\7\13\2\2\u0090\u0091\7\7\2\2\u0091\u0092\7\f\2\2"+
		"\u0092\31\3\2\2\2\u0093\u0094\7\16\2\2\u0094\u0096\b\16\1\2\u0095\u0097"+
		"\5\34\17\2\u0096\u0095\3\2\2\2\u0097\u0098\3\2\2\2\u0098\u0096\3\2\2\2"+
		"\u0098\u0099\3\2\2\2\u0099\u009c\3\2\2\2\u009a\u009b\7\n\2\2\u009b\u009d"+
		"\b\16\1\2\u009c\u009a\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u00a0\3\2\2\2"+
		"\u009e\u009f\7\t\2\2\u009f\u00a1\b\16\1\2\u00a0\u009e\3\2\2\2\u00a0\u00a1"+
		"\3\2\2\2\u00a1\u00a4\3\2\2\2\u00a2\u00a3\7\b\2\2\u00a3\u00a5\b\16\1\2"+
		"\u00a4\u00a2\3\2\2\2\u00a4\u00a5\3\2\2\2\u00a5\u00a9\3\2\2\2\u00a6\u00a8"+
		"\5\34\17\2\u00a7\u00a6\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2"+
		"\u00a9\u00aa\3\2\2\2\u00aa\u00af\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ae"+
		"\5\16\b\2\u00ad\u00ac\3\2\2\2\u00ae\u00b1\3\2\2\2\u00af\u00ad\3\2\2\2"+
		"\u00af\u00b0\3\2\2\2\u00b0\u00b4\3\2\2\2\u00b1\u00af\3\2\2\2\u00b2\u00b3"+
		"\7\n\2\2\u00b3\u00b5\b\16\1\2\u00b4\u00b2\3\2\2\2\u00b4\u00b5\3\2\2\2"+
		"\u00b5\u00b6\3\2\2\2\u00b6\u00b7\7\b\2\2\u00b7\u00b8\b\16\1\2\u00b8\33"+
		"\3\2\2\2\u00b9\u00ba\7\7\2\2\u00ba\u00bb\b\17\1\2\u00bb\35\3\2\2\2\u00bc"+
		"\u00bd\7\7\2\2\u00bd\u00bf\b\20\1\2\u00be\u00bc\3\2\2\2\u00bf\u00c0\3"+
		"\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1\u00c4\3\2\2\2\u00c2"+
		"\u00c3\7\n\2\2\u00c3\u00c5\b\20\1\2\u00c4\u00c2\3\2\2\2\u00c4\u00c5\3"+
		"\2\2\2\u00c5\u00c8\3\2\2\2\u00c6\u00c7\7\t\2\2\u00c7\u00c9\b\20\1\2\u00c8"+
		"\u00c6\3\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00cb\7\b"+
		"\2\2\u00cb\u00cd\b\20\1\2\u00cc\u00ca\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd"+
		"\u00d2\3\2\2\2\u00ce\u00cf\7\7\2\2\u00cf\u00d1\b\20\1\2\u00d0\u00ce\3"+
		"\2\2\2\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3"+
		"\u00d5\3\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d6\7\b\2\2\u00d6\u00d7\b\20"+
		"\1\2\u00d7\37\3\2\2\2\u00d8\u00d9\7\21\2\2\u00d9\u00da\b\21\1\2\u00da"+
		"!\3\2\2\2\u00db\u00dc\7\1\2\2\u00dc#\3\2\2\2\36\'\608AGMQU\\`es|\177\u0084"+
		"\u0087\u0098\u009c\u00a0\u00a4\u00a9\u00af\u00b4\u00c0\u00c4\u00c8\u00cc"+
		"\u00d2";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}