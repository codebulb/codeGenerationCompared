package ch.codebulb.codegenerationcompared.antlr.generated;

// Generated from PropertyAssignment.g4 by ANTLR 4.4
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

public class PropertyAssignmentParser extends Parser {
	public static final int
		T__4=1, T__3=2, T__2=3, T__1=4, T__0=5, TEXT=6, WS=7;
	public static final String[] tokenNames = {
		"<INVALID>", "' = '", "'notNull('", "') {'", "'}'", "'.'", "TEXT", "WS"
	};
	public static final int
		RULE_file = 0, RULE_instruction = 1, RULE_assignmentBlock = 2, RULE_condition = 3, 
		RULE_assignment = 4, RULE_expression = 5, RULE_property = 6;
	public static final String[] ruleNames = {
		"file", "instruction", "assignmentBlock", "condition", "assignment", "expression", 
		"property"
	};

	@Override
	public String getGrammarFileName() { return "PropertyAssignment.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	public PropertyAssignmentParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN);
	}
	public static class FileContext extends ParserRuleContext {
		public InstructionContext instruction(int i) {
			return getRuleContext(InstructionContext.class,i);
		}
		public List<? extends InstructionContext> instruction() {
			return getRuleContexts(InstructionContext.class);
		}
		public FileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PropertyAssignmentListener ) ((PropertyAssignmentListener)listener).enterFile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PropertyAssignmentListener ) ((PropertyAssignmentListener)listener).exitFile(this);
		}
	}

	@RuleVersion(0)
	public final FileContext file() throws RecognitionException {
		FileContext _localctx = new FileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(14); instruction();
				}
				}
				setState(17); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==T__3 || _la==TEXT );
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

	public static class InstructionContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public AssignmentBlockContext assignmentBlock() {
			return getRuleContext(AssignmentBlockContext.class,0);
		}
		public InstructionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instruction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PropertyAssignmentListener ) ((PropertyAssignmentListener)listener).enterInstruction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PropertyAssignmentListener ) ((PropertyAssignmentListener)listener).exitInstruction(this);
		}
	}

	@RuleVersion(0)
	public final InstructionContext instruction() throws RecognitionException {
		InstructionContext _localctx = new InstructionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_instruction);
		try {
			setState(21);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(19); assignmentBlock();
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(20); assignment();
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

	public static class AssignmentBlockContext extends ParserRuleContext {
		public List<? extends AssignmentContext> assignment() {
			return getRuleContexts(AssignmentContext.class);
		}
		public AssignmentContext assignment(int i) {
			return getRuleContext(AssignmentContext.class,i);
		}
		public ConditionContext condition() {
			return getRuleContext(ConditionContext.class,0);
		}
		public AssignmentBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PropertyAssignmentListener ) ((PropertyAssignmentListener)listener).enterAssignmentBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PropertyAssignmentListener ) ((PropertyAssignmentListener)listener).exitAssignmentBlock(this);
		}
	}

	@RuleVersion(0)
	public final AssignmentBlockContext assignmentBlock() throws RecognitionException {
		AssignmentBlockContext _localctx = new AssignmentBlockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_assignmentBlock);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(23); match(T__3);
			setState(24); condition();
			setState(25); match(T__2);
			setState(27); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(26); assignment();
				}
				}
				setState(29); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TEXT );
			setState(31); match(T__1);
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

	public static class ConditionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ConditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PropertyAssignmentListener ) ((PropertyAssignmentListener)listener).enterCondition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PropertyAssignmentListener ) ((PropertyAssignmentListener)listener).exitCondition(this);
		}
	}

	@RuleVersion(0)
	public final ConditionContext condition() throws RecognitionException {
		ConditionContext _localctx = new ConditionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_condition);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33); expression();
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

	public static class AssignmentContext extends ParserRuleContext {
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public List<? extends ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PropertyAssignmentListener ) ((PropertyAssignmentListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PropertyAssignmentListener ) ((PropertyAssignmentListener)listener).exitAssignment(this);
		}
	}

	@RuleVersion(0)
	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(35); expression();
			setState(36); match(T__4);
			setState(37); expression();
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

	public static class ExpressionContext extends ParserRuleContext {
		public PropertyContext property(int i) {
			return getRuleContext(PropertyContext.class,i);
		}
		public List<? extends PropertyContext> property() {
			return getRuleContexts(PropertyContext.class);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PropertyAssignmentListener ) ((PropertyAssignmentListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PropertyAssignmentListener ) ((PropertyAssignmentListener)listener).exitExpression(this);
		}
	}

	@RuleVersion(0)
	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39); property();
			setState(44);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(40); match(T__0);
				setState(41); property();
				}
				}
				setState(46);
				_errHandler.sync(this);
				_la = _input.LA(1);
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

	public static class PropertyContext extends ParserRuleContext {
		public TerminalNode TEXT() { return getToken(PropertyAssignmentParser.TEXT, 0); }
		public PropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof PropertyAssignmentListener ) ((PropertyAssignmentListener)listener).enterProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof PropertyAssignmentListener ) ((PropertyAssignmentListener)listener).exitProperty(this);
		}
	}

	@RuleVersion(0)
	public final PropertyContext property() throws RecognitionException {
		PropertyContext _localctx = new PropertyContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_property);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47); match(TEXT);
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
		"\3\uaf6f\u8320\u479d\ub75c\u4880\u1605\u191c\uab37\3\t\64\4\2\t\2\4\3"+
		"\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\6\2\22\n\2\r\2\16\2\23"+
		"\3\3\3\3\5\3\30\n\3\3\4\3\4\3\4\3\4\6\4\36\n\4\r\4\16\4\37\3\4\3\4\3\5"+
		"\3\5\3\6\3\6\3\6\3\6\3\7\3\7\3\7\7\7-\n\7\f\7\16\7\60\13\7\3\b\3\b\3\b"+
		"\2\2\2\t\2\2\4\2\6\2\b\2\n\2\f\2\16\2\2\2\60\2\21\3\2\2\2\4\27\3\2\2\2"+
		"\6\31\3\2\2\2\b#\3\2\2\2\n%\3\2\2\2\f)\3\2\2\2\16\61\3\2\2\2\20\22\5\4"+
		"\3\2\21\20\3\2\2\2\22\23\3\2\2\2\23\21\3\2\2\2\23\24\3\2\2\2\24\3\3\2"+
		"\2\2\25\30\5\6\4\2\26\30\5\n\6\2\27\25\3\2\2\2\27\26\3\2\2\2\30\5\3\2"+
		"\2\2\31\32\7\4\2\2\32\33\5\b\5\2\33\35\7\5\2\2\34\36\5\n\6\2\35\34\3\2"+
		"\2\2\36\37\3\2\2\2\37\35\3\2\2\2\37 \3\2\2\2 !\3\2\2\2!\"\7\6\2\2\"\7"+
		"\3\2\2\2#$\5\f\7\2$\t\3\2\2\2%&\5\f\7\2&\'\7\3\2\2\'(\5\f\7\2(\13\3\2"+
		"\2\2).\5\16\b\2*+\7\7\2\2+-\5\16\b\2,*\3\2\2\2-\60\3\2\2\2.,\3\2\2\2."+
		"/\3\2\2\2/\r\3\2\2\2\60.\3\2\2\2\61\62\7\b\2\2\62\17\3\2\2\2\6\23\27\37"+
		".";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
	}
}