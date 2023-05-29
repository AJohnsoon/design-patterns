package src.criacional.factory.v1.utils.entities;

import src.criacional.factory.v1.utils.model.Database;

public class OracleDB extends Database {
	@Override
	public void DBType() {
		System.out.println("Database info:");
		System.out.println("\t - Oracle database");
		System.out.println("\t - Data type: SQL");
		System.out.println("\t - Instance of AWS");
		System.out.println("\t \t - region: AWS GovCloud (US-West)");
		System.out.println("\t \t - Code: us-gov-west-1");
		System.out.println("\t \t - # of Zones: 3");
		System.out.println("\t \t - Location: Eastern");
		System.out.println("\t \t - State: Oregon");
		System.out.println("\t \t - Opened: 2011");
	}
}
