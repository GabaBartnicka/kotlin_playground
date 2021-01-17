data class Evaluation(val rightPosition: Int, val wrongPosition: Int)

fun evaluateGuessMe(secret: String, guess: String): Evaluation {
    if (secret == guess)
        return Evaluation(4, 0)

    var right = 0
    var wrong = 0

    val guessChars = guess.toMutableList();
    val secretChars = secret.toMutableList();
    val wrongPositions = mutableListOf<Char>()

    for (i in secret.indices) {
        if (secret[i] == guess[i]) {
            right++;
            guessChars.remove(guess[i])
            secretChars.remove(guess[i])
        }
    }

    for (l in guessChars) {
        if (secretChars.contains(l) && (!wrongPositions.contains(l) || secretChars.contains(l))) {
            wrong++
            wrongPositions.add(l)
            secretChars.remove(l)
        }
    }

    return Evaluation(right, wrong)
}

fun evaluateGuess(secret: String, guess: String): Evaluation {

    val rightPositions = secret.zip(guess).count { TODO() }

    val commonLetters = "ABCDEF".sumBy { ch ->

        Math.min(secret.count { TODO() }, guess.count { TODO() })
    }
    return Evaluation(rightPositions, commonLetters - rightPositions)
}
