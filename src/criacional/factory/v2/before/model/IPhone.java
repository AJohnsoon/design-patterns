package src.criacional.factory.v2.before.model;

public abstract class IPhone {

	public abstract void getHardware();

	public void assemble(){
		System.out.println("Assembling all the hardware's");
	}

	public void certificates() {
		System.out.println("Testing all the certificates");
	}

	public void pack() {
		System.out.println("Packing the device");
	}

}
