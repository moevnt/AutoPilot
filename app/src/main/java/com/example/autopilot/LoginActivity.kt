package com.example.autopilot

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LoginActivity: AppCompatActivity() {

    private lateinit var signInButton : Button
    private lateinit var registerButton: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        signInButton = findViewById(R.id.Sign_In_Button)
        registerButton = findViewById(R.id.Register_Button)

        signInButton.setOnClickListener { view: View ->
            val intent = MainActivity.newIntent(this@LoginActivity)
            startActivity(intent)
        }

        registerButton.setOnClickListener {
            val intent = RegistrationActivity.newIntent(this@LoginActivity)
            startActivity(intent)
        }

    }

    companion object{
        fun newIntent(packageContext : Context) : Intent {
    
            return Intent(packageContext, LoginActivity::class.java)
        }
    }
}