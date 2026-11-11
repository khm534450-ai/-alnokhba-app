package com.alnokhba.app.data

data class LibraryItem(
    val id: Int,
    val subject: String,
    val title: String,
    val description: String = "",
    val category: String,
    val fileUri: String? = null,
    val isFavorite: Boolean = false,
    val createdAt: Long = System.currentTimeMillis()
)
