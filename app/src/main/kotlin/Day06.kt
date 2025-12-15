//static boolean isAnagrams(String s1, String s2)  {
//    //creates two maps with character counts and compares them
//    s1 = s1.replaceAll(/\s+/, "").toLowerCase()
//    s2 = s2.replaceAll(/\s+/, "").toLowerCase()
//
//    return s1.toList().countBy { it } == s2.toList().countBy { it }
//}

fun isAnagrams(s1: String, s2: String) : Boolean {
    return s1.lowercase().filterNot { it.isWhitespace() }.groupingBy { it }.eachCount() ==
            s2.lowercase().filterNot { it.isWhitespace() }.groupingBy { it }.eachCount()
}