package com.example.tradingapp.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.tradingapp.R

class Topic3Adapter (val ForexList: List<com.example.tradingapp.Adapters.Model.Forex>, ):

    RecyclerView.Adapter<Topic3Adapter.Topic3ViewHolder>(){
    override fun getItemCount(): Int {
        return ForexList.size

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Topic3ViewHolder {
        return Topic3ViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.topic1_row, parent, false)
        )
    }

    class Topic3ViewHolder(view: View): RecyclerView.ViewHolder(view){
        val title: TextView = view.findViewById(R.id.textView_title)
        val answer: TextView = view.findViewById(R.id.textView_answer)

    }

    override fun onBindViewHolder(holder: Topic3ViewHolder, position: Int) {
        val free = ForexList[position]
        holder.title.text =  free.title
        holder.answer.text = free.answer

    }
}