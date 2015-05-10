package ch.codebulb.codegenerationcompared.antlr

import ch.codebulb.codegenerationcompared.antlr.generated.*
import ch.codebulb.codegenerationcompared.structure.Assignment
import org.antlr.v4.runtime.*
import org.antlr.v4.runtime.tree.*

class AntlrTranslator {
    public static String translate(String input) {
        ANTLRInputStream stream = new ANTLRInputStream(input)
        PropertyAssignmentLexer lexer = new PropertyAssignmentLexer(stream)
        CommonTokenStream tokens = new CommonTokenStream(lexer)
        PropertyAssignmentParser parser = new PropertyAssignmentParser(tokens)
        // Start parsing at the root node
        ParseTree file = parser.file()

        ParseTreeWalker walker = new ParseTreeWalker()
        AntlrTranslatorListener listener = new AntlrTranslatorListener()
        walker.walk(listener, file)
        return Assignment.toString(listener.assignments[file])
    }
}
