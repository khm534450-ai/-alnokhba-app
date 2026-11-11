package com.alnokhba.app.data

data class Flashcard(
    val id: Int,
    val subject: String,
    val question: String,
    val answer: String,
    val isFavorite: Boolean = false,
    val isKnown: Boolean = false
)
