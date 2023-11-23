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

    private val hurufList: List<HurufModel> = listOf(
        HurufModel(1,"alif_fathah","Pelajaran 2","Alif Berharakat Fathah","3p55spJk46s",R.raw.alif_fathah),
        HurufModel(2,"ba_fathah","Pelajaran 2","Ba Berharakat Fathah","5GZIedsx9zQ",R.raw.ba_fathah),
        HurufModel(3,"ta_fathah","Pelajaran 2","Ta Berharakat Fathah","5-UbyYiIq9M",R.raw.ta_fathah),
        HurufModel(4,"tsa_fathah","Pelajaran 2","Tsa Berharakat Fathah","Y-dxKGP6FFE",R.raw.tsa_fathah),
        HurufModel(5,"jim_fathah","Pelajaran 2","Jim Berharakat Fathah","_P49xmOg_FM",R.raw.jim_fathah),
        HurufModel(6,"ha_fathah","Pelajaran 2","Ha Berharakat Fathah","ho2mp7mcG84",R.raw.ha_fathah),
        HurufModel(7,"kho_fathah","Pelajaran 2","Kho Berharakat Fathah","yuAiHzeXBtY",R.raw.kho_fathah),
        HurufModel(8,"dal_fathah","Pelajaran 2","Dal Berharakat Fathah","92U_em94NpY",R.raw.dal_fathah),
        HurufModel(9,"dzal_fathah","Pelajaran 2","Dzal Berharakat Fathah","FC76mXWU_EY",R.raw.dzal_fathah),
        HurufModel(10,"ro_fathah","Pelajaran 2","Ra Berharakat Fathah","Vf26PyueaxY",R.raw.ro_fathah),
        HurufModel(11,"zayn_fathah","Pelajaran 2","Zayn Berharakat Fathah","87_IBOpsq24",R.raw.zayn_fathah),
        HurufModel(12,"sin_fathah","Pelajaran 2","Sin Berharakat Fathah","98IiZhFm_Nk",R.raw.sin_fathah),
        HurufModel(13,"syin_fathah","Pelajaran 2","Syin Berharakat Fathah","QDPmqg2iSOs",R.raw.syin_fathah),
        HurufModel(14,"shod_fathah","Pelajaran 2","Shod Berharakat Fathah","Exv3ZFToEnI",R.raw.sod_fathah),
        HurufModel(15,"dod_fathah","Pelajaran 2","Dhod Berharakat Fathah","3p2zWs7d84Q",R.raw.dod_fathah),
        HurufModel(16,"to_fathah","Pelajaran 2","To Berharakat Fathah","DhneqkV2qwk",R.raw.to_fathah),
        HurufModel(17,"zo_fathah","Pelajaran 2","Zo Berharakat Fathah","GRTo3Pc4r1I",R.raw.zo_fathah),
        HurufModel(18,"ain_fathah","Pelajaran 2","Ain Berharakat Fathah","VEY2nnIHtK8",R.raw.ain_fathah),
        HurufModel(19,"ghain_fathah","Pelajaran 2","Ghain Berharakat Fathah","ZYlDWl4I4eg",R.raw.ghain_fathah),
        HurufModel(20,"fa_fathah","Pelajaran 2","Fa Berharakat Fathah","-P_TgzRjFcE",R.raw.fa_fathah),
        HurufModel(21,"qaf_fathah","Pelajaran 2","Qaf Berharakat Fathah","GR2a8uLjcfE",R.raw.qof_fathah),
        HurufModel(22,"kaf_fathah","Pelajaran 2","Kaf Berharakat Fathah","Zh89LO0ogAo",R.raw.kaf_fathah),
        HurufModel(23,"lam_fathah","Pelajaran 2","Lam Berharakat Fathah","s5k__k9Yyhs",R.raw.lam_fathah),
        HurufModel(24,"mim_fathah","Pelajaran 2","Mim Berharakat Fathah","mOS_jK54ryw",R.raw.mim_fathah),
        HurufModel(25,"nun_fathah","Pelajaran 2","Nun Berharakat Fathah","rq7B6kLOH9w",R.raw.nun_fathah),
        HurufModel(26,"wau_fathah","Pelajaran 2","Wau Berharakat Fathah","dfj8IJ_DvTw",R.raw.wa_fathah),
        HurufModel(27,"ha2_fathah","Pelajaran 2","Ha Berharakat Fathah","RY_v8-_aa1o",R.raw.hamzah_fathah),
        HurufModel(28,"ya_fathah","Pelajaran 2","Ya Berharakat Fathah","U7goKOpzfzw",R.raw.ya_fathah)
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_alphabet_fathah)

        alif_fathah=findViewById(R.id.imageButton1)
        prevbutton_fathah=findViewById(R.id.prevbtn_fathah)
        nextbutton_fathah=findViewById(R.id.nextbtn_fathah)
        backtoMainBtn_fathah=findViewById(R.id.backtoMain_Fathah)

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
        alif_fathah.setOnClickListener {
            val intent= Intent(this@ListAlphabet_fathah,DetailHuruf::class.java)
            startActivity(intent)
        }

    }

    private fun navigateToDetailHuruf(huruf: HurufModel) {
        val intent = Intent(this, DetailHuruf::class.java)
        intent.putExtra("huruf", huruf)
        startActivity(intent)
    }
}