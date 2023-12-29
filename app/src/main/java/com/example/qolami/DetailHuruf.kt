package com.example.qolami

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Im
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView
//import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YoutubePlayerFullScreenHelper

class DetailHuruf : AppCompatActivity() {
    lateinit var prevbutton : ImageButton
    lateinit var nextbutton : ImageButton
    lateinit var backbutton : Button
    lateinit var btnPelajaran :ImageButton
    lateinit var btnLatihan : ImageButton
    lateinit var btnUjian : ImageButton
    lateinit var wvYoutube: YouTubePlayerView



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

    private val hurufListKasrah: List<HurufModel> = listOf(
        HurufModel(1,"alif_kasrah","Pelajaran 3","Alif Berharakat Kasrah","wJ8WaPcZM_M",R.raw.alif_kasrah),
        HurufModel(2,"ba_kasrah","Pelajaran 3","Ba Berharakat Kasrah","IrLP1XYuIjs",R.raw.ba_kasrah),
        HurufModel(3,"ta_kasrah","Pelajaran 3","Ta Berharakat Kasrah","6UexQWMnx0I",R.raw.ta_kasrah),
        HurufModel(4,"tsa_kasrah","Pelajaran 3","Tsa Berharakat Kasrah","U5xikMGMdTg",R.raw.tsa_kasrah),
        HurufModel(5,"jim_kasrah","Pelajaran 3","Jim Berharakat Kasrah","uXO3saszpSk",R.raw.jim_kasrah),
        HurufModel(6,"ha_kasrah","Pelajaran 3","Ha Berharakat Kasrah","Y_-BPpF6AW8",R.raw.ha_kasrah),
        HurufModel(7,"kho_kasrah","Pelajaran 3","Kho Berharakat Kasrah","sBl7jEm0Xmk",R.raw.kho_kasrah),
        HurufModel(8,"dal_kasrah","Pelajaran 3","Dal Berharakat Kasrah","fapuqkYj4kA",R.raw.dal_kasrah),
        HurufModel(9,"dzal_kasrah","Pelajaran 3","Dzal Berharakat Kasrah","dz6kejEOMuw",R.raw.dzal_kasrah),
        HurufModel(10,"ro_kasrah","Pelajaran 3","Ra Berharakat Kasrah","Vl6wNuQFyT0",R.raw.ra_kasrah),
        HurufModel(11,"zayn_kasrah","Pelajaran 3","Zayn Berharakat Kasrah","If0u90dumo4",R.raw.zayn_kasrah),
        HurufModel(12,"sin_kasrah","Pelajaran 3","Sin Berharakat Kasrah","Sw2CeqRO5io",R.raw.sin_kasrah),
        HurufModel(13,"syin_kasrah","Pelajaran 3","Syin Berharakat Kasrah","1fAnO0rayPQ",R.raw.syin_kasrah),
        HurufModel(14,"shod_kasrah","Pelajaran 3","Shod Berharakat Kasrah","2AadONAOWi0",R.raw.sod_kasrah),
        HurufModel(15,"dod_kasrah","Pelajaran 3","Dhod Berharakat Kasrah","dr7FL0hgGlI",R.raw.dod_kasrah),
        HurufModel(16,"to_kasrah","Pelajaran 3","To Berharakat Kasrah","QhyQKd6XzWU",R.raw.to_kasrah),
        HurufModel(17,"zo_kasrah","Pelajaran 3","Zo Berharakat Kasrah","PlDEQMjbq2c",R.raw.zho_kasrah),
        HurufModel(18,"ain_kasrah","Pelajaran 3","Ain Berharakat Kasrah","qIWizx3dfuM",R.raw.ain_kasrah),
        HurufModel(19,"ghain_kasrah","Pelajaran 3","Ghain Berharakat Kasrah","rh71lUOKgBE",R.raw.ghain_kasrah),
        HurufModel(20,"fa_kasrah","Pelajaran 3","Fa Berharakat Kasrah","ikgPz-gDEGA",R.raw.fa_kasrah),
        HurufModel(21,"qaf_kasrah","Pelajaran 3","Qaf Berharakat Kasrah","4qtIQLWgLEk",R.raw.qof_kasrah),
        HurufModel(22,"kaf_kasrah","Pelajaran 3","Kaf Berharakat Kasrah","6JVs8aeo2D8",R.raw.kaf_kasrah),
        HurufModel(23,"lam_kasrah","Pelajaran 3","Lam Berharakat Kasrah","LTrI62DeOGA",R.raw.lam_kasrah),
        HurufModel(24,"mim_kasrah","Pelajaran 3","Mim Berharakat Kasrah","btjrSC7aDe0",R.raw.mim_kasrah),
        HurufModel(25,"nun_kasrah","Pelajaran 3","Nun Berharakat Kasrah","0byc69KkxU0",R.raw.nun_kasrah),
        HurufModel(26,"wau_kasrah","Pelajaran 3","Wau Berharakat Kasrah","YglXvs0T4XE",R.raw.wau_kasrah),
        HurufModel(27,"ha2_kasrah","Pelajaran 3","Ha Berharakat Kasrah","6VEPC_Kn4ag",R.raw.hamzah_kasrah),
        HurufModel(28,"ya_kasrah","Pelajaran 3","Ya Berharakat Kasrah","sAr9seaJo1k",R.raw.ya_kasrah)
    )

