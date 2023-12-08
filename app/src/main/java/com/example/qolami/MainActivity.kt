package com.example.qolami

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast
import com.example.qolami.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    lateinit var latihanOnDevelopment : ImageButton
    lateinit var ujianOnDevelopment : ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setItemClicked()
        latihanOnDevelopment=findViewById(R.id.button2)
        ujianOnDevelopment=findViewById(R.id.button3)

        latihanOnDevelopment.setOnClickListener {
            Toast.makeText(this,"Fitur Latihan masih dalam tahap pengembangan!",Toast.LENGTH_LONG).show()
        }
        ujianOnDevelopment.setOnClickListener {
            Toast.makeText(this,"Fitur Ujian masih dalam tahap pengembangan!",Toast.LENGTH_LONG).show()
        }
    }

    private fun setItemClicked() {
        binding.imageButton2.setOnClickListener {
            val intent = Intent(this@MainActivity, PracticeActivity::class.java)
            startActivity(intent)
        }

        binding.iconAbout.setOnClickListener {
            val intent = Intent(this@MainActivity,About::class.java)
            startActivity(intent)
        }
    }
}