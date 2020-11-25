package com.example.autopilot

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.View
import android.widget.Button
import androidx.appcompat.widget.Toolbar
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.android.material.navigation.NavigationView
import com.google.android.material.snackbar.Snackbar
import com.jjoe64.graphview.GraphView
import com.jjoe64.graphview.series.DataPoint
import com.jjoe64.graphview.series.LineGraphSeries

class MainActivity : AppCompatActivity() {
	
	private lateinit var appBarConfiguration: AppBarConfiguration

	private lateinit var signOut : Button
	private lateinit var addButton : Button
	private lateinit var withdrawalButton: Button
	private lateinit var graphView : GraphView


	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
		
		graphView  = findViewById(R.id.graph)
		addButton = findViewById(R.id.Add_Button)
		withdrawalButton = findViewById(R.id.Withdrawal_Button)
		signOut = findViewById(R.id.Sign_Out_Button)
		
		graphView
		graphView.visibility
		
		
		
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
	
	override fun onCreateOptionsMenu(menu: Menu): Boolean {
		// Inflate the menu; this adds items to the action bar if it is present.
		menuInflater.inflate(R.menu.options, menu)
		return true
	}
	
	override fun onSupportNavigateUp(): Boolean {
		val navController = findNavController(R.id.nav_host_fragment)
		return navController.navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
	}
}