package com.example.tradingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tradingapp.databinding.ActivitySignalBinding

class SignalActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignalBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignalBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}