package com.example.hometask_28

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val text = "Please, enter PIN"
        val duration = Toast.LENGTH_LONG
        val toast = Toast.makeText(applicationContext, text, duration)

        toast.show()
        goToAdvertising()
    }


    //goToAdvertising

    fun goToAdvertising() {
        val context: Context = this
        val editPin = findViewById<View>(R.id.etPin) as EditText

        editPin.setOnClickListener {
            val intent = Intent(this, MainActivityAdvertising::class.java)
            startActivity(intent)
        }
    }



}