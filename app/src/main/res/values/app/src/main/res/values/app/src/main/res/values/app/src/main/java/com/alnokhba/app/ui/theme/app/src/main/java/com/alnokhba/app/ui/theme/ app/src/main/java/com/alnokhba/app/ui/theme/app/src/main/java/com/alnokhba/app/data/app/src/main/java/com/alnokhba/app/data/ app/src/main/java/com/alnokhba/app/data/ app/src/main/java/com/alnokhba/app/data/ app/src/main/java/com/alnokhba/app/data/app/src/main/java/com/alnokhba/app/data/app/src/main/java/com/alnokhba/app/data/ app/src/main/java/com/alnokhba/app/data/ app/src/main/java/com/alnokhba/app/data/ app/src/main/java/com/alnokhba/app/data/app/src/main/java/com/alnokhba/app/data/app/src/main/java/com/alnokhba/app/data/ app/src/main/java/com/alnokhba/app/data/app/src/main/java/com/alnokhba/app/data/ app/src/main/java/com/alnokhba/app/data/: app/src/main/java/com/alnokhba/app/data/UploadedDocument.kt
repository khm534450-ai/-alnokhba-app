package com.alnokhba.app.data

data class UploadedDocument(
    val id: Int,
    val subject: String,
    val fileName: String,
    val fileUri: String,
    val fileType: String,
    val uploadedAt: Long = System.currentTimeMillis(),
    val analysisStatus: AnalysisStatus = AnalysisStatus.PENDING
)

enum class AnalysisStatus {
    PENDING,
    PROCESSING,
    COMPLETED,
    FAILED
}
