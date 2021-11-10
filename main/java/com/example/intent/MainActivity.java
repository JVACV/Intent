package com.example.intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
   Button btn1;
   EditText et1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1=(Button) findViewById(R.id.btna);
        et1=(EditText) findViewById(R.id.eta);
        btn1.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View view) {
           String x=et1.getText().toString();

           Intent i=new Intent(MainActivity.this,SecondActivity.class);
           i.putExtra("Num1",x);
           startActivity(i);
       }
   });
    }
}
