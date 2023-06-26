package src.criacional.monostate.connections;

public class ConnectionPool {
	private final static int POOL_SIZE = 2;
	private static Connection[] connections;

	static {
		System.out.println("Creating connection pool");
		connections = new Connection[POOL_SIZE];
		for (int i=0; i < POOL_SIZE; i++) {
			connections[i] = new Connection();
		}
	}

	public ConnectionPool(){
		System.out.println("New instance of Connection Pool");
	}

	public Connection getConnection() {
		Connection connection = null;

		for (Connection conn : connections) {
			if (!conn.isInUse()){
				connection = conn;
				break;
			}
		}
		if (connection == null) {
			System.out.println("No connections available!");
			return null;
		}
		connection.setInUse(true);
		return connection;
	}

	public void leaveConnection(Connection conn) {
		conn.setInUse(false);
	}

}
