package com.example.ibank.ui.app.BottomNavigation

import androidx.compose.foundation.background
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.ibank.ui.theme.BottomNavigationText
import com.example.ibank.ui.theme.White

@Composable
fun BottomNavigation(

    navController: NavController

) {

    val listItems = listOf(

        BottomItem.HomeScreen,
        BottomItem.SearchScreen,
        BottomItem.MessageScreen,
        BottomItem.SettingsScreen,

    )

    NavigationBar(

        modifier = Modifier
            .background(White)

    ) {

        val backStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = backStackEntry?.destination?.route

        listItems.forEach { item ->

           NavigationBarItem(

               selected = currentRoute == item.route ,
               onClick = {

                   navController.navigate(item.route)

               },
               icon = {
                   Icon(

                       painter = painterResource(id = item.icon),
                       contentDescription = "IconBottomNavigation"

                   )
               },

               label = {
                   
                   Text(

                       text = item.title,
                       style = MaterialTheme.typography.BottomNavigationText

                   )
                   
               },

               

           )

        }

    }
    

}
