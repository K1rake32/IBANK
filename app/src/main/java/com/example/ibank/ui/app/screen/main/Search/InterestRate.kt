package com.example.ibank.ui.app.screen.main.Search

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Divider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ibank.ui.app.customComponent.CustomMainAppBar
import com.example.ibank.ui.app.data.RateItems
import com.example.ibank.ui.theme.ChangePasswordText
import com.example.ibank.ui.theme.DividerColor
import com.example.ibank.ui.theme.InterestingKind
import com.example.ibank.ui.theme.MediumBlackText

val rateList = listOf(

    RateItems(
        "Individual customers",
        "1m",
        "4.50%"
    ),

    RateItems(
        "Individual customers",
        "1m",
        "4.50%"
    ),

    RateItems(
        "Individual customers",
        "1m",
        "4.50%"
    ),

    RateItems(
        "Individual customers",
        "1m",
        "4.50%"
    ),

    RateItems(
        "Individual customers",
        "1m",
        "4.50%"
    ),

    RateItems(
        "Individual customers",
        "1m",
        "4.50%"
    ),

    RateItems(
        "Individual customers",
        "1m",
        "4.50%"
    ),

    RateItems(
        "Individual customers",
        "1m",
        "4.50%"
    ),

    RateItems(
        "Individual customers",
        "1m",
        "4.50%"
    ),

    RateItems(
        "Individual customers",
        "1m",
        "4.50%"
    ),

    RateItems(
        "Individual customers",
        "1m",
        "4.50%"
    ),

    RateItems(
        "Individual customers",
        "1m",
        "4.50%"
    ),

    RateItems(
        "Individual customers",
        "1m",
        "4.50%"
    ),

    RateItems(
        "Individual customers",
        "1m",
        "4.50%"
    ),

    RateItems(
        "Individual customers",
        "1m",
        "4.50%"
    ),

    RateItems(
        "Individual customers",
        "1m",
        "4.50%"
    ),

    RateItems(
        "Individual customers",
        "1m",
        "4.50%"
    ),

    RateItems(
        "Individual customers",
        "1m",
        "4.50%"
    ),
    RateItems(
        "Individual customers",
        "1m",
        "4.50%"
    ),
    RateItems(
        "Individual customers",
        "1m",
        "4.50%"
    ),
    RateItems(
        "Individual customers",
        "1m",
        "4.50%"
    ),
    RateItems(
        "Individual customers",
        "1m",
        "4.50%"
    ),
    RateItems(
        "Individual customers",
        "1m",
        "4.50%"
    ),

)

@Composable
fun InterestRate(



) {

    Column(

        modifier = Modifier.fillMaxSize()

    ) {

        CustomMainAppBar(title = "Interest rate")
        
        Spacer(modifier = Modifier.height(24.dp))

        Row(

            modifier = Modifier
                .padding(horizontal = 24.dp)
                .fillMaxWidth(),
            
            horizontalArrangement = Arrangement.SpaceBetween

        ) {

            Text(

                text = "Interest kind",
                style = MaterialTheme.typography.InterestingKind

            )

            Spacer(modifier = Modifier.width(40.dp))
            
            Text(

                text = "Deposit",
                style = MaterialTheme.typography.InterestingKind

            )

            Text(

                text = "Rate",
                style = MaterialTheme.typography.InterestingKind

            )


        }

        LazyColumn(

            modifier = Modifier
                .padding(top = 30.dp)
                .fillMaxSize(),

            verticalArrangement = Arrangement.spacedBy(20.dp)

        ) {

            items(rateList.size) {

                InterestRateItem(it)

            }

        }

    }

}

@Composable
fun InterestRateItem(

    index: Int

) {

    val card = rateList[index]

    Column(

    ) {

        Row(

            modifier = Modifier
                .padding(horizontal = 24.dp)
                .fillMaxWidth(),

            horizontalArrangement = Arrangement.SpaceBetween

        ) {

            Text(

                text = card.name,
                style = MaterialTheme.typography.MediumBlackText

            )

            Text(

                text = card.deposit,
                style = MaterialTheme.typography.MediumBlackText

            )


            Text(

                text = card.rate,
                style = MaterialTheme.typography.ChangePasswordText

            )

    }

        Spacer(modifier = Modifier.height(12.dp))

        Divider(

            modifier = Modifier
                .padding(horizontal = 24.dp)
                .fillMaxWidth()
                .background(DividerColor)
                .height(1.dp)

        )


    }

}

@Composable
@Preview(showBackground = true)
private fun InterestRatePreview() {

    InterestRate()

}