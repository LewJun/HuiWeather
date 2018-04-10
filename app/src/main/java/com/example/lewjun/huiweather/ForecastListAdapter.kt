package com.example.lewjun.huiweather

import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

/**
 * Created by LewJun on 2018/4/10.
 */
class ForecastListAdapter(val items: List<String>, val listener: OnItemClickListener) : RecyclerView.Adapter<ForecastListAdapter.ViewHolder>() {
    interface OnItemClickListener {
        fun onClick(view: View, pos: Int)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(TextView(parent.context), listener)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount() = items.size

    class ViewHolder(val textView: TextView, listener: OnItemClickListener) : RecyclerView.ViewHolder(textView) {
        init {
            textView.setOnClickListener({
                listener.onClick(textView, adapterPosition)
            })
        }
        fun bind(s: String) {
            textView.text = s
        }

    }


}