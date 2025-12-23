import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Day08 {
    public static String getLongestCommonPrefix(List<String> list) {
        //return usingForLoop(list);
        return usingStreams(list);
    }

    //my solution using loops
    private static String usingForLoop(List<String> list) {
        String firstItem = list.get(0);
        String commonPrefix = firstItem;

        //skip comparing the first item to itself
        List<String> restOfList =  list.subList(1, list.size());

        //assume the common prefix is the full length of the first string. Compare to each of the others in turn.
        //if the common prefix is smaller, set that as the new value
        for (String nextItem : restOfList) {
            StringBuilder thisPrefix = new StringBuilder();
            for(int i = 0; i < commonPrefix.length() && i < nextItem.length(); i++) {
                char c = firstItem.charAt(i);
                if(c == nextItem.charAt(i)) {
                    thisPrefix.append(c);
                } else {
                    break;
                }
            }

            commonPrefix = thisPrefix.toString();
        }

        return commonPrefix;
    }


    //Stream-based solution that reduces strings by iteratively trimming to their shared prefix
    //This is one of the few string problems where streams actually fit well
    //reduce is the right abstraction here
    //loop version would still be faster, but this is elegant and idiomatic
    static String usingStreams(List<String> list) {
        return list.stream()
                .reduce((a, b) -> {
                    int i = 0;
                    while (i < a.length() && i < b.length() && a.charAt(i) == b.charAt(i))
                        i++;
                    return a.substring(0, i);
                })
                .orElse("");
    }


}
