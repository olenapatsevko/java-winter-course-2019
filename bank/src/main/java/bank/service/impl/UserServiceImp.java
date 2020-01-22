package bank.service.impl;

import bank.domain.User;
import bank.repository.UserRepository;
import bank.service.PasswordEncryption;
import bank.service.UserService;
import bank.service.validator.Validate;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;


public class UserServiceImp implements UserService {

    private final UserRepository userRepository;
    private final PasswordEncryption passwordEncryption;
    private final Validate<User> userValidator;

    public UserServiceImp(UserRepository userRepository, PasswordEncryption passwordEncryption, Validate<User> userValidator) {
        this.userRepository = userRepository;
        this.passwordEncryption = passwordEncryption;
        this.userValidator = userValidator;
    }


    public boolean login(String email, String password) throws InvalidKeySpecException, NoSuchAlgorithmException {
        String encryptPassword = passwordEncryption.hashPassword(password);
        return userRepository
                .findByEmail(email)
                .map(User::getPassword)
                .filter(x -> x.equals(password))
                .isPresent();


    }


    public User register(User user) {
        userValidator.validate(user);
        userRepository.save(user);
        return user;
    }
}