    private val hurufListDhammah: List<HurufModel> = listOf(
        HurufModel(1,"alif_dammah","Pelajaran 4","Alif Berharakat Dammah","3p55spJk46s",R.raw.alif_dammah),
        HurufModel(2,"ba_dammah","Pelajaran 4","Ba Berharakat Dammah","5GZIedsx9zQ",R.raw.ba_dammah),
        HurufModel(3,"ta_dammah","Pelajaran 4","Ta Berharakat Dammah","5-UbyYiIq9M",R.raw.ta_dammah),
        HurufModel(4,"tsa_dammah","Pelajaran 4","Tsa Berharakat Dammah","Y-dxKGP6FFE",R.raw.tsa_dammah),
        HurufModel(5,"jim_dammah","Pelajaran 4","Jim Berharakat Dammah","_P49xmOg_FM",R.raw.jim_dammah),
        HurufModel(6,"ha_dammah","Pelajaran 4","Ha Berharakat Dammah","ho2mp7mcG84",R.raw.ha_dammah),
        HurufModel(7,"kho_dammah","Pelajaran 4","Kho Berharakat Dammah","yuAiHzeXBtY",R.raw.kho_dammah),
        HurufModel(8,"dal_dammah","Pelajaran 4","Dal Berharakat Dammah","92U_em94NpY",R.raw.dal_dammah),
        HurufModel(9,"dzal_dammah","Pelajaran 4","Dzal Berharakat Dammah","FC76mXWU_EY",R.raw.dzal_dammah),
        HurufModel(10,"ro_dammah","Pelajaran 4","Ra Berharakat Dammah","Vf26PyueaxY",R.raw.ra_dammah),
        HurufModel(11,"zayn_dammah","Pelajaran 4","Zayn Berharakat Dammah","87_IBOpsq24",R.raw.zayn_dammah),
        HurufModel(12,"sin_dammah","Pelajaran 4","Sin Berharakat Dammah","98IiZhFm_Nk",R.raw.sin_dammah),
        HurufModel(13,"syin_dammah","Pelajaran 4","Syin Berharakat Dammah","QDPmqg2iSOs",R.raw.syin_dammah),
        HurufModel(14,"shod_dammah","Pelajaran 4","Shod Berharakat Dammah","Exv3ZFToEnI",R.raw.sod_dammah),
        HurufModel(15,"dod_dammah","Pelajaran 4","Dhod Berharakat Dammah","3p2zWs7d84Q",R.raw.dod_dammah),
        HurufModel(16,"to_dammah","Pelajaran 4","To Berharakat Dammah","DhneqkV2qwk",R.raw.to_dammah),
        HurufModel(17,"zo_dammah","Pelajaran 4","Zo Berharakat Dammah","GRTo3Pc4r1I",R.raw.zo_dammah),
        HurufModel(18,"ain_dammah","Pelajaran 4","Ain Berharakat Dammah","VEY2nnIHtK8",R.raw.ain_dammah),
        HurufModel(19,"ghain_dammah","Pelajaran 4","Ghain Berharakat Dammah","ZYlDWl4I4eg",R.raw.ghain_dammah),
        HurufModel(20,"fa_dammah","Pelajaran 4","Fa Berharakat Dammah","-P_TgzRjFcE",R.raw.fa_dammah),
        HurufModel(21,"qaf_dammah","Pelajaran 4","Qaf Berharakat Dammah","GR2a8uLjcfE",R.raw.qo_dammah),
        HurufModel(22,"kaf_dammah","Pelajaran 4","Kaf Berharakat Dammah","Zh89LO0ogAo",R.raw.kaf_dammah),
        HurufModel(23,"lam_dammah","Pelajaran 4","Lam Berharakat Dammah","s5k__k9Yyhs",R.raw.lam_dammah),
        HurufModel(24,"mim_dammah","Pelajaran 4","Mim Berharakat Dammah","mOS_jK54ryw",R.raw.mim_dammah),
        HurufModel(25,"nun_dammah","Pelajaran 4","Nun Berharakat Dammah","rq7B6kLOH9w",R.raw.nun_dammah),
        HurufModel(26,"wau_dammah","Pelajaran 4","Wau Berharakat Dammah","dfj8IJ_DvTw",R.raw.wa_dammah),
        HurufModel(27,"ha2_dammah","Pelajaran 4","Ha Berharakat Dammah","RY_v8-_aa1o",R.raw.hamzah_dammah),
        HurufModel(28,"ya_dammah","Pelajaran 4","Ya Berharakat Dammah","U7goKOpzfzw",R.raw.ya_dammah)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_huruf)
        val huruf: HurufModel?=intent.getParcelableExtra("huruf")
        val tvPelajaran=findViewById<TextView>(R.id.tv_pelajaran)
        val titleHijaiyah=findViewById<TextView>(R.id.title_hijaiyah)
        wvYoutube=findViewById<YouTubePlayerView>(R.id.wv_youtube)
        val gif=findViewById<ImageView>(R.id.iv_gif)
        prevbutton=findViewById(R.id.imageButton37)
        nextbutton=findViewById(R.id.imageButton33)
        backbutton = findViewById(R.id.button2)
        btnPelajaran=findViewById(R.id.imageButton32)
        btnLatihan=findViewById(R.id.imageButton35)
        btnUjian=findViewById(R.id.imageButton34)

