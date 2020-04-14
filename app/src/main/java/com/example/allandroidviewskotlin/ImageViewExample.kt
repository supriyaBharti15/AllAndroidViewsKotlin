package com.example.allandroidviewskotlin

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ImageViewExample : AppCompatActivity() {
    var intCol = 0
    val drawableImageIds = intArrayOf(R.drawable.cat,R.drawable.image2,R.drawable.panda)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image_view)
        val userName = intent.getStringExtra("userName")
        val buttonClick = findViewById(R.id.changeImageBtn) as Button
        val imageView = findViewById(R.id.imageView) as ImageView
        val textView = findViewById(R.id.textView) as TextView
        textView.setText("Message sent by MainActivity is:: " + userName)

        buttonClick.setOnClickListener {
            imageView.setImageResource(drawableImageIds[intCol % drawableImageIds.size])
            intCol++
        }

        imageView.setOnClickListener {
            Toast.makeText(this,"U Clicked on image:",Toast.LENGTH_LONG).show()
        }
    }
}