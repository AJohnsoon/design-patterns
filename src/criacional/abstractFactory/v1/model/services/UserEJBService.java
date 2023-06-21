package src.criacional.abstractFactory.v1.model.services;

import src.criacional.abstractFactory.v1.model.interfaces.UserService;

public class UserEJBService implements UserService {

    @Override
    public void save(String name) {
        System.out.println("[EJB] Usuário: [" + name.toUpperCase() + "] salvo com sucesso!");
    }

    @Override
    public boolean delete(Integer id) {
        System.out.println("[EJB]Removendo usário de ID: " + id);
        return true;
    }
    
}
