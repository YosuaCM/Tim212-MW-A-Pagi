package com.example.helloworld

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import kotlinx.android.synthetic.main.activity_olahraga.*

class Olahraga : AppCompatActivity() {

    private val CHANNEL_ID = "notifikasi"
    private val notificationId = 101

    private val progressReceiver = object : BroadcastReceiver(){
        override fun onReceive(p0: Context?, p1: Intent?) {
            var persen = p1?.getIntExtra(EXTRA_PERSEN, 0)
            var selesai = p1?.getBooleanExtra(EXTRA_FINISH, true)

            progress_circular.progress = persen ?: 0
            if(selesai!!){

            }
        }

    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_olahraga)

        createNotificationChannel()

        var myService = Intent(this, OlahragaMyService::class.java)
        mulai.setOnClickListener {
            startService(myService)
        }

        var myServiceBar = Intent(this, ProgressService::class.java)
        mulai.setOnClickListener {
            sendNotification()
            ProgressService.enqueueWork(this, myServiceBar)
        }

        var filterProgress = IntentFilter(ACTION_PROGRESS)
        registerReceiver(progressReceiver, filterProgress)
    }

    override fun onDestroy() {
        super.onDestroy()
        unregisterReceiver(progressReceiver)
    }

    fun next(view: View){
        var intentReply = Intent(this, crunch::class.java)
        startActivity(intentReply)
    }

    fun kembali(view: View){
        var intentReply = Intent(this, MainActivity::class.java)
        startActivity(intentReply)
    }

    private fun createNotificationChannel(){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O){
            val name = "Judul Notifikasi"
            val descriptionText = "Deskripsi Notifikasi"
            val importance = NotificationManager.IMPORTANCE_DEFAULT
            val channel = NotificationChannel(CHANNEL_ID,name,importance).apply {
                description= descriptionText
            }
            val notificationManager: NotificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationManager.createNotificationChannel(channel)
        }
    }

    private fun sendNotification(){

        val builder = NotificationCompat.Builder(this,CHANNEL_ID)
            .setSmallIcon(R.drawable.ic_energy)
            .setContentTitle("Lompat Bintang")
            .setContentText("Lakukan gerakan selama 10 detik")
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)

        with(NotificationManagerCompat.from(this)){
            notify(notificationId, builder.build())
        }
    }
}