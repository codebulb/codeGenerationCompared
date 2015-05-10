package ch.codebulb.codegenerationcompared.antlr.generated;

// Generated from PropertyAssignment.g4 by ANTLR 4.4
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PropertyAssignmentParser}.
 */
public interface PropertyAssignmentListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PropertyAssignmentParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(@NotNull PropertyAssignmentParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PropertyAssignmentParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(@NotNull PropertyAssignmentParser.ConditionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PropertyAssignmentParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(@NotNull PropertyAssignmentParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link PropertyAssignmentParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(@NotNull PropertyAssignmentParser.FileContext ctx);

	/**
	 * Enter a parse tree produced by {@link PropertyAssignmentParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(@NotNull PropertyAssignmentParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PropertyAssignmentParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(@NotNull PropertyAssignmentParser.ExpressionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PropertyAssignmentParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(@NotNull PropertyAssignmentParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PropertyAssignmentParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(@NotNull PropertyAssignmentParser.InstructionContext ctx);

	/**
	 * Enter a parse tree produced by {@link PropertyAssignmentParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(@NotNull PropertyAssignmentParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PropertyAssignmentParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(@NotNull PropertyAssignmentParser.AssignmentContext ctx);

	/**
	 * Enter a parse tree produced by {@link PropertyAssignmentParser#property}.
	 * @param ctx the parse tree
	 */
	void enterProperty(@NotNull PropertyAssignmentParser.PropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PropertyAssignmentParser#property}.
	 * @param ctx the parse tree
	 */
	void exitProperty(@NotNull PropertyAssignmentParser.PropertyContext ctx);

	/**
	 * Enter a parse tree produced by {@link PropertyAssignmentParser#assignmentBlock}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentBlock(@NotNull PropertyAssignmentParser.AssignmentBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PropertyAssignmentParser#assignmentBlock}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentBlock(@NotNull PropertyAssignmentParser.AssignmentBlockContext ctx);
}