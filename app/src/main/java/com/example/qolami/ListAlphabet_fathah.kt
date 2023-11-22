package com.example.qolami

import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class ListAlphabet_fathah : AppCompatActivity() {

    lateinit var alif_fathah :ImageButton
    lateinit var prevbutton_fathah :ImageButton
    lateinit var nextbutton_fathah :ImageButton
    lateinit var backtoMainBtn_fathah :Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_alphabet_fathah)

        alif_fathah=findViewById(R.id.imageButton1)
        prevbutton_fathah=findViewById(R.id.prevbtn_fathah)
        nextbutton_fathah=findViewById(R.id.nextbtn_fathah)
        backtoMainBtn_fathah=findViewById(R.id.backtoMain_Fathah)

        backtoMainBtn_fathah.setOnClickListener {
            val intent= Intent(this@ListAlphabet_fathah,PracticeActivity::class.java)
            startActivity(intent)
        }
        nextbutton_fathah.setOnClickListener {
            val intent= Intent(this@ListAlphabet_fathah,ListAlphabet_kasrah::class.java)
            startActivity(intent)
        }
        prevbutton_fathah.setOnClickListener {
            val intent= Intent(this@ListAlphabet_fathah,ListAlphabet_hijaiyah::class.java)
            startActivity(intent)
        }
        alif_fathah.setOnClickListener {
            val intent= Intent(this@ListAlphabet_fathah,DetailHuruf::class.java)
            startActivity(intent)
        }

    }


}