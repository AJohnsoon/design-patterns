package src.criacional.singleton;

import src.criacional.singleton.connections.Connection;
import src.criacional.singleton.connections.ConnectionPool;

public class Client {
	public static void main(String[] args) {
		doQuery1();
		doQuery2();
		doQuery3();
	}

	public static void doQuery1(){
		ConnectionPool pool = ConnectionPool.getInstance();
		Connection conn = pool.getConnection();

		if(conn != null)
			conn.query("SELECT * FROM TABLE1");
	}

	public static void doQuery2(){
		ConnectionPool pool = ConnectionPool.getInstance();
		Connection conn = pool.getConnection();

		if(conn != null)
			conn.query("SELECT * FROM TABLE2");
	}

	public static void doQuery3(){
		ConnectionPool pool = ConnectionPool.getInstance();
		Connection conn = pool.getConnection();

		if(conn != null)
			conn.query("SELECT * FROM TABLE3");
	}
}
