package com.example.qolami

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.PlayerConstants
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.YouTubePlayer
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.listeners.AbstractYouTubePlayerListener
import com.pierfrancescosoffritti.androidyoutubeplayer.core.player.views.YouTubePlayerView
import java.io.InputStream

class DetailHuruf : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_huruf)
        val huruf: HurufModel?=intent.getParcelableExtra("huruf")
        val tvPelajaran=findViewById<TextView>(R.id.tv_pelajaran)
        val titleHijaiyah=findViewById<TextView>(R.id.title_hijaiyah)
        val wvYoutube=findViewById<YouTubePlayerView>(R.id.wv_youtube)
        val gif=findViewById<ImageView>(R.id.iv_gif)


        huruf?.let{
        tvPelajaran.text=it.jenisPelajaran
        titleHijaiyah.text=it.titleHuruf
        wvYoutube.addYouTubePlayerListener(object: AbstractYouTubePlayerListener(){
            override fun onReady(youTubePlayer: YouTubePlayer) {
                youTubePlayer.loadVideo(huruf.videoId,0f)
            }
        })
            Glide.with(this)
                .asGif()
                .load(huruf.gif)
                .diskCacheStrategy(DiskCacheStrategy.RESOURCE)
                .into(gif)
        }
        }

    }
