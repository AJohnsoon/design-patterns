package src.criacional.factory.v1.after.model;

import src.criacional.factory.v1.after.database.DB;

public class OracleDB implements DB {
	@Override
	public void query(String sql) {
		System.out.println("Querying " + sql + " in Oracle database");
	}

	@Override
	public void update(String sql) {
		System.out.println("Update query " + sql + " in Oracle database");
	}
}
