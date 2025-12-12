import spock.lang.Specification

/*
  Write a function that takes a string and returns a new string with all duplicate characters removed, 
  keeping only the first occurrence of each character in the order they appear. Preserve the original order.

  Treat uppercase and lowercase as distinct characters (i.e., "A" ≠ "a").

  All characters count (letters, digits, spaces, punctuation).
*/

class Day04Spec extends Specification {
    def "java remove duplicates"() {
        expect:
        Day04.removeDuplicates("banana") == "ban"
    }

     def "kotlin remove duplicates"() {
         expect:
         Day04Kt.removeDuplicates("HELLO. WOrld.") == "HELO. Wrld" 
     }

    def "groovy remove duplicates"() {
        expect:
        Day04Groovy.removeDuplicates("1122_334_455") == "12_345"
    }
}
