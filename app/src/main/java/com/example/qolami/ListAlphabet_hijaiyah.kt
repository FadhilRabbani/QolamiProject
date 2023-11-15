package com.example.qolami

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class ListAlphabet_hijaiyah : AppCompatActivity() {
    lateinit var backtomainButton_hijaiyah :Button
    lateinit var nextbutton_hijaiyah :ImageButton
    lateinit var prevbutton_hijaiyah :ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_alphabet_hijaiyah)

        backtomainButton_hijaiyah=findViewById(R.id.backtoMain_hijaiyah)
        nextbutton_hijaiyah=findViewById(R.id.nextbtn_hijaiyah)
        prevbutton_hijaiyah=findViewById(R.id.prevbtn_hijaiyah)

        backtomainButton_hijaiyah.setOnClickListener {
            val intent = Intent(this@ListAlphabet_hijaiyah, PracticeActivity::class.java)
            startActivity(intent)
        }
        nextbutton_hijaiyah.setOnClickListener {
            val intent = Intent(this@ListAlphabet_hijaiyah,ListAlphabet_fathah::class.java)
            startActivity(intent)
        }
        prevbutton_hijaiyah.setOnClickListener {
            val intent = Intent(this@ListAlphabet_hijaiyah,ListAlphabet_dhammah::class.java)
            startActivity(intent)
        }
    }
}