import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Day10 {
    public static boolean isUniqueCharacters(String in) {
        if(in.isEmpty()) return true;

        return usingStream(in);
    }

    private static boolean usingLoop(String in) {
        Map<Character, Integer> charMap = new HashMap<>();

        for(Character c : in.toCharArray()) {
            if(charMap.putIfAbsent(c, 1) != null) {
                return false;
            }
        }

        return true;
    }

    private static boolean usingStream(String in) {
        return in.chars().distinct().count() == in.length();

// using Collectors groupingBy and counting
//        return in.chars()
//                .mapToObj(c -> (char) c)
//                .collect(Collectors.groupingBy(c -> c, Collectors.counting()))
//                .values().stream()
//                .allMatch(count -> count == 1);
    }
}
