package com.example.ibank.ui.app.customComponent

import androidx.compose.foundation.text.BasicText
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import com.example.ibank.ui.theme.Purple
import com.example.ibank.ui.theme.TeamConditionsText

@Composable
fun CustomTeamConditions(

    text: String

) {

    val text = text
    val words = text.split("")
    val lastTwoWords = words.takeLast(21).joinToString("")
    val remainingText = words.dropLast(21).joinToString("")

    val annotatedText = buildAnnotatedString {

        append(remainingText + "")
        withStyle(style = SpanStyle(color = Purple)) {

            append(lastTwoWords)

        }

    }

    BasicText(

        text = annotatedText,
        style = MaterialTheme.typography.TeamConditionsText,

    )

}