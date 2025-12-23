import spock.lang.Specification


/**
 * Write a function that takes an array (or list) of strings and returns the longest common prefix shared by all strings.
 *
 * A prefix is a sequence of characters that appears at the start of each string.
 *
 * The comparison should be case-sensitive.
 *
 * If there is no common prefix, return an empty string. If the input array is empty, return an empty string.
 */
class Day08Spec extends Specification {


    def "java common prefix partial"() {
        given: "A list of strings"
        List<String> inputList = ["flower", "flow", "flight"]

        expect:
        Day08.getLongestCommonPrefix(inputList) == "fl"
    }

    def "java common prefix empty"() {
        given: "A list of strings"
        List<String> inputList = ["dog", "racecar", "car"]

        expect:
        Day08.getLongestCommonPrefix(inputList).isEmpty()
    }

    def "java common prefix partial more characters"() {
        given: "A list of strings"
        List<String> inputList = ["interspecies", "interstellar", "interstate"]

        expect:
        Day08.getLongestCommonPrefix(inputList) == "inters"
    }

    def "kotlin common prefix single"() {
        expect:
        Day08Kt.getLongestCommonPrefix(["hello"]) == "hello"
    }

    def "kotlin common prefix all empty"() {
        expect:
        Day08Kt.getLongestCommonPrefix(["", "", ""]) == ""
    }

    def "kotlin common prefix partial"() {
        expect:
        Day08Kt.getLongestCommonPrefix(["prefix", "preach", "prevent"]) == "pre"
    }

    def "groovy common prefix four items"() {
        expect:
        Day08Groovy.getLongestCommonPrefix(["interview", "internet", "internal", "interval"]) == "inter"
    }

    def "groovy common prefix no match"() {
        expect:
        Day08Groovy.getLongestCommonPrefix(["bat", "banana", "carrot"]) == ""
    }

    def "groovy common prefix partial"() {
        expect:
        Day08Groovy.getLongestCommonPrefix(["abcdef", "abc123", "abcde" ]) == "abc"
    }
}
