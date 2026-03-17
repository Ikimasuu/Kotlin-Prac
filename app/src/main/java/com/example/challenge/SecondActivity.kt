package com.example.challenge

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    private lateinit var etAddress: EditText
    private lateinit var etPrice: EditText
    private lateinit var etType: EditText
    private lateinit var etSqft: EditText
    private lateinit var etBedrooms: EditText
    private lateinit var btnSave: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        etAddress = findViewById(R.id.etAddress)
        etPrice = findViewById(R.id.etPrice)
        etType = findViewById(R.id.etType)
        etSqft = findViewById(R.id.etSqft)
        etBedrooms = findViewById(R.id.etBedrooms)
        btnSave = findViewById(R.id.btnSave)

        btnSave.setOnClickListener {
            val address = etAddress.text.toString().trim()
            val price = etPrice.text.toString().trim()
            val type = etType.text.toString().trim()
            val sqft = etSqft.text.toString().trim()
            val bedrooms = etBedrooms.text.toString().trim()

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
