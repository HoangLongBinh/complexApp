package com.example.complexapp.wishlistapp.data

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class WishViewModel: ViewModel() {
    private var wishTittleState by mutableStateOf("")   //hold wish tittle state in viewModel
    private var wishDescriptionState by mutableStateOf("")

    fun getWishTittleState(): String {
        return wishTittleState
    }

    fun getWishDescriptionState(): String {
        return wishDescriptionState
    }

    fun onWishTitleChange(newString: String) {
        wishTittleState = newString
    }

    fun onWishDescriptionChange(newString: String) {
        wishDescriptionState = newString
    }
}