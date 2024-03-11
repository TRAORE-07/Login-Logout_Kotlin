package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        val logout : Button = findViewById(R.id.btnLogOut)

        logout.setOnClickListener{
            // Clear user session or preferences
            val UserSession = getSharedPreferences("user_session", MODE_PRIVATE)
            val editor = UserSession.edit()
            editor.clear()
            editor.apply()

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            // Finish the current activity
            finish()
        }
    }
}