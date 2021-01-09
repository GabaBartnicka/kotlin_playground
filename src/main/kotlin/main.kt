fun isValidIdentifier0(s: String): Boolean {
    print(s)

    val firstChar = if (s.isBlank()) ' ' else s[0]

    val isFirstCharValid = when (firstChar) {
        in 'a'..'z' -> true
        in 'A'..'Z' -> true
        '_' -> true
        else -> false
    }
    val other = Regex("[a-zA-Z0-9\\s_]+").matches(s)

    return isFirstCharValid && other
}

fun isValidIdentifier(s: String): Boolean {
    fun isValidChar(ch: Char) = ch == '_' || ch.isLetterOrDigit()
    if (s.isEmpty() || s[0].isDigit()) return false
    for (ch in s) {
        if (!isValidChar(ch)) return false
    }

    return true
}


fun main(args: Array<String>) {
    println(isValidIdentifier("name"))   // true
    println(isValidIdentifier("_name"))  // true
    println(isValidIdentifier("_12"))    // true
    println(isValidIdentifier(""))       // false
    println(isValidIdentifier("012"))    // false
    println(isValidIdentifier("no$"))    // false
}