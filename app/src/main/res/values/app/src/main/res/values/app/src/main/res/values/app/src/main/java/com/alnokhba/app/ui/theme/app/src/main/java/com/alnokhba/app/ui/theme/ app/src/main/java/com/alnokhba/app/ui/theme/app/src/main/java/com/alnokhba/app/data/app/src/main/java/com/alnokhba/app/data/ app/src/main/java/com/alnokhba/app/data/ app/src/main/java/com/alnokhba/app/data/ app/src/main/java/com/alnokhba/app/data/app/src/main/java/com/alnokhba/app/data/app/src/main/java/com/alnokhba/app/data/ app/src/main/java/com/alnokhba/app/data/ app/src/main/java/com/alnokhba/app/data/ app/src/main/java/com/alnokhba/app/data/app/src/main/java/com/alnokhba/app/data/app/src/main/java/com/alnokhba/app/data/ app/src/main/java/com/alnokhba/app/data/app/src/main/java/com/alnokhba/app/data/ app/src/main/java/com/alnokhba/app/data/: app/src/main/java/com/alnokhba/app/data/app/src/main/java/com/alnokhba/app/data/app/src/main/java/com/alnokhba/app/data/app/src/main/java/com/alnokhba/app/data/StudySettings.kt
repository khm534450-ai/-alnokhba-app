package com.alnokhba.app.data

data class StudySettings(
    val dailyStudyGoalMinutes: Int = 240,
    val studySessionMinutes: Int = 45,
    val breakMinutes: Int = 15,
    val notificationsEnabled: Boolean = true,
    val soundEnabled: Boolean = true
)
