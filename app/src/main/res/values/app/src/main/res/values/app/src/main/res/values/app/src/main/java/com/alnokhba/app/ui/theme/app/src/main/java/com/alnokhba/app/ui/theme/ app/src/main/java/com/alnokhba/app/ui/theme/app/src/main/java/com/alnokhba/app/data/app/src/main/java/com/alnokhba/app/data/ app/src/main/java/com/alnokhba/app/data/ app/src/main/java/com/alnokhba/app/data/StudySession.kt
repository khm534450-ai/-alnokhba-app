package com.alnokhba.app.data

data class StudySession(
    val id: Int,
    val subject: String,
    val startTime: Long,
    val durationMinutes: Int,
    val completedTasks: Int
)
