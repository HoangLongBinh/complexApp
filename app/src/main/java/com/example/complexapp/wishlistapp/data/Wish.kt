package com.example.complexapp.wishlistapp.data

data class Wish(
    var id: Long = 0L,
    var tittle: String,
    var desc: String
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