import spock.lang.Specification

class Day01Spec extends Specification {
    def "java palindrome"() {
        expect:
        Day01.isPalindrome("racecar")
    }

     def "kotlin palindrome"() {
         expect:
         Day01Kt.isPalindrome("racecar")
     }

    def "groovy palindrome"() {
        expect:
        Day01Groovy.isPalindrome("racecar")
    }
}
