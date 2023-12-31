package com.example.qolami

import android.content.Intent
import android.media.Image
import android.media.MediaPlayer
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Im
import android.widget.Button
import android.widget.ImageButton
import android.widget.Toast

class ListAlphabet_hijaiyah : AppCompatActivity() {

    private var mediaPlayer: MediaPlayer? = null
    lateinit var backtomainButton_hijaiyah :Button
    lateinit var nextbutton_hijaiyah :ImageButton
    lateinit var prevbutton_hijaiyah :ImageButton
    lateinit var btnPelajaran : ImageButton
    lateinit var btnLatihan : ImageButton
    lateinit var btnUjian : ImageButton



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_alphabet_hijaiyah)

        backtomainButton_hijaiyah=findViewById(R.id.backtoMain_hijaiyah)
        nextbutton_hijaiyah=findViewById(R.id.nextbtn_hijaiyah)
        prevbutton_hijaiyah=findViewById(R.id.prevbtn_hijaiyah)
        btnPelajaran=findViewById(R.id.imageButton31)
        btnLatihan=findViewById(R.id.imageButton35)
        btnUjian=findViewById(R.id.imageButton34)


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
        btnPelajaran.setOnClickListener {
            val intent = Intent(this@ListAlphabet_hijaiyah,PracticeActivity::class.java)
            startActivity(intent)
        }
        btnLatihan.setOnClickListener {
            Toast.makeText(this,"Fitur Latihan masih dalam tahap pengembangan!", Toast.LENGTH_LONG).show()
        }
        btnUjian.setOnClickListener {
            Toast.makeText(this,"Fitur Ujian masih dalam tahap pengembangan!", Toast.LENGTH_LONG).show()
        }
    }

    private fun onButtonClick(buttonNumber: Int) {
        if (mediaPlayer != null) {
            if (mediaPlayer!!.isPlaying) {
                mediaPlayer!!.stop()
            }
            mediaPlayer!!.release()
            mediaPlayer = null
        }
        val soundId = resources.getIdentifier("sound$buttonNumber", "raw", packageName)
        mediaPlayer = MediaPlayer.create(this, soundId)
        mediaPlayer?.setOnCompletionListener {
            mediaPlayer?.release()
            mediaPlayer = null
        }
        mediaPlayer?.start()
    }

    override fun onStop() {
        super.onStop()
        mediaPlayer?.release()
        mediaPlayer = null
    }

    override fun onBackPressed() {
        val intent= Intent(this,PracticeActivity::class.java)
        startActivity(intent)
    }

}
