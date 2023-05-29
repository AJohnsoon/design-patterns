package src.criacional.factory.v1.after.factory;

import src.criacional.factory.v1.after.model.PostegresDB;
import src.criacional.factory.v1.after.database.DB;

public class PostgresFactory implements DBFactory{
	@Override
	public DB getDatabase() {
		return new PostegresDB();
	}
}
