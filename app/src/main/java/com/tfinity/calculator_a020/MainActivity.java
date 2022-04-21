package com.tfinity.calculator_a020;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    Button add,sub,mul,div;
    TextView result;
    EditText num1,num2;
    int re;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        add=findViewById(R.id.add);
        sub=findViewById(R.id.sub);
        mul=findViewById(R.id.mul);
        div=findViewById(R.id.div);
        result=findViewById(R.id.result);
        num1=findViewById(R.id.number1);
        num2=findViewById(R.id.number2);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*if(num1.getText().toString()==null){
                    num1.setText("0");
                }
                if(num2.getText().toString()==null){
                    num2.setText("0");
                }*/
                re=Integer.parseInt(num1.getText().toString())+Integer.parseInt(num2.getText().toString());
                String.valueOf(re);
                result.setText(String.valueOf(re));

            }
        });
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*if(num1.getText().toString()==" "){
                    num1.setText("0");
                }
                if(num2.getText().toString()==" "){
                    num2.setText("0");
                }*/
                re=Integer.parseInt(num1.getText().toString())-Integer.parseInt(num2.getText().toString());
                String.valueOf(re);
                result.setText(String.valueOf(re));

            }
        });
        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*if(num1.getText().toString()==" "){
                    num1.setText("0");
                }
                if(num2.getText().toString()==" "){
                    num2.setText("0");
                }*/
                re=Integer.parseInt(num1.getText().toString())*Integer.parseInt(num2.getText().toString());
                String.valueOf(re);
                result.setText(String.valueOf(re));

            }
        });
        div.setOnClickListener(view -> {
           /* if(num1.getText().toString()==" "){
                num1.setText("0");
            }
            if(num2.getText().toString()==" "){
                num2.setText("0");
            }*/
            if(num2.getText().toString()=="0"){
                num2.setText("1");
            }
            re=Integer.parseInt(num1.getText().toString())/Integer.parseInt(num2.getText().toString());
            String.valueOf(re);
            result.setText(String.valueOf(re));

        });
    }
}