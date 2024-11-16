package com.example.ibank.ui.app.BottomNavigation

import androidx.collection.emptyLongSet
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemColors
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.ibank.ui.theme.BottomNavigationText
import com.example.ibank.ui.theme.Purple
import com.example.ibank.ui.theme.White

@Composable
fun BottomNavigation(

    navController: NavController

) {

    val listItems = listOf(

        BottomItem.HomeScreen,
        BottomItem.SearchScreen,
        BottomItem.MessageScreen,
        BottomItem.SettingsScreen
        

    )

    NavigationBar(

        modifier = Modifier
            .background(White),

        contentColor = White

    ) {

        val backStackEntry by navController.currentBackStackEntryAsState()
        val currentRoute = backStackEntry?.destination?.route

        listItems.forEach { item ->

            val isSelected = currentRoute == item.route

           NavigationBarItem(

               selected = isSelected,
               onClick = {

                   navController.navigate(item.route)

               },
               icon = {

                      Row(

                          verticalAlignment = Alignment.CenterVertically,
                          horizontalArrangement = Arrangement.spacedBy(8.dp)

                      ) {

                            Icon(
                                
                                painter = painterResource(id = item.icon), 
                                contentDescription = ""
                                    
                            )


                            if(isSelected) {

                                Text (
                                    text = item.title,
                                    style = MaterialTheme.typography.BottomNavigationText
                                )

                            }
                      }

               },

               label = null,

               colors = NavigationBarItemDefaults.colors(

                   indicatorColor = Purple

               ),

               alwaysShowLabel = false,

               modifier = Modifier
                   .background(if (isSelected) Color.Transparent else Color.Transparent)



           )

        }

    }
    

}

@Composable
@Preview
fun BottomNavigationPreview() {

    val navController = rememberNavController()
    
    BottomNavigation(navController = navController)
    
}
