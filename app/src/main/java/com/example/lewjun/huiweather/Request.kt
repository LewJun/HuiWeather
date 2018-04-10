package com.example.lewjun.huiweather

import android.util.Log
import java.net.URL

/**
 * Created by LewJun on 2018/4/11.
 */
class Request(val url: String) {
    fun run() {
        var forecastJsonStr = URL(url).readText()
        Log.d(javaClass.simpleName, forecastJsonStr)
    }
}