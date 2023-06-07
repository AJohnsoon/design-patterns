package src.criacional.factory.v2.halfSimple.factory;

import src.criacional.factory.v2.utils.entities.IPhone11;
import src.criacional.factory.v2.utils.entities.IPhone11Pro;
import src.criacional.factory.v2.utils.model.IPhone;

public class IPhone11Factory extends IPhoneFactory{

    public IPhone createIPhone(String model) {
        if(model.equalsIgnoreCase("standard")){
            return new IPhone11();
        }
        else if(model.equalsIgnoreCase("highEnd")){
            return new IPhone11Pro();
        }
        else return null;
    }
}
