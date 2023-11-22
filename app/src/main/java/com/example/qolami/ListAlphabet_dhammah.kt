package com.example.qolami

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class ListAlphabet_dhammah : AppCompatActivity() {

    lateinit var backtoMainButton_dhammah : Button
    lateinit var nextbutton_dhammah : ImageButton
    lateinit var prevbutton_dhammah : ImageButton


    private val hurufList: List<HurufModel> = listOf(
        HurufModel(1,"alif_dammah","Pelajaran 4","Alif Berharakat Dammah","3p55spJk46s","dammahgif/alif_dammah.gif")
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_alphabet_dhammah)

        backtoMainButton_dhammah=findViewById(R.id.backtoMain_dhammah)
        nextbutton_dhammah=findViewById(R.id.nextbtn_dhammah)
        prevbutton_dhammah=findViewById(R.id.prevbtn_dhammah)

//        for (i in 0 until hurufList.size) {
//            val imageView: ImageButton = findViewById(resources.getIdentifier("imageView${i + 1}", "id", packageName))
//            imageView.setOnClickListener {
//
//            }
//        }

        backtoMainButton_dhammah.setOnClickListener {
            val intent = Intent(this@ListAlphabet_dhammah,PracticeActivity::class.java)
            startActivity(intent)
        }
        nextbutton_dhammah.setOnClickListener {
            val intent = Intent(this@ListAlphabet_dhammah,ListAlphabet_hijaiyah::class.java)
            startActivity(intent)
        }
        prevbutton_dhammah.setOnClickListener {
            val intent = Intent(this@ListAlphabet_dhammah, ListAlphabet_kasrah::class.java)
            startActivity(intent)
        }


    }
}