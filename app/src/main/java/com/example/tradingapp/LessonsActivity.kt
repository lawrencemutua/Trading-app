package com.example.tradingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tradingapp.databinding.ActivityLessonsBinding
import com.example.tradingapp.databinding.ActivitySignalBinding

class LessonsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLessonsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLessonsBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}