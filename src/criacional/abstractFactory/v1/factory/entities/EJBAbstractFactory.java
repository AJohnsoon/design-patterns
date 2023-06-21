package src.criacional.abstractFactory.v1.factory.entities;

import src.criacional.abstractFactory.v1.factory.services.ServicesAbstractFactory;
import src.criacional.abstractFactory.v1.model.interfaces.CarService;
import src.criacional.abstractFactory.v1.model.interfaces.UserService;
import src.criacional.abstractFactory.v1.model.services.CarEJBService;
import src.criacional.abstractFactory.v1.model.services.UserEJBService;

public class EJBAbstractFactory implements ServicesAbstractFactory {

    @Override
    public UserService getUserService() {
        return new UserEJBService();
    }

    @Override
    public CarService getCarService() {
        return new CarEJBService();
    }
}
