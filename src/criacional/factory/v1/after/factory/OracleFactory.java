package src.criacional.factory.v1.after.factory;

import src.criacional.factory.v1.after.model.OracleDB;
import src.criacional.factory.v1.after.database.DB;

public class OracleFactory implements DBFactory{
	@Override
	public DB getDatabase() {
		return new OracleDB();
	}
}
