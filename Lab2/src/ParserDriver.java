
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

	try {

	    System.out.println("Starting Lexer");
	    Lexer lex = new Lexer(
		new PushbackReader( new InputStreamReader(
				new FileInputStream(args[0])), 2048));

	    System.out.println("Starting Parser");
	    Parser p = new Parser(lex);

	    Start tree = p.parse(); 		// Parse the input.

	    System.out.println(tree);

	    System.out.println("End of Parser test");

	} catch (ParserException e) {
	    System.out.println(e.getMessage());
	} catch (Exception e) {
	    System.out.println(e.getMessage());
	    e.printStackTrace();
        }
        
    
    }

}              /*  End of ParserDriver  */
