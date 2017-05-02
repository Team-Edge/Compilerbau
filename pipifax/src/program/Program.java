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

import datatypes.*;
import syntaxtree.*;

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

		recursive(t);
		
		
		
		
		/*
		ParseTreePattern p = parser.compileParseTreePattern("<program>", PipifaxParser.RULE_startRule);
		ParseTreeMatch m = p.match(t);
		String id = m.get(PipifaxParser.VOCABULARY.getSymbolicName(PipifaxParser.RULE_program)).toStringTree();
		
		System.out.println(id);
		*/
		
	}
	
	public static void recursive(ParseTree t){
		
		ParseTree node = t;
		String m = node.toString();
		Root parent = null;
		
		boolean var = false;
		boolean func = false;
		boolean array = false;
		
		String name = null;
		int value;
		
		for(int i=0; i<t.getChildCount(); i++){
			t = t.getChild(i);
			
				if(t != null) 
				{
					String n = t.toString();
					//System.out.print(n);
					recursive(t);
					node = t;
					t = t.getParent();
				}
				
				m = node.toString();
				System.out.print(m);
				if(m.equals("var")){
					// Variablendeklaration
					var = true;
					
				}
				
				else if(m.equals("func")){
					// Funktionsdeklaration
				}
				
				else if(var){
					name = m;
					var = false;
				}
				
				else if(m.equals("int")){
					// deklariere var als Integer
					IntType VarType = new IntType(parent, name);
				}
				
				else if(m.equals("double")){
					// deklariere var als Double
					DoubleType VarType = new DoubleType(parent, name);
				}
				
				else if(m.equals("string")){
					// deklariere var als String
					StringType VarType = new StringType(parent, name);
				}
				
				else if(m.equals("[")){
					// deklariere var als Array
					ArrayType intVar = new ArrayType(parent, name);
					array = true;
				}
				
				else if(array);
					value = Integer.parseInt(m);
					array = false;
				}
				
				System.out.println();
		}
		
	}

}
