package ch.codebulb.codegenerationcompared.regex

import ch.codebulb.codegenerationcompared.structure.*

class RegexTranslator {
    public static String translate(String input) {
        List<Assignment> assignments = input.split("\n")
            .findAll {it != ""}.collect { String assignment ->
            translateAssignment(assignment)
        }
        return Assignment.toString(assignments)
    }
    
    private static Assignment translateAssignment(String assignment) {
        def expressions = (assignment =~ /(.*?) = (.*)/)[0]
        String leftExpression = expressions[1]
        String rightExpression = expressions[2]
        Expression left = translateExpression(leftExpression)
        Expression right = translateExpression(rightExpression)
        return new Assignment(left, right)
    }
    
    private static Expression translateExpression(String expression) {
        List properties = expression.split(/\./).collect { new Property(it) }
        return new Expression(properties)
    }
}

