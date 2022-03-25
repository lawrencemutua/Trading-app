package com.example.tradingapp

import android.content.Intent
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
        val actionBar = supportActionBar
        actionBar!!.title = "Notes"
        handleclicks()
    }
    fun handleclicks(){
      binding.btnTechnical.setOnClickListener {
          val intent = Intent (this, TechnicalAnalysisActivity::class.java)
          startActivity(intent)
      }
        binding.btnSentimentalanalysis.setOnClickListener {
            val intent = Intent (this, SentimentalAnalysisActivity::class.java)
            startActivity(intent)
        }
        binding.btnFundamentalanalysis.setOnClickListener {
            val intent = Intent(this, FundamentalAnalysisActivity::class.java)
            startActivity(intent)
        }
    }
}
