package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
private Button PlusButton, CButton, MinusButton, xButton, DelimButton;
private TextView Operation, Result;
private EditText number1, number2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        PlusButton=(Button) findViewById(R.id.PlusButton);
        MinusButton=(Button) findViewById(R.id.MinusButton);
        xButton=(Button) findViewById(R.id.xButton);
        DelimButton=(Button) findViewById(R.id.DelimButton);
        CButton=(Button) findViewById(R.id.CButton);

        Operation=(TextView) findViewById(R.id.Operation);
        Result=(TextView) findViewById(R.id.Result);

        number1=(EditText) findViewById(R.id.number1);
        number2=(EditText) findViewById(R.id.number2);

        PlusButton.setOnClickListener(this);
        MinusButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        float num1=0;
        float num2=0;
        float res=0;

        num1 = Float.parseFloat(number1.getText().toString());
        num2 = Float.parseFloat(number1.getText().toString());

        switch (v.getId()) {
            case R.id.PlusButton:
                Operation.setText("+");
                res = num1 + num2;
                break;
            case R.id.MinusButton:
                Operation.setText("-");
                res = num1-num2;
                break;
            case R.id.DelimButton:
                Operation.setText("/");
                res = num1/num2;
                break;
            case R.id.xButton:
                Operation.setText("*");
                res = num1*num2;
                break;

            case R.id.CButton:
                number1.setText("");
                Operation.setText("");
                number2.setText("");
                Result.setText("");
                break;






        }
        Result.setText(res+"");
    }
}