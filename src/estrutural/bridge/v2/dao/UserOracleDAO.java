package src.estrutural.bridge.v2.dao;

import src.estrutural.bridge.v2.interfaces.UserDAO;
import src.estrutural.bridge.v2.model.User;

public class UserOracleDAO implements UserDAO {
    @Override
    public void save(User user) {
        System.out.println("Saving the user in the ORACLE db...");
    }
}
