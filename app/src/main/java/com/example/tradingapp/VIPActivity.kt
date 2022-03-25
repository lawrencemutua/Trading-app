package com.example.tradingapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class VIPActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vipactivity)

        val actionBar = supportActionBar
        actionBar!!.title = "VIP Market"
        actionBar.setDisplayHomeAsUpEnabled(true)
    }

    }