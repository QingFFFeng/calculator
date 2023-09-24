package com.cs407.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import android.app.AlertDialog;

public class MainActivity extends AppCompatActivity {
    public void clickFunctionAdd(View view) {
        EditText myTextField = (EditText) findViewById(R.id.testNumber);
        EditText myTextField2 = (EditText) findViewById(R.id.testNumber2);

        double number1 = Double.parseDouble(myTextField.getText().toString());
        double number2 = Double.parseDouble(myTextField2.getText().toString());

        double result = number1 + number2;
        Intent intent = new Intent(MainActivity.this, calculator.class);
        intent.putExtra("RESULT", result);
        startActivity(intent);
    }

    public void clickFunctionSub(View view) {
        EditText myTextField = (EditText) findViewById(R.id.testNumber);
        EditText myTextField2 = (EditText) findViewById(R.id.testNumber2);

        double number1 = Double.parseDouble(myTextField.getText().toString());
        double number2 = Double.parseDouble(myTextField2.getText().toString());

        double result = number1 - number2;
        Intent intent = new Intent(MainActivity.this, calculator.class);
        intent.putExtra("RESULT", result);
        startActivity(intent);
    }

    public void clickFunctionMul(View view) {
        EditText myTextField = (EditText) findViewById(R.id.testNumber);
        EditText myTextField2 = (EditText) findViewById(R.id.testNumber2);

        double number1 = Double.parseDouble(myTextField.getText().toString());
        double number2 = Double.parseDouble(myTextField2.getText().toString());

        double result = number1 * number2;
        Intent intent = new Intent(MainActivity.this, calculator.class);
        intent.putExtra("RESULT", result);
        startActivity(intent);
    }

    public void clickFunctionDiv(View view) {
        EditText myTextField = (EditText) findViewById(R.id.testNumber);
        EditText myTextField2 = (EditText) findViewById(R.id.testNumber2);

        double number1 = Double.parseDouble(myTextField.getText().toString());
        double number2 = Double.parseDouble(myTextField2.getText().toString());

        if(number2 == 0){
            displayErrorMessage("Error: Divide by Zero");
        } else{
            double result = number1 / number2;
        Intent intent = new Intent(MainActivity.this, calculator.class);
        intent.putExtra("RESULT", result);
        startActivity(intent);}
    }

    private void displayErrorMessage(String message) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage(message)
                .setTitle("Error")
                .setPositiveButton("OK", null);

        AlertDialog dialog = builder.create();
        dialog.show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}