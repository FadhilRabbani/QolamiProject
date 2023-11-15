package com.example.qolami

import android.content.Intent
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class ListAlphabet_hijaiyah : AppCompatActivity() {

    private lateinit var mediaPlayer: MediaPlayer
    lateinit var backtomainButton_hijaiyah :Button
    lateinit var nextbutton_hijaiyah :ImageButton
    lateinit var prevbutton_hijaiyah :ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_alphabet_hijaiyah)

        backtomainButton_hijaiyah=findViewById(R.id.backtoMain_hijaiyah)
        nextbutton_hijaiyah=findViewById(R.id.nextbtn_hijaiyah)
        prevbutton_hijaiyah=findViewById(R.id.prevbtn_hijaiyah)


        for (i in 1..30) {
            val buttonId = resources.getIdentifier("imageButton$i", "id", packageName)
            val imageButton = findViewById<ImageButton>(buttonId)
            imageButton.setOnClickListener { onButtonClick(i) }
        }

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

    private fun onButtonClick(buttonNumber: Int) {
        val soundId = resources.getIdentifier("sound$buttonNumber", "raw", packageName)
        mediaPlayer = MediaPlayer.create(this, soundId)
        mediaPlayer.start()
    }

    override fun onStop() {
        super.onStop()
        mediaPlayer.release()
    }
}
