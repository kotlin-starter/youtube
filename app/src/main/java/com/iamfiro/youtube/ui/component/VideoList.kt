package com.iamfiro.youtube.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.iamfiro.youtube.R

@Composable
fun VideoList() {
    Video(thumbnail = R.drawable.yt_thumbnail, profile = R.drawable.yt_profile, title = "스트리머 내정에서 츈츈님과 레전드 케미 보여드렸습니다.", channelName = "네오입니다만")
    Video(thumbnail = R.drawable.yt_thumbnail2, profile = R.drawable.yt_profile2, title = "\"정치 안 한다며?\" 김성회의 말은 김성회의 말로 반박된다", channelName = "김성회의 지식백과")
    Video(thumbnail = R.drawable.yt_thumbnail3, profile = R.drawable.yt_profile3, title = "미국이 자국 기업에 '전쟁'을 선포한 진짜 이유\uD83D\uDD25/ 반독점법과 스탠더드 오일", channelName = "퍄퍄킴 역사")
}

@Composable
fun Video(thumbnail: Int, profile: Int, title: String, channelName: String) {
    Column(Modifier.fillMaxWidth().padding(bottom = 20.dp)) {
        Image(
            painter = painterResource(thumbnail),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(220.dp),
            contentScale = ContentScale.Crop
        )
        Row(
            verticalAlignment = Alignment.Top,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxWidth()
                .padding(14.dp)
        ) {
            Row(verticalAlignment = Alignment.Top, horizontalArrangement = Arrangement.spacedBy(10.dp)) {
                Image(
                    painter = painterResource(profile), null, Modifier
                        .size(36.dp)
                        .clip(
                            RoundedCornerShape(999.dp)
                        )
                )
                Column(verticalArrangement = Arrangement.spacedBy(4.dp)) {
                    Text(
                        title,
                        style = MaterialTheme.typography.titleMedium,
                        lineHeight = 22.sp
                    )
                    Text(
                        "$channelName · 조회수 5.7천회 · 2일전",
                        style = MaterialTheme.typography.labelSmall,
                        color = MaterialTheme.colorScheme.onSurfaceVariant,
                    )
                }
            }
            Icon(imageVector = Icons.Default.MoreVert, contentDescription = null)
        }
    }
}