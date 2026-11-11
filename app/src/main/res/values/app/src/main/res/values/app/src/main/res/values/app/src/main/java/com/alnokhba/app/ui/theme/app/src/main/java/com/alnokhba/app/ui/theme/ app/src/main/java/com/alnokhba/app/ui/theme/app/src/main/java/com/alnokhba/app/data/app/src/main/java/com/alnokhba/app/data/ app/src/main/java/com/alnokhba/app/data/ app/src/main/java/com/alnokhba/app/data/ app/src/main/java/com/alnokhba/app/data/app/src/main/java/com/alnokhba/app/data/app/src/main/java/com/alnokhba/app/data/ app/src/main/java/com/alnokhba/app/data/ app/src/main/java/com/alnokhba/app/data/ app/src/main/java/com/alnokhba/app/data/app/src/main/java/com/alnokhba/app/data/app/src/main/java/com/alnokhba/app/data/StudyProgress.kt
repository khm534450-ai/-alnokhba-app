package com.alnokhba.app.data

data class StudyProgress(
    val subject: String,
    val totalStudyMinutes: Int = 0,
    val completedTasks: Int = 0,
    val totalTasks: Int = 0,
    val quizScore: Int = 0
) {
    val completionRate: Float
        get() = if (totalTasks == 0) 0f
        else completedTasks.toFloat() / totalTasks
}
