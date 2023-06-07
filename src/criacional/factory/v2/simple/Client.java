package src.criacional.factory.v2.simple;

import src.criacional.factory.v2.simple.factory.IPhoneSimpleFactory;
import src.criacional.factory.v2.utils.model.IPhone;

public class Client {
    public static void main(String[] args){
        System.out.println("Iphone SE");
        IPhone iphoneSE = IPhoneSimpleFactory.createIPhoneItem("Se", "");
        iphoneSE.getHardware();
        iphoneSE.certificates();
        System.out.println(iphoneSE);

        System.out.println("\n ################################ \n");
        System.out.println("Iphone 11");
        IPhone iphone11 = IPhoneSimpleFactory.createIPhoneItem("11", "standard");
        iphone11.getHardware();
        iphone11.pack();
        System.out.println(iphone11);

        
        System.out.println("\n ################################ \n");
        System.out.println("Iphone X");
        IPhone iphoneX = IPhoneSimpleFactory.createIPhoneItem("x", "highEnd");
        iphoneX.getHardware();
        iphoneX.assemble();
        System.out.println(iphoneX);
    }
}
