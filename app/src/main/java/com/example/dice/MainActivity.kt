package com.example.dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var diceimageView: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollbutton: Button = findViewById(R.id.roll_button)

        diceimageView = findViewById(R.id.image_dice)

        rollbutton.setOnClickListener{rollDice(diceimageView)}

    }

    private fun rollDice(img: ImageView){
        Toast.makeText(this, "button click!", Toast.LENGTH_SHORT).show()


        val num1 = (1..6).random()

        val drawableresouce = when(num1){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            6 -> R.drawable.dice_6

            else -> R.drawable.dice_6
        }

        img.setImageResource(drawableresouce)

        img.rotationX = (-30..30).random().toFloat()
        img.rotationY = (-30..30).random().toFloat()

    }



}