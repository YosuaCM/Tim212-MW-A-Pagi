package com.example.helloworld

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_login.*

class login : AppCompatActivity() {

    lateinit var EXTRA_NAMA : String
    lateinit var EXTRA_BERAT : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        var AirplaneReceiver = MyAirplaneReceiver()
        var filter = IntentFilter()
        filter.addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED)
        registerReceiver(AirplaneReceiver,filter)
    }
    fun simpan(view: View){
        var intentReply = Intent(this, MainActivity::class.java)
        startActivity(intentReply)
    }

    
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("nama",nama.text.toString())
        outState.putString("berat",berat.text.toString())
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        EXTRA_NAMA = savedInstanceState.getString("nama","kosong")
        EXTRA_BERAT = savedInstanceState.getString("berat","kosong")
    }
}