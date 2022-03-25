package com.example.tradingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tradingapp.databinding.ActivityAccountBinding
import com.example.tradingapp.databinding.ActivitySignalBinding

class AccountActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAccountBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAccountBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}