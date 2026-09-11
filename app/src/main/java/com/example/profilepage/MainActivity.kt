package com.example.profilepage

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.profilepage.R

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    ProfileScreen()
                }
            }
        }
    }
}

@Composable
fun ProfileScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {

        Spacer(modifier = Modifier.height(48.dp))

        Box(
            modifier = Modifier.size(120.dp)
        ) {
            Image(
                painter = painterResource(id = R.drawable.foto_profil),
                contentDescription = "Foto Profil",
                contentScale = ContentScale.Crop,
                alignment = Alignment.TopCenter,
                modifier = Modifier
                    .size(120.dp)
                    .clip(CircleShape)
                    .border(width = 3.dp, color = Color.Black, shape = CircleShape)
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Nada Halwa Yuanita",
            fontSize = 22.sp,
            fontWeight = FontWeight.Bold
        )

        Text(
            text = "245150407111021",
            fontSize = 14.sp,
            color = Color.Gray
        )

        Text(
            text = "Sistem Informasi - FILKOM UB",
            fontSize = 14.sp,
            color = Color.Gray
        )

        Spacer(modifier = Modifier.height(24.dp))

        InfoRow(icon = Icons.Filled.Email, text = "nadahalwa002@student.ub.ac.id", tint = Color(0xFF9E9E9E))
        Spacer(modifier = Modifier.height(12.dp))
        InfoRow(icon = Icons.Filled.Phone, text = "081238469955", tint = Color(0xFF4CAF50))
        Spacer(modifier = Modifier.height(12.dp))
        InfoRow(icon = Icons.Filled.LocationOn, text = "Malang, Jawa Timur", tint = Color(0xFFE57373))

        Spacer(modifier = Modifier.height(32.dp))

        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.Start
        ) {
            Text(
                text = "Tentang Saya",
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold
            )
            Spacer(modifier = Modifier.height(8.dp))
            Text(
                text = "Mahasiswa Universitas Brawijaya, Fakultas Ilmu Komputer, Jurusan Sistem Informasi, Angkatan 2024.",
                fontSize = 14.sp,
                color = Color.DarkGray,
                textAlign = TextAlign.Start
            )
        }
    }
}

@Composable
fun InfoRow(icon: ImageVector, text: String, tint: Color) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(imageVector = icon, contentDescription = null, tint = tint)
        Spacer(modifier = Modifier.width(8.dp))
        Text(text = text, fontSize = 14.sp)
    }
}

@Preview(showBackground = true)
@Composable
fun ProfileScreenPreview() {
    MaterialTheme {
        ProfileScreen()
    }
}