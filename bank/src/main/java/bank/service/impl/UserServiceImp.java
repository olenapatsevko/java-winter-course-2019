package bank.service.impl;

import bank.domain.User;
import bank.repository.Page;
import bank.repository.UserRepository;
import bank.repository.impl.Pageable;
import bank.service.PasswordEncryption;
import bank.service.UserService;
import bank.service.validator.Validate;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.util.List;


public class UserServiceImp implements UserService {
    public static final int USER_PER_PAGE = 5;

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


    public List<User> findAll(int page) {
        //page should be valid or if page is not valid use default value
        //if page num is > maxPage , maxPage
        final Pageable<User> userPageable = userRepository.findAll(new Page(page, USER_PER_PAGE));
        return null;
    }
}
