package com.example.complexapp.wishlistapp.data

import kotlinx.coroutines.flow.Flow

/*
    This class will handle data from all source: DB, web,...
    This used to separate UI and DB, allow viewModel not need to care the data
    Provide method to access and modify DB
 */


class WishRepository(private val wishDao: WishDao) {
    suspend fun addAWish(wish: Wish) {
        wishDao.addAWish(wish)
    }

    fun getWishes(): Flow<List<Wish>> {
        return wishDao.getAllWishes()
    }

    suspend fun updateAWish(wish: Wish) {
        wishDao.updateAWish(wish)
    }

    suspend fun deleteAWish(wish: Wish) {
        wishDao.deleteAWish(wish)
    }

    fun getWishesById(id:Long): Flow<Wish> = wishDao.getAWishById(id)

}