package com.oktaygenc.movieapp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.res.ResourcesCompat
import com.oktaygenc.movieapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDisplayShowTitleEnabled(false)


        val titleTextView = TextView(this)
        titleTextView.text = "What do you want to watch?"
        titleTextView.textSize = 18f
        val font = ResourcesCompat.getFont(this, R.font.poppins_semibold)
        titleTextView.typeface = font
        titleTextView.setTextColor(resources.getColor(android.R.color.white))

        binding.toolbar.addView(titleTextView)

//        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}