package com.example.qolami

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView


class DetailHuruf : AppCompatActivity() {
    lateinit var prevbutton : ImageButton
    lateinit var nextbutton : ImageButton
    lateinit var backbutton : Button
    private var youTubePlayer: YouTubePlayer? = null

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
        setContentView(R.layout.activity_detail_huruf)
        val huruf: HurufModel?=intent.getParcelableExtra("huruf")
        val tvPelajaran=findViewById<TextView>(R.id.tv_pelajaran)
        val titleHijaiyah=findViewById<TextView>(R.id.title_hijaiyah)
        val wvYoutube=findViewById<YouTubePlayerView>(R.id.wv_youtube)
        val gif=findViewById<ImageView>(R.id.iv_gif)
        prevbutton=findViewById(R.id.imageButton37)
        nextbutton=findViewById(R.id.imageButton33)
        backbutton = findViewById(R.id.button2)

        setOnClick()
        huruf?.let{
            tvPelajaran.text=it.jenisPelajaran
            titleHijaiyah.text=it.titleHuruf
            wvYoutube.addYouTubePlayerListener(object: AbstractYouTubePlayerListener(){
                override fun onReady(youTubePlayer: YouTubePlayer) {
                    youTubePlayer.loadVideo(huruf.videoId,0f)
                    youTubePlayer.addListener(object : AbstractYouTubePlayerListener(){
                        override fun onStateChange(
                            youTubePlayer: YouTubePlayer,
                            state: PlayerConstants.PlayerState
                        ) {
                            if (state==PlayerConstants.PlayerState.ENDED){
                                youTubePlayer.seekTo(0f)
                                youTubePlayer.play()
                            }
                        }
                    })
                }
            })
            Glide.with(this)
                .asGif()
                .load(huruf.gif)
                .into(gif)
        }
    }

    private fun setOnClick() {
        val huruf: HurufModel? = intent.getParcelableExtra("huruf")
        nextbutton.setOnClickListener {
            if (huruf != null) {
                youTubePlayer?.pause()
                when (huruf.idIv) {
                    1 -> navigateToDetailHuruf(hurufList[1])
                    2 -> navigateToDetailHuruf(hurufList[2])
                    3 -> navigateToDetailHuruf(hurufList[3])
                    4 -> navigateToDetailHuruf(hurufList[4])
                    5 -> navigateToDetailHuruf(hurufList[5])
                    6 -> navigateToDetailHuruf(hurufList[6])
                    7 -> navigateToDetailHuruf(hurufList[7])
                    8 -> navigateToDetailHuruf(hurufList[8])
                    9 -> navigateToDetailHuruf(hurufList[9])
                    10 -> navigateToDetailHuruf(hurufList[10])
                    11 -> navigateToDetailHuruf(hurufList[11])
                    12 -> navigateToDetailHuruf(hurufList[12])
                    13 -> navigateToDetailHuruf(hurufList[13])
                    14 -> navigateToDetailHuruf(hurufList[14])
                    15 -> navigateToDetailHuruf(hurufList[15])
                    16 -> navigateToDetailHuruf(hurufList[16])
                    17 -> navigateToDetailHuruf(hurufList[17])
                    18 -> navigateToDetailHuruf(hurufList[18])
                    19 -> navigateToDetailHuruf(hurufList[19])
                    20 -> navigateToDetailHuruf(hurufList[20])
                    21 -> navigateToDetailHuruf(hurufList[21])
                    22 -> navigateToDetailHuruf(hurufList[22])
                    23 -> navigateToDetailHuruf(hurufList[23])
                    24 -> navigateToDetailHuruf(hurufList[24])
                    25 -> navigateToDetailHuruf(hurufList[25])
                    26 -> navigateToDetailHuruf(hurufList[26])
                    27 -> navigateToDetailHuruf(hurufList[27])
                    28 -> navigateToDetailHuruf(hurufList[0])
                    else -> {

                    }
                }
            }
        }

        prevbutton.setOnClickListener {
            if (huruf != null) {
                youTubePlayer?.pause()
                when (huruf.idIv) {
                    1 -> navigateToDetailHuruf(hurufList[28])
                    2 -> navigateToDetailHuruf(hurufList[0])
                    3 -> navigateToDetailHuruf(hurufList[1])
                    4 -> navigateToDetailHuruf(hurufList[2])
                    5 -> navigateToDetailHuruf(hurufList[3])
                    6 -> navigateToDetailHuruf(hurufList[4])
                    7 -> navigateToDetailHuruf(hurufList[5])
                    8 -> navigateToDetailHuruf(hurufList[6])
                    9 -> navigateToDetailHuruf(hurufList[7])
                    10 -> navigateToDetailHuruf(hurufList[8])
                    11 -> navigateToDetailHuruf(hurufList[9])
                    12 -> navigateToDetailHuruf(hurufList[10])
                    13 -> navigateToDetailHuruf(hurufList[11])
                    14 -> navigateToDetailHuruf(hurufList[12])
                    15 -> navigateToDetailHuruf(hurufList[13])
                    16 -> navigateToDetailHuruf(hurufList[14])
                    17 -> navigateToDetailHuruf(hurufList[15])
                    18 -> navigateToDetailHuruf(hurufList[16])
                    19 -> navigateToDetailHuruf(hurufList[17])
                    20 -> navigateToDetailHuruf(hurufList[18])
                    21 -> navigateToDetailHuruf(hurufList[19])
                    22 -> navigateToDetailHuruf(hurufList[20])
                    23 -> navigateToDetailHuruf(hurufList[21])
                    24 -> navigateToDetailHuruf(hurufList[22])
                    25 -> navigateToDetailHuruf(hurufList[23])
                    26 -> navigateToDetailHuruf(hurufList[24])
                    27 -> navigateToDetailHuruf(hurufList[25])
                    28 -> navigateToDetailHuruf(hurufList[26])
                    else -> {

                    }
                }
            }
        }

        backbutton.setOnClickListener {
            val intent= Intent(this,ListAlphabet_fathah::class.java)
            startActivity(intent)
            youTubePlayer?.pause()
        }
    }
    private fun navigateToDetailHuruf(huruf: HurufModel) {
        val intent = Intent(this, DetailHuruf::class.java)
        intent.putExtra("huruf", huruf)
        startActivity(intent)
    }

    override fun onBackPressed() {
        val intent=Intent(this,ListAlphabet_fathah::class.java)
        startActivity(intent)
        youTubePlayer?.pause()
    }
}