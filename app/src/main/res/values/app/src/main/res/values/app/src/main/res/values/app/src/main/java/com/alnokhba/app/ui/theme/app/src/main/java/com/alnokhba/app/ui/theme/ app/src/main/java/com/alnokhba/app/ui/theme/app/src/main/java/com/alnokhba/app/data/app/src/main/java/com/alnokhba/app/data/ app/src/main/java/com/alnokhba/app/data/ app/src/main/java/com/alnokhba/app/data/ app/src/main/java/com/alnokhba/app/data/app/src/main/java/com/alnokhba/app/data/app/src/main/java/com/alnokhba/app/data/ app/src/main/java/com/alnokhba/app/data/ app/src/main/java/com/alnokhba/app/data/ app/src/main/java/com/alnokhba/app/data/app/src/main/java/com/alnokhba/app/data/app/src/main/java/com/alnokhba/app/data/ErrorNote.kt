package com.alnokhba.app.data

data class ErrorNote(
    val id: Int,
    val subject: String,
    val question: String,
    val myMistake: String,
    val correctExplanation: String,
    val createdAt: Long = System.currentTimeMillis()
)
