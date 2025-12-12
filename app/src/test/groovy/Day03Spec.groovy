import spock.lang.Specification

/*
  Write a function that takes a string and returns the number of vowels it contains.
  For this task, consider the vowels: a, e, i, o, u (both uppercase and lowercase)
*/

class Day03Spec extends Specification {
    def "java vowel count"() {
        expect:
        Day03.countVowels("JAVA has streams") == 5
    }

     def "kotlin vowel count"() {
         expect:
         Day03Kt.countVowels("KOTLIN has extensions") == 7
     }

    def "groovy vowel count"() {
        expect:
        Day03Groovy.countVowels("GROOVY uses closures") == 7
    }
}
