package com.example.complexapp.wishlistapp.ui

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.complexapp.R
import com.example.complexapp.wishlistapp.Screen
import com.example.complexapp.wishlistapp.data.WishViewModel

//function used to add or edit detail view

@Composable
fun AddEditDetailView(
    id: Long = 0L,
    viewModel: WishViewModel,
    navController: NavController  //to return the homescreen
) {
    Scaffold(
        topBar = { 
            AppBar(tittle = if (id != 0L) stringResource(id = R.string.update_wish)
                else stringResource(id = R.string.add_wish)
            ) {
                navController.navigateUp()   //navigate to the previous screen
            }
        }
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentSize()
                .padding(it),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(modifier = Modifier.padding(10.dp))

            WishTextField(
                label = "Tittle",
                value = viewModel.wishTittleState,

                onChangeValue = { tittle ->
                    viewModel.onWishTitleChange(tittle) //set new data for view-model
                }
            )

            Spacer(modifier = Modifier.padding(10.dp))

            WishTextField(
                label = "Description",
                value = viewModel.wishDescriptionState,
                onChangeValue = { desc ->
                    viewModel.onWishDescriptionChange(desc) //set new data for view-model
                }
            )

            Spacer(modifier = Modifier.padding(10.dp))

            Button(
                onClick = { //wish handle store or modify data in the DB
                    if (viewModel.wishTittleState.isNotEmpty()
                        &&viewModel.wishDescriptionState.isNotEmpty()  //update if no empty
                        ) {
                        //TODO to update wish
                    } else {
                        //TODO add wish
                    }
                }
            ) {
                Text(
                    text = if (id != 0L) stringResource(id = R.string.update_wish)  //id != 0 => update
                    else stringResource(id = R.string.add_wish)
                )
            }

        }
    }

}


@Composable
fun WishTextField(
    label: String,
    value: String,
    onChangeValue: (String) -> Unit //while we enter and change value in the edit text field
) {
    OutlinedTextField(
        value = value,
        onValueChange = onChangeValue,
        label = { Text(text = label, color = Color.Black)},
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text), //show key board ASCII
        colors = TextFieldDefaults.outlinedTextFieldColors(
            textColor = Color.Black,
            focusedBorderColor = Color.Black,
            unfocusedBorderColor = colorResource(id = R.color.black),
            cursorColor = Color.Black,
            focusedLabelColor = Color.Black,
            unfocusedLabelColor = Color.Black
        )
    )
}

//@Preview(showBackground = true)
//@Composable
//fun WishTextFieldPreview() {
//    WishTextField(label = "Text", value = "Huyen Linh", onChangeValue = {} )
//}

//finalize: hoan thien