package com.example.allandroidviewskotlin

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_snackbar.*

class SnackBarActivity : AppCompatActivity() {
    private var button: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_snackbar)
        button = this.btn

        button!!.setOnClickListener {
            val snackbar = Snackbar.make(it, "This is a simple Exazmple", Snackbar.LENGTH_LONG)
            snackbar.show()
        }

    }
}