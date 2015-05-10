package ch.codebulb.codegenerationcompared.groovy

import ch.codebulb.codegenerationcompared.structure.*

class GroovyTranslator {
    private List<Assignment> assignments = []
    
    public static String translate(String input) {
        GroovyTranslator instance = new GroovyTranslator()
        
        // create a new expression upon getter property access (.)
        Expression.metaClass.propertyMissing << { String name ->
            delegate.properties << new Property(name)
            return delegate
        }
        
        // create a new assignment upon setter property access (=)
        // note than getter has higher precedence than setter property access
        Expression.metaClass.propertyMissing << { String name, value ->
            delegate.properties << new Property(name)
            instance.assignments << new Assignment(delegate, value)
        }
        
        Eval.me("instance", instance, """
import ch.codebulb.codegenerationcompared.groovy.*
import ch.codebulb.codegenerationcompared.structure.*
""" + input + """
public propertyMissing(String name) {
    // create a new property for unknown variable references
    // and pack it into a new expression
    new Expression([new Property(name)])
}
public notNull(Expression condition, Closure closure) {
    // pure delegate
    instance.notNull(condition, closure)
}
""")
        return Assignment.toString(nestAssignments(instance.assignments))
    }
    
    /**
     * Nests assignments in a flat list into blocks of assignments
     * where "start" and "end" block markers are present.
     */
    private static List<Assignment> nestAssignments(List<Assignment> assignments) {
        AssignmentBlock currentBlock
        return assignments.collect {
            // "start" marker block
            if (it in AssignmentBlock && it.condition != null) {
                currentBlock = it
                return null
            }
            
            if (currentBlock == null) {
                return it // a simple assignment, not part of a block
            }
            else {
                 // "end" marker block
                if (it in AssignmentBlock) {
                    assert null == it.condition
                    def ret = currentBlock
                    currentBlock = null
                    return ret
                }
                // an assignment within a block
                else {
                    currentBlock.assignments << it
                    return null
                }
            }
        }.findAll {it != null}
    }

    protected notNull(Expression condition, Closure closure) {
        // the actual block which also serves as the "start" marker block
        assignments << new AssignmentBlock(condition)
        // create all the block's child assignments
        closure()
        // "end" marker block
        assignments << new AssignmentBlock()
    }
}
