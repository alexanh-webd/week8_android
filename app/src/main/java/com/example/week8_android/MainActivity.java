package com.example.week8_android;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText textInput1;
    private EditText textInput2;
    private TextView textOutput;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        textInput1 = findViewById(R.id.textInput1);
        textInput2 = findViewById(R.id.textInput2);
        textOutput = findViewById(R.id.outputResult);
    }
    public void getSum(View view) {
        System.out.println(textInput1.getText());
        String num1str = textInput1.getText().toString();
        int num1 = Integer.parseInt(num1str);
        System.out.println(textInput2.getText());
        String num2str = textInput2.getText().toString();
        int num2 = Integer.parseInt(num2str);
        int result = num1 + num2;
        textOutput.setText(String.valueOf(result));
    }
    public void getSubtract(View view) {
        System.out.println(textInput1.getText());
        String num1str = textInput1.getText().toString();
        int num1 = Integer.parseInt(num1str);
        System.out.println(textInput2.getText());
        String num2str = textInput2.getText().toString();
        int num2 = Integer.parseInt(num2str);
        int result = num1 - num2;
        textOutput.setText(String.valueOf(result));
    }
    public void getMultiply(View view) {
        System.out.println(textInput1.getText());
        String num1str = textInput1.getText().toString();
        int num1 = Integer.parseInt(num1str);
        System.out.println(textInput2.getText());
        String num2str = textInput2.getText().toString();
        int num2 = Integer.parseInt(num2str);
        int result = num1 * num2;
        textOutput.setText(String.valueOf(result));
    }
    public void getDivision(View view) {
        System.out.println(textInput1.getText());
        String num1str = textInput1.getText().toString();
        int num1 = Integer.parseInt(num1str);
        System.out.println(textInput2.getText());
        String num2str = textInput2.getText().toString();
        int num2 = Integer.parseInt(num2str);
        float result = (float) num1 / num2;
        textOutput.setText(String.valueOf(result));
    }
}