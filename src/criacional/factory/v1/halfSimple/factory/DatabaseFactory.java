package src.criacional.factory.v1.halfSimple.factory;

import src.criacional.factory.v1.utils.model.Database;

public abstract class DatabaseFactory {

	public Database createDatabase(String dbType){
		Database db = null;
		db = createDB(dbType);
		db.DBType();
		return db;
	}

	protected abstract Database createDB(String type);
}
