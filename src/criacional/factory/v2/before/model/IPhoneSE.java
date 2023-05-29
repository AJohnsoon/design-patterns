package src.criacional.factory.v2.before.model;

public class IPhoneSE extends IPhone{
	@Override
	public void getHardware() {
		System.out.println("Hardware list");
		System.out.println("\t- 4.7in Screen");
		System.out.println("\t- A15 Chipset");
		System.out.println("\t- 4Gb RAM");
		System.out.println("\t- 128Gb Memory");
	}
}
