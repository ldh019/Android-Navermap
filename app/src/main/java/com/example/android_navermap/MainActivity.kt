package com.example.android_navermap

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.android_navermap.databinding.ActivityMainBinding

class MainActivity: AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonOne.setOnClickListener {
            val intent = Intent(this, MapFragmentActivity::class.java)
            startActivity(intent)
        }

        binding.buttonTwo.setOnClickListener {
            val intent = Intent(this, MapViewActivity::class.java)
            startActivity(intent)
        }

        binding.buttonThree.setOnClickListener {
            val intent = Intent(this, MapViewFragmentActivity::class.java)
            startActivity(intent)
        }
    }
}