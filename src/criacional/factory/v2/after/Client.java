package src.criacional.factory.v2.after;

import src.criacional.factory.v2.after.factory.IPhone11ProFactory;
import src.criacional.factory.v2.after.factory.IPhoneFactory;
import src.criacional.factory.v2.after.factory.IPhoneXFactory;
import src.criacional.factory.v2.utils.model.IPhone;

public class Client {
	public static void main(String[] args){
		System.out.println("2º)\n");

		IPhoneFactory iphoneX = new IPhoneXFactory();
		IPhoneFactory iphone11pro = new IPhone11ProFactory();

		System.out.println("### Ordering an iPhoneX");
		IPhone deviceX = iphoneX.orderItem();
		System.out.println(deviceX);

		System.out.println("\n ___________________ \n");

		System.out.println("### Ordering an iPhone11 PRO");
		IPhone devicePro = iphone11pro.orderItem();
		System.out.println(devicePro);
	}
}
