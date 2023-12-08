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
    lateinit var btnPelajaran : ImageButton


    private val hurufList: List<HurufModel> = listOf(
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
        setContentView(R.layout.activity_list_alphabet_dhammah)

        backtoMainButton_dhammah=findViewById(R.id.backtoMain_dhammah)
        nextbutton_dhammah=findViewById(R.id.nextbtn_dhammah)
        prevbutton_dhammah=findViewById(R.id.prevbtn_dhammah)
        btnPelajaran=findViewById(R.id.imageButton32)

        for (i in 0 until hurufList.size) {
            val imageButton: ImageButton = findViewById(resources.getIdentifier("imageButton${i+1}", "id", packageName))
            imageButton.setOnClickListener {
                navigateToDetailHuruf(hurufList[i])
            }
        }

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
        btnPelajaran.setOnClickListener {
            val intent = Intent(this@ListAlphabet_dhammah, PracticeActivity::class.java)
            startActivity(intent)
        }


    }

    private fun navigateToDetailHuruf(huruf: HurufModel) {
        var type = "dhammah"
        val intent = Intent(this, DetailHuruf::class.java)
        intent.putExtra("huruf", huruf)
        intent.putExtra("type", type)
        startActivity(intent)
    }
}