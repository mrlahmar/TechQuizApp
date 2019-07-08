package com.example.android.techquizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    // The button that helps to start the Quiz
    Button startQuizButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startQuizButton = (Button) findViewById(R.id.startQuiz);
        startQuizButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                // When the Button is Clicked, start the Quiz Activity
                Intent qIntent = new Intent(getBaseContext(), QuizActivity.class);
                startActivity(qIntent);
            }
        });
    }
}
