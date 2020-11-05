package com.example.autopilot

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class WithdrawalActivity : AppCompatActivity() {

    private lateinit var finalButton : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_withdrawal)

        finalButton = findViewById(R.id.finalize_Button)

        finalButton.setOnClickListener { view: View ->
            val intent = MainActivity.newIntent(this@WithdrawalActivity)
            startActivity(intent)
        }
    }

    companion object {
        fun newIntent(packageContext: Context): Intent {

            return Intent(packageContext, WithdrawalActivity::class.java)
        }
    }
}