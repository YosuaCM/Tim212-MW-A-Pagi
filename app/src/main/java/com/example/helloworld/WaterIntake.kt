package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_water_intake.*

class WaterIntake : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_water_intake)

        Ba.setOnClickListener{
            var total = minum.text.toString().toDouble()
            minum.setText("${total + 3.38}")
            minum.setText(String.format("%.2f", total + 3.38))
            var baik = ideal.text.toString().toDouble()
            var goals = target.text.toString().toDouble()

            if (minum.text.toString().toDouble() <= ideal.text.toString()
                    .toFloat() && sisa.text.toString().toDouble() >= 3.38
            ) {
                sisa.setText("${goals - minum.text.toString().toDouble()}")
            } else {
                sisa.setText("${0}")
            }
        }

        Bb.setOnClickListener{
            var total = minum.text.toString().toDouble()
            minum.setText("${total + 6.76}")
            minum.setText(String.format("%.2f", total + 6.76))
            var baik = ideal.text.toString().toDouble()
            var goals = target.text.toString().toDouble()

            if (minum.text.toString().toDouble() <= ideal.text.toString()
                    .toFloat() && sisa.text.toString().toDouble() >= 6.76
            ) {
                sisa.setText("${goals - minum.text.toString().toDouble()}")
            } else {
                sisa.setText("${0}")
            }
        }
    }


//    fun onBa(view: View) {
//        var total = minum.text.toString().toDouble()
//        minum.setText("${total + 3.38}")
//        minum.setText(String.format("%.2f", total + 3.38))
//        var baik = ideal.text.toString().toDouble()
//        var goals = target.text.toString().toDouble()
//
//        if (minum.text.toString().toDouble() <= ideal.text.toString()
//                .toFloat() && sisa.text.toString().toDouble() >= 3.38
//        ) {
//            sisa.setText("${goals - minum.text.toString().toDouble()}")
//        } else {
//            sisa.setText("${0}")
//        }
//    }

//    fun onBb(view: View) {
//        var total = minum.text.toString().toDouble()
//        minum.setText("${total + 6.76}")
//        minum.setText(String.format("%.2f", total + 6.76))
//        var baik = ideal.text.toString().toDouble()
//        var goals = target.text.toString().toDouble()
//
//        if (minum.text.toString().toDouble() <= ideal.text.toString()
//                .toFloat() && sisa.text.toString().toDouble() >= 6.76
//        ) {
//            sisa.setText("${goals - minum.text.toString().toDouble()}")
//        } else {
//            sisa.setText("${0}")
//        }
//    }

    fun onBc(view: View) {
        var total = minum.text.toString().toDouble()
        minum.setText("${total + 10.14}")
        minum.setText(String.format("%.2f", total + 10.14))
        var baik = ideal.text.toString().toDouble()
        var goals = target.text.toString().toDouble()

        if (minum.text.toString().toDouble() <= ideal.text.toString()
                .toFloat() && sisa.text.toString().toDouble() >= 10.14
        ) {
            sisa.setText("${goals - minum.text.toString().toDouble()}")
        } else {
            sisa.setText("${0}")
        }
    }

    fun onBd(view: View) {
        var total = minum.text.toString().toDouble()
        minum.setText("${total + 13.52}")
        minum.setText(String.format("%.2f", total + 13.52))
        var baik = ideal.text.toString().toDouble()
        var goals = target.text.toString().toDouble()
        if (minum.text.toString().toDouble() <= ideal.text.toString()
                .toFloat() && sisa.text.toString().toDouble() >= 13.52
        ) {
            sisa.setText("${goals - minum.text.toString().toDouble()}")
        } else {
            sisa.setText("${0}")
        }
    }




}