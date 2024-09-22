package com.example.agecalculator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import java.text.ParseException
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var firstNameInput: EditText
    private lateinit var lastNameInput: EditText
    private lateinit var dateOfBirthInput: EditText
    private lateinit var calculateButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize UI elements
        firstNameInput = findViewById(R.id.firstName)
        lastNameInput = findViewById(R.id.lastName)
        dateOfBirthInput = findViewById(R.id.dateOfBirth)
        calculateButton = findViewById(R.id.calculateButton)

        // Set onClickListener for the Calculate Button
        calculateButton.setOnClickListener {
            // Get the input values
            val firstName = firstNameInput.text.toString()
            val lastName = lastNameInput.text.toString()
            val dateOfBirth = dateOfBirthInput.text.toString()

            // Validate inputs
            if (firstName.isEmpty() || lastName.isEmpty() || dateOfBirth.isEmpty()) {
                Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show()
            } else {
                // Parse and calculate age
                val sdf = SimpleDateFormat("MM/dd/yyyy", Locale.US)
                try {
                    val birthDate = sdf.parse(dateOfBirth)
                    if (birthDate != null) {
                        val age = calculateAge(birthDate)
                        Toast.makeText(this, "Age: $age years", Toast.LENGTH_SHORT).show()
                    }
                } catch (e: ParseException) {
                    Toast.makeText(this, "Invalid Date Format", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }

    // Method to calculate age
    private fun calculateAge(birthDate: Date): Int {
        val birthCalendar = Calendar.getInstance()
        birthCalendar.time = birthDate

        val today = Calendar.getInstance()

        var age = today.get(Calendar.YEAR) - birthCalendar.get(Calendar.YEAR)

        // If birth date has not occurred this year, subtract 1
        if (today.get(Calendar.DAY_OF_YEAR) < birthCalendar.get(Calendar.DAY_OF_YEAR)) {
            age--
        }

        return age
    }
}
