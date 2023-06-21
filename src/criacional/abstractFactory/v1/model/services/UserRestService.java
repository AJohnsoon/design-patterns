package src.criacional.abstractFactory.v1.model.services;

import src.criacional.abstractFactory.v1.model.interfaces.UserService;

public class UserRestService implements UserService {

    @Override
    public void save(String name) {
        System.out.println("[REST] Usuário: [" + name.toUpperCase() + "] salvo com sucesso!");
    }

    @Override
    public boolean delete(Integer id) {
        System.out.println("[REST] Removendo usário de ID: " + id);
        return true;
    }
    
}
