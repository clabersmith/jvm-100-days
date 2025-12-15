import spock.lang.Specification

/*
  Write a function that takes a string and returns the first character that does not repeat anywhere else in the string.
  The search should be performed from left to right.

  A character is considered non-repeating if it appears exactly once in the entire string.
  Uppercase and lowercase characters are treated as distinct.

  All characters in the string should be considered, including letters, digits, spaces, and punctuation.
  If no non-repeating character exists, the function should indicate this clearly (for example, by returning null,
  an empty result, or a special value — your choice).
*/
class Day05Spec extends Specification {
    def "java get non-repeating alpha"() {
        expect:
        Day05.getFirstNonRepeatingChar("banana") == "b"
    }

    def "java get non-repeating numeric"() {
        expect:
        Day05.getFirstNonRepeatingChar("1136324") == "6"
    }

     def "kotlin get non-repeating alpha"() {
         expect:
         Day05Kt.getFirstNonRepeatingChar("HELLO,WOrld,Hello.") == "E"
     }

    def "kotlin get non-repeating space"() {
        expect:
        Day05Kt.getFirstNonRepeatingChar("Hello, Hello,world") == " "
    }

    def "groovy get non-repeating alpha"() {
        expect:
        Day05Groovy.getFirstNonRepeatingChar("anAnab") == "A"
    }

    def "groovy get non-repeating numeric"() {
        expect:
        Day05Groovy.getFirstNonRepeatingChar("abc112cba") == "2"
    }

    def "groovy get no non-repeate"() {
        expect:
        Day05Groovy.getFirstNonRepeatingChar("bananab") == ""
    }
}
