package bank;

import bank.domain.User;

public class ConsoleApplication {
    public static void main(String[] args) {
        //  final User user = new User(1,"Email.com", "password", null);
        final User user = User.builder()
                .withId(1)
                .withEmail("ss")
                .withPassword("asd")
                .withAccounts(null)
                .build();
    }
}
