package com.example.allandroidviewskotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private var mImageViewButton: Button? = null
    private var mRadioButton: Button? = null
    private var mSeekBarButton: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mImageViewButton = findViewById(R.id.imageViewExmp)
        mRadioButton = findViewById(R.id.radioButtonExmp)
        mSeekBarButton = findViewById(R.id.seekBarExmp)

        //set clickListener on buttons
        mImageViewButton!!.setOnClickListener(this)
        mRadioButton!!.setOnClickListener(this)
        mSeekBarButton!!.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        val id = v.getId()
        when (id) {
            R.id.imageViewExmp -> {
                val intent = Intent(this@MainActivity, ImageViewExample::class.java)
                intent.putExtra("userName", "Supriya")
                startActivity(intent)
            }
            R.id.radioButtonExmp -> {
                 intent = Intent(this@MainActivity,RadioButtonTestActivity::class.java)
                startActivity(intent)
                //startActivity(Intent(this, RadioButtonTestActivity::class.java))
            }

            R.id.seekBarExmp -> {

            }
            R.id.progressBarExmp -> {

            }
        }
    }
}