        setOnClick()

        huruf?.let{
            tvPelajaran.text=it.jenisPelajaran
            titleHijaiyah.text=it.titleHuruf
            wvYoutube.addYouTubePlayerListener(object: AbstractYouTubePlayerListener(){
                override fun onReady(youTubePlayer: YouTubePlayer) {
                    youTubePlayer.cueVideo(huruf.videoId,0f)
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
                .diskCacheStrategy(DiskCacheStrategy.RESOURCE)
                .into(gif)
        }
        btnPelajaran.setOnClickListener {
            val intent = Intent(this@DetailHuruf, PracticeActivity::class.java)
            startActivity(intent)
        }
        btnLatihan.setOnClickListener {
            Toast.makeText(this,"Fitur Latihan masih dalam tahap pengembangan!", Toast.LENGTH_LONG).show()
        }
        btnUjian.setOnClickListener {
            Toast.makeText(this,"Fitur Ujian masih dalam tahap pengembangan!", Toast.LENGTH_LONG).show()
        }
    }

    private fun setOnClick() {
        val huruf: HurufModel? = intent.getParcelableExtra("huruf")
        val type: String? = intent.getStringExtra("type")
        nextbutton.setOnClickListener {
            if (huruf != null) {
                if (type == "kasrah") {
                    when (huruf.idIv) {
                        1 -> navigateToDetailHuruf(hurufListKasrah[1])
                        2 -> navigateToDetailHuruf(hurufListKasrah[2])
                        3 -> navigateToDetailHuruf(hurufListKasrah[3])
                        4 -> navigateToDetailHuruf(hurufListKasrah[4])
                        5 -> navigateToDetailHuruf(hurufListKasrah[5])
                        6 -> navigateToDetailHuruf(hurufListKasrah[6])
                        7 -> navigateToDetailHuruf(hurufListKasrah[7])
                        8 -> navigateToDetailHuruf(hurufListKasrah[8])
                        9 -> navigateToDetailHuruf(hurufListKasrah[9])
                        10 -> navigateToDetailHuruf(hurufListKasrah[10])
                        11 -> navigateToDetailHuruf(hurufListKasrah[11])
                        12 -> navigateToDetailHuruf(hurufListKasrah[12])
                        13 -> navigateToDetailHuruf(hurufListKasrah[13])
                        14 -> navigateToDetailHuruf(hurufListKasrah[14])
                        15 -> navigateToDetailHuruf(hurufListKasrah[15])
                        16 -> navigateToDetailHuruf(hurufListKasrah[16])
                        17 -> navigateToDetailHuruf(hurufListKasrah[17])
                        18 -> navigateToDetailHuruf(hurufListKasrah[18])
                        19 -> navigateToDetailHuruf(hurufListKasrah[19])
                        20 -> navigateToDetailHuruf(hurufListKasrah[20])
                        21 -> navigateToDetailHuruf(hurufListKasrah[21])
                        22 -> navigateToDetailHuruf(hurufListKasrah[22])
                        23 -> navigateToDetailHuruf(hurufListKasrah[23])
                        24 -> navigateToDetailHuruf(hurufListKasrah[24])
                        25 -> navigateToDetailHuruf(hurufListKasrah[25])
                        26 -> navigateToDetailHuruf(hurufListKasrah[26])
                        27 -> navigateToDetailHuruf(hurufListKasrah[27])
                        28 -> navigateToDetailHuruf(hurufListKasrah[0])
                    }
                } else if (type == "fathah") {
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
                } else if (type == "dhammah") {
                    when (huruf.idIv) {
                        1 -> navigateToDetailHuruf(hurufListDhammah[1])
                        2 -> navigateToDetailHuruf(hurufListDhammah[2])
                        3 -> navigateToDetailHuruf(hurufListDhammah[3])
                        4 -> navigateToDetailHuruf(hurufListDhammah[4])
                        5 -> navigateToDetailHuruf(hurufListDhammah[5])
                        6 -> navigateToDetailHuruf(hurufListDhammah[6])
                        7 -> navigateToDetailHuruf(hurufListDhammah[7])
                        8 -> navigateToDetailHuruf(hurufListDhammah[8])
                        9 -> navigateToDetailHuruf(hurufListDhammah[9])
                        10 -> navigateToDetailHuruf(hurufListDhammah[10])
                        11 -> navigateToDetailHuruf(hurufListDhammah[11])
                        12 -> navigateToDetailHuruf(hurufListDhammah[12])
                        13 -> navigateToDetailHuruf(hurufListDhammah[13])
                        14 -> navigateToDetailHuruf(hurufListDhammah[14])
                        15 -> navigateToDetailHuruf(hurufListDhammah[15])
                        16 -> navigateToDetailHuruf(hurufListDhammah[16])
                        17 -> navigateToDetailHuruf(hurufListDhammah[17])
                        18 -> navigateToDetailHuruf(hurufListDhammah[18])
                        19 -> navigateToDetailHuruf(hurufListDhammah[19])
                        20 -> navigateToDetailHuruf(hurufListDhammah[20])
                        21 -> navigateToDetailHuruf(hurufListDhammah[21])
                        22 -> navigateToDetailHuruf(hurufListDhammah[22])
                        23 -> navigateToDetailHuruf(hurufListDhammah[23])
                        24 -> navigateToDetailHuruf(hurufListDhammah[24])
                        25 -> navigateToDetailHuruf(hurufListDhammah[25])
                        26 -> navigateToDetailHuruf(hurufListDhammah[26])
                        27 -> navigateToDetailHuruf(hurufListDhammah[27])
                        28 -> navigateToDetailHuruf(hurufListDhammah[0])
                        else -> {

                        }
                    }
                }
            }
            onStop()
        }

        prevbutton.setOnClickListener {
            if (huruf != null) {
                if (type == "kasrah") {
                    when (huruf.idIv) {
                        1 -> navigateToDetailHuruf(hurufListKasrah[27])
                        2 -> navigateToDetailHuruf(hurufListKasrah[0])
                        3 -> navigateToDetailHuruf(hurufListKasrah[1])
                        4 -> navigateToDetailHuruf(hurufListKasrah[2])
                        5 -> navigateToDetailHuruf(hurufListKasrah[3])
                        6 -> navigateToDetailHuruf(hurufListKasrah[4])
                        7 -> navigateToDetailHuruf(hurufListKasrah[5])
                        8 -> navigateToDetailHuruf(hurufListKasrah[6])
                        9 -> navigateToDetailHuruf(hurufListKasrah[7])
                        10 -> navigateToDetailHuruf(hurufListKasrah[8])
                        11 -> navigateToDetailHuruf(hurufListKasrah[9])
                        12 -> navigateToDetailHuruf(hurufListKasrah[10])
                        13 -> navigateToDetailHuruf(hurufListKasrah[11])
                        14 -> navigateToDetailHuruf(hurufListKasrah[12])
                        15 -> navigateToDetailHuruf(hurufListKasrah[13])
                        16 -> navigateToDetailHuruf(hurufListKasrah[14])
                        17 -> navigateToDetailHuruf(hurufListKasrah[15])
                        18 -> navigateToDetailHuruf(hurufListKasrah[16])
                        19 -> navigateToDetailHuruf(hurufListKasrah[17])
                        20 -> navigateToDetailHuruf(hurufListKasrah[18])
                        21 -> navigateToDetailHuruf(hurufListKasrah[19])
                        22 -> navigateToDetailHuruf(hurufListKasrah[20])
                        23 -> navigateToDetailHuruf(hurufListKasrah[21])
                        24 -> navigateToDetailHuruf(hurufListKasrah[22])
                        25 -> navigateToDetailHuruf(hurufListKasrah[23])
                        26 -> navigateToDetailHuruf(hurufListKasrah[24])
                        27 -> navigateToDetailHuruf(hurufListKasrah[25])
                        28 -> navigateToDetailHuruf(hurufListKasrah[26])
                        else -> {

                        }
                    }
                } else if (type == "fathah") {
                    when (huruf.idIv) {
                        1 -> navigateToDetailHuruf(hurufList[27])
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
                } else if (type == "dhammah") {
                    when (huruf.idIv) {
                        1 -> navigateToDetailHuruf(hurufListDhammah[27])
                        2 -> navigateToDetailHuruf(hurufListDhammah[0])
                        3 -> navigateToDetailHuruf(hurufListDhammah[1])
                        4 -> navigateToDetailHuruf(hurufListDhammah[2])
                        5 -> navigateToDetailHuruf(hurufListDhammah[3])
                        6 -> navigateToDetailHuruf(hurufListDhammah[4])
                        7 -> navigateToDetailHuruf(hurufListDhammah[5])
                        8 -> navigateToDetailHuruf(hurufListDhammah[6])
                        9 -> navigateToDetailHuruf(hurufListDhammah[7])
                        10 -> navigateToDetailHuruf(hurufListDhammah[8])
                        11 -> navigateToDetailHuruf(hurufListDhammah[9])
                        12 -> navigateToDetailHuruf(hurufListDhammah[10])
                        13 -> navigateToDetailHuruf(hurufListDhammah[11])
                        14 -> navigateToDetailHuruf(hurufListDhammah[12])
                        15 -> navigateToDetailHuruf(hurufListDhammah[13])
                        16 -> navigateToDetailHuruf(hurufListDhammah[14])
                        17 -> navigateToDetailHuruf(hurufListDhammah[15])
                        18 -> navigateToDetailHuruf(hurufListDhammah[16])
                        19 -> navigateToDetailHuruf(hurufListDhammah[17])
                        20 -> navigateToDetailHuruf(hurufListDhammah[18])
                        21 -> navigateToDetailHuruf(hurufListDhammah[19])
                        22 -> navigateToDetailHuruf(hurufListDhammah[20])
                        23 -> navigateToDetailHuruf(hurufListDhammah[21])
                        24 -> navigateToDetailHuruf(hurufListDhammah[22])
                        25 -> navigateToDetailHuruf(hurufListDhammah[23])
                        26 -> navigateToDetailHuruf(hurufListDhammah[24])
                        27 -> navigateToDetailHuruf(hurufListDhammah[25])
                        28 -> navigateToDetailHuruf(hurufListDhammah[26])
                        else -> {

                        }
                    }
                }
            }
            onStop()
        }

        backbutton.setOnClickListener {
            if (type == "kasrah") {
                val intent= Intent(this,ListAlphabet_kasrah::class.java)
                startActivity(intent)
            } else if (type == "fathah") {
                val intent= Intent(this,ListAlphabet_fathah::class.java)
                startActivity(intent)
            } else if (type == "dhammah") {
                val intent= Intent(this,ListAlphabet_dhammah::class.java)
                startActivity(intent)
            }
        }
    }
    private fun navigateToDetailHuruf(huruf: HurufModel) {
        val type: String? = intent.getStringExtra("type")
        val intent = Intent(this, DetailHuruf::class.java)
        intent.putExtra("huruf", huruf)
        intent.putExtra("type", type)
        startActivity(intent)
    }

    override fun onBackPressed() {
        val type: String? = intent.getStringExtra("type")
        if (type == "kasrah") {
            val intent= Intent(this,ListAlphabet_kasrah::class.java)
            startActivity(intent)
        } else if (type == "fathah") {
            val intent= Intent(this,ListAlphabet_fathah::class.java)
            startActivity(intent)
        } else if (type == "dhammah") {
            val intent= Intent(this,ListAlphabet_dhammah::class.java)
            startActivity(intent)
        }
    }

    override fun onStop() {
        super.onStop()
        wvYoutube.release()
    }
}