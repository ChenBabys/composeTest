package com.tanle.composetest.ui.custom_view

import android.content.Context
import android.content.res.Configuration
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.tanle.composetest.Conversation
import com.tanle.composetest.ui.bean.Message
import com.tanle.composetest.ui.bean.Share
import com.tanle.composetest.ui.theme.ComposeTestTheme
import com.tanle.composetest.ui.utils.DataUtil

/**
 * 每项icon的view
 */
@Composable
fun ShareCard(share: Share, modifier: Modifier, context: Context) {
    Surface(//有它才可以实现列表的间距
        modifier = Modifier.padding(10.dp, 5.dp),
        shadowElevation = 1.dp,
        shape = RoundedCornerShape(5.dp), onClick = {
            Toast.makeText(context, "点击了${share.name}", Toast.LENGTH_SHORT).show()
        }
    ) {
        ImageIcon(share, modifier)
    }
}

/**
 * 图标+文字的组合icon
 *
 */
@Composable
fun ImageIcon(share: Share, modifier: Modifier) {
    Column(
        modifier = modifier
            .width(60.dp)
            .height(80.dp)
            .padding(all = 8.dp)
    ) {
        Image(
            painter = painterResource(id = share.imgInt),
            contentDescription = "",
            modifier = Modifier
                .fillMaxSize()
                .padding(all = 8.dp),
            alignment = Alignment.Center
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = share.name,
            color = MaterialTheme.colorScheme.secondary,
            style = MaterialTheme.typography.bodyMedium
        )
    }
}

@Composable
fun MessageCard(msg: Message) {
    androidx.compose.material3.Surface(
        modifier = Modifier.padding(10.dp, 5.dp),
        shadowElevation = 2.dp,
        shape = RoundedCornerShape(5.dp)
    ) {//新增一个像card的包裹着
        Row(modifier = Modifier.padding(all = 8.dp)) {
            Image(
                painter = painterResource(id = msg.imgInt),
                contentDescription = null,
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape)
                    .alignByBaseline()
                    .border(1.5.dp, MaterialTheme.colorScheme.primary, CircleShape)
            )
            Spacer(modifier = Modifier.width(8.dp))

            var isExpand by remember { mutableStateOf(false) }

            Column(Modifier.clickable { isExpand = !isExpand }) {
                Text(
                    text = msg.title,
                    color = MaterialTheme.colorScheme.secondary,
                    style = MaterialTheme.typography.bodySmall
                )
                Spacer(modifier = Modifier.height(4.dp))
                Surface(
                    shadowElevation = 1.dp,
                    shape = RoundedCornerShape(5.dp),
                    modifier = Modifier.padding(all = 5.dp)
                ) {
                    Text(
                        text = msg.content, color = Color.Blue,
                        style = MaterialTheme.typography.bodyMedium,
                        modifier = Modifier.padding(all = 4.dp),
                        maxLines = if (isExpand) Int.MAX_VALUE else 1
                    )
                }
            }
        }
    }
}