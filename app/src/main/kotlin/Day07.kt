fun compress(s: String) : String {
    //return usingForLoop(s)

    return usingExtensions(s)
}


//Copied from Java implementation and then simplified:
//Removed the last variable by directly comparing s[i] with s[i - 1] and appending s[i - 1] to the result.
//Replaced the ..< operator with until for better readability and Kotlin idiomatic style.
//Used s.last() to append the last character instead of maintaining a separate last variable.
private fun usingForLoop(s: String): String {
    if (s.isEmpty()) return s

    val compressedS = StringBuilder()
    var count = 1

    for (i in 1 until s.length) {
        if (s[i] == s[i - 1]) {
            count++
        } else {
            compressedS.append(s[i - 1]).append(count)
            count = 1
        }
    }

    compressedS.append(s.last()).append(count)
    return compressedS.toString()
}

//uses fold to accumulate and Pair to keep track of last character/count
private fun usingExtensions(s: String): String =
    s.fold(mutableListOf<Pair<Char, Int>>()) { acc, c ->
        if (acc.isEmpty() || acc.last().first != c)
            acc.add(c to 1)
        else
            acc[acc.lastIndex] = c to acc.last().second + 1
        acc
    }.joinToString("") { "${it.first}${it.second}" }