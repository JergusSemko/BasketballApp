package com.example.android.basketballapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int scoreTeamASave;
    int scoreTeamBSave;

    private String scoreTeam_A = "ScoreTeamA";
    private String scoreTeam_B = "ScoreTeamB";
    private String teamAName = "TeamAName";
    private String teamBName = "TeamBName";
    private String scoreTeamA_Save = "ScoreTeamASave";
    private String scoreTeamB_Save = "ScoreTeamBSave";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(scoreTeam_A, scoreTeamA);
        outState.putInt(scoreTeam_B, scoreTeamB);
        outState.putInt(scoreTeamA_Save, scoreTeamASave);
        outState.putInt(scoreTeamB_Save, scoreTeamBSave);

        outState.putString("TeamAName", teamAName);
        outState.putString("TeamBName", teamBName);
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);

        // Restores UI from the savedInstanceState when user turns the device
        scoreTeamA = savedInstanceState.getInt(scoreTeam_A);
        scoreTeamB = savedInstanceState.getInt (scoreTeam_B);
        scoreTeamASave = savedInstanceState.getInt(scoreTeamA_Save);
        scoreTeamBSave = savedInstanceState.getInt (scoreTeamB_Save);

        teamAName = savedInstanceState.getString("TeamAName");
        teamBName = savedInstanceState.getString("TeamBName");

        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
    //Increase the score for A by 1.
    public void addOneForTeamA(View v) {
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA);
    }
    //Increase the score for A by 2.
    public void addTwoForTeamA(View v) {
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }
    // Increase the score for A by 3.
    public void addThreeForTeamA(View v) {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);
    }
    // Increase the score for B by 1.
    public void addOneForTeamB(View v) {
        scoreTeamB += 1;
        displayForTeamA(scoreTeamB);
    }
    // Increase the score for B by 2.
    public void addTwoForTeamB(View v) {
        scoreTeamB += 2;
        displayForTeamA(scoreTeamB);
    }
    // Increase the score for B by 3.
    public void addThreeForTeamB(View v) {
        scoreTeamB += 3;
        displayForTeamA(scoreTeamB);
    }
    public void resetScore(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
    // Displays the score for A.
    public void displayForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    // Displays the score for B.
    public void displayForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
