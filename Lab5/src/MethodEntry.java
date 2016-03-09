import java.util.Set;

public class MethodEntry extends ScopeEntry {

    public MethodEntry(String name, Type returnType) {
        super(name, returnType);
    }

    /** 
     * Only instances of VariableEntry can be inserted 
     * into the scope of a MethodEntry, i.e., only the 
     * formal parameters can be inserted.
     */
    public boolean addBinding(String name, Entry symTabEntry) {
    	if(symTabEntry instanceof MethodEntry || 
    			symTabEntry instanceof VariableEntry){
    		super.addBinding(name, symTabEntry);
    		return true;
    	}
    	return false;
    }

    /** 
     * Returns a String representation of the method signature.
     * E.g., int m(int i, char c);
     */
    public String toString() {
	// The formal parameters are recorded in the super class, 
	// i.e. 'ScopeEntry'.
	// Use the iterator methods (reset(), next(), hasMore())
	// Use them to retrieve the parameters in the proper order.
	// Note that the superclass method toString() cannot be used 
	// here because the delimiters are different (comma here 
	// versus semicolon in the superclass method).
    	String output = "";
		reset(); // reset to start of the List
		while (hasMore()) {
			Entry entry = (Entry)next();
			if (entry instanceof VariableEntry) {
				output += entry ;
				output += ", ";
			}
			
		}
		if(output.length() > 2){
			output = output.substring(0,output.length()-2);
		}
		
    	return  super.type().toString() + "  " + super.name() +"(" +  output +" )";

    }
}              // End of class MethodEntry            

