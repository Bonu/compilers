
import cpparser.analysis.DepthFirstAdapter;
import cpparser.node.AAdde5E5;
import cpparser.node.AArgsCommaExprArgs;
import cpparser.node.AArgsExprArgs;
import cpparser.node.AArrayRefFieldAccess;
import cpparser.node.AArrayRefIdArrayRef;
import cpparser.node.AArrayRefIddotidArrayRef;
import cpparser.node.ABlockClassMember;
import cpparser.node.ABlockSimpleStmt;
import cpparser.node.ABoolType;
import cpparser.node.ACharType;
import cpparser.node.AClassDeclareSingleClassDecls;
import cpparser.node.AClassDeclsMultipleClassDecls;
import cpparser.node.AClassDeclsProgram;
import cpparser.node.AClassEmptyClassDecl;
import cpparser.node.AClassMemberDeclsClassMemberDecls;
import cpparser.node.AClassMemberSingleClassMemberDecls;
import cpparser.node.AClassMembersClassDecl;
import cpparser.node.ACondition;
import cpparser.node.ADoWhileSimpleStmt;
import cpparser.node.AE3eqe3E2;
import cpparser.node.AE3gte3E2;
import cpparser.node.AE3gteqe3E2;
import cpparser.node.AE3lte3E2;
import cpparser.node.AEmptyBlockBlock;
import cpparser.node.AExprAndExpr;
import cpparser.node.AExprOnlyExpr;
import cpparser.node.AExprOrExpr;
import cpparser.node.AFaIdDotIdFieldAccess;
import cpparser.node.AFieldClassMember;
import cpparser.node.AFloatType;
import cpparser.node.AFormalFormals;
import cpparser.node.AFormals;
import cpparser.node.AIdentifierExprLocalDecl;
import cpparser.node.AIdentifierIntLitLocalDecl;
import cpparser.node.AIdentifierLocalDecl;
import cpparser.node.AIfElseStmtStmt;
import cpparser.node.AIntType;
import cpparser.node.ALocalDeclSimpleStmt;
import cpparser.node.AManyStmtsStmts;
import cpparser.node.AMethodArgumentsMethodDecl;
import cpparser.node.AMethodCallIdArgsMethodCall;
import cpparser.node.AMethodCallIddoidArgsMethodCall;
import cpparser.node.AMethodCallIddotidMethodCall;
import cpparser.node.AMethodClassMember;
import cpparser.node.ATClassClassHdr;
import cpparser.node.AWhileSimpleStmt;

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
//		symtab.enterScope(cls);
	}

	@Override
	public void outAMethodClassMember(AMethodClassMember node) {
		symtab.leaveScope();
	}

	@Override
	public void outAClassDeclsProgram(AClassDeclsProgram node) {
		// TODO Auto-generated method stub
		super.outAClassDeclsProgram(node);
	}

	@Override
	public void outAClassDeclsMultipleClassDecls(AClassDeclsMultipleClassDecls node) {
		// TODO Auto-generated method stub
		super.outAClassDeclsMultipleClassDecls(node);
	}

	@Override
	public void outAClassDeclareSingleClassDecls(AClassDeclareSingleClassDecls node) {
		// TODO Auto-generated method stub
		super.outAClassDeclareSingleClassDecls(node);
	}

	@Override
	public void outAClassMembersClassDecl(AClassMembersClassDecl node) {
		// TODO Auto-generated method stub
		super.outAClassMembersClassDecl(node);
	}

	@Override
	public void outAClassEmptyClassDecl(AClassEmptyClassDecl node) {
		// TODO Auto-generated method stub
		super.outAClassEmptyClassDecl(node);
	}

	@Override
	public void outAClassMemberDeclsClassMemberDecls(AClassMemberDeclsClassMemberDecls node) {
		// TODO Auto-generated method stub
		super.outAClassMemberDeclsClassMemberDecls(node);
	}

	@Override
	public void outAClassMemberSingleClassMemberDecls(AClassMemberSingleClassMemberDecls node) {
		// TODO Auto-generated method stub
		super.outAClassMemberSingleClassMemberDecls(node);
	}

	@Override
	public void outAFieldClassMember(AFieldClassMember node) {
		// TODO Auto-generated method stub
		super.outAFieldClassMember(node);
	}

	@Override
	public void outABlockClassMember(ABlockClassMember node) {
		// TODO Auto-generated method stub
		super.outABlockClassMember(node);
	}

	@Override
	public void outAMethodArgumentsMethodDecl(AMethodArgumentsMethodDecl node) {
		// TODO Auto-generated method stub
		super.outAMethodArgumentsMethodDecl(node);
	}

	@Override
	public void outAFormalFormals(AFormalFormals node) {
		// TODO Auto-generated method stub
		super.outAFormalFormals(node);
	}

	@Override
	public void outAFormals(AFormals node) {
		// TODO Auto-generated method stub
		super.outAFormals(node);
	}

	@Override
	public void outAEmptyBlockBlock(AEmptyBlockBlock node) {
		// TODO Auto-generated method stub
		super.outAEmptyBlockBlock(node);
	}

	@Override
	public void outAIntType(AIntType node) {
		// TODO Auto-generated method stub
		super.outAIntType(node);
	}

	@Override
	public void outACharType(ACharType node) {
		// TODO Auto-generated method stub
		super.outACharType(node);
	}

	@Override
	public void outABoolType(ABoolType node) {
		// TODO Auto-generated method stub
		super.outABoolType(node);
	}

	@Override
	public void outAFloatType(AFloatType node) {
		// TODO Auto-generated method stub
		super.outAFloatType(node);
	}

	@Override
	public void outAManyStmtsStmts(AManyStmtsStmts node) {
		// TODO Auto-generated method stub
		super.outAManyStmtsStmts(node);
	}

	@Override
	public void outAIfElseStmtStmt(AIfElseStmtStmt node) {
		// TODO Auto-generated method stub
		super.outAIfElseStmtStmt(node);
	}

	@Override
	public void outACondition(ACondition node) {
		// TODO Auto-generated method stub
		super.outACondition(node);
	}

	@Override
	public void outAIdentifierLocalDecl(AIdentifierLocalDecl node) {
		// TODO Auto-generated method stub
		super.outAIdentifierLocalDecl(node);
	}

	@Override
	public void outAIdentifierExprLocalDecl(AIdentifierExprLocalDecl node) {
		// TODO Auto-generated method stub
		super.outAIdentifierExprLocalDecl(node);
	}

	@Override
	public void outAIdentifierIntLitLocalDecl(AIdentifierIntLitLocalDecl node) {
		// TODO Auto-generated method stub
		super.outAIdentifierIntLitLocalDecl(node);
	}

	@Override
	public void outALocalDeclSimpleStmt(ALocalDeclSimpleStmt node) {
		// TODO Auto-generated method stub
		super.outALocalDeclSimpleStmt(node);
	}

	@Override
	public void outABlockSimpleStmt(ABlockSimpleStmt node) {
		// TODO Auto-generated method stub
		super.outABlockSimpleStmt(node);
	}

	@Override
	public void outAWhileSimpleStmt(AWhileSimpleStmt node) {
		// TODO Auto-generated method stub
		super.outAWhileSimpleStmt(node);
	}

	@Override
	public void outADoWhileSimpleStmt(ADoWhileSimpleStmt node) {
		// TODO Auto-generated method stub
		super.outADoWhileSimpleStmt(node);
	}

	@Override
	public void outAFaIdDotIdFieldAccess(AFaIdDotIdFieldAccess node) {
		// TODO Auto-generated method stub
		super.outAFaIdDotIdFieldAccess(node);
	}

	@Override
	public void outAArrayRefFieldAccess(AArrayRefFieldAccess node) {
		// TODO Auto-generated method stub
		super.outAArrayRefFieldAccess(node);
	}

	@Override
	public void outAArrayRefIdArrayRef(AArrayRefIdArrayRef node) {
		// TODO Auto-generated method stub
		super.outAArrayRefIdArrayRef(node);
	}

	@Override
	public void outAArrayRefIddotidArrayRef(AArrayRefIddotidArrayRef node) {
		// TODO Auto-generated method stub
		super.outAArrayRefIddotidArrayRef(node);
	}

	@Override
	public void outAMethodCallIdArgsMethodCall(AMethodCallIdArgsMethodCall node) {
		// TODO Auto-generated method stub
		super.outAMethodCallIdArgsMethodCall(node);
	}

	@Override
	public void outAMethodCallIddotidMethodCall(AMethodCallIddotidMethodCall node) {
		// TODO Auto-generated method stub
		super.outAMethodCallIddotidMethodCall(node);
	}

	@Override
	public void outAMethodCallIddoidArgsMethodCall(AMethodCallIddoidArgsMethodCall node) {
		// TODO Auto-generated method stub
		super.outAMethodCallIddoidArgsMethodCall(node);
	}

	@Override
	public void outAArgsExprArgs(AArgsExprArgs node) {
		// TODO Auto-generated method stub
		super.outAArgsExprArgs(node);
	}

	@Override
	public void outAArgsCommaExprArgs(AArgsCommaExprArgs node) {
		// TODO Auto-generated method stub
		super.outAArgsCommaExprArgs(node);
	}

	@Override
	public void outAExprOrExpr(AExprOrExpr node) {
		// TODO Auto-generated method stub
		super.outAExprOrExpr(node);
	}

	@Override
	public void outAExprAndExpr(AExprAndExpr node) {
		// TODO Auto-generated method stub
		super.outAExprAndExpr(node);
	}

	@Override
	public void outAExprOnlyExpr(AExprOnlyExpr node) {
		// TODO Auto-generated method stub
		super.outAExprOnlyExpr(node);
	}

	@Override
	public void outAE3lte3E2(AE3lte3E2 node) {
		// TODO Auto-generated method stub
		super.outAE3lte3E2(node);
	}

	@Override
	public void outAE3gte3E2(AE3gte3E2 node) {
		// TODO Auto-generated method stub
		super.outAE3gte3E2(node);
	}

	@Override
	public void outAE3gteqe3E2(AE3gteqe3E2 node) {
		// TODO Auto-generated method stub
		super.outAE3gteqe3E2(node);
	}

	@Override
	public void outAE3eqe3E2(AE3eqe3E2 node) {
		// TODO Auto-generated method stub
		super.outAE3eqe3E2(node);
	}

	@Override
	public void outAAdde5E5(AAdde5E5 node) {
		// TODO Auto-generated method stub
		super.outAAdde5E5(node);
	}
    
	
  
	
	//  your evaluation rules (i.e., method overrides) go here.

}
/*        end of SymTabBuilder       */










