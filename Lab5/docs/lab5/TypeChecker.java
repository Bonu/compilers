
import java.util.*;
import node.*;
import analysis.*;

public class TypeChecker extends DepthFirstAdapter
{
    private SymbolTable symtab;
    private int errorCount = 0;

    TypeChecker(SymbolTable st) {
	if (st == null) {
	    System.out.println("Invalid argument to TypeChecker constructor");
	    System.out.println("The symbol table must not be null");
	    System.exit(-1);
	}
	symtab = st;
    }
    public int errorCount() {
	return errorCount;
    }              /*      End of errorCount      */

    public boolean isAssignable(Type target, Type source) {
	// Returns true if values with type 'source' can be 
	// assigned to variables with type 'target'.  
	// Make sure 'target' is a variable.
	// This method is useful for checking method calls, assignment 
	// statements, variable initializers, etc.  
	return true;  // replace with body of this method
    }              /*      End of isAssignable      */

    protected Type checkCondition(Type t1, Token op) {
	// Checks conditional expressions in if and while statements
	if (t1.isArrayKind()) {
	    System.out.println("line " + op.getLine()
			+ ": a conditional expression must be a boolean type");
	    errorCount++;
	    return Type.boolValue;
	}
	if (! t1.isBoolType() && ! t1.isErrorType()) {
	    System.out.println("line " + op.getLine()
			+ ": a conditional expression must be a boolean type");
	    errorCount++;
	}
	return Type.boolValue;
    }              /*      End of checkCondition      */

    protected Type checkLogicalOp(Type t1, Type t2, Token op) {
	// Checks Logical operators || and &&
	if (t1.isArrayKind()) {
	    System.out.println("line " + op.getLine()
		+ ": invalid argument 1 to operator `"
		+ op.getText() + "'\n"
		+ "          -- expects a boolean argument but found "
		+ t1.toString() + "[]");
	    errorCount++;
	    return Type.boolValue;
	}
	if (t2.isArrayKind()) {
	    System.out.println("line " + op.getLine()
		+ ": invalid argument 2 to operator `"
		+ op.getText() + "'\n"
		+ "          -- expects a boolean argument but found "
		+ t2.toString() + "[]");
	    errorCount++;
	    return Type.boolValue;
	}
	if (! t1.isBoolType() && ! t1.isErrorType()) {
	    System.out.println("line " + op.getLine()
		+ ": invalid argument 1 to operator `"
		+ op.getText() + "'\n"
		+ "          -- expects a boolean argument but found "
		+ t1.toString());
	    errorCount++;
	}
	if (! t2.isBoolType() && ! t2.isErrorType()) {
	    System.out.println("line " + op.getLine()
		+ ": invalid argument 2 to operator `"
		+ op.getText() + "'\n"
		+ "          -- expects a boolean argument but found "
		+ t2.toString());
	    errorCount++;
	}
	return Type.boolValue;
    }              /*      End of checkLogicalOp      */

    protected Type checkRelationalOp(Type t1, Type t2, Token op) {
	// Checks Relational operators <, >, <=, >=, ==, and !=
	if (t1.isArrayKind()) {
	    System.out.println("line " + op.getLine()
			+ ": invalid argument 1 -- arrays cannot be compared");
	    errorCount++;
	}
	if (t2.isArrayKind()) {
	    System.out.println("line " + op.getLine()
			+ ": invalid argument 2 -- arrays cannot be compared");
	    errorCount++;
	}
	if (! t1.isErrorType() && ! t2.isErrorType()) {
	    if (! t1.isSameType(t2)) {
		if (! t1.isNumericType() || ! t2.isNumericType()) {
		    System.out.println("line " + op.getLine()
			   + ": operands to relational operator `" 
			   + op.getText() + "' have incompatible types");
		    errorCount++;
		}
	    }
	}
	return Type.boolValue;
    }              /*      End of checkRelationalOp      */

    protected Type checkUnaryBooleanOp(Type t, Token op) {
	// Checks Unary operator !
	if (t.isArrayKind()) {
	    System.out.println("line " + op.getLine()
		+ ": invalid argument to operator `"
		+ op.getText() + "'\n"
		+ "          -- expects a boolean argument but found "
		+ t.toString() + "[]");
	    errorCount++;
	    return Type.boolValue;
	}
	if (t.isBoolType()) {
	    return t;
	} else {
	    System.out.println("line " + op.getLine()
		       + ": unary operator `!' expects a boolean argument "
		       + "but found " + t.toString());
	    errorCount++;
	    return Type.boolValue;
	}
    }              /*      End of checkUnaryBooleanOp      */

    protected Type checkUnaryNumericOp(Type t, Token op) {
	// Checks Unary operators + and -
	if (t.isArrayKind()) {
	    System.out.println("line " + op.getLine()
		+ ": invalid argument to operator `"
		+ op.getText() + "'\n"
		+ "          -- expects a numeric argument but found "
		+ t.toString() + "[]");
	    errorCount++;
	    return Type.errorType;
	}
	if (t.isNumericType()) {
	    if (t.isCharType() && op.getText().equals("-")) {
		return Type.intValue;
	    } else {
		return t;
	    }
	} else {
	    System.out.println("line " + op.getLine()
		       + ": invalid argument type for unary operator `"
		       + op.getText() + "'\n"
		       + "          -- expects a numeric argument but found "
		       + t.toString());
	    errorCount++;
	    return Type.errorType;
	}
    }              /*      End of checkUnaryNumericOp      */

    protected Type checkBinaryNumericOp(Node exp1, Node exp2, Token op) {
	// Checks Binary operators +, -, *, /, and %
	// Do not forget to handle + for pairs of strings.
	Type t1 = null;  // the type attribute of exp1
	Type t2 = null;  // the type attribute of exp2

	// Below are the error messages to be printed when 
	// the type is wrong.  The first is for t1 and second for t2.

	    System.out.println("line " + op.getLine()
		   + ": invalid argument 1 ` " + exp1
		   + "' for arithmetic operator `"
		   + op.getText() + "'\n"
		   + "          -- expects a numeric argument but found "
		   + t1.toString());


	    System.out.println("line " + op.getLine()
		   + ": invalid argument 2 ` " + exp2
		   + "' for arithmetic operator `"
		   + op.getText() + "'\n"
		   + "          -- expects a numeric argument but found "
		   + t2.toString());

	return null;
    }              /*      End of checkBinaryNumericOp      */

}              /*      End of TypeChecker      */
