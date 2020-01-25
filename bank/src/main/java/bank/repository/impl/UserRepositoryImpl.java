package bank.repository.impl;

import bank.domain.User;
import bank.repository.UserRepository;

import java.util.*;

public class UserRepositoryImpl implements UserRepository {


    private Map<Integer, User> userMap = new HashMap<>();

    @Override
    public Optional<User> findByEmail(String email) {
        return userMap.values().stream().filter(user -> user.getEmail().equals(email)).findFirst();
    }

    @Override
    public void save(User entity) {
        userMap.put(entity.getId(), entity);
    }

    @Override
    public Optional<User> findById(Integer id) {
        return Optional.of(userMap.get(id));
    }

    @Override
    public List<User> findAll(int page, int ItemsPerPage) {
        //implement per stream
        return new ArrayList<>(userMap.values());
    }

    @Override
    public void update(User entity) {
        userMap.replace(entity.getId(), entity);
    }

    @Override
    public void deleteById(Integer id) {
        userMap.remove(id);
    }

    @Override
    public long count() {
        return userMap.size();
    }
}
