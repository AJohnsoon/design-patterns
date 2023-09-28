package src.estrutural.adapter.v2.hexagonal.controller;

import src.estrutural.adapter.v2.hexagonal.core.model.User;
import src.estrutural.adapter.v2.hexagonal.core.repository.UserRepository;
import src.estrutural.adapter.v2.hexagonal.core.service.UserService;
import src.estrutural.adapter.v2.hexagonal.infra.UserDatabaseAdapter;

import java.util.List;
import java.util.Map;

public class UserController {
    private UserService userService;

    public UserController() {
        UserRepository repository = new UserDatabaseAdapter();
        userService = new UserService(repository);
    }

    public Integer saveUser(Map<String, String> object) {
        try {
            User userObject = new User(object.get("name"), object.get("email"), object.get("password"));
            userService.save(userObject);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return 400;
        }
        return 201;
    }

    public Integer listAllUsers() {
        List<User> userList = userService.findAll();
        userList.forEach(System.out::println);
        return 200;
    }
}
