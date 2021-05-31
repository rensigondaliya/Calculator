package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText num1;
    private EditText num2;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       num1 = (EditText) findViewById(R.id.num1);
        num2 = (EditText) findViewById(R.id.num2);
        tvResult = (TextView) findViewById(R.id.tvResult);
    }

    public void btnsum(View view) {
        int n1 = Integer.parseInt(num1.getText().toString());
        int n2 = Integer.parseInt(num2.getText().toString());
        int sum = n1+n2;
        tvResult.setText(String.valueOf(sum));
    }

    public void btnsub(View view) {
        int n1 = Integer.parseInt(num1.getText().toString());
        int n2 = Integer.parseInt(num2.getText().toString());
        int sub = n1-n2;
        tvResult.setText(String.valueOf(sub));


    }

    public void btnmulti(View view){
        int n1 = Integer.parseInt(num1.getText().toString());
        int n2 = Integer.parseInt(num2.getText().toString());
        int multi = n1*n2;
        tvResult.setText(String.valueOf(multi));

    }

    public void btndiv(View view) {
        int n1 = Integer.parseInt(num1.getText().toString());
        int n2 = Integer.parseInt(num2.getText().toString());
        int Div = n1/n2;
        tvResult.setText(String.valueOf(Div));
    }
}