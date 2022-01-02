package com.eldorteshaboev.diceroller

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    class Dice(private val side:Int){
        fun roll():Int{
            return (1..side).random()
        }
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnRoll.setOnClickListener { rollDice() }
        rollDice()

    }

    private fun rollDice() {
        val dice = Dice(6)
        val dice2 = Dice(6)
        val diceRoll = dice.roll()
        val diceRoll2 = dice2.roll()
        val drawableResource = when(diceRoll){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else->R.drawable.dice_6

        /*ivDice1.setImageResource(R.drawable.dice_2)*/
    }
        val drawableResource2 = when(diceRoll2){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else->R.drawable.dice_6

            /*ivDice1.setImageResource(R.drawable.dice_2)*/
        }

        ivDice2.setImageResource(drawableResource2)
        ivDice1.setImageResource(drawableResource)
        ivDice1.contentDescription = diceRoll.toString()

    }
}