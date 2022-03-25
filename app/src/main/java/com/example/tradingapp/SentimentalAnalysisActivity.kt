package com.example.tradingapp

import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tradingapp.Adapters.Model.Forex
import com.example.tradingapp.Adapters.Topic1Adapter
import com.example.tradingapp.databinding.ActivitySentimentalAnalysisBinding
import com.google.firebase.firestore.FirebaseFirestore

class SentimentalAnalysisActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySentimentalAnalysisBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivitySentimentalAnalysisBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val actionBar = supportActionBar
        actionBar!!.title = "Sentimental Analysis"
        actionBar.setDisplayHomeAsUpEnabled(true)
        binding.recyclerTopic1.apply {
            layoutManager = LinearLayoutManager(this@SentimentalAnalysisActivity)
        }
        fetchtopic1()

    }

    private fun fetchtopic1() {
        FirebaseFirestore.getInstance().collection("Sentimental Analysis")
            .get()
            .addOnSuccessListener { documents ->
                run {
                    for (document in documents) {
                        val ForexList = documents.toObjects(Forex::class.java)
                        binding.recyclerTopic1.adapter = Topic1Adapter(ForexList)

                    }
                }
            }}}
