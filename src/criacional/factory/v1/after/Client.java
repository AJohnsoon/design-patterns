package src.criacional.factory.v1.after;

import src.criacional.factory.v1.after.factory.OracleFactory;
import src.criacional.factory.v1.after.database.DB;

public class Client {
	public static void main(String[] args) {
//		DB db = new PostgresFactory().getDatabase();
		DB db = new OracleFactory().getDatabase();
		db.query("SELECT * FROM users");
		db.update("INSERT INTO users VALUES ('User', 25)");
	}
}
