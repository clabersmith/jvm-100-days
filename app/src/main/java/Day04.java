
import java.util.stream.Collectors;

public class Day04 {
    public static String removeDuplicates (String s) {
        //using for loop
        // Map<Character, Boolean> foundMap = new LinkedHashMap<>();
        // StringBuilder returnS = new StringBuilder();
        // for(Character c :  s.toCharArray()) {
        //     if(foundMap.containsKey(c)) {
        //         //skip
        //     } else {
        //         foundMap.put(c, true);
        //         returnS.append(c);
        //     }
        // }
        // return returnS.toString();

        // using collection extensions
        return s.chars()
            .mapToObj(c -> (char) c)
            .distinct()
            .map(String::valueOf)
            .collect(Collectors.joining(""));
    }
}
