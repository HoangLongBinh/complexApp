package com.example.complexapp.wishlistapp.data

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow


//wish Dao class will hold the abstract method to handle modify data in room

@Dao
abstract class WishDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE) //always insert instead of conflict
    abstract suspend fun addAWish(wishEntity: Wish)

    //load all wishes form DB
    @Query("Select * from `wish-table`")
    abstract fun getAllWishes(): Flow<List<Wish>>

    @Update
    abstract suspend fun updateAWish(wishEntity: Wish)

    @Delete
    abstract suspend fun deleteAWish(wishEntity: Wish)

    //query a wish by id
    @Query("Select * from `wish-table` where id =:id")
    abstract fun getAWishById(id: Long): Flow<Wish>
}