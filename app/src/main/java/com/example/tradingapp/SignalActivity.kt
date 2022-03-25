package com.example.tradingapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tradingapp.databinding.ActivitySignalBinding

class SignalActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignalBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignalBinding.inflate(layoutInflater)
        setContentView(binding.root)
        handleclicks()
        val actionBar = supportActionBar
        actionBar!!.title = "SIGNALS"
    }
    fun handleclicks(){
        binding.btnDailysignaltrends.setOnClickListener {
            val intent = Intent( this, DailySignalTrends::class.java)
            startActivity(intent)
        }
        binding.btnVipsignals.setOnClickListener {
            startActivity(
                Intent(
                    Intent.ACTION_VIEW,
                    Uri.parse(
                        "https://api.whatsapp.com/send?phone=+254706120066&text=Hello Admin,Help me trade well so as to maximize the profits"
                    )
                )
            )
        }
    }

}