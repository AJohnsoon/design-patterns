package src.criacional.factory.v1.halfSimple.factory;

import src.criacional.factory.v1.utils.model.Database;
import src.criacional.factory.v1.utils.entities.MongoDB;
import src.criacional.factory.v1.utils.entities.OracleDB;
import src.criacional.factory.v1.utils.entities.PostegresDB;

public class DataFactory extends DatabaseFactory{
	@Override
	protected Database createDB(String type) {
		if(type.equalsIgnoreCase("mongo")){
			return new MongoDB();
		}
		else if(type.equalsIgnoreCase("oracle")){
			return new OracleDB();
		}
		else if(type.equalsIgnoreCase("postegres")){
			return new PostegresDB();
		}
		else {
			return null;
		}
	}
}
