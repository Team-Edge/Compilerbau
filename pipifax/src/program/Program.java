package program;

import java.io.IOException;

import org.antlr.v4.runtime.BufferedTokenStream;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.UnbufferedTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.pattern.ParseTreeMatch;
import org.antlr.v4.runtime.tree.pattern.ParseTreePattern;

import antlrGen.PipifaxLexer;
import antlrGen.PipifaxParser;

public class Program {

	public Program() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//CharStream fileIn = new ANTLRFileStream("./examples/exampleProgram.txt");
		CharStream fileIn = CharStreams.fromFileName("./examples/exampleProgram.txt");
		PipifaxLexer scanner = new PipifaxLexer(fileIn);
		TokenStream tokens = new CommonTokenStream(scanner);
		PipifaxParser parser = new PipifaxParser(tokens);
		
		
		ParseTree t = parser.startRule();
		System.out.println(t.toStringTree(parser));

		System.out.println();
		/*
		ParseTreePattern p = parser.compileParseTreePattern("<program>", PipifaxParser.RULE_startRule);
		ParseTreeMatch m = p.match(t);
		String id = m.get(PipifaxParser.VOCABULARY.getSymbolicName(PipifaxParser.RULE_program)).toStringTree();
		
		System.out.println(id);
		*/
		
	}

}
