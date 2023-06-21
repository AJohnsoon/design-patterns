package src.criacional.abstractFactory.v1.factory.entities;

import src.criacional.abstractFactory.v1.factory.services.ServicesAbstractFactory;
import src.criacional.abstractFactory.v1.model.interfaces.CarService;
import src.criacional.abstractFactory.v1.model.interfaces.UserService;
import src.criacional.abstractFactory.v1.model.services.CarRestService;
import src.criacional.abstractFactory.v1.model.services.UserRestService;

public class RestAbstractFactory implements ServicesAbstractFactory{

    @Override
    public UserService getUserService() {
        return new UserRestService();
    }

    @Override
    public CarService getCarService() {
        return new CarRestService();
    }
    
}
