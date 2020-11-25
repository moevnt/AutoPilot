package com.example.autopilot

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class WithdrawalActivity : AppCompatActivity() {

    private lateinit var finalButton : Button
    private lateinit var password : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_withdrawal)

        finalButton = findViewById(R.id.finalize_Button)
        password = findViewById(R.id.password_Edit)

        finalButton.setOnClickListener {
            
            if (password.text.toString() != "12345") {
                val toast: Toast =
                    Toast.makeText(this, "Incorrect Password", Toast.LENGTH_SHORT)
                toast.setGravity(Gravity.TOP, 0, 0)
                toast.show()
            }
            else {
                val toast: Toast =
                    Toast.makeText(this, "Funds Withdrawn", Toast.LENGTH_SHORT)
                toast.setGravity(Gravity.TOP, 0, 0)
                toast.show()
                val intent = MainActivity.newIntent(this@WithdrawalActivity)
                startActivity(intent)
            }
        }
    }
    
    
    companion object {
        fun newIntent(packageContext: Context): Intent {
            return Intent(packageContext, WithdrawalActivity::class.java)
        }
    }

}