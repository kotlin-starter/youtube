package com.iamfiro.youtube.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Explore
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.clipToBounds
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp

@Composable
fun TagList() {
    Row(
        horizontalArrangement = Arrangement.spacedBy(6.dp),
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .fillMaxWidth()
            .clipToBounds()
            .horizontalScroll(rememberScrollState())
            .padding(start = 12.dp, end = 12.dp, top = 4.dp, bottom = 8.dp)
    ) {
        Row(
            Modifier
                .clip(RoundedCornerShape(4.dp))
                .background(
                    MaterialTheme.colorScheme.surface
                )
                .padding(vertical = 1.dp, horizontal = 8.dp)
        ) {
            Icon(imageVector = Icons.Outlined.Explore, contentDescription = null, Modifier.size(28.dp))
        }

        Spacer(Modifier.width(4.dp))

        Tag("전체", true)
        Tag("새로운 맞춤 동영상", false)
        Tag("게임", false)
        Tag("음악", false)
        Tag("뉴스", false)
        Tag("믹스", false)
        Tag("라이브", false)
        Tag("스케치 코미디", false)
        Tag("애니메이션", false)
        Tag("수학", false)
    }
}

@Composable
fun Tag(text: String, selected: Boolean) {
    Row(
        Modifier
            .clip(RoundedCornerShape(10.dp))
            .background(
                if (selected) MaterialTheme.colorScheme.onSurface
                else MaterialTheme.colorScheme.surface
            )
            .padding(vertical = 7.dp, horizontal = 12.dp)
    ) {
        Text(
            text,
            color = if (selected) Color.White else Color.Black,
            style = MaterialTheme.typography.bodyMedium,
            fontWeight = FontWeight.Medium
        )
    }
}