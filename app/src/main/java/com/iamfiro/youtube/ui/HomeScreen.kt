package com.iamfiro.youtube.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.iamfiro.youtube.ui.component.BottomSheet
import com.iamfiro.youtube.ui.component.Header
import com.iamfiro.youtube.ui.component.TagList
import com.iamfiro.youtube.ui.component.VideoList

@Composable
fun HomeScreen() {
    Scaffold { innerPadding ->
        LazyColumn(
            Modifier
                .background(MaterialTheme.colorScheme.background)
                .padding(innerPadding)
                .fillMaxSize()
        ) {
            item {
                Header()
                TagList()
                VideoList()
            }
        }
    }
}