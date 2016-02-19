
import cpparser.analysis.DepthFirstAdapter;
import cpparser.node.AMethodClassMember;
import cpparser.node.ATClassClassHdr;

public class SymTabBuilder extends DepthFirstAdapter
{ 
    static private SymbolTable symtab = new SymbolTable();

    public SymTabBuilder(){
//    	topLevel 
    }
    
    public SymbolTable symtab() {
	return symtab;
    }

	@Override
	public void outATClassClassHdr(ATClassClassHdr node) {
		String class_name = node.getIdentifier().getText();
		ClassEntry cls = new ClassEntry(class_name);
		symtab.insertBinding(cls);
		symtab.enterScope(cls);
	}

	@Override
	public void outAMethodClassMember(AMethodClassMember node) {
		symtab.leaveScope();
	}
    
     
	
	//  your evaluation rules (i.e., method overrides) go here.

}
/*        end of SymTabBuilder       */










