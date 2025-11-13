package compiler;

import compiler.lib.*;

public class STentry implements Visitable {
	int nl;
	public STentry(int n) { nl = n; }
	
	@Override
	public <S,E extends Exception> S accept(BaseASTVisitor<S,E> visitor) throws E {
		return ((BaseEASTVisitor<S,E>) visitor).visitSTentry(this);
	}
}
