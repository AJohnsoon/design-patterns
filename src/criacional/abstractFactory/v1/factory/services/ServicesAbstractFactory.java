package src.criacional.abstractFactory.v1.factory.services;

import src.criacional.abstractFactory.v1.model.interfaces.CarService;
import src.criacional.abstractFactory.v1.model.interfaces.UserService;

public interface ServicesAbstractFactory {
    UserService getUserService();
    CarService getCarService();
}
