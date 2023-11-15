package com.example.qolami

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.qolami.databinding.ActivityMainBinding
import com.example.qolami.databinding.ActivityPracticeBinding

class PracticeActivity : AppCompatActivity() {
    lateinit var backtoMainbutton_practice : Button
    private lateinit var binding: ActivityPracticeBinding
    private val list = ArrayList<Practice>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPracticeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvPractice.setHasFixedSize(true)

        list.addAll(getList())
        showRecyclerList()

        backtoMainbutton_practice=findViewById(R.id.backtoMain_practice)

        backtoMainbutton_practice.setOnClickListener {
            val intent = Intent(this@PracticeActivity,MainActivity::class.java)
            startActivity(intent)
        }
    }

    private fun getList(): ArrayList<Practice> {
        val dataName = resources.getStringArray(R.array.data_nama_pelajaran)
        val dataDescription = resources.getStringArray(R.array.data_deskripsi_pelajaran)
        val listTeam = ArrayList<Practice>()
        for (i in dataName.indices) {
            val practice = Practice(dataName[i], dataDescription[i])
            listTeam.add(practice)
        }
        return listTeam
    }

    private fun showRecyclerList(){
        binding.rvPractice.layoutManager = LinearLayoutManager(this)
        val listTeamAdapter = PracticeAdapter(list)
        binding.rvPractice.adapter = listTeamAdapter

        listTeamAdapter.setOnItemClickCallback(object : PracticeAdapter.OnItemClickCallback {
            override fun onItemClicked(data: Practice) {
//                val intentToDetail = Intent(this@MainActivity, DetailActivity::class.java)
//                intentToDetail.putExtra("DATA", data)
//                startActivity(intentToDetail)

                when (data.name){
                    "Pelajaran 1" ->{
                        val intent=Intent(this@PracticeActivity,ListAlphabet_hijaiyah::class.java)
                        startActivity(intent)
                    }
                    "Pelajaran 2" ->{
                        val intent=Intent(this@PracticeActivity,ListAlphabet_fathah::class.java)
                        startActivity(intent)
                    }
                    "Pelajaran 3" ->{
                        val intent=Intent(this@PracticeActivity,ListAlphabet_kasrah::class.java)
                        startActivity(intent)
                    }
                    "Pelajaran 4" ->{
                        val intent=Intent(this@PracticeActivity,ListAlphabet_dhammah::class.java)
                        startActivity(intent)
                    }

                }
            }
        })
    }
}