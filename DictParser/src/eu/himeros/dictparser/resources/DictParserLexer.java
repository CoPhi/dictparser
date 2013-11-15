// Generated from C:\prove_java\dictparser\DictParser/src/eu/himeros/dictparser/resources/DictParser.g4 by ANTLR 4.0

    package eu.himeros.dictparser.resources;
    import org.antlr.v4.runtime.*;
    import java.io.*;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DictParserLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__3=1, T__2=2, T__1=3, T__0=4, ARABIC_WORD=5, P_MARK=6, Q_MARK=7, C_MARK=8, 
		OPEN_PAR=9, CLOSED_PAR=10, G_OPEN_PAR=11, G_CLOSED_PAR=12, DIGIT=13, NUMBER=14, 
		UTF8_BOM=15, LATIN_WORD=16, NEWLINE=17, WS=18, ML_COMMENT=19;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'،'", "'*'", "'##'", "'\"'", "ARABIC_WORD", "P_MARK", "Q_MARK", "':'", 
		"'('", "')'", "'{'", "'}'", "DIGIT", "NUMBER", "'\\ufeff'", "LATIN_WORD", 
		"NEWLINE", "WS", "ML_COMMENT"
	};
	public static final String[] ruleNames = {
		"T__3", "T__2", "T__1", "T__0", "A", "B", "C", "D", "E", "F", "G", "H", 
		"I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", 
		"W", "X", "Y", "Z", "LATIN_LETTER", "ARABIC_LETTER", "ARABIC_WORD", "P_MARK", 
		"Q_MARK", "C_MARK", "OPEN_PAR", "CLOSED_PAR", "G_OPEN_PAR", "G_CLOSED_PAR", 
		"DIGIT", "NUMBER", "UTF8_BOM", "LATIN_WORD", "NEWLINE", "WS", "ML_COMMENT"
	};


	public DictParserLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "DictParser.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	@Override
	public void action(RuleContext _localctx, int ruleIndex, int actionIndex) {
		switch (ruleIndex) {
		case 45: WS_action((RuleContext)_localctx, actionIndex); break;

		case 46: ML_COMMENT_action((RuleContext)_localctx, actionIndex); break;
		}
	}
	private void ML_COMMENT_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 1: skip(); break;
		}
	}
	private void WS_action(RuleContext _localctx, int actionIndex) {
		switch (actionIndex) {
		case 0: skip(); break;
		}
	}

	public static final String _serializedATN =
		"\2\4\25\u00ff\b\1\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b"+
		"\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20"+
		"\t\20\4\21\t\21\4\22\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27"+
		"\t\27\4\30\t\30\4\31\t\31\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36"+
		"\t\36\4\37\t\37\4 \t \4!\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4"+
		"(\t(\4)\t)\4*\t*\4+\t+\4,\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\2\3"+
		"\3\3\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3\13"+
		"\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\24\3\24\3\25\3\25\3\26\3\26\3\27\3\27\3\30\3\30\3\31\3\31"+
		"\3\32\3\32\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 "+
		"\3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 \3 "+
		"\5 \u00ba\n \3!\3!\3\"\6\"\u00bf\n\"\r\"\16\"\u00c0\3#\3#\3#\5#\u00c6"+
		"\n#\3$\3$\3%\3%\3&\3&\3\'\3\'\3(\3(\3(\3)\3)\3)\3*\3*\3+\3+\3+\3,\3,\3"+
		"-\6-\u00de\n-\r-\16-\u00df\3.\3.\3.\5.\u00e5\n.\3/\3/\6/\u00e9\n/\r/\16"+
		"/\u00ea\3/\3/\5/\u00ef\n/\3/\3/\3\60\3\60\3\60\3\60\6\60\u00f7\n\60\r"+
		"\60\16\60\u00f8\3\60\3\60\3\60\3\60\3\60\3\u00f8\61\3\3\1\5\4\1\7\5\1"+
		"\t\6\1\13\2\1\r\2\1\17\2\1\21\2\1\23\2\1\25\2\1\27\2\1\31\2\1\33\2\1\35"+
		"\2\1\37\2\1!\2\1#\2\1%\2\1\'\2\1)\2\1+\2\1-\2\1/\2\1\61\2\1\63\2\1\65"+
		"\2\1\67\2\19\2\1;\2\1=\2\1?\2\1A\2\1C\7\1E\b\1G\t\1I\n\1K\13\1M\f\1O\r"+
		"\1Q\16\1S\17\1U\20\1W\21\1Y\22\1[\23\1]\24\2_\25\3\3\2\37\4CCcc\4DDdd"+
		"\4EEee\4FFff\4GGgg\4HHhh\4IIii\4JJjj\4KKkk\4LLll\4MMmm\4NNnn\4OOoo\4P"+
		"Ppp\4QQqq\4RRrr\4SSss\4TTtt\4UUuu\4VVvv\4WWww\4XXxx\4YYyy\4ZZzz\4[[{{"+
		"\4\\\\||\6\u060d\u0611\u061d\u061d\u0620\u064c\u0662\u0701\4$$))\4\f\f"+
		"\17\17\u0103\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2C\3\2\2"+
		"\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2"+
		"Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2\2\2[\3\2\2\2\2]\3"+
		"\2\2\2\2_\3\2\2\2\3a\3\2\2\2\5d\3\2\2\2\7f\3\2\2\2\ti\3\2\2\2\13k\3\2"+
		"\2\2\rm\3\2\2\2\17o\3\2\2\2\21q\3\2\2\2\23s\3\2\2\2\25u\3\2\2\2\27w\3"+
		"\2\2\2\31y\3\2\2\2\33{\3\2\2\2\35}\3\2\2\2\37\177\3\2\2\2!\u0081\3\2\2"+
		"\2#\u0083\3\2\2\2%\u0085\3\2\2\2\'\u0087\3\2\2\2)\u0089\3\2\2\2+\u008b"+
		"\3\2\2\2-\u008d\3\2\2\2/\u008f\3\2\2\2\61\u0091\3\2\2\2\63\u0093\3\2\2"+
		"\2\65\u0095\3\2\2\2\67\u0097\3\2\2\29\u0099\3\2\2\2;\u009b\3\2\2\2=\u009d"+
		"\3\2\2\2?\u00b9\3\2\2\2A\u00bb\3\2\2\2C\u00be\3\2\2\2E\u00c5\3\2\2\2G"+
		"\u00c7\3\2\2\2I\u00c9\3\2\2\2K\u00cb\3\2\2\2M\u00cd\3\2\2\2O\u00cf\3\2"+
		"\2\2Q\u00d2\3\2\2\2S\u00d5\3\2\2\2U\u00d7\3\2\2\2W\u00da\3\2\2\2Y\u00dd"+
		"\3\2\2\2[\u00e4\3\2\2\2]\u00ee\3\2\2\2_\u00f2\3\2\2\2ab\7\u00da\2\2bc"+
		"\7\u0154\2\2c\4\3\2\2\2de\7,\2\2e\6\3\2\2\2fg\7%\2\2gh\7%\2\2h\b\3\2\2"+
		"\2ij\7$\2\2j\n\3\2\2\2kl\t\2\2\2l\f\3\2\2\2mn\t\3\2\2n\16\3\2\2\2op\t"+
		"\4\2\2p\20\3\2\2\2qr\t\5\2\2r\22\3\2\2\2st\t\6\2\2t\24\3\2\2\2uv\t\7\2"+
		"\2v\26\3\2\2\2wx\t\b\2\2x\30\3\2\2\2yz\t\t\2\2z\32\3\2\2\2{|\t\n\2\2|"+
		"\34\3\2\2\2}~\t\13\2\2~\36\3\2\2\2\177\u0080\t\f\2\2\u0080 \3\2\2\2\u0081"+
		"\u0082\t\r\2\2\u0082\"\3\2\2\2\u0083\u0084\t\16\2\2\u0084$\3\2\2\2\u0085"+
		"\u0086\t\17\2\2\u0086&\3\2\2\2\u0087\u0088\t\20\2\2\u0088(\3\2\2\2\u0089"+
		"\u008a\t\21\2\2\u008a*\3\2\2\2\u008b\u008c\t\22\2\2\u008c,\3\2\2\2\u008d"+
		"\u008e\t\23\2\2\u008e.\3\2\2\2\u008f\u0090\t\24\2\2\u0090\60\3\2\2\2\u0091"+
		"\u0092\t\25\2\2\u0092\62\3\2\2\2\u0093\u0094\t\26\2\2\u0094\64\3\2\2\2"+
		"\u0095\u0096\t\27\2\2\u0096\66\3\2\2\2\u0097\u0098\t\30\2\2\u00988\3\2"+
		"\2\2\u0099\u009a\t\31\2\2\u009a:\3\2\2\2\u009b\u009c\t\32\2\2\u009c<\3"+
		"\2\2\2\u009d\u009e\t\33\2\2\u009e>\3\2\2\2\u009f\u00ba\5\13\6\2\u00a0"+
		"\u00ba\5\r\7\2\u00a1\u00ba\5\17\b\2\u00a2\u00ba\5\21\t\2\u00a3\u00ba\5"+
		"\23\n\2\u00a4\u00ba\5\25\13\2\u00a5\u00ba\5\27\f\2\u00a6\u00ba\5\31\r"+
		"\2\u00a7\u00ba\5\33\16\2\u00a8\u00ba\5\35\17\2\u00a9\u00ba\5\37\20\2\u00aa"+
		"\u00ba\5!\21\2\u00ab\u00ba\5#\22\2\u00ac\u00ba\5%\23\2\u00ad\u00ba\5\'"+
		"\24\2\u00ae\u00ba\5)\25\2\u00af\u00ba\5+\26\2\u00b0\u00ba\5-\27\2\u00b1"+
		"\u00ba\5/\30\2\u00b2\u00ba\5\61\31\2\u00b3\u00ba\5\63\32\2\u00b4\u00ba"+
		"\5\65\33\2\u00b5\u00ba\5\67\34\2\u00b6\u00ba\59\35\2\u00b7\u00ba\5;\36"+
		"\2\u00b8\u00ba\5=\37\2\u00b9\u009f\3\2\2\2\u00b9\u00a0\3\2\2\2\u00b9\u00a1"+
		"\3\2\2\2\u00b9\u00a2\3\2\2\2\u00b9\u00a3\3\2\2\2\u00b9\u00a4\3\2\2\2\u00b9"+
		"\u00a5\3\2\2\2\u00b9\u00a6\3\2\2\2\u00b9\u00a7\3\2\2\2\u00b9\u00a8\3\2"+
		"\2\2\u00b9\u00a9\3\2\2\2\u00b9\u00aa\3\2\2\2\u00b9\u00ab\3\2\2\2\u00b9"+
		"\u00ac\3\2\2\2\u00b9\u00ad\3\2\2\2\u00b9\u00ae\3\2\2\2\u00b9\u00af\3\2"+
		"\2\2\u00b9\u00b0\3\2\2\2\u00b9\u00b1\3\2\2\2\u00b9\u00b2\3\2\2\2\u00b9"+
		"\u00b3\3\2\2\2\u00b9\u00b4\3\2\2\2\u00b9\u00b5\3\2\2\2\u00b9\u00b6\3\2"+
		"\2\2\u00b9\u00b7\3\2\2\2\u00b9\u00b8\3\2\2\2\u00ba@\3\2\2\2\u00bb\u00bc"+
		"\t\34\2\2\u00bcB\3\2\2\2\u00bd\u00bf\5A!\2\u00be\u00bd\3\2\2\2\u00bf\u00c0"+
		"\3\2\2\2\u00c0\u00be\3\2\2\2\u00c0\u00c1\3\2\2\2\u00c1D\3\2\2\2\u00c2"+
		"\u00c6\7\60\2\2\u00c3\u00c4\7\u00da\2\2\u00c4\u00c6\7\u0154\2\2\u00c5"+
		"\u00c2\3\2\2\2\u00c5\u00c3\3\2\2\2\u00c6F\3\2\2\2\u00c7\u00c8\t\35\2\2"+
		"\u00c8H\3\2\2\2\u00c9\u00ca\7<\2\2\u00caJ\3\2\2\2\u00cb\u00cc\7*\2\2\u00cc"+
		"L\3\2\2\2\u00cd\u00ce\7+\2\2\u00ceN\3\2\2\2\u00cf\u00d0\7^\2\2\u00d0\u00d1"+
		"\7}\2\2\u00d1P\3\2\2\2\u00d2\u00d3\7^\2\2\u00d3\u00d4\7\177\2\2\u00d4"+
		"R\3\2\2\2\u00d5\u00d6\4\62;\2\u00d6T\3\2\2\2\u00d7\u00d8\5S*\2\u00d8\u00d9"+
		"\7/\2\2\u00d9V\3\2\2\2\u00da\u00db\7\uff01\2\2\u00dbX\3\2\2\2\u00dc\u00de"+
		"\5? \2\u00dd\u00dc\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00dd\3\2\2\2\u00df"+
		"\u00e0\3\2\2\2\u00e0Z\3\2\2\2\u00e1\u00e5\t\36\2\2\u00e2\u00e3\7\17\2"+
		"\2\u00e3\u00e5\7\f\2\2\u00e4\u00e1\3\2\2\2\u00e4\u00e2\3\2\2\2\u00e5\\"+
		"\3\2\2\2\u00e6\u00ef\7\"\2\2\u00e7\u00e9\7\f\2\2\u00e8\u00e7\3\2\2\2\u00e9"+
		"\u00ea\3\2\2\2\u00ea\u00e8\3\2\2\2\u00ea\u00eb\3\2\2\2\u00eb\u00ef\3\2"+
		"\2\2\u00ec\u00ed\7\17\2\2\u00ed\u00ef\7\f\2\2\u00ee\u00e6\3\2\2\2\u00ee"+
		"\u00e8\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f0\3\2\2\2\u00f0\u00f1\b/"+
		"\2\2\u00f1^\3\2\2\2\u00f2\u00f3\7\61\2\2\u00f3\u00f4\7,\2\2\u00f4\u00f6"+
		"\3\2\2\2\u00f5\u00f7\13\2\2\2\u00f6\u00f5\3\2\2\2\u00f7\u00f8\3\2\2\2"+
		"\u00f8\u00f9\3\2\2\2\u00f8\u00f6\3\2\2\2\u00f9\u00fa\3\2\2\2\u00fa\u00fb"+
		"\7,\2\2\u00fb\u00fc\7\61\2\2\u00fc\u00fd\3\2\2\2\u00fd\u00fe\b\60\3\2"+
		"\u00fe`\3\2\2\2\13\2\u00b9\u00c0\u00c5\u00df\u00e4\u00ea\u00ee\u00f8";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}