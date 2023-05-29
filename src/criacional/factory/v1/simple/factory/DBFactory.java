package src.criacional.factory.v1.simple.factory;

import src.criacional.factory.v1.utils.entities.MongoDB;
import src.criacional.factory.v1.utils.entities.OracleDB;
import src.criacional.factory.v1.utils.entities.PostegresDB;
import src.criacional.factory.v1.utils.model.Database;

public class DBFactory {
	public static Database instance(String type){
		Database db = null;
		if(type.equalsIgnoreCase("mongo")){
			db = new MongoDB();
		}
		else if(type.equalsIgnoreCase("oracle")){
			db = new OracleDB();
			db.query("SELECT * FROM USER");
		}
		else if(type.equalsIgnoreCase("postegres")){
			db = new PostegresDB();
			db.query("INSERT INTO users VALUES ('alex', 33)");
		}
		else{
			System.out.println("Error: DataBase not configured");
		}

		assert db != null;
		db.DBType();
		return db;
	}
}
