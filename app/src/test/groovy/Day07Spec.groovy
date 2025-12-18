import spock.lang.Specification

/**
 * Compress a string by character counts.
 *
 * Write a function that takes a single string and returns a compressed representation
 * where each run of consecutive identical characters is replaced by the character
 * followed by the number of times it appears in that run.
 *
 * Details:
 * - Compression is case-sensitive (\"a\" and \"A\" are different).
 * - All characters are treated literally (letters, digits, whitespace, punctuation).
 * - Only consecutive runs are combined; separate runs of the same character are
 *   compressed independently.
 * - The function should return the compressed string (no requirement to return the
 *   shorter of original vs compressed unless specified).
 *
 * Examples:
 * - \"aabcc\" -> \"a2b1c2\"
 * - \"aaAA\"  -> \"a2A2\"
 * - \"a a\"   -> \"a1 1a1\" (space is a character and is counted)
 */

class Day07Spec extends Specification {

    def "java: compress aabcc"() {
        expect:
        Day07.compress("aabcc") == "a2b1c2"
    }

    def "java: compress aaAA"() {
        expect:
        Day07.compress("aaAA") == "a2A2"
    }

    def "java: compress with spaces"() {
        expect:
        Day07.compress("a a") == "a1 1a1"
    }

    def "kotlin: compress empty string"() {
        expect:
        Day07Kt.compress("") == ""
    }

    def "kotlin: compress single character"() {
        expect:
        Day07Kt.compress("x") == "x1"
    }

    def "kotlin: compress mixed digits and letters"() {
        expect:
        Day07Kt.compress("a11bb") == "a112b2"
    }

    def "groovy: compress empty string"() {
        expect:
        Day07Groovy.compress("") == ""
    }

    def "groovy: compress all unique characters"() {
        expect:
        Day07Groovy.compress("abc") == "a1b1c1"
    }

    def "groovy: compress long run of one character"() {
        expect:
        Day07Groovy.compress("zzzzz") == "z5"
    }
}
