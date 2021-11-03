package com.example.hometask_28

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivityAdvertising : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_advertising)

        val text = "Please, enter PIN"
        val duration = Toast.LENGTH_LONG
        val toast = Toast.makeText(applicationContext, text, duration)

        toast.show()
        goBackToMainPage()
    }

    //goToAdvertising

    fun goBackToMainPage() {
        val context: Context = this
        val editPinAdv = findViewById<View>(R.id.etPinAdv) as EditText

        editPinAdv.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }



}




