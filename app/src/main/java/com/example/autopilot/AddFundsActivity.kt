package com.example.autopilot

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class AddFundsActivity : AppCompatActivity(){

    private lateinit var submitButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_funds)

        submitButton = findViewById(R.id.submit_Button)

        submitButton.setOnClickListener { view : View ->
            val intent = MainActivity.newIntent(this@AddFundsActivity)
            startActivity(intent)
        }
    }

    companion object {
        fun newIntent(packageContext: Context): Intent {

            val intent = Intent(packageContext, AddFundsActivity::class.java)

            return intent
        }
    }
}