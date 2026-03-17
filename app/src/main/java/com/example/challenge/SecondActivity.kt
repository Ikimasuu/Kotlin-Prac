package com.example.challenge

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SecondActivity : Activity() {

    private lateinit var edittextAddress: EditText
    private lateinit var edittextPrice: EditText
    private lateinit var edittextType: EditText
    private lateinit var edittextSqft: EditText
    private lateinit var edittextBedrooms: EditText
    private lateinit var buttonSave: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        edittextAddress = findViewById(R.id.edittextAddress)
        edittextPrice = findViewById(R.id.edittextPrice)
        edittextType = findViewById(R.id.edittextType)
        edittextSqft = findViewById(R.id.edittextSqft)
        edittextBedrooms = findViewById(R.id.edittextBedrooms)
        buttonSave = findViewById(R.id.buttonSave)

        buttonSave.setOnClickListener {
            val address = edittextAddress.text.toString().trim()
            val price = edittextPrice.text.toString().trim()
            val type = edittextType.text.toString().trim()
            val sqft = edittextSqft.text.toString().trim()
            val bedrooms = edittextBedrooms.text.toString().trim()

            if (address.isEmpty() || price.isEmpty() || type.isEmpty() || sqft.isEmpty() || bedrooms.isEmpty()) {
                Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            Toast.makeText(this, "Saved successfully!", Toast.LENGTH_SHORT).show()

            val intent = Intent(this, ThirdActivity::class.java)
            intent.putExtra("address", address)
            intent.putExtra("price", price)
            intent.putExtra("type", type)
            intent.putExtra("sqft", sqft)
            intent.putExtra("bedrooms", bedrooms)
            startActivity(intent)
        }
    }
}
