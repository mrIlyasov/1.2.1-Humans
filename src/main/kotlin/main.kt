fun main() {
    var likes: Int = 1351
    val likesToString: String = likes.toString();
    val lastChar: Char = likesToString.get(likesToString.length - 1);
    val lastInt: Int = lastChar.digitToInt();
    val lastByOneChar: Char = likesToString.get(likesToString.length - 2);
    val lastByOneInt: Int = lastByOneChar.digitToInt();

    if (lastInt === 1 && lastByOneCheck(lastByOneInt)) {
        println("понравилось $likes человеку")
    } else {
        println("понравилось $likes людям")
    }
}

fun lastByOneCheck(lastByOne: Int): Boolean {
    return lastByOne > 1 || lastByOne === 0
}
