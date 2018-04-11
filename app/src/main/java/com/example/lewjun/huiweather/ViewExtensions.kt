package com.example.lewjun.huiweather

import android.content.Context
import android.view.View

/**
 * 不能放在类里面
 * Created by LewJun on 2018/04/11.
 */
// 扩展View
val View.ctx: Context
    get() = context
