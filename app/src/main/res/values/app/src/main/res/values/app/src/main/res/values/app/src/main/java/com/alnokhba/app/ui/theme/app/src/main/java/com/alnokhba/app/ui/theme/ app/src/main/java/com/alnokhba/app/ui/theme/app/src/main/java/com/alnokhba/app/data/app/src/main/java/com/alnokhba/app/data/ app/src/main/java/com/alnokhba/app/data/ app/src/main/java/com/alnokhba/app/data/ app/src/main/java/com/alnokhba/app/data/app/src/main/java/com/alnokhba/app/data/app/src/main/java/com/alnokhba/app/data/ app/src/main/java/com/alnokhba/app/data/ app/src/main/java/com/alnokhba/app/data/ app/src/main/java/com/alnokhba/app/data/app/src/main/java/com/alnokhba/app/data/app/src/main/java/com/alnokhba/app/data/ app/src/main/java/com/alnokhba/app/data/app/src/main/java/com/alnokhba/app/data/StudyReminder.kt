package com.alnokhba.app.data

data class StudyReminder(
    val id: Int,
    val title: String,
    val message: String,
    val timeInMillis: Long,
    val isEnabled: Boolean = true
)
