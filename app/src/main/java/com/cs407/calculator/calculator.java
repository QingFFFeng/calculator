package com.cs407.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class calculator extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);


        textView = findViewById(R.id.textView);
        Intent intent = getIntent();
        double result = intent.getDoubleExtra("RESULT", 0);
        textView.setText(""+result);
    }
}