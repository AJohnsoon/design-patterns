package src.criacional.monostate.connections;

public class Connection {
	private boolean inUse;

	public Connection(){
		this.inUse = false;
	}

	public Object query(String sql){
		System.out.println("Running '"+ sql + "' in connection " + this.inUse);
		return null;
	}

	public boolean isInUse() {
		return inUse;
	}

	public void setInUse(boolean inUse) {
		this.inUse = inUse;
	}
}
