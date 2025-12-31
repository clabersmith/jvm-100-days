class Day05Groovy {
    static String getFirstNonRepeatingChar(String s) {
        // Uses for loop and indexOf/lastIndexOf
        for (char c in s.toCharArray()) {
            def ss = String.valueOf(c)
            if (s.indexOf(ss) == s.lastIndexOf(ss)) {
                return ss
            }
        }

        return ""

        // Uses Groovy collection methods and closures
//        return s.toList()
//                .countBy {it}
//                .find {it.value == 1}?.key ?: ''
    }
}
