class Day10Groovy {
    static boolean isUniqueCharacters(String input) {
        return input.toSet().size() == input.length()
    }
}