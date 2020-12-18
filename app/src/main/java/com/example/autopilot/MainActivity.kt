package com.example.autopilot

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.jjoe64.graphview.GraphView

class MainActivity : AppCompatActivity() {

	private lateinit var signOut : Button
	private lateinit var addButton : Button
	private lateinit var withdrawalButton: Button
	private lateinit var graphView : GraphView
	private lateinit var reportButton: Button
	private lateinit var accountInfo: Button


	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
		
		graphView  = findViewById(R.id.graph)
		addButton = findViewById(R.id.Add_Button)
		withdrawalButton = findViewById(R.id.Withdrawal_Button)
		reportButton = findViewById(R.id.Report_Button)
		signOut = findViewById(R.id.Sign_Out_Button)
		accountInfo = findViewById(R.id.Account_Info_Button)
		
		graphView
		graphView.visibility

		addButton.setOnClickListener { view : View ->
			val intent = AddFundsActivity.newIntent(this@MainActivity)
			startActivity(intent)
		}

		withdrawalButton.setOnClickListener { view : View ->
			val intent = WithdrawalActivity.newIntent(this@MainActivity)
			startActivity(intent)
		}
		
		reportButton.setOnClickListener {
			val toast: Toast =
				Toast.makeText(this, "Report in inbox", Toast.LENGTH_SHORT)
			toast.setGravity(Gravity.TOP, 0, 0)
			toast.show()
		}
		
		accountInfo.setOnClickListener{
			val intent = RegistrationActivity.newIntent((this@MainActivity))
			startActivity(intent)
		}
		
		signOut.setOnClickListener { view : View ->
			val intent = LoginActivity.newIntent(this@MainActivity)
			startActivity(intent)
		}
	}

	companion object{
		fun newIntent(packageContext : Context) : Intent {
			
			return Intent(packageContext, MainActivity::class.java)
		}
	}
}