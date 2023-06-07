package src.criacional.factory.v2.halfSimple.factory;

import src.criacional.factory.v2.utils.entities.IPhoneSE;
import src.criacional.factory.v2.utils.model.IPhone;

public class IPhoneSEFactory extends IPhoneFactory{
    
    public IPhone createIPhone(String model){
        if(model.equalsIgnoreCase("standard") || model.equalsIgnoreCase("highEnd") || model.equalsIgnoreCase("")){
            return new IPhoneSE();
        }
        else return null;
    }
}
