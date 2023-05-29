package src.criacional.factory.v1.utils.entities;

import src.criacional.factory.v1.utils.model.Database;

public class PostegresDB extends Database {
	@Override
	public void DBType() {
		System.out.println("Database info:");
		System.out.println("\t - Postegres database");
		System.out.println("\t - Data type: SQL");
		System.out.println("\t - Instance of AWS");
		System.out.println("\t \t - region: Canada (Central)");
		System.out.println("\t \t - Code: ca-central-1");
		System.out.println("\t \t - # of Zones: 3");
		System.out.println("\t \t - Location: Montreal");
		System.out.println("\t \t - Country: Canada");
		System.out.println("\t \t - Opened: 2016");
	}
}
