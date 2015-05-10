package ch.codebulb.codegenerationcompared.structure

import groovy.transform.TupleConstructor

@TupleConstructor
@TupleConstructor(includes="condition")
class AssignmentBlock extends Assignment {
    Expression condition
    List<Assignment> assignments = []
    
    public String toString() {
        """if (${condition.asGetter()} != null) {
\t${assignments.join("\n\t")}
}"""
    }
}
