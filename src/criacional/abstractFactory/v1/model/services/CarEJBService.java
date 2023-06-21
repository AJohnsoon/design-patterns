package src.criacional.abstractFactory.v1.model.services;

import src.criacional.abstractFactory.v1.model.interfaces.CarService;

public class CarEJBService implements CarService{

    @Override
    public void save(String model) {
        System.out.println("[EJB] Salvando modelo de carro: " + model);
    }

    @Override
    public void update(String newModel) {
        System.out.println("[EJB] Atualizando modelo para: " + newModel);
    }
}
