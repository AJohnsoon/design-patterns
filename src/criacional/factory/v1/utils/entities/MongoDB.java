package src.criacional.factory.v1.utils.entities;

import src.criacional.factory.v1.utils.model.Database;

public class MongoDB extends Database {
	@Override
	public void DBType() {
		System.out.println("Database info:");
		System.out.println("\t - MongoDB");
		System.out.println("\t - Data type: NoSQL");
		System.out.println("\t - Instance of AWS");
		System.out.println("\t \t - region: US East (Ohio)");
		System.out.println("\t \t - Code: us-east-2");
		System.out.println("\t \t - # of Zones: 3");
		System.out.println("\t \t - Location: Columbus");
		System.out.println("\t \t - State: Ohio");
		System.out.println("\t \t - Opened: 2016");
	}
}
