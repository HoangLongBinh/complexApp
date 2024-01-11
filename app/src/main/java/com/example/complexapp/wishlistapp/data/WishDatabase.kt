package com.example.complexapp.wishlistapp.data

import androidx.room.Database
import androidx.room.RoomDatabase

//abstract room DB
//data base show how the db look like
@Database(
    entities = [Wish::class],
    version = 1,
    exportSchema = false
)
abstract class WishDatabase: RoomDatabase() {
    //return a wishDao
    abstract fun wishDao(): WishDao
}