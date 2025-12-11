class Day02Groovy {
    static boolean isPalindrome(String s) {
        def s1 = ""
        for(i in s.length()-1..0) {
            s1 += s[i]
        }
        return s1.equals(s)
    }
    
    //Claude AI alternative
    // Alternative: two-pointer approach
    // static boolean isPalindrome(String s) {
    //     int left = 0
    //     int right = s.length() - 1
    //     while (left < right) {
    //         if (s[left] != s[right]) {
    //             return false
    //         }
    //         left++
    //         right--
    //     }
    //     return true
    // }
}
