package com.example.helloworld

import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View;
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var AirplaneReceiver = MyAirplaneReceiver()
        var filter = IntentFilter()
        filter.addAction(Intent.ACTION_AIRPLANE_MODE_CHANGED)
        registerReceiver(AirplaneReceiver,filter)
    }

    fun onBmiButton(view: View) {
        var intentReply = Intent(this, Inputbmi::class.java)
        startActivity(intentReply)
    }

    fun onHistoryButton(view: View) {
        var intentReply = Intent(this, MainActivity2::class.java)
        startActivity(intentReply)
    }

    fun onWaterButton(view: View) {
        var intentReply = Intent(this, WaterIntake::class.java)
        startActivity(intentReply)
    }

    fun onEatButton(view: View){
        var intentReply = Intent(this, makanbang::class.java)
        startActivity(intentReply)
    }

    fun onGymButton(view: View){
        var intentReply = Intent(this, Olahraga::class.java)
        startActivity(intentReply)
    }

    fun onAlarmButton(view: View){
        var intentReply = Intent(this, alarm::class.java)
        startActivity(intentReply)
    }
}