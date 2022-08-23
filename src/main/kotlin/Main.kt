fun main() {
    val likes = 11
    val lastCharacter = likes%10
    if (lastCharacter == 1 && likes != 11 ) println ("$likes человеку") else println("$likes людям")
}