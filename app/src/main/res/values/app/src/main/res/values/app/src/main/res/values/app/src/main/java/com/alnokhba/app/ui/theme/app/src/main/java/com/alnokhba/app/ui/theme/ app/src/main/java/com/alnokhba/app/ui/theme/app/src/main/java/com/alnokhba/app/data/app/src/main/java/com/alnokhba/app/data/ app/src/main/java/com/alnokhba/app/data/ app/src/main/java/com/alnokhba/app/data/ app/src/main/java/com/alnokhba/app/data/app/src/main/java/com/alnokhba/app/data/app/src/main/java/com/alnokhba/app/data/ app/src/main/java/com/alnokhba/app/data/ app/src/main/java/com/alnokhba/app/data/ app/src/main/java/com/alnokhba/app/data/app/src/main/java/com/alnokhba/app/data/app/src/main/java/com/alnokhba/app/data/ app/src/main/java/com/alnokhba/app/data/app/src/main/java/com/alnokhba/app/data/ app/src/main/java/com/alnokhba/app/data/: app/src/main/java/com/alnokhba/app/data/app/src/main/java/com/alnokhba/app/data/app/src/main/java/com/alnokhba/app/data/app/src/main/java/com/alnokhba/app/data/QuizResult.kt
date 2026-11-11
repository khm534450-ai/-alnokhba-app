package com.alnokhba.app.data

data class QuizResult(
    val id: Int,
    val subject: String,
    val totalQuestions: Int,
    val correctAnswers: Int,
    val scorePercentage: Float,
    val completedAt: Long = System.currentTimeMillis()
)
