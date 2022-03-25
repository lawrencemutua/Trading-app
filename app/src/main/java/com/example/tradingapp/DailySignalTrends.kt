package com.example.tradingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tradingapp.Adapters.Model.Forex
import com.example.tradingapp.Adapters.Topic1Adapter
import com.example.tradingapp.databinding.ActivityDailySignalTrendsBinding
import com.google.firebase.firestore.FirebaseFirestore

class DailySignalTrends : AppCompatActivity() {
    private lateinit var binding: ActivityDailySignalTrendsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDailySignalTrendsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val actionBar = supportActionBar
        actionBar!!.title = "Daily Signal Trends"
        actionBar.setDisplayHomeAsUpEnabled(true)
        binding.recyclerDailysignaltrends.apply {
            layoutManager = LinearLayoutManager(this@DailySignalTrends)
        }
        fetchtopic1()

    }

    private fun fetchtopic1() {
        FirebaseFirestore.getInstance().collection("Daily Trends")
            .get()
            .addOnSuccessListener { documents ->
                run {
                    for (document in documents) {
                        val ForexList = documents.toObjects(Forex::class.java)
                        binding.recyclerDailysignaltrends.adapter = Topic1Adapter(ForexList)

                    }
                }
            }}}
