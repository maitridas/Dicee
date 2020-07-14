package com.ddev.dicee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button rollbutton = findViewById(R.id.rollbutton);
        final ImageView leftdice = findViewById(R.id.imageleftdice);
        final ImageView rightdice = findViewById(R.id.imagerightdice);
        final int[] dicearray ={
                R.drawable.dice1,
                R.drawable.dice2,
                R.drawable.dice3,
                R.drawable.dice4,
                R.drawable.dice5,
                R.drawable.dice6
        };

        rollbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d("dicee","the button is clicked");
                Random randomnumber = new Random();
                int number = randomnumber.nextInt(6);
                Log.d("dicee","the random number is "+number);
                leftdice.setImageResource(dicearray[number]);
                number=randomnumber.nextInt(6);
                rightdice.setImageResource(dicearray[number]) ;

            }
        });

    }
}