package com.example.miptlab2

import android.util.Log

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
        val words = cleanedText.trim().split(Regex("[\\s.,]*[\\s.,]+")).toMutableList()

        val lastItemInList = words.lastOrNull()

        if (lastItemInList != null) {
            if(lastItemInList == "") words.removeLast() // pasalinamas paskutinis elementas, kad neuzsiskaitytu tuscias laukas paliktas po tasko ar kablelio prie zodziu skaiciaus
        }
        if (words[0] == "") words.removeAt(0) // pasalina pirma elementa, jeigu pats pirmas padedamas taskas arba kablelis

        return words.size
    }

}