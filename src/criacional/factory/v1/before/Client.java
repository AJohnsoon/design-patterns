package src.criacional.factory.v1.before;

import src.criacional.factory.v1.before.database.OracleDB;

public class Client {

	public static void main(String[] args) {
		OracleDB db = new OracleDB();
		db.query("SELECT * FROM users");
		db.update("INSERT INTO users VALUES ('User', 25)");

		//O que acontece se você tiver que mudar para um banco de dados postgres?
	}
}
