package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {
       EditText et2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        et2=(EditText) findViewById(R.id.et2);
        Intent intent=getIntent();
        String y= intent.getStringExtra("Num1");
        et2.setText(y);
//        Toast.makeText(getApplicationContext(),"Hello Javatpoint",Toast.LENGTH_SHORT).show();
    }
}
