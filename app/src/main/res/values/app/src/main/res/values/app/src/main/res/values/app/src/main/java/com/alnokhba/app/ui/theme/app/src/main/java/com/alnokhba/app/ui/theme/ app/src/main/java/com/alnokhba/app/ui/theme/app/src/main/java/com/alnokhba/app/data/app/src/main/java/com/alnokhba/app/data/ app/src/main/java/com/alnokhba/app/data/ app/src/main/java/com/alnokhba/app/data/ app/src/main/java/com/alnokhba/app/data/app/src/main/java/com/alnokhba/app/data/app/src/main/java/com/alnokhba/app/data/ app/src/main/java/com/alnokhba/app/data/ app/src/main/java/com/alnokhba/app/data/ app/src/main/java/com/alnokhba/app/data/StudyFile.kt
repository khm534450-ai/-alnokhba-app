package com.alnokhba.app.data

data class StudyFile(
    val id: Int,
    val subject: String,
    val title: String,
    val fileUri: String,
    val fileType: String,
    val uploadedAt: Long = System.currentTimeMillis()
)
