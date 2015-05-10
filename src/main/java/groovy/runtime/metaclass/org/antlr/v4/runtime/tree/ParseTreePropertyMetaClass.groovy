package groovy.runtime.metaclass.org.antlr.v4.runtime.tree

import groovy.transform.InheritConstructors

/**
  * Uses Groovy "magical metaprogramming package ch.codebulb.codegenerationcompared" to register
  * additional methods at application startup time
  */
@InheritConstructors
class ParseTreePropertyMetaClass extends DelegatingMetaClass {
    Object invokeMethod(Object object, String name, Object[] args) {
        switch (name) {
            case "putAt": // Delegate index write operator
                return object.put(args[0], args[1])
            case "getAt": // Delegate index read operator
                return object.get(args[0])
            default:
                super.invokeMethod object, name, args
        }
    }
}