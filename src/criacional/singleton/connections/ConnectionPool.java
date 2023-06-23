package src.criacional.singleton.connections;

import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {

	public final static int POOL_SIZE = 2;
	private static final  ConnectionPool instance = new ConnectionPool();
	private final List<Connection> connections = new ArrayList<>();

	public static ConnectionPool getInstance(){
		return instance;
	}

	private ConnectionPool() {
		System.out.println("Creating connection pool");
		for(int i=0; i < POOL_SIZE; i++){
			connections.add(new Connection());
		}
	}

	public Connection getConnection(){
		Connection connection = null;
		for (Connection conn : connections){
			if(!conn.isInUse()){
				connection = conn;
				break;
			}
		}
		if(connection == null){
			System.out.println("No connections available!");
			return null;
		}
		connection.setInUse(true);
		return connection;
	}

	public void leaveConnection(Connection conn){
		conn.setInUse(false);
	}
}
