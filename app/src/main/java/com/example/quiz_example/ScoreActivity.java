package com.example.quiz_example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ScoreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);

        TextView txtVw_score = findViewById(R.id.txtVw_score);

        int score = getIntent().getExtras().getInt("score", 0);
        txtVw_score.setText(String.valueOf(score));

    }
}