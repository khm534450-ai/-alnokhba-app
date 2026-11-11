package com.alnokhba.app.data

data class StudyPlan(
    val id: Int,
    val date: String,
    val tasks: List<StudyTask>,
    val totalStudyMinutes: Int = 0,
    val completedTasks: Int = 0
) {
    val progress: Float
        get() = if (tasks.isEmpty()) 0f
        else completedTasks.toFloat() / tasks.size
}
