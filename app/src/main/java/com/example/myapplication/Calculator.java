package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calculator extends AppCompatActivity implements View.OnClickListener {
    EditText editText1,editText2;
    TextView textView;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdec,bequal,badd,bsub,bmul,bdiv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        editText1=findViewById(R.id.edit1);
        editText2=findViewById(R.id.edit2);
        textView=findViewById(R.id.textViewans);
        b1=findViewById(R.id.button1);b2=findViewById(R.id.button2);
        b3=findViewById(R.id.button3);b4=findViewById(R.id.button4);
        b5=findViewById(R.id.button5);b6=findViewById(R.id.button6);
        b7=findViewById(R.id.button7);b8=findViewById(R.id.button8);
        b9=findViewById(R.id.button9);b0=findViewById(R.id.button0);
        badd=findViewById(R.id.buttonadd);bdec=findViewById(R.id.buttondec);
        bequal=findViewById(R.id.buttonequal);bsub=findViewById(R.id.buttonsub);
        bmul=findViewById(R.id.buttonmul);bdiv=findViewById(R.id.buttondiv);

        bequal.setOnClickListener(this);b2.setOnClickListener(this);
        b1.setOnClickListener(this);b4.setOnClickListener(this);
        b3.setOnClickListener(this);b6.setOnClickListener(this);
        b5.setOnClickListener(this);b8.setOnClickListener(this);
        b7.setOnClickListener(this);b0.setOnClickListener(this);
        b9.setOnClickListener(this);bdec.setOnClickListener(this);
        badd.setOnClickListener(this);bsub.setOnClickListener(this);
        bmul.setOnClickListener(this);bdiv.setOnClickListener(this);
    }
    int k=0;
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.buttonadd:
                k=1;
                return;

            case R.id.buttonsub:
                k=1;
                return;
            case R.id.buttonmul:
                k=1;
                return;
            case R.id.buttondiv:
                k=1;
                return;
            case R.id.buttonequal:
                int ans=Integer.parseInt(editText1.getText().toString())+Integer.parseInt(editText2.getText().toString());
                textView.setText(Integer.toString(ans));
                return;

        }
            if(k==1){
                    Button b1 = (Button)v;
                    editText2.setText(editText2.getText().toString()+b1.getText().toString());
            }
            else {
                Button b1 = (Button) v;
                editText1.setText(editText1.getText().toString() + b1.getText().toString());
            }



    }
}