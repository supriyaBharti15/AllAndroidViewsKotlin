package com.example.allandroidviewskotlin

import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.view.View
import android.widget.LinearLayout
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.get
import org.w3c.dom.Text

class RadioButtonTestActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.JELLY_BEAN_MR1)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radio_test)
        val layout = findViewById(R.id.layoutMain) as LinearLayout
        val radioGrp = findViewById(R.id.radioGrp) as RadioGroup
        val resultTextView = findViewById(R.id.result) as TextView
        val option = arrayOf("option1", "option2", "option3", "option4")
        val radioGroup = RadioGroup(this)

        /*
        make a for loop in kotlin to create radioButton dynamically on the basic of number of oprion
         */
        for (i in option.indices) {
            val radioBtn = RadioButton(this)
            radioBtn.text = option[i]
            // assign an automatically generated id to the radio button
            radioBtn.id = View.generateViewId()
            /*
        change color of radio button text in kotlin using 2 way
        
         */
            radioBtn.setTextColor(Color.GREEN)
            radioBtn.setTextColor(Color.parseColor("#0000FF"))
            radioGroup.addView(radioBtn)
        }
        layout.addView(radioGroup)


        /*
   set click on radio group and udate the test on click of option
    */

        radioGrp.setOnCheckedChangeListener { group, checkedId ->
            resultTextView.text = checkedId.toString()
        }
    }


}