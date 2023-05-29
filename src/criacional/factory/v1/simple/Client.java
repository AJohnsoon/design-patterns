package src.criacional.factory.v1.simple;

import src.criacional.factory.v1.simple.factory.DBFactory;
import src.criacional.factory.v1.utils.model.Database;

public class Client  {
	public static void main(String[] args){
		System.out.println("### instance MONGO database");
		Database mongodb = DBFactory.instance("mongo");
		System.out.println(mongodb);

		System.out.println("\n_________________________\n");

		System.out.println("### instance ORACLE database");
		Database oracledb = DBFactory.instance("oracle");
		System.out.println(oracledb);

		System.out.println("\n_________________________\n");

		System.out.println("### instance POSTEGRES database");
		Database postgresdb = DBFactory.instance("postegres");
		System.out.println(postgresdb);


	}
}
