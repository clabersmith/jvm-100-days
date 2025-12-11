import spock.lang.Specification

class Day02Spec extends Specification {
    def "java palindrome"() {
        expect:
        Day02.isPalindrome("racecar")
    }

     def "kotlin palindrome"() {
         expect:
         Day02Kt.isPalindrome2("racecar")
     }

    def "groovy palindrome"() {
        expect:
        Day02Groovy.isPalindrome("racecar")
    }
}
