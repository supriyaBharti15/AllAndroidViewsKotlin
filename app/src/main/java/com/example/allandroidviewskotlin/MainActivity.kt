package com.example.allandroidviewskotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private var mImageViewButton: Button? = null
    private var mRadioButton: Button? = null
    private var mSeekBarButton: Button? = null
    private var mWebviewButton: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mImageViewButton = findViewById(R.id.imageViewExmp)
        mRadioButton = findViewById(R.id.radioButtonExmp)
        mSeekBarButton = findViewById(R.id.seekBarExmp)
        mWebviewButton = findViewById(R.id.webViewExmp)

        //set clickListener on buttons
        mImageViewButton!!.setOnClickListener(this)
        mRadioButton!!.setOnClickListener(this)
        mSeekBarButton!!.setOnClickListener(this)
        mWebviewButton!!.setOnClickListener(this)
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
                intent = Intent(this@MainActivity, RadioButtonTestActivity::class.java)
                startActivity(intent)
                //startActivity(Intent(this, RadioButtonTestActivity::class.java))
            }

            R.id.seekBarExmp -> {
                intent = Intent(this, SeekBarTextActivity::class.java)
                startActivity(intent)
            }
            R.id.webViewExmp -> {
                intent = Intent(this, WebViewActivity::class.java)
                startActivity(intent)
            }
            R.id.progressBarExmp -> {
                intent = Intent(this, WebViewActivity::class.java)
                startActivity(intent)
            }
        }
    }
}
