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

        val intentPegawai: Pegawai? = intent.getParcelableExtra(DataPegawai, Pegawai::class.java)

        val isiText = "NIP : ${intentPegawai?.NIP.toString()}\n" +
                "Nama : ${intentPegawai?.Nama.toString()}\n" +
                "Dept : ${intentPegawai?.Dept.toString()}"

        val showDataPegawai = findViewById<TextView>(R.id.showDataPegawai)
        showDataPegawai.text = isiText
    }

    companion object {
        const val DataPegawai = "KirimDataPegawai"
    }
}
