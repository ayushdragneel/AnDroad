package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Date;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    TextView textView;
    Button button1,button2,button3,button4,button5,button6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=(TextView)findViewById(R.id.textView3);
        button1=(Button)findViewById(R.id.button1);
        button2=(Button)findViewById(R.id.button2);
        button3=(Button)findViewById(R.id.button3);
        button4=(Button)findViewById(R.id.button4);
        button5=(Button)findViewById(R.id.button5);
        button6=(Button)findViewById(R.id.button6);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.button1:
                Toast.makeText(this,"You clickeed nhone",Toast.LENGTH_LONG).show();
                break;
            case R.id.button2:
                textView.setText("You clicked two");
                break;
            case R.id.button3:
                Intent intent=new Intent(MainActivity.this,Intentivity.class);
                startActivity(intent);
                break;
            case R.id.button5:
                Intent calc=new Intent(MainActivity.this,Calculator.class);
                startActivity(calc);
                break;

        }

    }
}