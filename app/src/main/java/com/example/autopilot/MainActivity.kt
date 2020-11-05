package com.example.autopilot

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

	private lateinit var signOut : Button
	private lateinit var addButton : Button
	private lateinit var withdrawalButton: Button


	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		addButton = findViewById(R.id.Add_Button)
		withdrawalButton = findViewById(R.id.Withdrawal_Button)
		signOut = findViewById(R.id.Sign_Out_Button)


		signOut.setOnClickListener { view : View ->
			val intent = LoginActivity.newIntent(this@MainActivity)
			startActivity(intent)
		}

		addButton.setOnClickListener { view : View ->
			val intent = AddFundsActivity.newIntent(this@MainActivity)
			startActivity(intent)
		}

		withdrawalButton.setOnClickListener { view : View ->
			val intent = WithdrawalActivity.newIntent(this@MainActivity)
			startActivity(intent)
		}
	}

	companion object{
		fun newIntent(packageContext : Context) : Intent {

			val intent = Intent(packageContext, MainActivity::class.java)

			return intent
		}
	}
}