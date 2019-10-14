package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calculator extends AppCompatActivity implements View.OnClickListener  {
    EditText editText;
    Button seven, eight, nine, zero, one, two, three, four, five, six, multily, divide, subtract, add, clear, equal;
    String displaynum = "";
    int res;
    String op, tt;
    int num1, num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcaulator);
        editText=findViewById(R.id.text0);

        seven = findViewById(R.id.btn7);
        eight = findViewById(R.id.btn8);
        nine = findViewById(R.id.btn9);
        zero = findViewById(R.id.btn0);
        one= findViewById(R.id.btn1);
        two= findViewById(R.id.btn2);
        three = findViewById(R.id.btn3);
        four = findViewById(R.id.btn4);
        five= findViewById(R.id.btn5);
        six = findViewById(R.id.btn6);
        multily = findViewById(R.id.btnmult);
        divide= findViewById(R.id.btndiv);
        subtract = findViewById(R.id.btnsub);
        add = findViewById(R.id.btnadd);
        clear= findViewById(R.id.btnc);
        equal= findViewById(R.id.btnequal);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.btn1:
                displaynum +=1;
                editText.setText(displaynum);

        }
    }
}
