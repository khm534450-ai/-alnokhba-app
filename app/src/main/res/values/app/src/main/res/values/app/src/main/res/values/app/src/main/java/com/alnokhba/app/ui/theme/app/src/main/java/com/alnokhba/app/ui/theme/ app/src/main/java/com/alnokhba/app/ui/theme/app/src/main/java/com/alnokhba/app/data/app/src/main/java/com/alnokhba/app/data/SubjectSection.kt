package com.alnokhba.app.data

data class SubjectSection(
    val id: Int,
    val title: String,
    val description: String
)

object SubjectSectionsData {
    val sections = listOf(
        SubjectSection(1, "الأبحاث", "أبحاث ومراجع المادة"),
        SubjectSection(2, "الملخصات", "ملخصات الدروس"),
        SubjectSection(3, "الملفات وPDF", "ملفات المادة"),
        SubjectSection(4, "الفيديوهات", "دروس وشروحات مرئية"),
        SubjectSection(5, "أسئلة الدورات", "أسئلة الدورات السابقة"),
        SubjectSection(6, "ملاحظاتي", "ملاحظاتك الخاصة"),
        SubjectSection(7, "ارفع ملفاً وحلّله", "رفع ملفات وصور للدراسة"),
        SubjectSection(8, "المساعد الذكي", "مساعد خاص بالمادة")
    )
}
