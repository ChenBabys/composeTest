package com.tanle.composetest.ui.custom_view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MineScaffold() {
    val navs = listOf("主页", "聊天", "同城", "我的")
    var currentIndex by remember {
        mutableStateOf(0)
    }

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(title = {
                Text(text = "我的标题")
            }, navigationIcon = {
                Icon(imageVector = Icons.Default.ArrowBack, contentDescription = null)
            }, actions = {
                Icon(imageVector = Icons.Default.Favorite, contentDescription = null)
                Spacer(modifier = Modifier.width(10.dp))
                Text(text = "喜欢")
            })
        },
        bottomBar = {
            NavigationBar() {
                navs.forEachIndexed { index, s ->
                    NavigationBarItem(selected = currentIndex == index,
                        onClick = {
                            currentIndex = index
                        }, icon = {
                            Icon(
                                imageVector = when (index) {
                                    0 -> Icons.Default.Favorite
                                    1 -> Icons.Default.AccountCircle
                                    2 -> Icons.Default.AccountBox
                                    3 -> Icons.Default.Face
                                    else -> Icons.Default.AccountBox
                                }, contentDescription = null
                            )
                        }, label = {
                            Text(text = s)
                        })
                }
            }
        },
    ) {
        Surface(
            modifier = Modifier
                .fillMaxSize()
                .padding(all = 10.dp),
            shape = RoundedCornerShape(8.dp),
            color = Color.White
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(all = 10.dp)
            ) {
                for (index in 0..10) {
                    Text(text = "这是内容${index}")
                    Spacer(modifier = Modifier.height(8.dp))
                }
            }
        }
    }
}

@Preview
@Composable
fun MineScaffoldPreView() {
    MineScaffold()
}
