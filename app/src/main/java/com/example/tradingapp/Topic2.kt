package com.example.tradingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tradingapp.Adapters.Model.Forex
import com.example.tradingapp.Adapters.Topic1Adapter
import com.example.tradingapp.databinding.ActivityTopic2Binding
import com.google.firebase.firestore.FirebaseFirestore

class Topic2 : AppCompatActivity() {
    private lateinit var binding: ActivityTopic2Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTopic2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val actionBar = supportActionBar
        actionBar!!.title = "Topic 2"
        actionBar.setDisplayHomeAsUpEnabled(true)
        binding.recyclerTopic1.apply {
            layoutManager = LinearLayoutManager(this@Topic2)
        }
        fetchtopic1()

    }

    private fun fetchtopic1() {
        FirebaseFirestore.getInstance().collection("Topic 2")
            .get()
            .addOnSuccessListener { documents ->
                run {
                    for (document in documents) {
                        val ForexList = documents.toObjects(Forex::class.java)
                        binding.recyclerTopic1.adapter = Topic1Adapter(ForexList)

                    }
                }
            }}}
