package src.criacional.factory.v2.halfSimple;

import src.criacional.factory.v2.halfSimple.factory.IPhone11Factory;
import src.criacional.factory.v2.halfSimple.factory.IPhoneSEFactory;
import src.criacional.factory.v2.halfSimple.factory.IPhoneXFactory;
import src.criacional.factory.v2.halfSimple.factory.IPhoneFactory;
import src.criacional.factory.v2.utils.model.IPhone;

public class Client {
    public static void main(String[] args){
        IPhoneFactory iPhone11Factory = new IPhone11Factory();
        IPhoneFactory iPhoneXFactory = new IPhoneXFactory();
        IPhoneFactory iPhoneSEFactory = new IPhoneSEFactory();

        System.out.println("\t IPHONE X");
        IPhone iPhonex = iPhoneXFactory.createIPhoneModel("standard");
        iPhonex.getHardware();
        iPhonex.assemble();
        System.out.println(iPhonex);

        System.out.println("\n ######################################################### \n");
        System.out.println("\t IPHONE 11");

        IPhone iPhone11 = iPhone11Factory.createIPhoneModel("highEnd");
        iPhone11.getHardware();
        iPhone11.pack();
        System.out.println(iPhone11);

        System.out.println("\n ######################################################### \n");
        System.out.println("\t IPHONE SE");
        IPhone iPhoneSE = iPhoneSEFactory.createIPhoneModel("");
        iPhoneSE.getHardware();
        iPhoneSE.certificates();
        System.out.println(iPhoneSE);
    }
}
