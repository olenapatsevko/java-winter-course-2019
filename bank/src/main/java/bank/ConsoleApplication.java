package bank;

import bank.domain.User;
import bank.service.PasswordEncryption;

import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

public class ConsoleApplication {
    public static void main(String[] args) {
        //  final User user = new User(1,"Email.com", "password", null);
        //final UserServiceImp userService =  new UserServiceImp(new UserRepositoryImpl(), passwordEncruptor, userValidator);
        //final boolean b = userService.login("vasia", "mama");
        final User user = User.builder()
                .withId(1)
                .withEmail("ss")
                .withPassword("asd")
                .withAccounts(null)
                .build();

        PasswordEncryption passwordEncryption = new PasswordEncryption();
        try {
            System.out.println(passwordEncryption.hashPassword("mama"));
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            e.printStackTrace();
        }
    }
}
