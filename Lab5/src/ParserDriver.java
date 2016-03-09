
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PushbackReader;

import cpparser.lexer.Lexer;
import cpparser.node.Start;
import cpparser.parser.Parser;
import cpparser.parser.ParserException;

public class ParserDriver {

	 public static void main(String[] args)
	    {

		System.out.println("Input file: " + args[0]);
		try {

			System.out.println("Starting Lexer");
			Lexer l = new Lexer(new PushbackReader(new InputStreamReader(new FileInputStream(args[0])), 1024));

			System.out.println("Starting Parser");
			Parser p = new Parser(l);
			Start tree = p.parse(); // Parse the input.

			System.out.println("Building Symbol Table");
			SymTabBuilder symTabTester = new SymTabBuilder();
			tree.apply(symTabTester);
			System.out.println("\n\nFinished Symbol Table\n\n");

			System.out.println(symTabTester.symtab());

			System.out.println("End of Symbol Table Builder test");

		} catch (ParserException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

} /* End of ParserDriver */
