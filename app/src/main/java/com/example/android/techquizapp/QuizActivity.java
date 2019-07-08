package com.example.android.techquizapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import java.util.ArrayList;

public class QuizActivity extends AppCompatActivity {

    Button checkAnswerButton;
    private int nbOfCorrectAnswers = 0;
    private boolean sent = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        /**
         * This method is the companion to the Check Answer
         */
        checkAnswerButton = findViewById(R.id.check_answer);
        checkAnswerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showResults();
                sent = true;
            }
        });
    }

    /** This method checks the correct answers
     * and show the number of correct answers in a Toast message
     */
    private void showResults() {
        if (!sent) {
            if(checkAnswerOne()) {
                nbOfCorrectAnswers++;
            }
            if(checkAnswerTwo()) {
                nbOfCorrectAnswers++;
            }
            if(checkAnswerThree()) {
                nbOfCorrectAnswers++;
            }
            if(checkAnswerFour()) {
                nbOfCorrectAnswers++;
            }

            showResultAsToast(nbOfCorrectAnswers);

        } else {
            showResultAsToast(nbOfCorrectAnswers);
        }
    }

    /**
     * Checks if the answer is correct, change the color of correct answer to green
     * @return true for correct answer, false for incorrect
     */

    private boolean checkAnswerOne() {
        CheckBox correctAnswer1Q1 = findViewById(R.id.qs1Ans1);
        CheckBox correctAnswer2Q1 = findViewById(R.id.qs1Ans3);
        correctAnswer1Q1.setTextColor(Color.parseColor("green"));
        correctAnswer2Q1.setTextColor(Color.parseColor("green"));
        return  ((correctAnswer1Q1.isChecked()) && (correctAnswer2Q1.isChecked()));
    }

    /**
     * Checks if the answer is correct, change the color of correct answer to green
     * @return true for correct answer, false for incorrect
     */

    private boolean checkAnswerTwo() {
        CheckBox correctAnswer1Q2 = findViewById(R.id.qs2Ans3);
        correctAnswer1Q2.setTextColor(Color.parseColor("green"));
        return  correctAnswer1Q2.isChecked();
    }

    /**
     * Checks if the answer is correct, change the color of correct answer to green
     * @return true for correct answer, false for incorrect
     */

    private boolean checkAnswerThree() {
        CheckBox correctAnswer1Q3 = findViewById(R.id.qs3Ans1);
        correctAnswer1Q3.setTextColor(Color.parseColor("green"));
        return correctAnswer1Q3.isChecked();
    }

    /**
     * Checks if the answer is correct, change the color of correct answer to green
     * @return true for correct answer, false for incorrect
     */

    private boolean checkAnswerFour() {
        CheckBox correctAnswer1Q4 = findViewById(R.id.qs4Ans2);
        correctAnswer1Q4.setTextColor(Color.parseColor("green"));
        return correctAnswer1Q4.isChecked();
    }

    /** This method helps to show a Toast message
     * @param nbOfCorrectAnswers the numbers of correct answers
     */

    private void showResultAsToast(int nbOfCorrectAnswers) {
       String msg = "";

       if(nbOfCorrectAnswers == 4) {
           msg = "Genius ! LOL !! " + nbOfCorrectAnswers + "/4";
       } else if (nbOfCorrectAnswers < 4) {
           msg = "You can do better than this! " + nbOfCorrectAnswers + "/4";
       }

       // The Toast method helps to show a message that shows the number of correct answers
       Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
    }
}
