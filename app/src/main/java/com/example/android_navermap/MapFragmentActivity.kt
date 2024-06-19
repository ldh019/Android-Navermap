package com.example.android_navermap

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager
import com.example.android_navermap.databinding.ActivityMapFragmentBinding
import com.naver.maps.map.MapFragment
import com.naver.maps.map.OnMapReadyCallback

class MapFragmentActivity: AppCompatActivity(), OnMapReadyCallback {
    private lateinit var binding: ActivityMapFragmentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMapFragmentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val fm = supportFragmentManager
        (fm.findFragmentById(R.id.map) as MapFragment).getMapAsync(this)
    }

    override fun onMapReady(map: com.naver.maps.map.NaverMap) {
        // ...
    }
}