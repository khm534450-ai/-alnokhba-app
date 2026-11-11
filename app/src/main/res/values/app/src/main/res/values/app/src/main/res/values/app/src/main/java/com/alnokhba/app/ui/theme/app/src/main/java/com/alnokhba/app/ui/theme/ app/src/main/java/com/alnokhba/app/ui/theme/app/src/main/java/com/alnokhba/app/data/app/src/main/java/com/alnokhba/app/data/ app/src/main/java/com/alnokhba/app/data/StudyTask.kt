package com.alnokhba.app.data

data class StudyTask(
    val id: Int,
    val title: String,
    val subject: String,
    val durationMinutes: Int,
    val isCompleted: Boolean = false
)
