package src.estrutural.bridge.v2;


import src.estrutural.bridge.v2.dao.UserMongoDAO;
import src.estrutural.bridge.v2.dao.UserMysqlDAO;
import src.estrutural.bridge.v2.dao.UserOracleDAO;
import src.estrutural.bridge.v2.model.User;
import src.estrutural.bridge.v2.services.UserEJB;
import src.estrutural.bridge.v2.services.UserRest;
import src.estrutural.bridge.v2.services.UserSoap;
import src.estrutural.bridge.v2.interfaces.UserService;

public class Client {
    public static void main(String[] args) {
        User user = new User("Test", "test@email.com", "pwd");

        System.out.println();

        UserService restOracleService = new UserRest(new UserOracleDAO());
        restOracleService.save(user);

        System.out.println("\n _________________________________ \n");

        UserService soapMongoService = new UserSoap(new UserMongoDAO());
        soapMongoService.save(user);

        System.out.println("\n _________________________________ \n");

        UserService ejbMysqlService = new UserEJB(new UserMysqlDAO());
        ejbMysqlService.save(user);
    }
}
