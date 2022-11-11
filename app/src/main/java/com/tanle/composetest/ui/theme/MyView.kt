package com.tanle.composetest.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.R
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.tanle.composetest.ui.theme.bean.Message

/**
 * 绘制的图
 */
object MyView {

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

}