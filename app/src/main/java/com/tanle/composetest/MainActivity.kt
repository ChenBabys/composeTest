package com.tanle.composetest

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.tanle.composetest.ui.theme.ComposeTestTheme
import com.tanle.composetest.ui.theme.MyView
import com.tanle.composetest.ui.theme.bean.Message

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
                    Conversation(getMessageList())
                }
            }
        }
    }
}


@Composable
fun Conversation(messages: List<Message>) {
    LazyColumn {//这玩意就相当于recycleView
        items(messages) { message ->
            MyView.MessageCard(msg = message)
        }
    }
}

/**
 * 获取数组
 */
fun getMessageList(): List<Message> {
    return mutableListOf<Message>().apply {
        add(Message("中国", "北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都", R.mipmap.img))
        add(Message("美国", "北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都", R.mipmap.img))
        add(Message("中国", "北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都", R.mipmap.img))
        add(Message("美国", "北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都", R.mipmap.img))
        add(Message("中国", "北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都", R.mipmap.img))
        add(Message("美国", "北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都", R.mipmap.img))
        add(Message("中国", "北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都", R.mipmap.img))
        add(Message("美国", "北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都", R.mipmap.img))
        add(Message("中国", "北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都", R.mipmap.img))
        add(Message("中国", "北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都", R.mipmap.img))
        add(Message("美国", "北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都", R.mipmap.img))
        add(Message("中国", "北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都", R.mipmap.img))
        add(Message("美国", "北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都", R.mipmap.img))
        add(Message("中国", "北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都", R.mipmap.img))
        add(Message("中国", "北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都", R.mipmap.img))
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ComposeTestTheme {
        Conversation(getMessageList())
    }
}