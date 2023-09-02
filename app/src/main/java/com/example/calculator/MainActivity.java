package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void add(View v){
        EditText num1=findViewById(R.id.number1);
        int n1= Integer.parseInt(num1.getText().toString());
        EditText num2 =findViewById(R.id.number2);
        int n2 = Integer.parseInt(num2.getText().toString());
        TextView tv =findViewById(R.id.sum);
        tv.setText("" +(n1+n2));
    }
    public void sub(View v){
        EditText num1=findViewById(R.id.number1);
        int n1 = Integer.parseInt(num1.getText().toString());
        EditText num2 =findViewById(R.id.number2);
        int n2 = Integer.parseInt(num2.getText().toString());
        TextView tv =findViewById(R.id.subtract);
        tv.setText("" +(n1-n2));}
    public void mul(View v){
        EditText num1=findViewById(R.id.number1);
        int n1 = Integer.parseInt(num1.getText().toString());
        EditText num2 =findViewById(R.id.number2);
        int n2 = Integer.parseInt(num2.getText().toString());
        TextView tv =findViewById(R.id.multiply);
        tv.setText("" +(n1*n2));}
    public void div(View v){
        EditText num1=findViewById(R.id.number1);
        int n1 = Integer.parseInt(num1.getText().toString());
        EditText num2 =findViewById(R.id.number2);
        int n2 = Integer.parseInt(num2.getText().toString());
        TextView tv =findViewById(R.id.division);
        tv.setText("" +(n1/n2));
    }
}