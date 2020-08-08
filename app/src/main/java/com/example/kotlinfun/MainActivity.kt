package com.example.kotlinfun

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //summary calculation field will be kept hidden on load
        summaryCalculation.visibility = View.INVISIBLE

        //onClick the CALCULATE button
        calculateButton.setOnClickListener {

            //get billAmount and the discountAmount
            var billValue = billAmount.text.toString().toDouble()
            var discountValue = discountAmount.text.toString().toDouble()

            //Do the calculation
            var discountedValue = String.format("%.2f",((billValue * (100 - discountValue)) / 100))


            //show the summary
            summaryCalculation.text = "Current Price of the item is \$${discountedValue}"
            summaryCalculation.visibility = View.VISIBLE;
        }



    }
}