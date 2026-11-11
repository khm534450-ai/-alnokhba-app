package com.alnokhba.app.data

data class AIRequest(
    val subject: String,
    val question: String,
    val documentUri: String? = null,
    val conversationId: String? = null
)

data class AIResponse(
    val answer: String,
    val conversationId: String? = null,
    val success: Boolean = true,
    val errorMessage: String? = null
)
