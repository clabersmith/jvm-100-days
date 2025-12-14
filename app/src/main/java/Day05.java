
import java.util.stream.Collectors;

public class Day05 {
    public static String getFirstNonRepeatingChar(String s) {

        //first attempt using loops
//        for(char c1 : s.toCharArray())  {
//            int foundCnt = 0;  //the character should appear only once
//
//            for(char c2 : s.toCharArray()) {
//                if (c1 == c2) {
//                    foundCnt++;
//                }
//            }
//
//            if(foundCnt == 1) {
//                return String.valueOf(c1);
//            }
//        }
//
//        return "";

        //simplifies by eliminating the inner loop
//        for (char c1 : s.toCharArray()) {
//            if (s.chars().filter(c2 -> c2 == c1).count() == 1) {
//                return String.valueOf(c1);
//            }
//        }
//        return "";

        //using streams to create a one-liner
        return s.chars().mapToObj(c -> (char) c)
                .filter(c1 -> s.chars().filter(c2 -> c2 == c1).count() == 1)
                .map(String::valueOf)
                .findFirst()
                .orElse("");
    }
}
