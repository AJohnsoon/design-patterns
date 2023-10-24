package src.estrutural.bridge.v2.interfaces;

import src.estrutural.bridge.v2.model.User;

public abstract class UserService {
    protected UserDAO dao;

    public UserService(UserDAO dao) {
        this.dao = dao;
    }

    public abstract void save(User user);
}
