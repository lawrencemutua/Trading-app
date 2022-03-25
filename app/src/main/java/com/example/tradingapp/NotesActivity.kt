package com.example.tradingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tradingapp.databinding.ActivityNotesBinding
import com.example.tradingapp.databinding.ActivitySignalBinding

class NotesActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNotesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNotesBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}