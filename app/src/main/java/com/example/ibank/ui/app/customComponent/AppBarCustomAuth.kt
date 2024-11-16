package com.example.ibank.ui.app.customComponent

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBars
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusTargetModifierNode
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ibank.R
import com.example.ibank.ui.theme.AuthSign
import com.example.ibank.ui.theme.Purple
import com.example.ibank.ui.theme.Strings

@Composable
fun  AppBarCustomAuth(

    title: String,

) {

    Box(

        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp)
            .background(Purple),


    ) {

        Row(

            modifier = Modifier
                .padding(horizontal = 24.dp)
                .fillMaxSize(),

            verticalAlignment = Alignment.CenterVertically

        ) {

            Image(

                painter = painterResource(id = R.drawable.back_icon),
                contentDescription = "IconBack"

            )

            Spacer(modifier = Modifier.width(20.dp))

            Text(

                text = title,
                style = MaterialTheme.typography.AuthSign

            )

        }

    }

}