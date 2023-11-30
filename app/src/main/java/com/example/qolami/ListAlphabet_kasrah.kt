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