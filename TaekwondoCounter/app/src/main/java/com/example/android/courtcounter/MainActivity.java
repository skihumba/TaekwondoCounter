package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreRed = 0;
    int scoreBlue = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Displays Red Player's score.
     */
    public void displayForRed(int score) {
        TextView scoreView = (TextView) findViewById(R.id.Red_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays Blue player's score.
     */
    public void displayForBlue(int score) {
        TextView scoreView = (TextView) findViewById(R.id.Blue_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Add 3pts to Red when +3 clicked.
     */
    public void addThreeRed(View view) {
        scoreRed += 3;
        displayForRed(scoreRed);
    }

    /**
     * Add 2pts to Red when +2 clicked.
     */
    public void addTwoRed(View view) {
        scoreRed += 2;
        displayForRed(scoreRed);
    }

    /**
     * Add 1pt to Red when +1 clicked.
     */
    public void addOneRed(View view) {
        scoreRed += 1;
        displayForRed(scoreRed);
    }

    /**
     * Add 3pts to Blue when +3 clicked.
     */
    public void addThreeBlue(View view) {
        scoreBlue += 3;
        displayForBlue(scoreBlue);
    }

    /**
     * Add 2pts to Blue when +2 clicked.
     */
    public void addTwoBlue(View view) {
        scoreBlue += 2;
        displayForBlue(scoreBlue);
    }

    /**
     * Add 1pt to Blue when +1 clicked.
     */
    public void addOneBlue(View view) {
        scoreBlue += 1;
        displayForBlue(scoreBlue);
    }

    /**
     * deduct 1 pt from Red when Red's penalty is clicked.
     */
    public void penaltyRed(View view) {
        scoreRed -= 1;
        displayForRed(scoreRed);
    }

    /**
     * deduct 1 pt from Blue when Blue's's penalty is clicked.
     */
    public void penaltyBlue(View view) {
        scoreBlue -= 1;
        displayForBlue(scoreBlue);
    }

    /**
     * Reset scores.
     */
    public void reset(View view) {
        scoreRed = 0;
        scoreBlue = 0;
        displayForRed(scoreRed);
        displayForBlue(scoreBlue);
    }
}
