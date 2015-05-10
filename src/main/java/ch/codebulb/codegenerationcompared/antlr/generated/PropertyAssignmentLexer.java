package ch.codebulb.codegenerationcompared.antlr.generated;

// Generated from PropertyAssignment.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

public class PropertyAssignmentLexer extends Lexer {
	public static final int
		T__4=1, T__3=2, T__2=3, T__1=4, T__0=5, TEXT=6, WS=7;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"'\\u0000'", "'\\u0001'", "'\\u0002'", "'\\u0003'", "'\\u0004'", "'\\u0005'", 
		"'\\u0006'", "'\\u0007'"
	};
	public static final String[] ruleNames = {
		"T__4", "T__3", "T__2", "T__1", "T__0", "TEXT", "WS"
	};


	public PropertyAssignmentLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN);
	}

	@Override
	public String getGrammarFileName() { return "PropertyAssignment.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	public static final String _serializedATN =
		"\3\uaf6f\u8320\u479d\ub75c\u4880\u1605\u191c\uab37\2\t\62\b\1\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\6\7"+
		"(\n\7\r\7\16\7)\3\b\6\b-\n\b\r\b\16\b.\3\b\3\b\2\2\2\t\3\2\3\5\2\4\7\2"+
		"\5\t\2\6\13\2\7\r\2\b\17\2\t\3\2\4\4\2C\\c|\4\2\13\f\17\17\63\2\3\3\2"+
		"\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17"+
		"\3\2\2\2\3\21\3\2\2\2\5\25\3\2\2\2\7\36\3\2\2\2\t\"\3\2\2\2\13$\3\2\2"+
		"\2\r\'\3\2\2\2\17,\3\2\2\2\21\22\7\"\2\2\22\23\7?\2\2\23\24\7\"\2\2\24"+
		"\4\3\2\2\2\25\26\7p\2\2\26\27\7q\2\2\27\30\7v\2\2\30\31\7P\2\2\31\32\7"+
		"w\2\2\32\33\7n\2\2\33\34\7n\2\2\34\35\7*\2\2\35\6\3\2\2\2\36\37\7+\2\2"+
		"\37 \7\"\2\2 !\7}\2\2!\b\3\2\2\2\"#\7\177\2\2#\n\3\2\2\2$%\7\60\2\2%\f"+
		"\3\2\2\2&(\t\2\2\2\'&\3\2\2\2()\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*\16\3\2\2"+
		"\2+-\t\3\2\2,+\3\2\2\2-.\3\2\2\2.,\3\2\2\2./\3\2\2\2/\60\3\2\2\2\60\61"+
		"\b\b\2\2\61\20\3\2\2\2\5\2).\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
	}
}