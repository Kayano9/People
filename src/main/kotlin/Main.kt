fun main() {
    val likes = 52211
    val twoLastCharacter = likes%100
    val lastCharacter = likes%10
    if (lastCharacter == 1 && twoLastCharacter != 11 ) println ("$likes человеку") else println("$likes людям")
}