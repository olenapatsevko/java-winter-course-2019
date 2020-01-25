package bank.service;

import bank.domain.User;
import bank.exception.ValidationException;



public interface UserService {

    boolean login(String email, String password);

    User register(User user) throws ValidationException;

}
