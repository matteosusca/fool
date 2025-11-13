package compiler.lib;

import compiler.*;
import compiler.exc.UnimplException;

public class BaseEASTVisitor<S,E extends Exception> extends BaseASTVisitor<S,E>  {
	
	protected BaseEASTVisitor() {}
    protected BaseEASTVisitor(boolean p) { super(p); }
    
    protected void printSTentry(String s) {
    	System.out.println(indent+"STentry: "+s);
	}
	
	public S visitSTentry(STentry s) throws E {throw new UnimplException();}
}








// protected BaseEASTVisitor(boolean ie) { super(ie); }
