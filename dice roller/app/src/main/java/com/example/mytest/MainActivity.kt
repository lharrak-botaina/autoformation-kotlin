package com.example.mytest

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

/**
 * This activity allows the user to roll a dice and view the result
 * on the screen.
 */
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rollButton: Button = findViewById(R.id.roll)
        rollButton.setOnClickListener { rollDice() }


    }
    /**
     * Roll the dice and update the screen with the result.
     */
    private fun rollDice() {
        // Create new Dice object with 6 sides and roll it
        val dice = Dice(6)
        val diceRoll = dice.roll()
        // Update the screen with the dice roll
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text = diceRoll.toString()
        // Find the ImageView in the layout
        val diceImage:ImageView=findViewById(R.id.imageView)
        // Update the content description
        diceImage.contentDescription = diceRoll.toString()
        // Determine which drawable resource ID to use based on the dice roll
       when(diceRoll){
           1->diceImage.setImageResource(R.drawable.dice_1)
           2->diceImage.setImageResource(R.drawable.dice_2)
           3->diceImage.setImageResource(R.drawable.dice_3)
           4->diceImage.setImageResource(R.drawable.dice_4)
           5->diceImage.setImageResource(R.drawable.dice_5)
           6->diceImage.setImageResource(R.drawable.dice_6)


       }


    }

}