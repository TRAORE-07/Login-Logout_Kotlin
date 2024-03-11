package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val utilisateur : EditText = findViewById(R.id.editUser)
        val motdepasse : EditText = findViewById(R.id.editPass)
        val connecter : Button = findViewById(R.id.btnNext)

        connecter.setOnClickListener(){
            val utili = utilisateur.text.toString()
            val mdp = motdepasse.text.toString()

            if (utili == "Djeneba" && mdp == "root1"){
                startActivity(Intent(this, WelcomeActivity::class.java))
                Toast.makeText(this, "Valid Informations. Login Successfully", Toast.LENGTH_LONG).show()
            }
            else{
                Toast.makeText(this, "Wrong Informations. Please try again.", Toast.LENGTH_LONG).show()
            }

        }
    }
}