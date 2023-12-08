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
    lateinit var btnPelajaran: ImageButton

    private val hurufList: List<HurufModel> = listOf(
        HurufModel(1,"alif_fathah","Pelajaran 2","Alif Berharakat Fathah","ntD81WB132A",R.raw.alif_fathah),
        HurufModel(2,"ba_fathah","Pelajaran 2","Ba Berharakat Fathah","Ii477YjhDVk",R.raw.ba_fathah),
        HurufModel(3,"ta_fathah","Pelajaran 2","Ta Berharakat Fathah","6UexQWMnx0I",R.raw.ta_fathah),
        HurufModel(4,"tsa_fathah","Pelajaran 2","Tsa Berharakat Fathah","moa8jxvBM_g",R.raw.tsa_fathah),
        HurufModel(5,"jim_fathah","Pelajaran 2","Jim Berharakat Fathah","OF0pHtNcJts",R.raw.jim_fathah),
        HurufModel(6,"ha_fathah","Pelajaran 2","Ha Berharakat Fathah","uLXf6TiBhXo",R.raw.ha_fathah),
        HurufModel(7,"kho_fathah","Pelajaran 2","Kho Berharakat Fathah","06mNtQn5hPM",R.raw.kho_fathah),
        HurufModel(8,"dal_fathah","Pelajaran 2","Dal Berharakat Fathah","KLA7uwvxyvg",R.raw.dal_fathah),
        HurufModel(9,"dzal_fathah","Pelajaran 2","Dzal Berharakat Fathah","bs-yAjuvs0k",R.raw.dzal_fathah),
        HurufModel(10,"ro_fathah","Pelajaran 2","Ra Berharakat Fathah","zTJpyte5QHU",R.raw.ro_fathah),
        HurufModel(11,"zayn_fathah","Pelajaran 2","Zayn Berharakat Fathah","jcL6tk5FIt8",R.raw.zayn_fathah),
        HurufModel(12,"sin_fathah","Pelajaran 2","Sin Berharakat Fathah","T4rX3SeZH-c",R.raw.sin_fathah),
        HurufModel(13,"syin_fathah","Pelajaran 2","Syin Berharakat Fathah","eEpYreBDeE8",R.raw.syin_fathah),
        HurufModel(14,"shod_fathah","Pelajaran 2","Shod Berharakat Fathah","mLUaUAL-Ty8",R.raw.sod_fathah),
        HurufModel(15,"dod_fathah","Pelajaran 2","Dhod Berharakat Fathah","YWbUdRmyQsQ",R.raw.dod_fathah),
        HurufModel(16,"to_fathah","Pelajaran 2","To Berharakat Fathah","6FzZ3jQrvL8",R.raw.to_fathah),
        HurufModel(17,"zo_fathah","Pelajaran 2","Zo Berharakat Fathah","lg441UMEv_Q",R.raw.zo_fathah),
        HurufModel(18,"ain_fathah","Pelajaran 2","Ain Berharakat Fathah","06WeCyI7E5c",R.raw.ain_fathah),
        HurufModel(19,"ghain_fathah","Pelajaran 2","Ghain Berharakat Fathah","GNDEM9GktSw",R.raw.ghain_fathah),
        HurufModel(20,"fa_fathah","Pelajaran 2","Fa Berharakat Fathah","q9W37UTUPIU",R.raw.fa_fathah),
        HurufModel(21,"qaf_fathah","Pelajaran 2","Qaf Berharakat Fathah","aBxg0IK6uBI",R.raw.qof_fathah),
        HurufModel(22,"kaf_fathah","Pelajaran 2","Kaf Berharakat Fathah","7DKP8vW8AOo",R.raw.kaf_fathah),
        HurufModel(23,"lam_fathah","Pelajaran 2","Lam Berharakat Fathah","XQaApdhUYVE",R.raw.lam_fathah),
        HurufModel(24,"mim_fathah","Pelajaran 2","Mim Berharakat Fathah","M6rl_6dC66Q",R.raw.mim_fathah),
        HurufModel(25,"nun_fathah","Pelajaran 2","Nun Berharakat Fathah","PyjozCgnyI8",R.raw.nun_fathah),
        HurufModel(26,"wau_fathah","Pelajaran 2","Wa Berharakat Fathah","VsnSAjDNTXs",R.raw.wa_fathah),
        HurufModel(27,"ha2_fathah","Pelajaran 2","Ha Berharakat Fathah","WHU0lJbWVuk",R.raw.hamzah_fathah),
        HurufModel(28,"ya_fathah","Pelajaran 2","Ya Berharakat Fathah","3CzzT9ZO604",R.raw.ya_fathah)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_alphabet_fathah)
        prevbutton_fathah=findViewById(R.id.prevbtn_fathah)
        nextbutton_fathah=findViewById(R.id.nextbtn_fathah)
        backtoMainBtn_fathah=findViewById(R.id.backtoMain_Fathah)
        btnPelajaran=findViewById(R.id.imageButton32)

        for (i in 0 until hurufList.size) {
            val imageButton: ImageButton = findViewById(resources.getIdentifier("imageButton${i+1}", "id", packageName))
            imageButton.setOnClickListener {
                navigateToDetailHuruf(hurufList[i])
            }
        }

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
        btnPelajaran.setOnClickListener {
            val intent = Intent(this@ListAlphabet_fathah,PracticeActivity::class.java)
            startActivity(intent)
        }
    }
    private fun navigateToDetailHuruf(huruf: HurufModel) {
        var type = "fathah"
        val intent = Intent(this, DetailHuruf::class.java)
        intent.putExtra("huruf", huruf)
        intent.putExtra("type", type)
        startActivity(intent)
    }
}