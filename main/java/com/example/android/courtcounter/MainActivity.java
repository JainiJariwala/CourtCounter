package com.example.android.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int scoreA=0;
    public void A3(View view){
        scoreA=scoreA+3;
         displayA(scoreA);
    }

    public void A2(View view){
        scoreA=scoreA+2;
        displayA(scoreA);
    }

    public void A1(View view){
        scoreA=scoreA+1;
        displayA(scoreA);
    }

    private void displayA(int number) {
        TextView team_a_score = (TextView) findViewById(R.id.team_a_score);
        team_a_score.setText("" + number);
    }

    int scoreB=0;
    public void B3(View view){
        scoreB=scoreB+3;
        displayB(scoreB);
    }

    public void B2(View view){
        scoreB=scoreB+2;
        displayB(scoreB);
    }

    public void B1(View view){
        scoreB=scoreB+1;
        displayB(scoreB);
    }

    public void reset(View view){
        scoreA=0;
        scoreB=0;
        displayA(scoreA);
        displayB(scoreB);
    }

    private void displayB(int number) {
        TextView team_b_score = (TextView) findViewById(R.id.team_b_score);
        team_b_score.setText("" + number);
    }

}