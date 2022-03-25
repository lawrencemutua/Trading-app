package com.example.tradingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.tradingapp.Adapters.Model.Forex
import com.example.tradingapp.Adapters.Topic1Adapter
import com.example.tradingapp.databinding.ActivityTopic6Binding
import com.google.firebase.firestore.FirebaseFirestore

class Topic6 : AppCompatActivity() {
    private lateinit var binding: ActivityTopic6Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTopic6Binding.inflate(layoutInflater)
        setContentView(binding.root)

        val actionBar = supportActionBar
        actionBar!!.title = "Topic 6"
        actionBar.setDisplayHomeAsUpEnabled(true)
        binding.recyclerTopic1.apply {
            layoutManager = LinearLayoutManager(this@Topic6)
        }
        fetchtopic1()

    }

    private fun fetchtopic1() {
        FirebaseFirestore.getInstance().collection("Topic 6")
            .get()
            .addOnSuccessListener { documents ->
                run {
                    for (document in documents) {
                        val ForexList = documents.toObjects(Forex::class.java)
                        binding.recyclerTopic1.adapter = Topic1Adapter(ForexList)

                    }
                }
            }}}
