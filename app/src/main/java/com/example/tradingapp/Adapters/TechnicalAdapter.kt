package com.example.tradingapp.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.tradingapp.R

class TechnicalAdapter (val ForexList: List<com.example.tradingapp.Adapters.Model.Forex>, ):

    RecyclerView.Adapter<TechnicalAdapter.TechnicalViewHolder>(){
    override fun getItemCount(): Int {
        return ForexList.size

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TechnicalViewHolder {
        return TechnicalViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.topic1_row, parent, false)
        )
    }

    class TechnicalViewHolder(view: View): RecyclerView.ViewHolder(view){
        val title: TextView = view.findViewById(R.id.textView_title)
        val answer: TextView = view.findViewById(R.id.textView_answer)

    }

    override fun onBindViewHolder(holder: TechnicalViewHolder, position: Int) {
        val free = ForexList[position]
        holder.title.text =  free.title
        holder.answer.text = free.answer

    }
}