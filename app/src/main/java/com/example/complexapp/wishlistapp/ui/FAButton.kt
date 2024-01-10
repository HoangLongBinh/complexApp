package com.example.complexapp.wishlistapp.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material.FloatingActionButton
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun FAButton(
    onClicked: () -> Unit
) {
    FloatingActionButton(
        onClick = { onClicked() },
        modifier = Modifier.padding(20.dp),
        backgroundColor = Color.Black,
        contentColor = Color.White
    ) {
        //content here
        Icon(
            imageVector = Icons.Default.Add,
            contentDescription = null
        )
    }
}