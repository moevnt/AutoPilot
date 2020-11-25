package com.example.autopilot

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class RegistrationActivity : AppCompatActivity() {
	
	private lateinit var name : EditText
	private lateinit var backButton: Button
	private lateinit var createButton: Button
	
	
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_registration)
		
		name = findViewById(R.id.editTextTextPersonName)
		backButton = findViewById(R.id.Back_Button)
		createButton = findViewById(R.id.Submit_Registration_Button)
		
		
		backButton.setOnClickListener {
			val intent = LoginActivity.newIntent(this@RegistrationActivity)
			startActivity(intent)
		}
		
		createButton.setOnClickListener {
			val toast : Toast = Toast.makeText(this, "Welcome ${name.text}", Toast.LENGTH_SHORT)
			toast.setGravity(Gravity.TOP, 0,0)
			toast.show()
			
			val intent = LoginActivity.newIntent(this@RegistrationActivity)
			startActivity(intent)
		}
		
		
	}
	
	companion object{
		fun newIntent(packageContext : Context) : Intent {
			
			val intent = Intent(packageContext, RegistrationActivity::class.java)
			
			return intent
		}
	}
}