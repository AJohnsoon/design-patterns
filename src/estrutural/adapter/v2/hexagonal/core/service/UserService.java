package src.estrutural.adapter.v2.hexagonal.core.service;

import src.estrutural.adapter.v2.hexagonal.core.model.User;
import src.estrutural.adapter.v2.hexagonal.core.repository.UserRepository;

import java.util.List;

public class UserService {
    private UserRepository userRepository;

    public UserService (UserRepository repository){
       this.userRepository = repository;
    }

    public void save (User userObject) {
        boolean alreadyUserEmail = userRepository.findAll().stream()
                .anyMatch(userDb -> userDb.getEmail().equalsIgnoreCase(userObject.getEmail()));
        if(alreadyUserEmail) throw new RuntimeException("Email address already exists!");
        userRepository.save(userObject);
    }

    public List<User> findAll(){
        return userRepository.findAll();
    }
}
