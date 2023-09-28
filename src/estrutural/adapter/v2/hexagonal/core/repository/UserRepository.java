package src.estrutural.adapter.v2.hexagonal.core.repository;

import src.estrutural.adapter.v2.hexagonal.core.model.User;

import java.util.List;

public interface UserRepository {
    void save(User user);
    List<User> findAll();
}
