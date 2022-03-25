package com.example.tradingapp

import android.content.Intent
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
        val actionBar = supportActionBar
        actionBar!!.title = "Lessons"
        handleclicks()
    }
    fun handleclicks (){
        binding.btnTopic1.setOnClickListener {
            val intent = Intent (this, Topic1::class.java)
            startActivity(intent)
        }
        binding.btnTopic2.setOnClickListener {
            val intent = Intent( this, Topic2::class.java)
            startActivity(intent)
        }
        binding.btnTopic3.setOnClickListener {
            val intent = Intent (this, Topic3::class.java)
            startActivity(intent)
        }
        binding.btnTopic4.setOnClickListener {
            val intent = Intent (this, Topic4::class.java)
            startActivity(intent)
        }
        binding.btnTopic5.setOnClickListener {
            val intent = Intent (this, Topic5::class.java)
            startActivity(intent)
        }
        binding.btnTopic6.setOnClickListener {
            val intent = Intent (this, Topic6::class.java)
            startActivity(intent)
        }
        binding.btnTopic7.setOnClickListener {
            val intent = Intent (this, Topic7::class.java)
            startActivity(intent)
        }
    }
}