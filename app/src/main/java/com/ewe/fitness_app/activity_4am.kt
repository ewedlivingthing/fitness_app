package com.ewe.fitness_app

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ImageView
import com.ewe.fitness_app.databinding.ActivityActivity4amBinding
import kotlin.math.roundToInt



class activity_4am : AppCompatActivity() {
    private lateinit var binding: ActivityActivity4amBinding
    private var timerStarted = false
    private lateinit var serviceIntent: Intent
    private var time = 0.0



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.setContentView(R.layout.activity_activity4am);







 binding = ActivityActivity4amBinding.inflate(layoutInflater)
setContentView(binding.root)

;
binding.startStopButton.setOnClickListener { startStopTimer() }



serviceIntent = Intent(applicationContext, TimerService::class.java)
registerReceiver(updateTime, IntentFilter(TimerService.TIMER_UPDATED))
}



private fun startStopTimer() {
    if (timerStarted)
        stopTimer()
    else
        startTimer()

}

private fun startTimer() {
    serviceIntent.putExtra(TimerService.TIME_EXTRA, time)
    startService(serviceIntent)
    binding.startStopButton.text = "stop"

    timerStarted = true
}


private fun stopTimer() {

    stopService(serviceIntent)
    binding.startStopButton.text = "start"
    timerStarted = false

}


private val updateTime: BroadcastReceiver = object : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        var time = intent.getDoubleExtra(TimerService.TIME_EXTRA, 0.0)
        binding.stoptime.text = getTimeStringFromDouble(time)
    }
}

private fun getTimeStringFromDouble(time: Double): CharSequence? {
    val resultInt = time.roundToInt()
    val hours = resultInt % 86400 / 3600
    val minutes = resultInt % 86400 % 3600 / 60
    val seconds = resultInt % 86400 % 3600 % 60
    return mateTimeString(hours, minutes, seconds)
}

private fun mateTimeString(hours: Int, minutes: Int, seconds: Int): String =
    String.format("%02d:%02d:%02d", hours, minutes, seconds)

}
