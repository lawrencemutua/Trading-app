package com.example.tradingapp.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.tradingapp.R

class SentimentalAdapter (val ForexList: List<com.example.tradingapp.Adapters.Model.Forex>, ):

    RecyclerView.Adapter<SentimentalAdapter.SentimentalViewHolder>(){
    override fun getItemCount(): Int {
        return ForexList.size

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SentimentalViewHolder {
        return SentimentalViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.topic1_row, parent, false)
        )
    }

    class SentimentalViewHolder(view: View): RecyclerView.ViewHolder(view){
        val title: TextView = view.findViewById(R.id.textView_title)
        val answer: TextView = view.findViewById(R.id.textView_answer)

    }

    override fun onBindViewHolder(holder: SentimentalViewHolder, position: Int) {
        val free = ForexList[position]
        holder.title.text =  free.title
        holder.answer.text = free.answer

    }
}