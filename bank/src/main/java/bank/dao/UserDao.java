package bank.dao;

import bank.domain.User;

import java.util.Optional;

public interface UserDao extends CrudPageableDao<User> {

    Optional<User> findByEmail(String email);
}