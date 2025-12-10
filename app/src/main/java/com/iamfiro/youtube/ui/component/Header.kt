package com.iamfiro.youtube.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Cast
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.iamfiro.youtube.R

@Composable
fun Header() {
    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
//        modifier = Modifier.padding(horizontal = 16.dp, vertical = 12.dp).fillMaxWidth()
        modifier = Modifier.padding(bottom = 16.dp, top = 12.dp, start = 14.dp, end = 8.dp).fillMaxWidth()
    ) {
        YoutubeLogo(21.dp)
        Row(horizontalArrangement = Arrangement.spacedBy(20.dp), verticalAlignment = Alignment.CenterVertically) {
            Icon(imageVector = Icons.Default.Cast, contentDescription = null, modifier = Modifier.size(24.dp))
            Icon(imageVector = Icons.Outlined.Notifications, contentDescription = null, modifier = Modifier.size(28.dp))
            Icon(imageVector = Icons.Default.Search, contentDescription = null, modifier = Modifier.size(28.dp))
        }
    }
}