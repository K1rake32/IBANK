package com.example.ibank.ui.app.screen.main.Search

import androidx.compose.foundation.Image
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
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ibank.R
import com.example.ibank.ui.app.customComponent.CustomMainAppBar
import com.example.ibank.ui.app.data.CountryItem
import com.example.ibank.ui.theme.DividerColor
import com.example.ibank.ui.theme.InterestingKind
import com.example.ibank.ui.theme.MediumBlackText

val countryList = listOf(

    CountryItem(

        image = R.drawable.vietnam,
        "Vietnam",
        "1.403",
        "1.746"

    ),

    CountryItem(

        image = R.drawable.vietnam,
        "Vietnam",
        "1.403",
        "1.746"

    ),

    CountryItem(

        image = R.drawable.vietnam,
        "Vietnam",
        "1.403",
        "1.746"

    ),

    CountryItem(

        image = R.drawable.vietnam,
        "Vietnam",
        "1.403",
        "1.746"

    ),

    CountryItem(

        image = R.drawable.vietnam,
        "Vietnam",
        "1.403",
        "1.746"

    ),

    CountryItem(

        image = R.drawable.vietnam,
        "Vietnam",
        "1.403",
        "1.746"

    ),

    CountryItem(

        image = R.drawable.vietnam,
        "Vietnam",
        "1.403",
        "1.746"

    ),

    CountryItem(

        image = R.drawable.vietnam,
        "Vietnam",
        "1.403",
        "1.746"

    ),

    CountryItem(

        image = R.drawable.vietnam,
        "Vietnam",
        "1.403",
        "1.746"

    ),

    CountryItem(

        image = R.drawable.vietnam,
        "Vietnam",
        "1.403",
        "1.746"

    ),

    CountryItem(

        image = R.drawable.vietnam,
        "Vietnam",
        "1.403",
        "1.746"

    ),

    CountryItem(

        image = R.drawable.vietnam,
        "Vietnam",
        "1.403",
        "1.746"

    ),

    CountryItem(

        image = R.drawable.vietnam,
        "Vietnam",
        "1.403",
        "1.746"

    ),

    CountryItem(

        image = R.drawable.vietnam,
        "Vietnam",
        "1.403",
        "1.746"

    ),

    CountryItem(

        image = R.drawable.vietnam,
        "Vietnam",
        "1.403",
        "1.746"

    ),

    CountryItem(

        image = R.drawable.vietnam,
        "Vietnam",
        "1.403",
        "1.746"

    ),

    CountryItem(

        image = R.drawable.vietnam,
        "Vietnam",
        "1.403",
        "1.746"

    ),

)

@Composable
fun ExchangeRate(



) {

    Column(
        
        modifier = Modifier
            .fillMaxSize()
        
    ) {
        
        CustomMainAppBar(title = "Exchange rate")
        
        Spacer(modifier = Modifier.height(24.dp))

        Row(

            modifier = Modifier
                .padding(horizontal = 24.dp)
                .fillMaxWidth(),

            horizontalArrangement = Arrangement.SpaceBetween


        ) {

            Text(

                text = "Country",
                style = MaterialTheme.typography.InterestingKind

            )

            Spacer(modifier = Modifier.width(0.dp))

            Text(

                text = "Buy",
                style = MaterialTheme.typography.InterestingKind

            )

            Text(

                text = "Sell",
                style = MaterialTheme.typography.InterestingKind

            )

        }

        LazyColumn(

            modifier = Modifier
                .padding(top = 32.dp)
                .fillMaxSize(),

            verticalArrangement = Arrangement.spacedBy(12.dp)

        ) {

            items(countryList.size) {

                CountryListItem(index = it)

            }

        }

    }

}

@Composable
private fun CountryListItem(

    index: Int

) {

    val item = countryList[index]

    Column(
        
    ) {

        Row(

            modifier = Modifier
                .padding(horizontal = 24.dp)
                .fillMaxWidth(),

            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically

        ) {


            Image(

                painter = painterResource(item.image),
                contentDescription = "Country Image"

            )

            Text(

                text = item.country,
                style = MaterialTheme.typography.MediumBlackText

            )


            Text(

                text = item.buy,
                style = MaterialTheme.typography.MediumBlackText

            )

            Text(

                text = item.sell,
                style = MaterialTheme.typography.MediumBlackText

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
private fun ExchangeRatePreview() {

    ExchangeRate()

}