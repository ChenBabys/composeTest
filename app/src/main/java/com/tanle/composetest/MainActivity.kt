package com.tanle.composetest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.tanle.composetest.ui.theme.ComposeTestTheme
import com.tanle.composetest.ui.custom_view.MyView
import com.tanle.composetest.ui.bean.Message
import com.tanle.composetest.ui.bean.Share
import com.tanle.composetest.ui.utils.DataUtil

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTestTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
//                    Conversation(DataUtil.getMessageList())
                    ShareDialog(DataUtil.getShareIconList(),Modifier)
                }
            }
        }
    }
}

/**
 * 对话
 */
@Composable
fun Conversation(messages: List<Message>) {
    LazyColumn {//这玩意就相当于recycleView
        items(messages) { message ->
            MyView.MessageCard(msg = message)
        }
    }
}

/**
 * 分享弹框
 */
@Composable
fun ShareDialog(shareItem: List<Share>,modifier: Modifier) {
    LazyRow(modifier = modifier
        .fillMaxSize()
        .padding(4.dp, 25.dp, 4.dp, 0.dp)) {
        items(shareItem) { item: Share ->
            MyView.ShareCard(share = item,modifier)
        }
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeTestTheme {
//        Conversation(DataUtil.getMessageList())
        ShareDialog(DataUtil.getShareIconList(),Modifier)
    }
}