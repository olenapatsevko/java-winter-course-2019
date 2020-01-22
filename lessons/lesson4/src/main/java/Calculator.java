import java.util.HashMap;
import java.util.Map;
import java.util.function.ToIntBiFunction;

public class Calculator {
    private static Map<String, ToIntBiFunction<Integer, Integer>> operatorCalculation = new HashMap<>() {{
        put("+", Integer::sum);
        put("-", (a, b) -> a - b);
        put("*", (a, b) -> a * b);
    }};


    public int calculate(int a, String operator, int b) {
        return operatorCalculation.get(operator).applyAsInt(a, b);
    }

}
