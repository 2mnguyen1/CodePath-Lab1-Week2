package com.example.flashcardapp

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.annotation.RequiresApi

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.M)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val flashcardQuestion = findViewById<TextView>(R.id.flashcard_question);
        val flashcardAnswer1 = findViewById<TextView>(R.id.flashcard_answer1);
        val flashcardAnswer2 = findViewById<TextView>(R.id.flashcard_answer2);
        val flashcardAnswer3 = findViewById<TextView>(R.id.flashcard_answer3);

        flashcardAnswer1.visibility = View.INVISIBLE;
        flashcardAnswer2.visibility = View.INVISIBLE;
        flashcardAnswer3.visibility = View.INVISIBLE;


        flashcardQuestion.setOnClickListener{
            flashcardAnswer1.visibility = View.VISIBLE;
            flashcardAnswer2.visibility = View.VISIBLE;
            flashcardAnswer3.visibility = View.VISIBLE;
            flashcardAnswer1.setBackgroundColor(resources.getColor(R.color.my_background_color, null))
            flashcardAnswer2.setBackgroundColor(resources.getColor(R.color.my_background_color, null))
            flashcardAnswer3.setBackgroundColor(resources.getColor(R.color.my_background_color, null))
        }

        flashcardAnswer1.setOnClickListener{
            flashcardAnswer1.setBackgroundColor(resources.getColor(R.color.my_red_color, null))
            flashcardAnswer3.setBackgroundColor(resources.getColor(R.color.my_green_color, null))
        }

        flashcardAnswer2.setOnClickListener{
            flashcardAnswer2.setBackgroundColor(resources.getColor(R.color.my_red_color, null))
            flashcardAnswer3.setBackgroundColor(resources.getColor(R.color.my_green_color, null))
        }

        flashcardAnswer3.setOnClickListener{
            flashcardAnswer3.setBackgroundColor(resources.getColor(R.color.my_green_color, null))
        }



    }
}