import spock.lang.Specification

/**
 Write a function that takes a string as input and determines whether all characters in the string are unique, meaning no character appears more than once.

 The check should be case-sensitive ('A' and 'a' are considered different).

 All characters in the string should be considered, including letters, digits, spaces, and punctuation.

 An empty string should be considered as having all unique characters.

 Return true if all characters are unique; otherwise, return false.
 */

class Day10Spec extends Specification {

    def "java: unique two words"() {
        expect:
        Day10.isUniqueCharacters("hel word")
    }

    def "java: all unique characters with punctuation and digits"() {
        expect:
        Day10.isUniqueCharacters("A1!b2@c3#")
    }

    def "java: not unique characters due to repeated numbers"() {
        expect:
        !Day10.isUniqueCharacters("A2!b2@c3#")
    }

    def "java: not unique due to repeated space"() {
        expect:
        !Day10.isUniqueCharacters("a b c d e f a")
    }

    def "java: empty string is unique"() {
        expect:
        Day10.isUniqueCharacters("")
    }

    def "kotlin: unique with mixed case and symbols"() {
        expect:
        Day10Kt.isUniqueCharacters("AbC!@#123")
    }

    def "kotlin: not unique due to repeated symbol"() {
        expect:
        !Day10Kt.isUniqueCharacters("Kotlin!!Rocks")
    }

    def "kotlin: unique with whitespace and tabs"() {
        expect:
        Day10Kt.isUniqueCharacters("a b\tc\nd")
    }

    def "kotlin: not unique with repeated uppercase"() {
        expect:
        !Day10Kt.isUniqueCharacters("HELLO")
    }

    def "kotlin: unique with unicode characters"() {
        expect:
        Day10Kt.isUniqueCharacters("üñîq😊")
    }

    def "groovy: unique with special symbols and numbers"() {
        expect:
        Day10Groovy.isUniqueCharacters("!@#\$%^&*()1234567890")
    }

    def "groovy: not unique with repeated punctuation"() {
        expect:
        !Day10Groovy.isUniqueCharacters("groovy!!")
    }

    def "groovy: unique with mixed whitespace"() {
        expect:
        Day10Groovy.isUniqueCharacters("g r\to\nuvy")
    }

    def "groovy: not unique with repeated unicode"() {
        expect:
        !Day10Groovy.isUniqueCharacters("gröövy")
    }

    def "groovy: unique with only one character"() {
        expect:
        Day10Groovy.isUniqueCharacters("z")
    }

}
