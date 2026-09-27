package com.example.explisitintent

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Pegawai(
    val Nip : Int,
    val Nama : String?,
    val Dept : String?
) : Parcelable
