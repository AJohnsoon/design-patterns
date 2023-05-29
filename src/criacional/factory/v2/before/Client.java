package src.criacional.factory.v2.before;

import src.criacional.factory.v2.before.model.*;

public class Client {
	public IPhone orderItem(String generation, String level){
		IPhone device = null;

		if(generation.equalsIgnoreCase("11")){
			if(level.equalsIgnoreCase("standard")){
				device = new IPhone11();
			} else if (level.equalsIgnoreCase("highEnd")) {
				device = new IPhone11Pro();
			}
		}
		else if(generation.equalsIgnoreCase("x")){
			if(level.equalsIgnoreCase("standard")){
				device = new IPhoneX();
			} else if (level.equalsIgnoreCase("highEnd")) {
				device = new IPhoneXS();
			}
		}
		else if(generation.equalsIgnoreCase("SE")){
			if (level.equalsIgnoreCase("standard")){
				device = new IPhoneSE();
			}
		}

		assert device != null;
		device.getHardware();
		device.assemble();
		device.certificates();
		device.pack();

		return device;
	}

	public static void main(String[] args){
		Client client = new Client();
		System.out.println("### Ordering an iPhone XS");
		IPhone iphoneX = client.orderItem("x", "highEnd");
		System.out.println(iphoneX);

		System.out.println("\n _______________________ \n");

		System.out.println("### Ordering an iPhone11");
		IPhone iphone11 = client.orderItem("11", "highEnd");
		System.out.println(iphone11);

		System.out.println("\n _______________________ \n");

		System.out.println("### Ordering an iPhone11");
		IPhone iphoneSE = client.orderItem("SE", "standard");
		System.out.println(iphoneSE);

	}
}
