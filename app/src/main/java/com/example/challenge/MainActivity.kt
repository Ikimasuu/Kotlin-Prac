package com.example.challenge

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : Activity() {

    private lateinit var edittextUsername: EditText
    private lateinit var edittextPassword: EditText
    private lateinit var buttonLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edittextUsername = findViewById(R.id.edittextUsername)
        edittextPassword = findViewById(R.id.edittextPassword)
        buttonLogin = findViewById(R.id.buttonLogin)

        buttonLogin.setOnClickListener {
            val username = edittextUsername.text.toString().trim()
            val password = edittextPassword.text.toString().trim()

            if (username.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            if (username == "admin" && password == "1234") {
                Toast.makeText(this, "Login successful!", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, SecondActivity::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "Invalid credentials", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
