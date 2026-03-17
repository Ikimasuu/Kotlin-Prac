package com.example.challenge

import android.app.Activity
import android.os.Bundle
import android.widget.EditText

class ThirdActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val edittextAddress = findViewById<EditText>(R.id.edittextAddress)
        val edittextPrice = findViewById<EditText>(R.id.edittextPrice)
        val edittextType = findViewById<EditText>(R.id.edittextType)
        val edittextSqft = findViewById<EditText>(R.id.edittextSqft)
        val edittextBedrooms = findViewById<EditText>(R.id.edittextBedrooms)

        val address = intent.getStringExtra("address") ?: "N/A"
        val price = intent.getStringExtra("price") ?: "N/A"
        val type = intent.getStringExtra("type") ?: "N/A"
        val sqft = intent.getStringExtra("sqft") ?: "N/A"
        val bedrooms = intent.getStringExtra("bedrooms") ?: "N/A"

        edittextAddress.setText(address)
        edittextPrice.setText(price)
        edittextType.setText(type)
        edittextSqft.setText(sqft)
        edittextBedrooms.setText(bedrooms)
    }
}
