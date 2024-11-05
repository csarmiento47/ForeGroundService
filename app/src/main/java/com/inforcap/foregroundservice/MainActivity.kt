package com.inforcap.foregroundservice

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.inforcap.foregroundservice.databinding.ActivityMainBinding
import com.inforcap.foregroundservice.service.ForegroundService

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        ForegroundService.startService(this,"Ejecutando servicio")

    }

    override fun onDestroy() {
        super.onDestroy()
        ForegroundService.stopService(this)

    }
}