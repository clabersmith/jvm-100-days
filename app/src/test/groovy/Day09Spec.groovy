import spock.lang.Specification

/**
 * Write a function that takes a sentence as input and returns a new sentence where the first letter of each word is capitalized.

 * A word is defined as a sequence of characters separated by one or more spaces.

 * Only the first character of each word should be capitalized.

 * All other characters in the word should remain unchanged.

 * If a word starts with a non-letter character, leave it unchanged.

 * Treat multiple spaces as one.  Assume input string is  non-null but can be empty.
 */

class Day09Spec extends Specification {

    def "java: simple example with two words"() {
        expect:
        Day09.capitalizeFirst("hello world") == "Hello World"
    }

    def "java: treat multiple spaces between words as one"() {
        expect:
        Day09.capitalizeFirst("  hello   world  ") == "Hello World"
    }

    def "java: word starts with non-letter character"() {
        expect:
        Day09.capitalizeFirst("123abc !foo bar") == "123abc !foo Bar"
    }

    def "java: words contain single letters"() {
        expect:
        Day09.capitalizeFirst("To a t") == "To A T"
    }

    def "java: empty string returns as empty"() {
        expect:
        Day09.capitalizeFirst("") == ""
    }

    def "kotlin: simple example with two words"() {
        expect:
        Day09Kt.capitalizeFirst("java is  fun") == "Java Is Fun"
    }

    def "kotlin: treat multiple spaces between words as one"() {
        expect:
        Day09Kt.capitalizeFirst("  kotlin   is  cool  ") == "Kotlin Is Cool"
    }

    def "kotlin: word starts with non-letter character"() {
        expect:
        Day09Kt.capitalizeFirst("!foo 123bar baz") == "!foo 123bar Baz"
    }

    def "kotlin: empty string returns as empty"() {
        expect:
        Day09Kt.capitalizeFirst("") == ""
    }

    def "groovy: simple example with two words"() {
        expect:
        Day09Groovy.capitalizeFirst("hello world") == "Hello World"
    }

    def "groovy: treat multiple spaces between words as one"() {
        expect:
        Day09Groovy.capitalizeFirst("  hello   world  ") == "Hello World"
    }

    def "groovy: word starts with non-letter character"() {
        expect:
        Day09Groovy.capitalizeFirst("123abc !foo bar") == "123abc !foo Bar"
    }

    def "groovy: empty string returns as empty"() {
        expect:
        Day09Groovy.capitalizeFirst("") == ""
    }
}
