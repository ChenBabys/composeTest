package com.tanle.composetest.ui.bean

import androidx.annotation.DrawableRes

data class Message(val title: String, val content: String, @DrawableRes val imgInt: Int)