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

    /* generate a Toast function - less clunky */
    public void makeToast(String string) {

        Toast.makeText(MainActivity.this, string, Toast.LENGTH_SHORT).show();
        
    }

    /* generate a function when guessButton is clicked */
    public void guessClick(View view) {

        /* get the text the end user input */
        EditText guessEditText = (EditText) findViewById(R.id.guessEditText);

        /* convert guessEditText to an integer */
        int randomGuess = Integer.parseInt(guessEditText.getText().toString());

        /** create a series of if/else if statements
         *  to display messages when requirements
         *  are met
         */
        if (randomGuess == randomNumber) {

            /* use the makeToast function to generate a message to the end user */
            makeToast("You guessed correctly! Try again!");

            /* generate a new random integer if statement is met */
            Random rand = new Random();
            randomNumber = rand.nextInt(21) + 1;

        } else if (randomGuess > randomNumber){

            makeToast("Lower");

        } else if (randomGuess < randomNumber) {

            makeToast("Higher");

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
        randomNumber = rand.nextInt(20) + 1;

    }
}
