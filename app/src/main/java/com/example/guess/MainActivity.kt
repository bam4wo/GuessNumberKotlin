package com.example.guess

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val secretNumber = SecretNumber()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.i("MainActivity", "Secret:" + secretNumber.secret)
    }

    fun check(view : View) {
        val num = ed_number.text.toString().toInt()
        println("Number: $num")
        Log.i("MainActivity", "Number:" + num)
        var diff = num - secretNumber.secret
        var message = "bingo"
        if (diff < 0) {
            message = " bigger"
        } else if (diff > 0) {
            message = "smaller"
        } else {
            message
        }
        //Toast.makeText(this, message, Toast.LENGTH_LONG).show()
        AlertDialog.Builder(this)
            .setTitle("HAHA")
            .setMessage(message)
            .setPositiveButton("OK", null)
            .show()
    }
}