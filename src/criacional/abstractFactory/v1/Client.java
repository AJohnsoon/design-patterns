package src.criacional.abstractFactory.v1;

import src.criacional.abstractFactory.v1.factory.entities.RestAbstractFactory;
import src.criacional.abstractFactory.v1.factory.services.ServicesAbstractFactory;
import src.criacional.abstractFactory.v1.model.interfaces.CarService;
import src.criacional.abstractFactory.v1.model.interfaces.UserService;

public class Client {
    public static void main(String[] args) throws Exception {

        // ServicesAbstractFactory factory = new EJBAbstractFactory();
        ServicesAbstractFactory factory = new RestAbstractFactory();
        
        UserService userService = factory.getUserService();
        userService.save("Alex Greenwich");
        userService.delete(3);

        System.out.println("____________________________________\n");

        CarService carService = factory.getCarService();
        carService.save("HRV");
        carService.update("Nivus");

    }
}
