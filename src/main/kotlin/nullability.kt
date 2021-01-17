fun String?.isEmptyOrNull() = this == null || this.isEmpty()


fun main(args: Array<String>) {
    val s1: String? = null
    val s2: String? = ""
    s1.isEmptyOrNull() eq true
    s2.isEmptyOrNull() eq true

    val s3 = "   "
    s3.isEmptyOrNull() eq false
}

fun main2(args: Array<String>) {
    val s = 'a'
    println(s as? Int)    // null
    println(s as Int?)    // exception
}