package com.ariirwandi13.scorkeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Tracks the score for Team A
    int scoreTeamA = 0;
    int yellowTeamA = 0;
    int redTeamA = 0;

    // Tracks the score for Team B
    int scoreTeamB = 0;
    int yellowTeamB = 0;
    int redTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addGoalForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayGoalForTeamA(scoreTeamA);
    }


    public void addYellowForTeamA(View v) {
        yellowTeamA = yellowTeamA + 1;
        displayYellowForTeamA(yellowTeamA);
    }


    public void addRedForTeamA(View v) {
        redTeamA = redTeamA + 1;
        displayRedForTeamA(redTeamA);
    }


    public void addGoalForTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayGoalForTeamB(scoreTeamB);
    }


    public void addYellowForTeamB(View v) {
        yellowTeamB = yellowTeamB + 1;
        displayYellowForTeamB(yellowTeamB);
    }


    public void addRedForTeamB(View v) {
        redTeamB = redTeamB + 1;
        displayRedForTeamB(redTeamB);
    }


    public void resetScore(View v) {
        scoreTeamA = 0;
        yellowTeamA = 0;
        redTeamA = 0;
        scoreTeamB = 0;
        yellowTeamB = 0;
        redTeamB = 0;

        displayGoalForTeamA(scoreTeamA);
        displayYellowForTeamA(yellowTeamA);
        displayRedForTeamA(redTeamA);
        displayGoalForTeamB(scoreTeamB);
        displayYellowForTeamB(yellowTeamB);
        displayRedForTeamB(redTeamB);
    }


    public void displayGoalForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayYellowForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_yellow);
        scoreView.setText(String.valueOf(score));
    }

    public void displayRedForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_red);
        scoreView.setText(String.valueOf(score));
    }

    public void displayGoalForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayYellowForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_yellow);
        scoreView.setText(String.valueOf(score));
    }

    public void displayRedForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_red);
        scoreView.setText(String.valueOf(score));
    }
}
