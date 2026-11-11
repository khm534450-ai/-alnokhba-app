package com.alnokhba.app.data

data class SubjectResource(
    val id: Int,
    val subject: String,
    val title: String,
    val description: String = "",
    val resourceType: ResourceType,
    val url: String = "",
    val isFavorite: Boolean = false
)

enum class ResourceType {
    RESEARCH,
    SUMMARY,
    PDF,
    VIDEO,
    COURSE_QUESTIONS,
    NOTE
}
