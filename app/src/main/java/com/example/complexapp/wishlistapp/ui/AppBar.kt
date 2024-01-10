package com.example.complexapp.wishlistapp.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.example.complexapp.R

/*
    App bar is a composable have tittle and icon for click
 */

@Composable
fun AppBar(
    tittle: String,
    onBackNavClicked: () -> Unit = {}
) {

    val navigationIcon: (@Composable () -> Unit)? =
        if (!tittle.contains("wishlist")) {
            {  //lambda
                IconButton(onClick = { onBackNavClicked() }) {  //callback function used to back
                    Icon(
                        imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                        contentDescription = null,
                        tint = Color.White
                    )
                }
            }
        } else {
            null
        }



    TopAppBar(
        title = {
            Text(text = tittle,
                modifier = Modifier.padding(8.dp),
                color = Color.White
            )
        },
        elevation = 3.dp,
        backgroundColor = colorResource(id = R.color.pink),
        navigationIcon = navigationIcon

    )
}