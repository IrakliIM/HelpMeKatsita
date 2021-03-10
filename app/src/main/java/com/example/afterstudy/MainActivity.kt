package com.example.afterstudy

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var PlayerOne: Button
    private lateinit var PlayerTwo: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        PlayerOne = findViewById(R.id.PlayerOneButton)
        PlayerTwo = findViewById(R.id.PlayerTwoButton)


        PlayerTwo.setOnClickListener(this)
        PlayerOne.setOnClickListener(this)
    }




    override fun onClick(Button: View?) {

        var count1 = 0
        var count2 = 0

        if(Button is Button){

            if(Button == PlayerOne){

                count1 + 1

            }

            if(Button == PlayerTwo){
                count2 + 1
            }

            when(count1){
                1 -> Button.setTextColor(Color.BLACK)
                2 -> Button.setTextColor(Color.BLUE)
                3 -> Button.setTextColor(Color.GREEN)
                4 -> Button.setTextColor(Color.RED)
            }

            when(count2){
                1 -> Button.setTextColor(Color.BLACK)
                2 -> Button.setTextColor(Color.BLUE)
                3 -> Button.setTextColor(Color.GREEN)
                4 -> Button.setTextColor(Color.RED)
            }

        }else{
            Toast.makeText(this, "Error", Toast.LENGTH_SHORT).show()
        }
    }


}