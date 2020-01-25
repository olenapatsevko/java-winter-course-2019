package bank;


import bank.domain.User;
import bank.repository.impl.UserRepositoryImpl;
import bank.service.PasswordEncryption;
import bank.service.impl.UserServiceImp;
import bank.service.validator.UserValidator;

public class ConsoleApplication {
    public static void main(String[] args) {

        final UserServiceImp userService = new UserServiceImp(new UserRepositoryImpl(), new PasswordEncryption(), new UserValidator());
        final User user = User.builder()
                .withId(1)
                .withEmail("olena@gmail.com")
                .withPassword("Q1234@fghj")
                .withAccounts(null)
                .build();
        System.out.println(userService.register(user).toString());
        System.out.println(userService.login("olena@gmail.com", "Q1234@fghj"));


    }


}

