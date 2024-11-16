package com.example.ibank.ui.app.screen.main.Search

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ibank.R
import com.example.ibank.ui.app.customComponent.CustomMainAppBar
import com.example.ibank.ui.app.data.SearchItem
import com.example.ibank.ui.app.screen.main.Home.cardBank
import com.example.ibank.ui.theme.MinorAuthText
import com.example.ibank.ui.theme.SearchMainText
import com.example.ibank.ui.theme.White

val SearchScreenList = listOf(

    SearchItem(

        mainText = "Branch",
        minorText = "Search for branch",
        image = R.drawable.branch_item

    ),

    SearchItem(

        mainText = "Interest rate",
        minorText = "Search for interest rate",
        image = R.drawable.rate_item

    ),

    SearchItem(

        mainText = "Exchange rate",
        minorText = "Search for exchange rate",
        image = R.drawable.rate_item_2

    ),

    SearchItem(

        mainText = "Exchange",
        minorText = "Exchange amount of money",
        image = R.drawable.excahnge_item

    )

)

@Composable
fun SearchScreen(

    onMapsBranch: () -> Unit

) {



    Column(

        modifier = Modifier
            .fillMaxSize()

    ) {

        CustomMainAppBar(title = "Search")

        Spacer(modifier = Modifier.height(24.dp))

        Column(

            modifier = Modifier
                .fillMaxSize()

        ) {

            LazyColumn(


            ) {

                items(SearchScreenList.size) { index ->

                    SearchDesignItem(index = index, onclick = {

                        val card = SearchScreenList[index]

                        if (card == SearchScreenList[0]) {

                            onMapsBranch()

                        }

                    })

                }

            }

        }


    }

}

@Composable
fun SearchDesignItem(index: Int, onclick: () -> Unit) {

    val card = SearchScreenList[index]

    Card(

        modifier = Modifier
            .padding(horizontal = 24.dp)
            .padding(bottom = 20.dp)
            .fillMaxWidth()
            .background(color = White)
            .clickable { onclick() },

        shape = RoundedCornerShape(15.dp),

        elevation = CardDefaults.cardElevation(7.dp),

        colors = CardDefaults.cardColors(containerColor = White),

    ) {

        Row(

            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),

            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.Top

        ) {
            
            Column {

                Text(

                    text = card.mainText,
                    style = MaterialTheme.typography.SearchMainText

                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(

                    text = card.minorText,
                    style = MaterialTheme.typography.MinorAuthText

                )
                
            }

            Image(

                painter = painterResource(id = card.image),
                contentDescription = ""

            )

        }

    }


}

@Composable
@Preview(showBackground = true)
fun SearchScreenPreview() {

    SearchScreen(onMapsBranch = {})

}