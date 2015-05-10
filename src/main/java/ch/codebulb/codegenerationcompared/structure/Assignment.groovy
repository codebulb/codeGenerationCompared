package ch.codebulb.codegenerationcompared.structure

import groovy.transform.TupleConstructor

@TupleConstructor
class Assignment {
    Expression left
    Expression right
    
    public static String toString(List<Assignment> assignments) {
        return assignments.join("\n")
    }
    
    public String toString() {
        "${left.asSetter(right)};"
    }
}
