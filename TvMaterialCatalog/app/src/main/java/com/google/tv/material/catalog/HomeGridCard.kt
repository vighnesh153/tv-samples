package com.google.tv.material.catalog

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.tv.material3.Card
import androidx.tv.material3.CardDefaults
import androidx.tv.material3.CardContainerDefaults
import androidx.tv.material3.ExperimentalTvMaterial3Api
import androidx.tv.material3.StandardCardContainer
import androidx.tv.material3.Text

@OptIn(ExperimentalTvMaterial3Api::class)
@Composable
fun ComponentsGridCard(
    component: Component,
    modifier: Modifier = Modifier
) {
    val image = getHomeGridCardImage(imageArg = component.imageArg)
    val navHostController = LocalNavController.current

    StandardCardContainer(
        modifier = modifier,
        imageCard = {
            Card(
                onClick = { navHostController.navigate(component.routeValue) },
                interactionSource = it,
                colors = CardDefaults.colors(containerColor = Color.Transparent)
            ) {
                Image(painter = painterResource(id = image), contentDescription = null)
            }
        },
        title = {
            Text(
                text = component.title,
                modifier = Modifier.padding(top = 8.dp)
            )
        }
    )
}

@OptIn(ExperimentalTvMaterial3Api::class)
@Composable
fun FoundationsGridCard(
    foundation: Foundation,
    modifier: Modifier = Modifier
) {
    val image = getHomeGridCardImage(imageArg = foundation.imageArg)
    val navHostController = LocalNavController.current

    StandardCardContainer(
        modifier = modifier,
        imageCard = {
            Card(
                onClick = { navHostController.navigate(foundation.routeValue) },
                interactionSource = it,
                colors = CardDefaults.colors(containerColor = Color.Transparent)
            ) {
                Image(painter = painterResource(id = image), contentDescription = null)
            }
        },
        title = {
            Text(
                text = foundation.title,
                modifier = Modifier.padding(top = 8.dp)
            )
        }
    )
}
