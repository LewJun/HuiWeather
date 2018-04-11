package com.example.lewjun.huiweather

import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.widget.TextView

/**
 * Created by LewJun on 2018/4/10.
 */
class ForecastListAdapter(val items: List<String>, val itemClick: (String) -> Unit) : RecyclerView.Adapter<ForecastListAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(TextView(parent.context), itemClick)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount() = items.size

    class ViewHolder(val textView: TextView, val itemClick: (String) -> Unit) : RecyclerView.ViewHolder(textView) {
        fun bind(s: String) {
            with(s) {
                textView.text = s
                textView.setOnClickListener {
                    itemClick(s)
                }
            }
        }
    }
}