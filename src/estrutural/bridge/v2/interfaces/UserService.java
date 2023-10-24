package src.estrutural.bridge.v2.services.interfaces;

import src.estrutural.bridge.v2.interfaces.UserDAO;
import src.estrutural.bridge.v2.model.entities.User;

public abstract class UserService {
    protected UserDAO dao;

    public UserService(UserDAO dao) {
        this.dao = dao;
    }

    public abstract void save(User user);
}
