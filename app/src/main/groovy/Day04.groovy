class Day04Groovy {
    static String removeDuplicates(String s) {
        return s.toList().unique().join() //using toSet here would not preserve order
    }
}
