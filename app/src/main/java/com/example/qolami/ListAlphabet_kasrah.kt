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

    private val hurufList: List<HurufModel> = listOf(
        HurufModel(1,"alif_kasrah","Pelajaran 3","Alif Berharakat Kasrah","3p55spJk46s",R.raw.alif_kasrah),
        HurufModel(2,"ba_kasrah","Pelajaran 3","Ba Berharakat Kasrah","5GZIedsx9zQ",R.raw.ba_kasrah),
        HurufModel(3,"ta_kasrah","Pelajaran 3","Ta Berharakat Kasrah","5-UbyYiIq9M",R.raw.ta_kasrah),
        HurufModel(4,"tsa_kasrah","Pelajaran 3","Tsa Berharakat Kasrah","Y-dxKGP6FFE",R.raw.tsa_kasrah),
        HurufModel(5,"jim_kasrah","Pelajaran 3","Jim Berharakat Kasrah","_P49xmOg_FM",R.raw.jim_kasrah),
        HurufModel(6,"ha_kasrah","Pelajaran 3","Ha Berharakat Kasrah","ho2mp7mcG84",R.raw.ha_kasrah),
        HurufModel(7,"kho_kasrah","Pelajaran 3","Kho Berharakat Kasrah","yuAiHzeXBtY",R.raw.kho_kasrah),
        HurufModel(8,"dal_kasrah","Pelajaran 3","Dal Berharakat Kasrah","92U_em94NpY",R.raw.dal_kasrah),
        HurufModel(9,"dzal_kasrah","Pelajaran 3","Dzal Berharakat Kasrah","FC76mXWU_EY",R.raw.dzal_kasrah),
        HurufModel(10,"ro_kasrah","Pelajaran 3","Ra Berharakat Kasrah","Vf26PyueaxY",R.raw.ra_kasrah),
        HurufModel(11,"zayn_kasrah","Pelajaran 3","Zayn Berharakat Kasrah","87_IBOpsq24",R.raw.zayn_kasrah),
        HurufModel(12,"sin_kasrah","Pelajaran 3","Sin Berharakat Kasrah","98IiZhFm_Nk",R.raw.sin_kasrah),
        HurufModel(13,"syin_kasrah","Pelajaran 3","Syin Berharakat Kasrah","QDPmqg2iSOs",R.raw.syin_kasrah),
        HurufModel(14,"shod_kasrah","Pelajaran 3","Shod Berharakat Kasrah","Exv3ZFToEnI",R.raw.sod_kasrah),
        HurufModel(15,"dod_kasrah","Pelajaran 3","Dhod Berharakat Kasrah","3p2zWs7d84Q",R.raw.dod_kasrah),
        HurufModel(16,"to_kasrah","Pelajaran 3","To Berharakat Kasrah","DhneqkV2qwk",R.raw.to_kasrah),
        HurufModel(17,"zo_kasrah","Pelajaran 3","Zo Berharakat Kasrah","GRTo3Pc4r1I",R.raw.zho_kasrah),
        HurufModel(18,"ain_kasrah","Pelajaran 3","Ain Berharakat Kasrah","VEY2nnIHtK8",R.raw.ain_kasrah),
        HurufModel(19,"ghain_kasrah","Pelajaran 3","Ghain Berharakat Kasrah","ZYlDWl4I4eg",R.raw.ghain_kasrah),
        HurufModel(20,"fa_kasrah","Pelajaran 3","Fa Berharakat Kasrah","-P_TgzRjFcE",R.raw.fa_kasrah),
        HurufModel(21,"qaf_kasrah","Pelajaran 3","Qaf Berharakat Kasrah","GR2a8uLjcfE",R.raw.qof_kasrah),
        HurufModel(22,"kaf_kasrah","Pelajaran 3","Kaf Berharakat Kasrah","Zh89LO0ogAo",R.raw.kaf_kasrah),
        HurufModel(23,"lam_kasrah","Pelajaran 3","Lam Berharakat Kasrah","s5k__k9Yyhs",R.raw.lam_kasrah),
        HurufModel(24,"mim_kasrah","Pelajaran 3","Mim Berharakat Kasrah","mOS_jK54ryw",R.raw.mim_kasrah),
        HurufModel(25,"nun_kasrah","Pelajaran 3","Nun Berharakat Kasrah","rq7B6kLOH9w",R.raw.nun_kasrah),
        HurufModel(26,"wau_kasrah","Pelajaran 3","Wau Berharakat Kasrah","dfj8IJ_DvTw",R.raw.wau_kasrah),
        HurufModel(27,"ha2_kasrah","Pelajaran 3","Ha Berharakat Kasrah","RY_v8-_aa1o",R.raw.hamzah_kasrah),
        HurufModel(28,"ya_kasrah","Pelajaran 3","Ya Berharakat Kasrah","U7goKOpzfzw",R.raw.ya_kasrah)
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_alphabet_kasrah)

        backtoMainButton=findViewById(R.id.backtoMain_Kasrah)
        nextbutton_kasrah=findViewById(R.id.nextbtn_kasrah)
        prevbutton_kasrah=findViewById(R.id.prevbtn_kasrah)

        for (i in 0 until hurufList.size) {
            val imageButton: ImageButton = findViewById(resources.getIdentifier("imageButton${i+1}", "id", packageName))
            imageButton.setOnClickListener {
                navigateToDetailHuruf(hurufList[i])
            }
        }

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
    private fun navigateToDetailHuruf(huruf: HurufModel) {
        var type = "kasrah"
        val intent = Intent(this, DetailHuruf::class.java)
        intent.putExtra("huruf", huruf)
        intent.putExtra("type", type)
        startActivity(intent)
    }
}