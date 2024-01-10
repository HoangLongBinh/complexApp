package com.example.complexapp.wishlistapp.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.complexapp.wishlistapp.Screen
import com.example.complexapp.wishlistapp.data.DummyWish
import com.example.complexapp.wishlistapp.data.WishViewModel


//home view screen -> home for wishlist app
//we can use navigate function to move to other screen
@Composable
fun HomeView(
    viewModel: WishViewModel, //handle display UI and update the data
    navController: NavController //use to handle callback function
) {
    Scaffold(
        topBar = { AppBar("wishlist") },   //not show button
        floatingActionButton = { FAButton {  //add floating action button
            navController.navigate(Screen.AddScreen.route) //function use to navigate to add screen when we click on the FAButton
        }}
    ) {
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
        ) {
            items(DummyWish.wishlist) {wish ->
                WishItem(wish = wish) {

                }
            }
        }
    }
}


//@Preview(showBackground = true)
//@Composable
//fun HomeViewPreview() {
//    HomeView()
//}