package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

//import static android.R.layout.simple_list_item_1;

public class Intentivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
ListView listView;
ArrayAdapter<String> adapter;
//TextView textView= findViewById(R.id.textView10);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intentivity);
        listView= findViewById(R.id.lister);
        adapter=new ArrayAdapter<>(this, android.R.layout.simple_list_item_1);
        adapter.add("Dial number");
        adapter.add("Save location");
        adapter.add("Open browser");
        adapter.add("Calender");
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(this);

    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
       // String item=adapter.getItem(position);
        //Toast.makeText(this,"You clicked this",Toast.LENGTH_LONG).show();
        switch (position){
            case 0:
                Intent intent=new Intent(Intent.ACTION_DIAL, Uri.parse("tel:1234567890"));
                startActivity(intent);
                break;
            case 1:
                Intent intent1=new Intent(Intent.ACTION_VIEW,Uri.parse("geo:22.5817578,88.333449?"));
                startActivity(intent1);
                break;
            case 2:
                Intent intent2=new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.codeforces.com"));
                startActivity(intent2);
                break;

            default:
                String item=adapter.getItem(position);
                Toast.makeText(this,"You clicked this",Toast.LENGTH_LONG).show();

        }

    }
}