import spock.lang.Specification

/*
  Check if Two Strings Are Anagrams

  Write a function that determines whether two strings are anagrams of each other.
  Two strings are anagrams if they contain the same characters in the same quantities,
  but possibly in a different order.

  Rules:
  - Comparison should be case-insensitive.
  - Ignore whitespace in the strings.
  - All other characters (letters, digits, punctuation) should be considered.
  - The order of characters does not matter, so identical strings will be considered anagrams

  If the two strings are anagrams, return true; otherwise, return false.
*/

class Day06Spec extends Specification {
    def "java: listen and silent are anagrams"() {
        expect:
        Day06.isAnagrams("listen", "silent")
    }

    def "java: Triangle and Integral are anagrams"() {
        expect:
        Day06.isAnagrams("Triangle", "Integral")
    }

    def "java: anagram and nag a ram are anagrams (ignore spaces)"() {
        expect:
        Day06.isAnagrams("anagram", "nag a ram")
    }

    def "java: Apple and Papal are not anagrams"() {
        expect:
        !Day06.isAnagrams("Apple", "Papal")
    }

    def "kotlin: Dormitory and Dirty room are anagrams"() {
        expect:
        Day06Kt.isAnagrams("Dormitory", "Dirty room")
    }

    def "kotlin: The Morse Code and Here come dots are anagrams"() {
        expect:
        Day06Kt.isAnagrams("The Morse Code", "Here come dots")
    }

    def "kotlin: Hello and World are not anagrams"() {
        expect:
        !Day06Kt.isAnagrams("Hello", "World")
    }

    def "groovy: Debit Card and Bad Credit are anagrams"() {
        expect:
        Day06Groovy.isAnagrams("Debit Card", "Bad Credit")
    }

    def "groovy: Astronomer and Moon starer are anagrams"() {
        expect:
        Day06Groovy.isAnagrams("Astronomer", "Moon starer")
    }

    def "groovy: Conversation and Voices rant onx are not anagrams"() {
        expect:
        !Day06Groovy.isAnagrams("Conversation", "Voices rant onx")
    }
}
