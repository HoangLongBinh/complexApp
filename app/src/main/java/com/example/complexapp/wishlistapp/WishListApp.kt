package com.example.complexapp.wishlistapp

import android.app.Application
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.complexapp.ui.theme.ComplexappTheme
import com.example.complexapp.wishlistapp.ui.Navigation


//this class will inherit application class, need to override on create fun
class WishListApp: Application() {
    override fun onCreate() {
        super.onCreate()
        Graph.provide(this) //initialize the db for the app
//        {
//            Navigation()
//        }

    }
}