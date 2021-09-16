package com.example.gamescore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int Team_A_Score = 0;
    int Team_B_Score = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
    }

    public void addOneForTeamA(View view) {
        Team_A_Score += 1;
        displayScoreForTeamA(Team_A_Score);
    }
    public void addOneForTeamB(View view) {
        Team_B_Score += 1;
        displayScoreForTeamB(Team_B_Score);
    }


    public void addTwoForTeamA(View view) {
        Team_A_Score += 2;
        displayScoreForTeamA(Team_A_Score);
    }
    public void addTwoForTeamB(View view) {
        Team_B_Score += 2;
        displayScoreForTeamB(Team_B_Score);
    }


    public void addThreeForTeamA(View view) {
        Team_A_Score += 3;
        displayScoreForTeamA(Team_A_Score);
    }
    public void addThreeForTeamB(View view) {
        Team_B_Score += 3;
        displayScoreForTeamB(Team_B_Score);
    }


    public void resetScore(View view) {
        Team_A_Score = 0;
        Team_B_Score = 0;
        displayScoreForTeamA(Team_A_Score);
        displayScoreForTeamB(Team_B_Score);
    }

    public void displayScoreForTeamA(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayScoreForTeamB(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}