package com.example.ibank.ui.theme

import androidx.compose.material3.MediumTopAppBar
import androidx.compose.material3.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.ibank.R

//FontStyle
val PoppinsSemiBold = FontFamily(
    Font(R.font.poppins_semibold, FontWeight.SemiBold)
)

val PoppinsMedium = FontFamily(
    Font(R.font.poppins_medium, FontWeight.Medium)
)

val PoppinsRegular = FontFamily(
    Font(R.font.poppins_regular, FontWeight.Medium)
)



//Typography
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
)

val Typography.AuthSign: TextStyle
    get() = TextStyle(
        fontSize = 20.sp,
        color = White,
        fontFamily = PoppinsSemiBold
    )

val Typography.WelcomText: TextStyle
    get() = TextStyle(
        fontSize = 24.sp,
        color = Purple,
        fontFamily = PoppinsSemiBold
    )

val Typography.MinorWelcomeText: TextStyle
    get() = TextStyle(
        fontSize = 12.sp,
        color = Black,
        fontFamily = PoppinsMedium
    )

val Typography.PlaceHolderText: TextStyle
    get() = TextStyle(
        fontSize = 14.sp,
        color = Gray,
        fontFamily = PoppinsMedium,
        lineHeight = 20.sp
    )

val Typography.ForgotPasswordText: TextStyle
    get() = TextStyle(
        fontSize = 12.sp,
        color = Gray,
        fontFamily = PoppinsMedium,
    )

val Typography.AuthButtonText: TextStyle
    get() = TextStyle(
        fontSize = 16.sp,
        color = White,
        fontFamily = PoppinsMedium,
    )

val Typography.DontHaveAccountText: TextStyle
    get() = TextStyle(
        fontSize = 12.sp,
        color = Black,
        fontFamily = PoppinsRegular,
    )

val Typography.SignUpText: TextStyle
    get() = TextStyle(
        fontSize = 12.sp,
        color = Purple,
        fontFamily = PoppinsSemiBold,
    )

val Typography.TeamConditionsText: TextStyle
    get() = TextStyle(
        fontSize = 14.sp,
        color = Black,
        fontFamily = PoppinsMedium,

    )

val Typography.MinorAuthText: TextStyle
    get() = TextStyle(
        fontSize = 12.sp,
        color = GrayWhite,
        fontFamily = PoppinsSemiBold,

        )

val Typography.AuthSignForgot: TextStyle
    get() = TextStyle(
        fontSize = 20.sp,
        color = Black,
        fontFamily = PoppinsSemiBold
    )

val Typography.FeedbackNumberText: TextStyle
    get() = TextStyle(
        fontSize = 14.sp,
        color = GrayBlack,
        fontFamily = PoppinsMedium,

        )

val Typography.ChangePasswordText: TextStyle
    get() = TextStyle(
        fontSize = 16.sp,
        color = Purple,
        fontFamily = PoppinsSemiBold,

        )

val Typography.NameInCard: TextStyle
    get() = TextStyle(
        fontSize = 24.sp,
        color = White,
        fontFamily = PoppinsRegular
    )

val Typography.TypeCard: TextStyle
    get() = TextStyle(
        fontSize = 14.sp,
        color = White,
        fontFamily = PoppinsMedium
    )

val Typography.NumberCard: TextStyle
    get() = TextStyle(
        fontSize = 16.sp,
        color = White,
        fontFamily = PoppinsRegular
    )

val Typography.BalanceCard: TextStyle
    get() = TextStyle(
        fontSize = 20.sp,
        color = White,
        fontFamily = PoppinsSemiBold
    )

val Typography.IconItem: TextStyle
    get() = TextStyle(
        fontSize = 12.sp,
        color = GrayWhite,
        fontFamily = PoppinsMedium
    )

val Typography.BottomNavigationText: TextStyle
    get() = TextStyle(
        fontSize = 12.sp,
        color = White,
        fontFamily = PoppinsRegular
    )

val Typography.SearchMainText: TextStyle
    get() = TextStyle(
        fontSize = 16.sp,
        color = Black,
        fontFamily = PoppinsSemiBold
    )

val Typography.InterestingKind: TextStyle
    get() = TextStyle(
        fontSize = 16.sp,
        color = GrayForText,
        fontFamily = PoppinsSemiBold
    )

val Typography.MediumBlackText: TextStyle
    get() = TextStyle(
        fontSize = 16.sp,
        color = Black,
        fontFamily = PoppinsMedium
    )



