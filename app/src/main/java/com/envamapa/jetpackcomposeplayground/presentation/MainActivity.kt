package com.envamapa.jetpackcomposeplayground.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.envamapa.jetpackcomposeplayground.R

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            setContent {
                NewsStory()
            }
        }
    }
}

@Composable
fun NewsStory() {
    Column(
        modifier = Modifier.padding(16.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.header),
            contentDescription = "Nice header",
            modifier = Modifier
                .height(180.dp)
                .fillMaxHeight(),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "A day in Shark Fin Cove")
        Text(text = "Davenport, California")
        Text(text = "December 2018")
    }
}

// region previews

@Preview
@Composable
fun DefaultPreview() {
    NewsStory()
}

// end region
