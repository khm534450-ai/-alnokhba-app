package com.alnokhba.app.data

data class Subject(
    val id: Int,
    val name: String,
    val colorHex: Long,
    val description: String
)

object SubjectsData {
    val subjects = listOf(
        Subject(1, "الرياضيات", 0xFF35245B, "مادة الرياضيات"),
        Subject(2, "الفيزياء", 0xFF245B68, "مادة الفيزياء"),
        Subject(3, "الكيمياء", 0xFF76513D, "مادة الكيمياء"),
        Subject(4, "علم الأحياء", 0xFF356B50, "مادة علم الأحياء"),
        Subject(5, "اللغة العربية", 0xFF70445F, "مادة اللغة العربية"),
        Subject(6, "اللغة الإنكليزية", 0xFF3C5680, "مادة اللغة الإنكليزية"),
        Subject(7, "اللغة الفرنسية", 0xFF805D35, "مادة اللغة الفرنسية")
    )
}
