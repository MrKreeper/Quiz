package com.bonbon.quiz;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FirstQuestionActivity extends AppCompatActivity implements View.OnClickListener {
    Button button;
    EditText editText;
    TextView textView;
    Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstq);
        button = findViewById(R.id.q1button);
        editText = findViewById(R.id.q1answer);
        textView = findViewById(R.id.q1text);
        button2 = findViewById(R.id.q1done);
        button.setOnClickListener(this);
        button2.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.q1button:
                String text = editText.getText().toString();
                switch (text) {
                    case "4":
                        textView.setText("Правильно! Поздравляю, ты умеешь считать!");
                        break;
                    case "":
                        textView.setText("Типа молчание - знак согласия или что? Извини, не врубаюсь");
                        break;
                    default:
                        textView.setText("Я не знаю как это комментировать -_-");
                        break;

                }
                button2.setVisibility(View.VISIBLE);
                break;
            case R.id.q1done:
                Intent intent = new Intent();
                intent.setClass(getApplicationContext(), SecondQuestionActivity.class);
                startActivity(intent);
                break;
        }
    }
}
