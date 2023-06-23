package src.criacional.singleton.v2.monostate;


import src.criacional.singleton.v2.monostate.connections.Connection;
import src.criacional.singleton.v2.monostate.connections.ConnectionPool;

public class Client {
	public static void main(String[] args) {
		doQuery1();
		doQuery2();
		doQuery3();
	}

	public static void doQuery1(){
		ConnectionPool pool = new ConnectionPool();
		Connection conn = pool.getConnection();

		if(conn != null)
			conn.query("SELECT * FROM TABLE1");
	}

	public static void doQuery2(){
		ConnectionPool pool = new ConnectionPool();
		Connection conn = pool.getConnection();

		if(conn != null)
			conn.query("SELECT * FROM TABLE2");
	}

	public static void doQuery3(){
		ConnectionPool pool = new ConnectionPool();
		Connection conn = pool.getConnection();

		if(conn != null)
			conn.query("SELECT * FROM TABLE3");
	}
}
