package src.estrutural.adapter.v2.hexagonal.infra;

import src.estrutural.adapter.v2.hexagonal.core.model.User;
import src.estrutural.adapter.v2.hexagonal.core.repository.UserRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserDatabaseAdapter implements UserRepository {

    private Map<String, User> memoryUser = new HashMap<>();
    @Override
    public void save(User user) {
        memoryUser.put(user.getEmail(), user);
    }

    @Override
    public List<User> findAll() {
        return new ArrayList<>(memoryUser.values());
    }
}
