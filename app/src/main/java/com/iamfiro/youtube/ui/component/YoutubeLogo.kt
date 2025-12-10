package com.iamfiro.youtube.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import com.iamfiro.youtube.R

@Composable
fun YoutubeLogo(height: Dp) {
    if(isSystemInDarkTheme()) {
        Image(painter = painterResource(R.drawable.youtube_white), contentDescription = null, modifier = Modifier.height(height))
    } else {
        Image(painter = painterResource(R.drawable.youtube_dark), contentDescription = null, modifier = Modifier.height(height))

    }
}