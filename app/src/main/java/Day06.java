import java.util.HashMap;
import java.util.Map;

public class Day06 {
    public static boolean isAnagrams(String s1, String s2) {
        //return usingForLoops(s1, s2);
        return usingStreams(s1, s2);
        //return usingArraysAndSorting(s1, s2);
    }

    private static boolean usingForLoops(String s1, String s2) {
        Map<Character, Integer> mapS1= new HashMap<>();
        Map<Character, Integer> mapS2= new HashMap<>();

        char[] charArray1 = s1.toLowerCase().replaceAll("\\s+", "").toCharArray();
        for(Character c: charArray1) {
            mapS1.put(c,mapS1.getOrDefault(c,0) + 1);
        }

        char[] charArray2 = s2.toLowerCase().replaceAll("\\s+", "").toCharArray();
        for(Character c: charArray2) {
            mapS2.put(c,mapS2.getOrDefault(c,0) + 1);
        }

        return mapS1.equals(mapS2);
    }

    private static boolean usingStreams(String s1, String s2) {
        Map<Character, Long> mapS1 = s1.toLowerCase().chars()
                .mapToObj(c -> (char) c)
                .filter(c -> !Character.isWhitespace(c))
                .collect(java.util.stream.Collectors.groupingBy(c -> c, java.util.stream.Collectors.counting()));

        Map<Character, Long> mapS2 = s2.toLowerCase().chars()
                .mapToObj(c -> (char) c)
                .filter(c -> !Character.isWhitespace(c))
                .collect(java.util.stream.Collectors.groupingBy(c -> c, java.util.stream.Collectors.counting()));

        return mapS1.equals(mapS2);
    }

    public static boolean usingArraysAndSorting(String s1, String s2) {
        if (s1 == null || s2 == null) return false;
        char[] a = s1.toLowerCase().replaceAll("\\s+", "").toCharArray();
        char[] b = s2.toLowerCase().replaceAll("\\s+", "").toCharArray();
        if (a.length != b.length) return false;
        java.util.Arrays.sort(a);
        java.util.Arrays.sort(b);
        return java.util.Arrays.equals(a, b);
    }

}
