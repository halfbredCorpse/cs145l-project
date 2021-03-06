// Generated from C:/Javalib/dovahzul\dovahzul.g4 by ANTLR 4.7.2
package com.dovahzul;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class dovahzulLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, VAR=12, INT=13, STR=14, TRUE=15, FALSE=16, WS=17;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
			"T__9", "T__10", "VAR", "INT", "STR", "TRUE", "FALSE", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'LOS'", "'REIN'", "'AAV'", "'AUS'", "'DUN'", "'DUR'", "'AHRK'", 
			"'ONT'", "'SAHLO'", "'LOT'", "'RO'", null, null, null, "'VAHZAH'", "'FOLAAS'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"VAR", "INT", "STR", "TRUE", "FALSE", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public dovahzulLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "dovahzul.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\23|\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\r\6\rV\n\r\r\r"+
		"\16\rW\3\16\6\16[\n\16\r\16\16\16\\\3\17\3\17\7\17a\n\17\f\17\16\17d\13"+
		"\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\22\6\22w\n\22\r\22\16\22x\3\22\3\22\2\2\23\3\3\5\4\7\5"+
		"\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23"+
		"\3\2\6\3\2c|\3\2\62;\6\2\f\f$$^^tt\4\2\13\f\"\"\2\177\2\3\3\2\2\2\2\5"+
		"\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2"+
		"\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33"+
		"\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\3%\3\2\2\2\5"+
		")\3\2\2\2\7.\3\2\2\2\t\62\3\2\2\2\13\66\3\2\2\2\r:\3\2\2\2\17>\3\2\2\2"+
		"\21C\3\2\2\2\23G\3\2\2\2\25M\3\2\2\2\27Q\3\2\2\2\31U\3\2\2\2\33Z\3\2\2"+
		"\2\35^\3\2\2\2\37g\3\2\2\2!n\3\2\2\2#v\3\2\2\2%&\7N\2\2&\'\7Q\2\2\'(\7"+
		"U\2\2(\4\3\2\2\2)*\7T\2\2*+\7G\2\2+,\7K\2\2,-\7P\2\2-\6\3\2\2\2./\7C\2"+
		"\2/\60\7C\2\2\60\61\7X\2\2\61\b\3\2\2\2\62\63\7C\2\2\63\64\7W\2\2\64\65"+
		"\7U\2\2\65\n\3\2\2\2\66\67\7F\2\2\678\7W\2\289\7P\2\29\f\3\2\2\2:;\7F"+
		"\2\2;<\7W\2\2<=\7T\2\2=\16\3\2\2\2>?\7C\2\2?@\7J\2\2@A\7T\2\2AB\7M\2\2"+
		"B\20\3\2\2\2CD\7Q\2\2DE\7P\2\2EF\7V\2\2F\22\3\2\2\2GH\7U\2\2HI\7C\2\2"+
		"IJ\7J\2\2JK\7N\2\2KL\7Q\2\2L\24\3\2\2\2MN\7N\2\2NO\7Q\2\2OP\7V\2\2P\26"+
		"\3\2\2\2QR\7T\2\2RS\7Q\2\2S\30\3\2\2\2TV\t\2\2\2UT\3\2\2\2VW\3\2\2\2W"+
		"U\3\2\2\2WX\3\2\2\2X\32\3\2\2\2Y[\t\3\2\2ZY\3\2\2\2[\\\3\2\2\2\\Z\3\2"+
		"\2\2\\]\3\2\2\2]\34\3\2\2\2^b\7$\2\2_a\n\4\2\2`_\3\2\2\2ad\3\2\2\2b`\3"+
		"\2\2\2bc\3\2\2\2ce\3\2\2\2db\3\2\2\2ef\7$\2\2f\36\3\2\2\2gh\7X\2\2hi\7"+
		"C\2\2ij\7J\2\2jk\7\\\2\2kl\7C\2\2lm\7J\2\2m \3\2\2\2no\7H\2\2op\7Q\2\2"+
		"pq\7N\2\2qr\7C\2\2rs\7C\2\2st\7U\2\2t\"\3\2\2\2uw\t\5\2\2vu\3\2\2\2wx"+
		"\3\2\2\2xv\3\2\2\2xy\3\2\2\2yz\3\2\2\2z{\b\22\2\2{$\3\2\2\2\7\2W\\bx\3"+
		"\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}