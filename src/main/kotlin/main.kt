package ru.netology

fun main () {
    val likes: Int = 101011;
    val result = if (likes % 10 == 1 && likes % 100 != 11) "человеку" else "людям"
    println("понравилось $likes $result.")
}