package com.joshuar.ageapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    //Declare my variables

    private lateinit var ageInput: EditText
    private lateinit var gButton: Button
    private lateinit var cButton: Button
    private lateinit var resultTextView: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Initialize my variables

        ageInput =  findViewById(R.id.ageInput)
        gButton = findViewById<Button>(R.id.gButton)
        cButton = findViewById<Button>(R.id.cButton)
        resultTextView = findViewById(R.id.resultTextView)


        gButton.setOnClickListener {
            val age = ageInput.text.toString().toIntOrNull()

            if (age != null && age in 20..100) {
                val famousPerson = when (age) {
                    28 -> "Heath Ledger, an Actor who was most famous for his role as the Joker in The Dark Knight"
                    36 -> "Marilyn Monroe, she was an American Actress, Singer and Model and lived as one of the most Iconic figures"
                    40 -> "Paul Walker, an American Actor known for his role as Brian O'Conner in the thrilling Fast & Furious Movies"
                    50 -> "Micheal Jackson, an American singer known as King of Pop, one of the 20th century's culturally significant figure"
                    53 -> "Irrfan Khan, an Indian Actor who worked in Indian, British and American films, being one of the finest actors in cinema"
                    61 -> "Andre Braugher, an American Actor known famously for his role as Captain Raymond Holt in the nbc series Brooklyn Nine-Nine"
                    78 -> "Mahatma Gandhi, better known as Mahatma, who was an Indian Lawyer who freed his country from British Colonial rule in 1947"
                    80 -> "John DeLorean, an American engineer who was greatly known for the DeLorean Motor Company"
                    95 -> "Nelson Mandela, a South African anti-apartheid activist, and South Africa's first democratically elected president"
                    100 -> "Gloria Stuart, an American Actor, visual artist and activist who regained her fame late in life portraying Rose Dawson in Titanic"
                    else -> null
                }

                val message = if (famousPerson != null) "You are the age of $famousPerson."
                else "No Famous Figure found within the entered age."
                resultTextView.text = message

            } else {
                resultTextView.text = "Invalid input. Please enter a valid age between 20 and 100"
            }

        }
        cButton.setOnClickListener {
            ageInput.text.clear()
            resultTextView.text = ""
        }






        }

















    }
