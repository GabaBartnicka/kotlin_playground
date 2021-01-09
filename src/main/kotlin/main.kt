fun sum0(list: List<Int>): Int {
    var result = 0
    for (i in list) {
        result += i
    }
    return result
}

fun <Int> List<Int>.sum(): kotlin.Int {
    var s = 0
    for (int in this) {
        if (int is kotlin.Int)
            s += int
    }
    return s
}

fun main(args: Array<String>) {
//    val sum = sum(listOf(1, 2, 3))
//    println(sum)    // 6

    val sum = listOf(1, 2, 3).sum()
    println(sum)
}