package src.criacional.factory.v2.utils.entities;

import src.criacional.factory.v2.utils.model.IPhone;

public class IPhoneXS extends IPhone {

	@Override
	public void getHardware() {
		System.out.println("Hardware list");
		System.out.println("\t- 6.5in Screen");
		System.out.println("\t- A12 Chipset");
		System.out.println("\t- 4Gb RAM");
		System.out.println("\t- 512Gb Memory");
	}
}
