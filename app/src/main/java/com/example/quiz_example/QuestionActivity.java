package com.example.quiz_example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class QuestionActivity extends AppCompatActivity implements View.OnClickListener {

    TextView txtVw_question;
    TextView txtVw_timer;
    Button btn_a;
    Button btn_b;
    Button btn_c;
    Button btn_d;

    int score = 0;

    ArrayList<Question> questions;

    int count = 0;
    CountDownTimer countDownTimer;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qustion);

        txtVw_question = findViewById(R.id.txtVw_question);
        txtVw_timer = findViewById(R.id.txtVw_timer);
        btn_a = findViewById(R.id.btn_a);
        btn_a.setOnClickListener(this);
        btn_b = findViewById(R.id.btn_b);
        btn_b.setOnClickListener(this);
        btn_c = findViewById(R.id.btn_c);
        btn_c.setOnClickListener(this);
        btn_d = findViewById(R.id.btn_d);
        btn_d.setOnClickListener(this);

        questions = Question.startGame();

        txtVw_question.setText(questions.get(count).getQuestion());
        btn_a.setText(questions.get(count).getAnswer_a());
        btn_b.setText(questions.get(count).getAnswer_b());
        btn_c.setText(questions.get(count).getAnswer_c());
        btn_d.setText(questions.get(count).getAnswer_d());

        countDownTimer = new CountDownTimer(10000, 1000) {
            public void onTick(long millisUntilFinished) {
                Log.d("TICK", "seconds remaining: " + millisUntilFinished / 1000);
                txtVw_timer.setText(""+millisUntilFinished / 1000);
            }

            public void onFinish() {
                btn_a.setText("");
                onClick(btn_a);
            }

        }.start();
    }

    @Override
    public void onClick(View view) {
        Button btn = (Button) view;
        Log.d("CLICK", btn.getText().toString());

        countDownTimer.cancel();

        if(btn.getText().toString().equals(questions.get(count).getCorrect())){
            score = score + 1;
        }

        count = count + 1;
        if(count<questions.size()) {
            txtVw_question.setText(questions.get(count).getQuestion());
            btn_a.setText(questions.get(count).getAnswer_a());
            btn_b.setText(questions.get(count).getAnswer_b());
            btn_c.setText(questions.get(count).getAnswer_c());
            btn_d.setText(questions.get(count).getAnswer_d());

            countDownTimer.start();
        }
        else{
            Intent intent = new Intent(QuestionActivity.this, ScoreActivity.class);
            intent.putExtra("score", score);
            startActivity(intent);
            QuestionActivity.this.finish();
        }
    }


}