package com.example.tradingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.tradingapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.btnNotes.setOnClickListener{
            val intent = Intent(this, NotesActivity::class.java)
            startActivity(intent)
        }
        binding.btnLessons.setOnClickListener{
            val intent = Intent(this,LessonsActivity::class.java)
            startActivity(intent)
        }
        binding.btnAccount.setOnClickListener {
            val intent = Intent(this, AccountActivity::class.java)
            startActivity(intent)
        }
        binding.btnSignal.setOnClickListener {
            val intent = Intent(this, SignalActivity::class.java)
            startActivity(intent)
        }
    }
}

