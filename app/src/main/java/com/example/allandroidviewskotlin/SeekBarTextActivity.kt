package com.example.allandroidviewskotlin

import android.os.Bundle
import android.widget.SeekBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_seekbar.*

class SeekBarTextActivity : AppCompatActivity(), SeekBar.OnSeekBarChangeListener {
    private var progressView: TextView? = null
    private var seekbarText: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seekbar)
        val seekBar = findViewById(R.id.seekBar) as SeekBar
        progressView = this.progress
        seekbarText = this.seekbarStatus

        // called when progress is changed
        seekBar.setOnSeekBarChangeListener(this)
    }

    override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
        progressView!!.text = progress.toString()
        seekbarText!!.text = "ProgressChanged"
    }


    override fun onStartTrackingTouch(seekBar: SeekBar?) {
        seekbarText!!.text = "StartTrackingTouch"
    }

    override fun onStopTrackingTouch(seekBar: SeekBar?) {
        seekbarText!!.text = "StopTrackingTouch"

    }
}