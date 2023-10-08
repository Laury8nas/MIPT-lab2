package com.example.miptlab2

class Count(
) {

     fun countSymbols(text: String): Int {
        val symbols = listOf(".", ",", ":", "!", "?", ";", "-", "(", ")", "\"")
        var symbolCount = 0

        for (char in text) {
            if (char.toString() in symbols) {
                symbolCount++
            }
        }

        return symbolCount
    }

    fun countWords(text: String): Int {
        val cleanedText = text.replace(Regex("[^A-Za-z\\s.,]"), "")
        val words = cleanedText.trim().split(Regex("[\\s.,]+"))

        return words.size
    }

}