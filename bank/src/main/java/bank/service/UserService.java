package bank.service;

import bank.domain.User;
import bank.exception.ValidationException;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

public interface UserService {

    boolean login(String email, String password) throws InvalidKeySpecException, NoSuchAlgorithmException;

    User register(User user) throws ValidationException;

}
