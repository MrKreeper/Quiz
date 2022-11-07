package com.bonbon.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SecondQuestionActivity extends AppCompatActivity implements View.OnClickListener {
    Button button;
    CheckBox ch1;
    CheckBox ch2;
    CheckBox ch3;
    TextView textView;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondq);
        button = findViewById(R.id.q2button);
        ch1 = findViewById(R.id.q2a1);
        ch2 = findViewById(R.id.q2a2);
        ch3 = findViewById(R.id.q2a3);
        textView = findViewById(R.id.q2text);
        button2 = findViewById(R.id.q2done);
        button.setOnClickListener(this);
        button2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.q2button:
                boolean a1 = ch1.isSelected();
                boolean a2 = ch2.isSelected();
                boolean a3 = ch3.isSelected();
                if (!a1) {
                    textView.setText("");
                }
                button2.setVisibility(View.VISIBLE);
                break;
            case R.id.q1done:
                Intent intent = new Intent();
                intent.setClass(getApplicationContext(), MainActivity.class);
                startActivity(intent);
                break;
        }
    }
}
