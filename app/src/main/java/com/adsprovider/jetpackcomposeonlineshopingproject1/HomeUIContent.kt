package com.adsprovider.jetpackcomposeonlineshopingproject1

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.adsprovider.jetpackcomposeonlineshopingproject1.ui.theme.blueColor

@Composable
fun HomeUI() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.White)
            .statusBarsPadding()
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            Row(
                modifier = Modifier
                    .background(blueColor)
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Buttons(icon = R.drawable.baseline_menu_24, Color.White)
                Text(
                    text = "Online Shop",
                    style = TextStyle(
                        fontSize = 20.sp,
                        color = Color.White,
                        fontWeight = FontWeight.Medium,
                        fontFamily = FontFamily.SansSerif,
                        textAlign = TextAlign.Center
                    )
                )

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.End
                ) {
                    Buttons(icon = R.drawable.baseline_search_24, Color.White)
                }
            }

            Card(modifier = Modifier.fillMaxWidth()) {
                LazyVerticalGrid(columns = GridCells.Fixed(2)){
                    items(Data.dataList) {
                        ShowSuit(data = it)
                    }
                }
            }
        }
    }
}


@Composable
fun ShowSuit(data: Data.Demo) {
    Card(
        shape = RoundedCornerShape(5.dp),
        modifier = Modifier
            .width(175.dp)
            .height(300.dp)
            .padding(vertical = 5.dp, horizontal = 5.dp)
    ) {
        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 5.dp, horizontal = 5.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(painter = painterResource(id = data.img), contentDescription = "")
                Text(text = data.name)
                Text(text = data.disp)
                Text(text = data.price)
            }

        }
    }
}

@Composable
fun Buttons(
    @DrawableRes icon: Int,
    tint: Color = Color.Unspecified
) {
    IconButton(onClick = { /*TODO*/ }) {
        Icon(
            painter = painterResource(id = icon),
            contentDescription = "",
            tint = tint
        )
    }
}