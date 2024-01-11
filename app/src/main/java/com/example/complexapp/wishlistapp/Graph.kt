package com.example.complexapp.wishlistapp

import android.content.Context
import androidx.room.Room
import com.example.complexapp.wishlistapp.data.WishDatabase
import com.example.complexapp.wishlistapp.data.WishRepository

object Graph {
    lateinit var database: WishDatabase

    //only initialize when we need it
    val wishRepository by lazy {
        WishRepository(wishDao = database.wishDao())
    }

    //fun used to build db
    fun provide(context: Context) {
        //initialize the DB when we call the provide function
        database = Room.databaseBuilder(context,
            WishDatabase::class.java, "wishlist.db").build()
    }
}

