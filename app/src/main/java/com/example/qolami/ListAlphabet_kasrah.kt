package com.example.qolami

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class ListAlphabet_kasrah : AppCompatActivity() {

    lateinit var backtoMainButton : Button
    lateinit var nextbutton_kasrah : ImageButton
    lateinit var prevbutton_kasrah : ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_alphabet_kasrah)

        backtoMainButton=findViewById(R.id.backtoMain_Kasrah)
        nextbutton_kasrah=findViewById(R.id.nextbtn_kasrah)
        prevbutton_kasrah=findViewById(R.id.prevbtn_kasrah)

        backtoMainButton.setOnClickListener {
            val intent = Intent(this@ListAlphabet_kasrah,PracticeActivity::class.java)
            startActivity(intent)
        }
        nextbutton_kasrah.setOnClickListener {
            val intent = Intent(this@ListAlphabet_kasrah,ListAlphabet_dhammah::class.java)
            startActivity(intent)
        }
        prevbutton_kasrah.setOnClickListener {
            val intent = Intent(this@ListAlphabet_kasrah, ListAlphabet_fathah::class.java)
            startActivity(intent)
        }

    }
}