class Day05Groovy {
    static String getFirstNonRepeatingChar(String s) {
        // Uses for loop and indexOf/lastIndexOf
        for (char c in s.toCharArray()) {
            if (s.indexOf(c) == s.lastIndexOf(c)) {
                return String.valueOf(c)
            }
        }

        // Uses Groovy collection methods and closures
//        return s.toList()
//                .countBy {it}
//                .find {it.value == 1}?.key ?: ''
    }
}
