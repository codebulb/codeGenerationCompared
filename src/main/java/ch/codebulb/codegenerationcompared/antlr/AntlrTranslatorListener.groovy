package ch.codebulb.codegenerationcompared.antlr

import ch.codebulb.codegenerationcompared.antlr.generated.PropertyAssignmentBaseListener
import ch.codebulb.codegenerationcompared.antlr.generated.PropertyAssignmentParser
import ch.codebulb.codegenerationcompared.structure.*
import org.antlr.v4.runtime.misc.NotNull
import org.antlr.v4.runtime.tree.ParseTreeProperty

class AntlrTranslatorListener extends PropertyAssignmentBaseListener {
    ParseTreeProperty assignments = new ParseTreeProperty();
    
    @Override
    public void exitProperty(@NotNull PropertyAssignmentParser.PropertyContext ctx) {
        assignments[ctx] = new Property(ctx.TEXT().text)
    }
    
    @Override
    public void exitExpression(@NotNull PropertyAssignmentParser.ExpressionContext ctx) {
        assignments[ctx] = new Expression(ctx.property().collect {assignments[it]})
    }
    
    @Override
    public void exitAssignment(@NotNull PropertyAssignmentParser.AssignmentContext ctx) {
        assignments[ctx] = new Assignment(assignments[ctx.expression(0)], assignments[ctx.expression(1)])
    }
    
    @Override
    public void exitCondition(@NotNull PropertyAssignmentParser.ConditionContext ctx) {
        exitExpression(ctx.expression())
    }
    
    @Override
    public void exitAssignmentBlock(@NotNull PropertyAssignmentParser.AssignmentBlockContext ctx) {
        assignments[ctx] = new AssignmentBlock(
            // because we skip annotating "condition", we get its child directly
            assignments[ctx.condition().expression()],
            ctx.assignment().collect {assignments[it]})
    }
    
    @Override
    public void exitFile(@NotNull PropertyAssignmentParser.FileContext ctx) {
        assignments[ctx] = ctx.instruction()
            // because we skip annotating "instruction", we get its children directly
            .collect { it.assignment() ?: it.assignmentBlock() }
            .collect {assignments[it]}
    }
}
