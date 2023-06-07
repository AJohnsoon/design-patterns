package src.criacional.factory.v2.halfSimple;

import src.criacional.factory.v2.halfSimple.factory.IPhone11Factory;
import src.criacional.factory.v2.halfSimple.factory.IPhoneSEFactory;
import src.criacional.factory.v2.halfSimple.factory.IPhoneXFactory;
import src.criacional.factory.v2.halfSimple.factory.PhoneFactory;
import src.criacional.factory.v2.utils.model.IPhone;

public class Client {
    public static void main(String[] args){
        PhoneFactory iphone11 = new IPhone11Factory();
        PhoneFactory iphonex = new IPhoneXFactory();
        PhoneFactory iphonese = new IPhoneSEFactory();

        System.out.println("\t IPHONE X");
        IPhone iPhonex = iphonex.createIPhoneModel("standard");
        iPhonex.getHardware();
        iPhonex.assemble();
        System.out.println(iPhonex);

        System.out.println("\n ######################################################### \n");
        System.out.println("\t IPHONE 11");

        IPhone iPhone11 = iphone11.createIPhoneModel("highEnd");
        iPhone11.getHardware();
        iPhone11.pack();
        System.out.println(iPhone11);

        System.out.println("\n ######################################################### \n");
        System.out.println("\t IPHONE SE");
        IPhone iPhoneSE = iphonese.createIPhoneModel("");
        iPhoneSE.getHardware();
        iPhoneSE.certificates();
        System.out.println(iPhoneSE);
    }
}
