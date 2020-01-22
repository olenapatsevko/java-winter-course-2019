import java.util.function.Function;

public class Main {

    public static void main(String[] args) {
        final String name = "alyx";
        Function<String, String> function = x -> {

            System.out.println(x);
            return "Hello" + name;
        };
    }
}
