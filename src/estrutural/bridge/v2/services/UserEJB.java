package src.estrutural.bridge.v2.services;

import src.estrutural.bridge.v2.interfaces.UserDAO;
import src.estrutural.bridge.v2.model.User;
import src.estrutural.bridge.v2.interfaces.UserService;

public class UserEJB extends UserService {

    public UserEJB(UserDAO dao) {
        super(dao);
    }

    @Override
    public void save(User user) {
        System.out.println("Starting a save operation through EJB Protocol!");
        dao.save(user);
    }
}
