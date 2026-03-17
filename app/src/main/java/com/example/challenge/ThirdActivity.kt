package com.example.challenge

import android.app.Activity
import android.os.Bundle
import android.widget.EditText

class ThirdActivity : Activity() {

    private lateinit var edittextAddress: EditText
    private lateinit var edittextPrice: EditText
    private lateinit var edittextType: EditText
    private lateinit var edittextSqft: EditText
    private lateinit var edittextBedrooms: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        edittextAddress = findViewById(R.id.edittextAddress)
        edittextPrice = findViewById(R.id.edittextPrice)
        edittextType = findViewById(R.id.edittextType)
        edittextSqft = findViewById(R.id.edittextSqft)
        edittextBedrooms = findViewById(R.id.edittextBedrooms)

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
