package com.example.ibank.ui.app.screen.main.Home

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.drawscope.translate
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ibank.R
import com.example.ibank.ui.app.data.CardBankData
import com.example.ibank.ui.theme.AuthButtonText
import com.example.ibank.ui.theme.BalanceCard
import com.example.ibank.ui.theme.Gray
import com.example.ibank.ui.theme.IconItem
import com.example.ibank.ui.theme.MainBlueCard
import com.example.ibank.ui.theme.MainShapeCard
import com.example.ibank.ui.theme.MinorRedCard
import com.example.ibank.ui.theme.MinorShapeCard
import com.example.ibank.ui.theme.NameInCard
import com.example.ibank.ui.theme.NumberCard
import com.example.ibank.ui.theme.Purple
import com.example.ibank.ui.theme.PurpleForMinorCard
import com.example.ibank.ui.theme.TypeCard
import com.example.ibank.ui.theme.White

val cardBank = listOf(

    CardBankData(

        image = R.drawable.item_1,
        text = "Account\nand Card"

    ),

    CardBankData(

        image = R.drawable.item_2,
        text = "Transfer"

    ),

    CardBankData(

        image = R.drawable.item_3,
        text = "Withdraw"

    ),

    CardBankData(

        image = R.drawable.item_4,
        text = "Mobile\nprepaid"

    ),

    CardBankData(

        image = R.drawable.item_5,
        text = "Pay the \nbill"

    ),

    CardBankData(

        image = R.drawable.item_6,
        text = "Save'\nonline"

    ),

    CardBankData(

        image = R.drawable.item_7,
        text = "Credit\ncard"

    ),

    CardBankData(

        image = R.drawable.item_8,
        text = "Transaction\nreport"

    ),

    CardBankData(

        image = R.drawable.item_9,
        text = "Beneficiary"

    ),

    )

@Composable
fun HomeScreen() {

    Column(

        modifier = Modifier
            .fillMaxSize()
            .background(Purple)

    ) {

        Column(

            modifier = Modifier
                .padding(horizontal = 24.dp)
                .padding(bottom = 24.dp),

        ) {

            Spacer(modifier = Modifier.height(24.dp))

            Row(

                modifier = Modifier
                    .fillMaxWidth(),

                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically

            ) {

                Box(

                    modifier = Modifier
                        .clip(CircleShape)


                ) {

                    Image(

                        painter = painterResource(id = R.drawable.main_avatar),
                        contentDescription = "MainAvatar",
                        contentScale = ContentScale.Crop,

                        modifier = Modifier
                            .size(50.dp)

                    )

                }

                Text(

                    text = "Hi, Push Puttichai",
                    style = MaterialTheme.typography.AuthButtonText,

                )

                Spacer(modifier = Modifier.width(70.dp))

                Image(

                    painter = painterResource(id = R.drawable.message),
                    contentDescription = "MessageMainScreen"

                )

            }

        }

        Spacer(modifier = Modifier.fillMaxHeight(0.01f))

        Box(

            modifier = Modifier
                .fillMaxSize()
                .height(100.dp)
                .clip(RoundedCornerShape(topStart = 24.dp, topEnd = 24.dp))
                .background(White)

        ) {

            Column(

                modifier = Modifier
                    .padding(24.dp)

            ) {

                Box(

                    modifier = Modifier
                        .fillMaxWidth()
                        .height(215.dp)
                        .clip(RoundedCornerShape(15.dp))
                        .background(MainBlueCard)

                ) {

                    Canvas(modifier = Modifier.fillMaxSize()) {

                        translate(

                            left = -260f,
                            top = 79f

                        ) {

                            drawCircle(MainShapeCard, radius = 150.dp.toPx())

                        }
                    }

                    Canvas(modifier = Modifier.fillMaxSize()) {

                        translate(

                            left = 450f,
                            top = -200f

                        ) {

                            drawCircle(MinorShapeCard, radius = 100.dp.toPx())

                        }
                        
                    }

                    Column(

                        modifier = Modifier
                            .padding(20.dp)

                    ) {

                        Text(

                            text = "John Smith",
                            style = MaterialTheme.typography.NameInCard

                        )

                        Spacer(modifier = Modifier.height(30.dp))

                        Text(

                            text = "Amazon Platinium",
                            style = MaterialTheme.typography.TypeCard

                        )

                        Spacer(modifier = Modifier.height(10.dp))

                        Text(

                            text = "4756  4756  4756  9018",
                            style = MaterialTheme.typography.NumberCard

                        )

                        Spacer(modifier = Modifier.height(10.dp))

                        Text(

                            text = "$3.469.52",
                            style = MaterialTheme.typography.BalanceCard

                        )

                        Row(

                            modifier = Modifier
                                .fillMaxWidth(),

                            horizontalArrangement = Arrangement.End

                        ) {

                            Image(
                                painter = painterResource(id = R.drawable.visa),
                                contentDescription = "VisaBank"

                            )

                        }

                    }

                }

                Box(

                    modifier = Modifier
                        .padding(horizontal = 20.dp)
                        .fillMaxWidth()
                        .height(10.dp)
                        .clip(RoundedCornerShape(bottomStart = 15.dp, bottomEnd = 15.dp))
                        .background(MinorRedCard)

                )

                Box(

                    modifier = Modifier
                        .padding(horizontal = 35.dp)
                        .fillMaxWidth()
                        .height(10.dp)
                        .clip(RoundedCornerShape(bottomStart = 15.dp, bottomEnd = 15.dp))
                        .background(PurpleForMinorCard)

                )

                Spacer(modifier = Modifier.height(32.dp))

                LazyVerticalGrid(

                    columns = GridCells.Fixed(3),
                    modifier = Modifier
                        .fillMaxWidth(),

                    verticalArrangement = Arrangement.spacedBy(16.dp),
                    horizontalArrangement = Arrangement.spacedBy(16.dp)

                ) {

                   items(cardBank.size) {

                        CardBankItem(it)

                   }

                }
            }

        }

    }
    
}


@Composable
fun CardBankItem(index: Int) {

    val card = cardBank[index]

    Card(

        modifier = Modifier
            .clip(RoundedCornerShape(15.dp))
            .background(Gray),

        elevation = CardDefaults.cardElevation(7.dp),

        colors = CardDefaults.cardColors(containerColor = White)

    ) {

        Column(

            modifier = Modifier
                .padding(top = 16.dp, bottom = 16.dp)
                .height(75.dp)
                .fillMaxSize(),

            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center

        ) {

            Image(

                painter = painterResource(id = card.image),
                contentDescription = ""

            )

            Spacer(modifier = Modifier.height(12.dp))

            Text(

                text = card.text,
                style = MaterialTheme.typography.IconItem,
                textAlign = TextAlign.Center

            )


        }



    }

}

@Composable
@Preview(showBackground = true)
fun MainScreenPreview() {

    HomeScreen()

}
        
        
        
        
