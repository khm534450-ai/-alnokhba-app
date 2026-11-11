package com.alnokhba.app.data

data class StudyNote(
    val id: Int,
    val subject: String,
    val title: String,
    val content: String,
    val createdAt: Long = System.currentTimeMillis()
)
