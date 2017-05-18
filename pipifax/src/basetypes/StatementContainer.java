package basetypes;

public interface StatementContainer extends Statement, VarContainer {

	void addStatement(Statement stat);
	
}
