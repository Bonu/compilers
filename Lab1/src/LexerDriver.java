
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.PushbackReader;
import java.util.StringTokenizer;

import cplexer.lexer.Lexer;
import cplexer.lexer.LexerException;
import cplexer.node.EOF;
import cplexer.node.TWhiteSpace;
import cplexer.node.Token;

public class LexerDriver {

	private static Token next_token(Lexer lex) {
		char c = '"';
//		float a = 1.5F ;
//		float b = .5F ;
//		float c = 1.F ;
//		float d = 1.e05F ;
//		float e = .5E+1F ;
//		float f = 1.77E-03F ;
//
//		float n = .e05F;
		float g = 0.0f;
		try {
			return lex.next();
		} catch (LexerException e) {
			System.out.println(e.getMessage());
			return null;
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			return null;
		}
	}

	private static String getClassName(Class c) {
		StringTokenizer fullName = new StringTokenizer(c.getName(), ".");
		String className = "";
		while (fullName.hasMoreTokens()) {
			className = fullName.nextToken();
		}
		return className;
	}

	public static void main(String[] args) {
		/**/
		/*** // Two Multiline comments each on a single line */

		try {
			System.out.println("Starting Lexer");
			Lexer lex = new Lexer(new PushbackReader(new InputStreamReader(new FileInputStream(args[0])), 1024));

			Token t = next_token(lex);
			int tokenCount = 0;
			while (!(t instanceof EOF)) {

				if (t == null) {
					// Skip Unknown Token
				} else if (t instanceof TWhiteSpace) {
					System.out.println("[" + t.getLine() + ", " + t.getPos() + "]  \tTWhiteSpace: \"" + t + "\"");
				} else {
					System.out.println(
							"[" + t.getLine() + ", " + t.getPos() + "]  \t" + getClassName(t.getClass()) + ": " + t);
					++tokenCount;
				}
				t = next_token(lex);
			}
			System.out.println("Token count=" + tokenCount);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		System.out.println("End of Scanner test");

	}

} // End of LexerDriver
