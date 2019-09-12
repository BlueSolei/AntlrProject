package com.bluesolei;

import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import com.bluesolei.parser.*;

public class Main {

    public static void main(String[] args) {
        SimpleGrammarLexer lexer = new SimpleGrammarLexer(CharStreams.fromString("Hello Shaul!"));
        SimpleGrammarParser parser = new SimpleGrammarParser(new CommonTokenStream(lexer));

        String name = parser.main().name().getText();

        System.out.println("Hello " + name);
    }
}
