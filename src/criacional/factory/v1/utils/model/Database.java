package src.criacional.factory.v1.utils.model;

public abstract class Database {
	public abstract void DBType();

	public void query(String sql){
		System.out.println("Querying " + sql + " in database");
	}

	public void update(String sql) {
		System.out.println("Update query " + sql + " in database");
	}
}
