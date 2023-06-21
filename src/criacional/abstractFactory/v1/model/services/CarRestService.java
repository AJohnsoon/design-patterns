package src.criacional.abstractFactory.v1.model.services;

import src.criacional.abstractFactory.v1.model.interfaces.CarService;

public class CarRestService implements CarService {

    @Override
    public void save(String model) {
        System.out.println("[REST] Salvando modelo de carro: " + model);
    }

    @Override
    public void update(String newModel) {
        System.out.println("[REST] Atualizando modelo para: " + newModel);
    }
    
}
