package src.criacional.factory.v2.simple.factory;

import src.criacional.factory.v2.utils.entities.IPhone11;
import src.criacional.factory.v2.utils.entities.IPhone11Pro;
import src.criacional.factory.v2.utils.entities.IPhoneSE;
import src.criacional.factory.v2.utils.entities.IPhoneX;
import src.criacional.factory.v2.utils.entities.IPhoneXS;
import src.criacional.factory.v2.utils.model.IPhone;

public class IPhoneFactory {
    
    public static IPhone createIPhoneItem(String generation, String model){
        IPhone device = null;
        if(generation.equalsIgnoreCase("x")){
            if(model.equalsIgnoreCase("standard")){
                device = new IPhoneX();
            }
            else if(model.equalsIgnoreCase("highEnd")){
                return new IPhoneXS();
            }
        }
        else if(generation.equals("11")){
            if(model.equalsIgnoreCase("standard")){
                device = new IPhone11();
            }
            else if(model.equalsIgnoreCase("highEnd")){
                device = new IPhone11Pro();
            }
        }
        else if(generation.equalsIgnoreCase("se")){
            if(model.equalsIgnoreCase("standard") || model.equalsIgnoreCase("")){
                device = new IPhoneSE();
            }
        }
        return device;
    }
}
