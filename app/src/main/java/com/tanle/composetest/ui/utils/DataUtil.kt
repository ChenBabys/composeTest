package com.tanle.composetest.ui.utils

import com.tanle.composetest.R
import com.tanle.composetest.ui.bean.Message
import com.tanle.composetest.ui.bean.Share

object DataUtil {

    /**
     * 获取数组
     */
    fun getMessageList(): List<Message> {
        return mutableListOf<Message>().apply {
            add(Message("中国", "北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都", R.mipmap.img))
            add(
                Message(
                    "美国",
                    "北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都",
                    R.mipmap.wechat
                )
            )
            add(
                Message(
                    "中国",
                    "北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都北京是首都",
                    R.mipmap.alipay
                )
            )
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

    /**
     * 获取分享弹框的数据list
     */
    fun getShareIconList(): List<Share> {
        return mutableListOf<Share>().apply {
            add(Share("微信", R.mipmap.wechat))
            add(Share("支付宝", R.mipmap.alipay))
            add(Share("微信", R.mipmap.wechat))
            add(Share("支付宝", R.mipmap.alipay))
            add(Share("微信", R.mipmap.wechat))
            add(Share("支付宝", R.mipmap.alipay))
            add(Share("微信", R.mipmap.wechat))
            add(Share("支付宝", R.mipmap.alipay))
            add(Share("微信", R.mipmap.wechat))
            add(Share("支付宝", R.mipmap.alipay))
        }
    }
}