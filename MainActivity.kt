package com.alnokhba.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

private val Purple = Color(0xFF35245B)
private val Gold = Color(0xFFD6AD55)
private val Cream = Color(0xFFF7F4EE)

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NokhbaApp()
        }
    }
}

@Composable
fun NokhbaApp() {
    var selectedSubject by remember { mutableStateOf<String?>(null) }
    var selectedSection by remember { mutableStateOf<String?>(null) }

    val subjects = listOf(
        "الرياضيات",
        "الفيزياء",
        "الكيمياء",
        "علم الأحياء",
        "اللغة العربية",
        "اللغة الإنكليزية",
        "اللغة الفرنسية"
    )

    val sections = listOf(
        "الأبحاث",
        "الملخصات",
        "الملفات وPDF",
        "الفيديوهات",
        "أسئلة الدورات",
        "ملاحظاتي",
        "ارفع ملفاً وحلّله",
        "المساعد الذكي"
    )

    MaterialTheme {
        CompositionLocalProvider(
            LocalLayoutDirection provides LayoutDirection.Rtl
        ) {
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = Cream
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(18.dp)
                ) {
                    Text(
                        "النخبة",
                        fontSize = 34.sp,
                        fontWeight = FontWeight.ExtraBold,
                        color = Purple
                    )

                    Text(
                        "طريقك نحو التفوق",
                        fontSize = 16.sp,
                        color = Gold
                    )

                    Spacer(Modifier.height(24.dp))

                    if (selectedSubject == null) {
                        PageTitle("المواد الدراسية")

                        LazyVerticalGrid(
                            columns = GridCells.Fixed(2),
                            verticalArrangement = Arrangement.spacedBy(12.dp),
                            horizontalArrangement = Arrangement.spacedBy(12.dp)
                        ) {
                            items(subjects) { subject ->
                                NokhbaCard(subject) {
                                    selectedSubject = subject
                                }
                            }
                        }
                    } else if (selectedSection == null) {
                        TextButton(onClick = {
                            selectedSubject = null
                        }) {
                            Text("رجوع")
                        }

                        PageTitle(selectedSubject!!)

                        LazyVerticalGrid(
                            columns = GridCells.Fixed(3),
                            verticalArrangement = Arrangement.spacedBy(10.dp),
                            horizontalArrangement = Arrangement.spacedBy(10.dp)
                        ) {
                            items(sections) { section ->
                                NokhbaCard(section) {
                                    selectedSection = section
                                }
                            }
                        }
                    } else {
                        TextButton(onClick = {
                            selectedSection = null
                        }) {
                            Text("رجوع إلى أقسام المادة")
                        }

                        PageTitle(selectedSection!!)

                        Text(
                            "محتوى هذا القسم سيُضاف في المراحل القادمة.",
                            color = Purple,
                            fontSize = 16.sp
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun PageTitle(title: String) {
    Text(
        text = title,
        fontSize = 23.sp,
        fontWeight = FontWeight.Bold,
        color = Purple,
        modifier = Modifier.padding(vertical = 18.dp)
    )
}

@Composable
fun NokhbaCard(
    title: String,
    onClick: () -> Unit
) {
    Card(
        onClick = onClick,
        modifier = Modifier
            .fillMaxWidth()
            .height(112.dp),
        shape = RoundedCornerShape(17.dp),
        colors = CardDefaults.cardColors(
            containerColor = Purple
        )
    ) {
        Box(
            modifier = Modifier.fillMaxSize().padding(8.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = title,
                color = Gold,
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}
