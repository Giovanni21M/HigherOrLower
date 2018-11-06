package com.giovannimartinus.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    /* define a variable outside of a method for other methods to use it */
    int randomNumber;

    /* generate a function when guessButton is clicked */
    public void guessClick(View view) {

        /* get the text the end user input */
        EditText guessEditText = (EditText) findViewById(R.id.guessEditText);

        int randomGuess = Integer.parseInt(guessEditText.getText().toString());

        /** create a series of if/else if statements
         *  to display messages when requirements
         *  are met
         */
        if (randomGuess == randomNumber) {

            Toast.makeText(MainActivity.this, "You guessed correctly!", Toast.LENGTH_SHORT).show();

            /* generate a new random integer if statement is met */
            Random rand = new Random();
            randomNumber = rand.nextInt(21) + 1;

        } else if (randomGuess > randomNumber){

            Toast.makeText(MainActivity.this, "Lower", Toast.LENGTH_SHORT).show();

        } else if (randomGuess < randomNumber) {

            Toast.makeText(MainActivity.this, "Higher", Toast.LENGTH_SHORT).show();

        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /** Place code in here to launch with the app
         *  rather than being run when the guessClick
         *  method is run (clicked)
         */

        /* initialize a random object */
        Random rand = new Random();
        /* generate a random integer from 1-20*/
        randomNumber = rand.nextInt(21) + 1;

    }
}
