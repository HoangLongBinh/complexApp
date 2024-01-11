package com.example.complexapp.wishlistapp.data

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

/*
    Theory of room DB
    If you want to store a small amount of data that not require structure => can you Shared preference
    If you want to store data and perform complex query => can use SQLite or Room
 */


//The entity basically a table wish many properties

/*
    Step to initialize a room DB
    1. Create an Entity class (sample wish)
    2. Create a wishDao from Entity class (Data access object)
 */


@Entity(tableName = "wish-table")
data class Wish(
    @PrimaryKey(autoGenerate = true) var id: Long = 0L,  //this id is auto increment and generate automatically
    @ColumnInfo(name = "wish-title") var tittle: String,
    @ColumnInfo(name = "wish-desc") var desc: String
)


//add dummy wish for testing

object DummyWish {
    val wishlist = listOf(
        Wish(id = 0L, "Have more money", "Have one billion USD"),
        Wish(id = 0L, "More strong", "Can bring the Earth on the shoulder"),
        Wish(id = 0L, "Have beautiful girl friend", "Have girl friend with big butt"),
        Wish(id = 0L, "Super coder", "Can deploy a lot of great application")
    )
}