package com.example.ibank.ui.app.BottomNavigation

import com.example.ibank.R

sealed class BottomItem(val title: String, val icon: Int, val route: String) {

    object HomeScreen: BottomItem(

        "Home",
        R.drawable.homebottomnavigation,
        "home_screen"

    )

    object SearchScreen: BottomItem(

        "Search",
        R.drawable.homebottomnavigation,
        "search_screen"

    )

    object MessageScreen: BottomItem(

        "Message",
        R.drawable.homebottomnavigation,
        "message_screen"

    )

    object SettingsScreen: BottomItem(

        "Settings",
        R.drawable.homebottomnavigation,
        "settings_screen"

    )

}