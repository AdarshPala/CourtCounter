package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int ptsA = 0;
    int ptsB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void A3(View view) {
        ptsA += 3;
        displayA(ptsA);
    }

    public void A2(View view) {
        ptsA += 2;
        displayA(ptsA);
    }

    public void A1(View view) {
        ptsA += 1;
        displayA(ptsA);
    }

    public void B3(View view) {
        ptsB += 3;
        displayB(ptsB);
    }

    public void B2(View view) {
        ptsB += 2;
        displayB(ptsB);
    }

    public void B1(View view) {
        ptsB += 1;
        displayB(ptsB);
    }

    public void displayA(int ptsA) {
        TextView scoreA = (TextView) findViewById(R.id.teamA_score);
        scoreA.setText("" + ptsA);
    }

    public void displayB(int ptsB) {
        TextView scoreB = (TextView) findViewById(R.id.teamB_score);
        scoreB.setText("" + ptsB);
    }

    public void reset(View view) {
        ptsA = 0;
        ptsB = 0;
        displayA(ptsA);
        displayB(ptsB);
    }

}
