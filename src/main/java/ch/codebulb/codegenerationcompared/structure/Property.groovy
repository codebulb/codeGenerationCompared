package ch.codebulb.codegenerationcompared.structure

import groovy.transform.TupleConstructor

@TupleConstructor
class Property {
    String name
    
    public String asGetter() {
        "get${name.capitalize()}()"
    }
    
    public String asSetter(String value) {
        "set${name.capitalize()}($value)"
    }
}
