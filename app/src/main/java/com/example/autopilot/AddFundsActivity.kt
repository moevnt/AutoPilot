package com.example.autopilot

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.security.spec.ECField

class AddFundsActivity : AppCompatActivity(){
	
	private lateinit var submitButton : Button
	private lateinit var backButton: Button
	private lateinit var accountNumber : EditText
	private lateinit var depositAmount : EditText
	
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_add_funds)
		
		submitButton = findViewById(R.id.submit_Button)
		accountNumber = findViewById(R.id.Account_Number)
		backButton = findViewById(R.id.back_button)
		depositAmount = findViewById(R.id.Deposit_Amount)
		
		submitButton.setOnClickListener { view : View ->
			
			if (accountNumber.text.toString() != "123456"){
				val toast: Toast =
					Toast.makeText(this, "Incorrect Account Information", Toast.LENGTH_SHORT)
				toast.setGravity(Gravity.TOP, 0, 0)
				toast.show()
			}
			else{
				val toast : Toast = Toast.makeText(this,"Successfully Added ${depositAmount.text} into Auto Pilot", Toast.LENGTH_SHORT)
				toast.setGravity(Gravity.TOP,0,0)
				toast.show()
				
				val intent = MainActivity.newIntent(this@AddFundsActivity)
				startActivity(intent)
			}
		}
		
		backButton.setOnClickListener {
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