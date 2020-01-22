package part1.model;

import java.util.HashMap;
import java.util.Map;

public class RegularExpression {

    private static Map<String, String> map = new HashMap<>() {{
        put("phone", "(\\s*)[+]([0-9]{12})(\\s*)");
        put("name", "\\s*[A-Z]?[a-z]*(\\s*),?");
        put("birthday", "^((2000|2400|2800|(19|2[0-9](0[48]|[2468][048]|[13579][26])))-02-29)$"
                + "|^(((19|2[0-9])[0-9]{2})-02-(0[1-9]|1[0-9]|2[0-8]))$"
                + "|^(((19|2[0-9])[0-9]{2})-(0[13578]|10|12)-(0[1-9]|[12][0-9]|3[01]))$"
                + "|^(((19|2[0-9])[0-9]{2})-(0[469]|11)-(0[1-9]|[12][0-9]|30))");
        put("surname", "\\s*[A-Z]?[a-z]*(\\s*),?");
        put("address", "\\s*[A-z]+(\\s)*[.,;]?(\\s)*[0-9]{1,4}?(\\s)*[.,;]?[0-9]{1,4}?(\\s)*");
    }};

    public RegularExpression(String name, String expression) {
        map.put(name, expression);
    }

    public void removeExpression(String name) {
        map.remove(name);
    }

    public static String getExpression(String name) {
        return map.get(name);
    }

    public void setExpression(String name, String expression) {
        map.replace(name, expression);
    }
}
