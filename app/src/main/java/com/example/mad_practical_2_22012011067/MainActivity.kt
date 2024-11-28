package com.example.mad_practical_2_22012011067

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    val TAG = "MainActivity"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        showMessage("onCreate function has been called") }
    fun showMessage(msg: String){ Log.i(TAG, msg)
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show()
    }
    override fun onStart() { super.onStart()
        showMessage("onStart function has been called")
    }
    override fun onPause() {
        super.onPause()
        showMessage("onPause function has been called")
    }
    override fun onRestart() {
        super.onRestart()
        showMessage("onRestart function has been called")
    }
    override fun onDestroy() {
        super.onDestroy()
        showMessage("onDestroy function has been called")
    }
    override fun onResume() {
        super.onResume()
        showMessage("onResume function has been called")
    }
    override fun onStop() {
            super.onStop()
            showMessage("onStop function has been called")
    }
}
