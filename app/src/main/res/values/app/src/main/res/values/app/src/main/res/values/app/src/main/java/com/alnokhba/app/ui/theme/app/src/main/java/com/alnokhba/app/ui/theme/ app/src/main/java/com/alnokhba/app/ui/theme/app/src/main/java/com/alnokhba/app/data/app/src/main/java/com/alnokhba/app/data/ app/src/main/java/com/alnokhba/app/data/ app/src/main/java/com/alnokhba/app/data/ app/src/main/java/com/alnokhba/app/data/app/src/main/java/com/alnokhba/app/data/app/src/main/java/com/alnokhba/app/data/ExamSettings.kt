package com.alnokhba.app.data

data class ExamSettings(
    val examDate: Long? = null,
    val reminderEnabled: Boolean = true,
    val studyMinutes: Int = 45,
    val breakMinutes: Int = 15
)
