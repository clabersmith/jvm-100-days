class Day08Groovy {
    // Uses Groovy inject and string slicing to reduce strings to their common prefix
//    static String getLongestCommonPrefix(List<String> strings) {
//        strings.inject { a, b ->
//            int i = 0
//            while (i < a.size() && i < b.size() && a[i] == b[i]) {
//                i++
//            }
//            a[0..<i]
//        } ?: ''
//    }

    /*
      Alternative approach:

        strings*.toList() → spread operator
        transpose() aligns characters by index
        unique() checks divergence

      Very expressive, very Groovy
     */
    static String getLongestCommonPrefix(List<String> strings) {
        if (!strings) return ''

        strings*.toList()
                .transpose()
                .takeWhile { it.unique().size() == 1 }
                .collect { it[0] }
                .join('')
    }

}

