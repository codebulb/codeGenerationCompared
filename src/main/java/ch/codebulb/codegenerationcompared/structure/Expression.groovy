package ch.codebulb.codegenerationcompared.structure

import groovy.transform.TupleConstructor

@TupleConstructor
class Expression {
    List<Property> properties = []
    
    public String asGetter() {
        properties[0].name + "." + properties[1..-1].collect {it.asGetter()}.join(".")
    }
    
    public String asSetter(Expression value) {
        properties[0].name + "." + 
            (properties.size() > 2 ? (properties[1..-2].collect {it.asGetter()}.join(".") + ".") : "") + 
            properties[-1].asSetter(value.asGetter())
    }
}
