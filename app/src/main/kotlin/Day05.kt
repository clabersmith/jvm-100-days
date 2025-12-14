fun getFirstNonRepeatingChar(s: String): String {
    //using for loop
//    var foundCnt =  0;
//    for(c in s) {
//        foundCnt = s.count { it == c }
//        if(foundCnt == 1) {
//            return c.toString()
//        }
//    }
//
//    return ""

    //one-liner using extensions/inline functions
    return s.groupingBy { it }
            .eachCount()
            .let { counts -> s.firstOrNull { counts[it] == 1 }?.toString() ?: "" }
}
