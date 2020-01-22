package bank.injector;

import bank.domain.User;
import bank.repository.UserRepository;
import bank.repository.impl.UserRepositoryImpl;
import bank.service.PasswordEncryption;
import bank.service.UserService;
import bank.service.impl.UserServiceImp;
import bank.service.validator.UserValidator;
import bank.service.validator.Validate;

public class ApplicationInjector {

    private static final ApplicationInjector INSTANCE = new ApplicationInjector();
    private static final Validate<User> USER_VALIDATOR = new UserValidator();
    private static final PasswordEncryption PASSWORD_ENCRYPTOR = new PasswordEncryption();
    public static final UserRepository USER_REPOSITORY = new UserRepositoryImpl();
    public static final UserService USER_SERVICE = new UserServiceImp(USER_REPOSITORY, PASSWORD_ENCRYPTOR, USER_VALIDATOR);

    private ApplicationInjector() {

    }

    public static ApplicationInjector getInstance() {
        return INSTANCE;
    }
}
