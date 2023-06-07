package src.criacional.factory.v2.halfSimple.factory;

import src.criacional.factory.v2.utils.entities.IPhoneX;
import src.criacional.factory.v2.utils.entities.IPhoneXS;
import src.criacional.factory.v2.utils.model.IPhone;

public class IPhoneXFactory extends PhoneFactory {

    public IPhone createIPhone(String model){
        if(model.equalsIgnoreCase("standard")){
            return new IPhoneX();
        }
        else if(model.equalsIgnoreCase("highEnd")){
            return new IPhoneXS();
        }
        else return null;
    }
}
