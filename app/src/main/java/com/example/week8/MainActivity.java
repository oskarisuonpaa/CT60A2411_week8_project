package com.example.week8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        EditText editTextNumber1 = findViewById(R.id.editTextNumber1);
        EditText editTextNumber2 = findViewById(R.id.editTextNumber2);
        Button buttonPlus = findViewById(R.id.buttonPlus);
        Button buttonMinus = findViewById(R.id.buttonMinus);
        Button buttonMultiplication = findViewById(R.id.buttonMultiplication);
        Button buttonDivision = findViewById(R.id.buttonDivision);
        TextView textViewResult = findViewById(R.id.textViewResult);

        buttonPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Float number1 = Float.parseFloat(editTextNumber1.getText().toString());
                Float number2 = Float.parseFloat(editTextNumber2.getText().toString());
                Float result = number1 + number2;
                textViewResult.setText(String.format("%.2f", result));
            }
        });

        buttonMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Float number1 = Float.parseFloat(editTextNumber1.getText().toString());
                Float number2 = Float.parseFloat(editTextNumber2.getText().toString());
                Float result = number1 - number2;
                textViewResult.setText(String.format("%.2f", result));
            }
        });

        buttonMultiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Float number1 = Float.parseFloat(editTextNumber1.getText().toString());
                Float number2 = Float.parseFloat(editTextNumber2.getText().toString());
                Float result = number1 * number2;
                textViewResult.setText(String.format("%.2f", result));
            }
        });

        buttonDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Float number1 = Float.parseFloat(editTextNumber1.getText().toString());
                Float number2 = Float.parseFloat(editTextNumber2.getText().toString());
                if (number2 == 0) {
                    textViewResult.setText("Cannot divide by zero!");
                } else {
                    Float result = number1 / number2;
                    textViewResult.setText(String.format("%.2f", result));
                }
            }
        });
    }
}