package src.criacional.factory.v1.halfSimple;

import src.criacional.factory.v1.halfSimple.factory.DataFactory;
import src.criacional.factory.v1.halfSimple.factory.DatabaseFactory;
import src.criacional.factory.v1.utils.model.Database;

public class Client {
	public static void main(String[] args){
		DatabaseFactory db = new DataFactory();

		System.out.println("### CREATING A DATABASE");
		Database database = db.createDatabase("postegres");
		database.query("SELECT * FROM users");
		database.update("INSERT INTO users VALUES ('User', 25)");
		System.out.println(database);
	}
}
