package com.example.qolami

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class HurufModel(
    val idIv: Int,
    val huruf: String,
    val jenisPelajaran: String,
    val titleHuruf: String,
    val videoId: String,
    val gif: Int) : Parcelable
