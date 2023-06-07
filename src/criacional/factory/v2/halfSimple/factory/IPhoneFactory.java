package src.criacional.factory.v2.halfSimple.factory;

import src.criacional.factory.v2.utils.model.IPhone;

public abstract class IPhoneFactory {

    public IPhone createIPhoneModel(String modelName){
        IPhone phone = null;
        phone = createIPhone(modelName);
        return phone;
    }

    protected abstract IPhone createIPhone(String model); 
}
