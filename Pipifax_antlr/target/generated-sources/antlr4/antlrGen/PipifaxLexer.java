// Generated from C:\Users\Florian\workspace\Pipifax_antlr\Pipifax.g4 by ANTLR 4.7
package antlrGen;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class PipifaxLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		KW_VAR=1, KW_INT=2, KW_DOUBLE=3, KW_STRING=4, KW_FUNC=5, KW_IF=6, KW_ELSE=7, 
		KW_WHILE=8, COMMA=9, ASSIGNER=10, BR_OP_1=11, BR_CL_1=12, BR_OP_2=13, 
		BR_CL_2=14, BR_OP_3=15, BR_CL_3=16, OP_PLUS=17, OP_MINUS=18, OP_MULT=19, 
		OP_DIV=20, OP_AND=21, OP_OR=22, OP_NOT=23, CMP_SMALLER=24, CMP_GREATER=25, 
		CMP_EQUAL=26, CMP_UNEQUAL=27, CMP_EQSMALLER=28, CMP_EQGREATER=29, CMP_COMPARE=30, 
		NUM_INT=31, NUM_FLOAT=32, NUM_E_FLOAT=33, STRING=34, ID=35, COMMENT=36, 
		WS=37;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"KW_VAR", "KW_INT", "KW_DOUBLE", "KW_STRING", "KW_FUNC", "KW_IF", "KW_ELSE", 
		"KW_WHILE", "COMMA", "ASSIGNER", "BR_OP_1", "BR_CL_1", "BR_OP_2", "BR_CL_2", 
		"BR_OP_3", "BR_CL_3", "OP_PLUS", "OP_MINUS", "OP_MULT", "OP_DIV", "OP_AND", 
		"OP_OR", "OP_NOT", "CMP_SMALLER", "CMP_GREATER", "CMP_EQUAL", "CMP_UNEQUAL", 
		"CMP_EQSMALLER", "CMP_EQGREATER", "CMP_COMPARE", "FR_DIGIT", "FR_NNDIGIT", 
		"FR_NOLEADINGNULLS", "FR_DOT", "FR_EXPDIGIT", "FR_FLOAT", "FR_OPTVZ", 
		"NUM_INT", "NUM_FLOAT", "NUM_E_FLOAT", "STRING", "ID", "COMMENT", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'var'", "'int'", "'double'", "'string'", "'func'", "'if'", "'else'", 
		"'while'", "','", "'='", "'('", "')'", "'['", "']'", "'{'", "'}'", "'+'", 
		"'-'", "'*'", "'/'", "'&&'", "'||'", "'!'", "'<'", "'>'", "'=='", "'!='", 
		"'<='", "'>='", "'<=>'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "KW_VAR", "KW_INT", "KW_DOUBLE", "KW_STRING", "KW_FUNC", "KW_IF", 
		"KW_ELSE", "KW_WHILE", "COMMA", "ASSIGNER", "BR_OP_1", "BR_CL_1", "BR_OP_2", 
		"BR_CL_2", "BR_OP_3", "BR_CL_3", "OP_PLUS", "OP_MINUS", "OP_MULT", "OP_DIV", 
		"OP_AND", "OP_OR", "OP_NOT", "CMP_SMALLER", "CMP_GREATER", "CMP_EQUAL", 
		"CMP_UNEQUAL", "CMP_EQSMALLER", "CMP_EQGREATER", "CMP_COMPARE", "NUM_INT", 
		"NUM_FLOAT", "NUM_E_FLOAT", "STRING", "ID", "COMMENT", "WS"
	};
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


	public PipifaxLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Pipifax.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\'\u010c\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\3\2\3\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\5\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3"+
		"\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\n\3\n\3\13\3\13\3\f\3\f\3\r\3\r\3"+
		"\16\3\16\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\3"+
		"\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30\3\31\3\31\3\32\3\32\3"+
		"\33\3\33\3\33\3\34\3\34\3\34\3\35\3\35\3\35\3\36\3\36\3\36\3\37\3\37\3"+
		"\37\3\37\3 \3 \3!\3!\3\"\3\"\3\"\7\"\u00c0\n\"\f\"\16\"\u00c3\13\"\5\""+
		"\u00c5\n\"\3#\3#\3$\3$\3%\5%\u00cc\n%\3%\3%\3%\7%\u00d1\n%\f%\16%\u00d4"+
		"\13%\3&\3&\5&\u00d8\n&\3\'\5\'\u00db\n\'\3\'\3\'\3(\3(\3)\3)\3)\3)\3)"+
		"\7)\u00e6\n)\f)\16)\u00e9\13)\3*\3*\7*\u00ed\n*\f*\16*\u00f0\13*\3*\3"+
		"*\3+\3+\7+\u00f6\n+\f+\16+\u00f9\13+\3,\3,\7,\u00fd\n,\f,\16,\u0100\13"+
		",\3,\3,\3,\3,\3-\6-\u0107\n-\r-\16-\u0108\3-\3-\4\u00ee\u00fe\2.\3\3\5"+
		"\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21"+
		"!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?\2"+
		"A\2C\2E\2G\2I\2K\2M!O\"Q#S$U%W&Y\'\3\2\b\3\2\62;\3\2\63;\4\2GGgg\5\2C"+
		"\\aac|\6\2\62;C\\aac|\5\2\13\f\17\17\"\"\2\u0110\2\3\3\2\2\2\2\5\3\2\2"+
		"\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21"+
		"\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2"+
		"\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3"+
		"\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3"+
		"\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2M\3"+
		"\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2W\3\2\2\2\2Y\3\2\2"+
		"\2\3[\3\2\2\2\5_\3\2\2\2\7c\3\2\2\2\tj\3\2\2\2\13q\3\2\2\2\rv\3\2\2\2"+
		"\17y\3\2\2\2\21~\3\2\2\2\23\u0084\3\2\2\2\25\u0086\3\2\2\2\27\u0088\3"+
		"\2\2\2\31\u008a\3\2\2\2\33\u008c\3\2\2\2\35\u008e\3\2\2\2\37\u0090\3\2"+
		"\2\2!\u0092\3\2\2\2#\u0094\3\2\2\2%\u0096\3\2\2\2\'\u0098\3\2\2\2)\u009a"+
		"\3\2\2\2+\u009c\3\2\2\2-\u009f\3\2\2\2/\u00a2\3\2\2\2\61\u00a4\3\2\2\2"+
		"\63\u00a6\3\2\2\2\65\u00a8\3\2\2\2\67\u00ab\3\2\2\29\u00ae\3\2\2\2;\u00b1"+
		"\3\2\2\2=\u00b4\3\2\2\2?\u00b8\3\2\2\2A\u00ba\3\2\2\2C\u00c4\3\2\2\2E"+
		"\u00c6\3\2\2\2G\u00c8\3\2\2\2I\u00cb\3\2\2\2K\u00d7\3\2\2\2M\u00da\3\2"+
		"\2\2O\u00de\3\2\2\2Q\u00e0\3\2\2\2S\u00ea\3\2\2\2U\u00f3\3\2\2\2W\u00fa"+
		"\3\2\2\2Y\u0106\3\2\2\2[\\\7x\2\2\\]\7c\2\2]^\7t\2\2^\4\3\2\2\2_`\7k\2"+
		"\2`a\7p\2\2ab\7v\2\2b\6\3\2\2\2cd\7f\2\2de\7q\2\2ef\7w\2\2fg\7d\2\2gh"+
		"\7n\2\2hi\7g\2\2i\b\3\2\2\2jk\7u\2\2kl\7v\2\2lm\7t\2\2mn\7k\2\2no\7p\2"+
		"\2op\7i\2\2p\n\3\2\2\2qr\7h\2\2rs\7w\2\2st\7p\2\2tu\7e\2\2u\f\3\2\2\2"+
		"vw\7k\2\2wx\7h\2\2x\16\3\2\2\2yz\7g\2\2z{\7n\2\2{|\7u\2\2|}\7g\2\2}\20"+
		"\3\2\2\2~\177\7y\2\2\177\u0080\7j\2\2\u0080\u0081\7k\2\2\u0081\u0082\7"+
		"n\2\2\u0082\u0083\7g\2\2\u0083\22\3\2\2\2\u0084\u0085\7.\2\2\u0085\24"+
		"\3\2\2\2\u0086\u0087\7?\2\2\u0087\26\3\2\2\2\u0088\u0089\7*\2\2\u0089"+
		"\30\3\2\2\2\u008a\u008b\7+\2\2\u008b\32\3\2\2\2\u008c\u008d\7]\2\2\u008d"+
		"\34\3\2\2\2\u008e\u008f\7_\2\2\u008f\36\3\2\2\2\u0090\u0091\7}\2\2\u0091"+
		" \3\2\2\2\u0092\u0093\7\177\2\2\u0093\"\3\2\2\2\u0094\u0095\7-\2\2\u0095"+
		"$\3\2\2\2\u0096\u0097\7/\2\2\u0097&\3\2\2\2\u0098\u0099\7,\2\2\u0099("+
		"\3\2\2\2\u009a\u009b\7\61\2\2\u009b*\3\2\2\2\u009c\u009d\7(\2\2\u009d"+
		"\u009e\7(\2\2\u009e,\3\2\2\2\u009f\u00a0\7~\2\2\u00a0\u00a1\7~\2\2\u00a1"+
		".\3\2\2\2\u00a2\u00a3\7#\2\2\u00a3\60\3\2\2\2\u00a4\u00a5\7>\2\2\u00a5"+
		"\62\3\2\2\2\u00a6\u00a7\7@\2\2\u00a7\64\3\2\2\2\u00a8\u00a9\7?\2\2\u00a9"+
		"\u00aa\7?\2\2\u00aa\66\3\2\2\2\u00ab\u00ac\7#\2\2\u00ac\u00ad\7?\2\2\u00ad"+
		"8\3\2\2\2\u00ae\u00af\7>\2\2\u00af\u00b0\7?\2\2\u00b0:\3\2\2\2\u00b1\u00b2"+
		"\7@\2\2\u00b2\u00b3\7?\2\2\u00b3<\3\2\2\2\u00b4\u00b5\7>\2\2\u00b5\u00b6"+
		"\7?\2\2\u00b6\u00b7\7@\2\2\u00b7>\3\2\2\2\u00b8\u00b9\t\2\2\2\u00b9@\3"+
		"\2\2\2\u00ba\u00bb\t\3\2\2\u00bbB\3\2\2\2\u00bc\u00c5\5? \2\u00bd\u00c1"+
		"\5A!\2\u00be\u00c0\5? \2\u00bf\u00be\3\2\2\2\u00c0\u00c3\3\2\2\2\u00c1"+
		"\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u00c5\3\2\2\2\u00c3\u00c1\3\2"+
		"\2\2\u00c4\u00bc\3\2\2\2\u00c4\u00bd\3\2\2\2\u00c5D\3\2\2\2\u00c6\u00c7"+
		"\7\60\2\2\u00c7F\3\2\2\2\u00c8\u00c9\t\4\2\2\u00c9H\3\2\2\2\u00ca\u00cc"+
		"\5%\23\2\u00cb\u00ca\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd"+
		"\u00ce\5C\"\2\u00ce\u00d2\5E#\2\u00cf\u00d1\5? \2\u00d0\u00cf\3\2\2\2"+
		"\u00d1\u00d4\3\2\2\2\u00d2\u00d0\3\2\2\2\u00d2\u00d3\3\2\2\2\u00d3J\3"+
		"\2\2\2\u00d4\u00d2\3\2\2\2\u00d5\u00d8\5#\22\2\u00d6\u00d8\5%\23\2\u00d7"+
		"\u00d5\3\2\2\2\u00d7\u00d6\3\2\2\2\u00d7\u00d8\3\2\2\2\u00d8L\3\2\2\2"+
		"\u00d9\u00db\5%\23\2\u00da\u00d9\3\2\2\2\u00da\u00db\3\2\2\2\u00db\u00dc"+
		"\3\2\2\2\u00dc\u00dd\5C\"\2\u00ddN\3\2\2\2\u00de\u00df\5I%\2\u00dfP\3"+
		"\2\2\2\u00e0\u00e1\5I%\2\u00e1\u00e2\5G$\2\u00e2\u00e3\5K&\2\u00e3\u00e7"+
		"\5A!\2\u00e4\u00e6\5? \2\u00e5\u00e4\3\2\2\2\u00e6\u00e9\3\2\2\2\u00e7"+
		"\u00e5\3\2\2\2\u00e7\u00e8\3\2\2\2\u00e8R\3\2\2\2\u00e9\u00e7\3\2\2\2"+
		"\u00ea\u00ee\7$\2\2\u00eb\u00ed\13\2\2\2\u00ec\u00eb\3\2\2\2\u00ed\u00f0"+
		"\3\2\2\2\u00ee\u00ef\3\2\2\2\u00ee\u00ec\3\2\2\2\u00ef\u00f1\3\2\2\2\u00f0"+
		"\u00ee\3\2\2\2\u00f1\u00f2\7$\2\2\u00f2T\3\2\2\2\u00f3\u00f7\t\5\2\2\u00f4"+
		"\u00f6\t\6\2\2\u00f5\u00f4\3\2\2\2\u00f6\u00f9\3\2\2\2\u00f7\u00f5\3\2"+
		"\2\2\u00f7\u00f8\3\2\2\2\u00f8V\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fe"+
		"\7%\2\2\u00fb\u00fd\13\2\2\2\u00fc\u00fb\3\2\2\2\u00fd\u0100\3\2\2\2\u00fe"+
		"\u00ff\3\2\2\2\u00fe\u00fc\3\2\2\2\u00ff\u0101\3\2\2\2\u0100\u00fe\3\2"+
		"\2\2\u0101\u0102\7\f\2\2\u0102\u0103\3\2\2\2\u0103\u0104\b,\2\2\u0104"+
		"X\3\2\2\2\u0105\u0107\t\7\2\2\u0106\u0105\3\2\2\2\u0107\u0108\3\2\2\2"+
		"\u0108\u0106\3\2\2\2\u0108\u0109\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010b"+
		"\b-\2\2\u010bZ\3\2\2\2\16\2\u00c1\u00c4\u00cb\u00d2\u00d7\u00da\u00e7"+
		"\u00ee\u00f7\u00fe\u0108\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}