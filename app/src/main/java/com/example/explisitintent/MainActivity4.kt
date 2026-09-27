package com.example.explisitintent

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activty_main4)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val intentPegawai = intent.getParcelableArrayListExtra<Pegawai>(
            DataPegawai,
            Pegawai::class.java
        )

        val isiText = "NIP : ${intentPegawai!![0].NIP.toString()}, " +
                "\nNama : ${intentPegawai[0].Nama.toString()}, " +
                "\nDept : ${intentPegawai[0].Dept.toString()}" +
                "\n" +
                "\nNIP : ${intentPegawai[1].NIP.toString()}, " +
                "\nNama : ${intentPegawai[1].Nama.toString()}, " +
                "\nDept : ${intentPegawai[1].Dept.toString()}"


        val showDataPegawai = findViewById<TextView>(R.id.showDataPegawai)
        showDataPegawai.text = isiText
    }

    companion object {
        const val DataPegawai = "KirimDataPegawai"
    }
}
