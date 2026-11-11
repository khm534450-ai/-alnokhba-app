package com.alnokhba.app.data

enum class MessageRole {
    USER,
    ASSISTANT
}

data class AIMessage(
    val id: String,
    val subject: String,
    val role: MessageRole,
    val content: String,
    val timestamp: Long = System.currentTimeMillis()
)
