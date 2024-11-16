package com.example.ibank.ui.app.screen.main.Search

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draganddrop.DragAndDropModifierNode
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.ibank.ui.app.customComponent.CustomMainAppBar
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.Marker
import com.google.maps.android.compose.MarkerState
import com.google.maps.android.compose.rememberCameraPositionState

@Composable
fun Branch(



) {

    val Maloyaroslavets = LatLng(55.01557753847542, 36.482640270667716)
    val cameraPosition = rememberCameraPositionState() {

        position = CameraPosition.fromLatLngZoom(Maloyaroslavets, 10f)

    }

    Column(

        modifier = Modifier
            .fillMaxSize()

    ) {

        CustomMainAppBar(title = "Branch")

        Spacer(modifier = Modifier.height(15.dp))

        GoogleMap (

            modifier = Modifier.fillMaxSize(),
            cameraPositionState = cameraPosition

        )


    }

}

@Composable
@Preview(showBackground = true)
private fun BranchPreview() {

    Branch()

}