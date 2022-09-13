package com.example.madpractical3_20012021070

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.WindowCompat
import com.example.madpractical3_20012021070.databinding.ActivityLoginBinding
import com.example.madpractical3_20012021070.databinding.ActivityMainBinding

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)

        binding.BottomNavigationView.id = R.id.bottom_nav_reg
        binding.BottomNavigationView.setOnItemSelectedListener { it2 ->
            when (it2.itemId) {
                R.id.bottom_nav_reg -> {
                    Intent(this, RegistrationActivity::class.java).also { startActivity(it) }
                }
            }
            return@setOnItemSelectedListener true
        }
    }
}


