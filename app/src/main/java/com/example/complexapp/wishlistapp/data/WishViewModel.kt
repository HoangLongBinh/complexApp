package com.example.complexapp.wishlistapp.data

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.complexapp.wishlistapp.Graph
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch

class WishViewModel(
    private val wishRepository: WishRepository = Graph.wishRepository //default
): ViewModel() {
     var wishTittleState by mutableStateOf("")   //hold wish tittle state in viewModel
     var wishDescriptionState by mutableStateOf("")

//    fun getWishTittleState(): String {
//        return wishTittleState
//    }

//    fun getWishDescriptionState(): String {
//        return wishDescriptionState
//    }

    fun onWishTitleChange(newString: String) {
        wishTittleState = newString
    }

    fun onWishDescriptionChange(newString: String) {
        wishDescriptionState = newString
    }

    //property must be initialize or abstract
    lateinit var getAllWishes: Flow<List<Wish>>

    init {
        //need to load in suspend function
        viewModelScope.launch {
            getAllWishes = wishRepository.getWishes()
        }
    }

    fun addWish(wish: Wish) {
        //dispatcher decide the thread where the function will run
        viewModelScope.launch(Dispatchers.IO) {
            wishRepository.addAWish(wish)
        }
    }

    fun getAWishById(id:Long) {
        //dispatcher decide the thread where the function will run
        viewModelScope.launch(Dispatchers.IO) {
            wishRepository.getWishesById(id)
        }
    }

    fun updateWish(wish: Wish) {
        //dispatcher decide the thread where the function will run
        viewModelScope.launch(Dispatchers.IO) {
            wishRepository.updateAWish(wish)
        }
    }

    fun deleteWish(wish: Wish) {
        viewModelScope.launch(Dispatchers.IO) {
            wishRepository.deleteAWish(wish)
        }
    }
}