package com.example.challenge

import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class ThirdActivity : AppCompatActivity() {

    private lateinit var tvAddress: EditText
    private lateinit var tvPrice: EditText
    private lateinit var tvType: EditText
    private lateinit var tvSqft: EditText
    private lateinit var tvBedrooms: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        tvAddress = findViewById(R.id.tvAddress)
        tvPrice = findViewById(R.id.tvPrice)
        tvType = findViewById(R.id.tvType)
        tvSqft = findViewById(R.id.tvSqft)
        tvBedrooms = findViewById(R.id.tvBedrooms)

        val address = intent.getStringExtra("address") ?: "N/A"
        val price = intent.getStringExtra("price") ?: "N/A"
        val type = intent.getStringExtra("type") ?: "N/A"
        val sqft = intent.getStringExtra("sqft") ?: "N/A"
        val bedrooms = intent.getStringExtra("bedrooms") ?: "N/A"

        tvAddress.setText(address)
        tvPrice.setText(price)
        tvType.setText(type)
        tvSqft.setText(sqft)
        tvBedrooms.setText(bedrooms)
    }
}
