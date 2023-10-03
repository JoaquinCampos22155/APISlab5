package com.example.apislab5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val request: Gson().fromJson(inputStreamReader, pedido::class.java)
        UpdateUI(pedido)
        inputStreamReader.close()
        inputSystem.close()

    }
}