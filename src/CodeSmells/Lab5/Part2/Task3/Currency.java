package CodeSmells.Lab5.Part2.Task3;

import java.util.HashMap;
import java.util.Map;

public class Currency {
    private String code;

    private Currency(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    private static final Map<String, Currency> currencyMap = new HashMap<>();

    public static Currency getInstance(String code) {
        if (!currencyMap.containsKey(code)) {
            currencyMap.put(code, new Currency(code));
        }
        return currencyMap.get(code);
    }
}