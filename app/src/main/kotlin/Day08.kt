
// Uses reduce and string slicing with range to reduce strings to their common prefix
fun getLongestCommonPrefix(list : List<String> ): String {
    return list.reduce { a, b ->
        var i = 0
        while (i < a.length && i < b.length && a[i] == b[i]) {
            i++
        }
        a.substring(0 until i)
    }
}