package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity<button> extends AppCompatActivity {
    EditText e2;
    Button b2;
    TextView t2;

    @Override
    protected void onCreate(Bundle savedInstancestate) {

        super.onCreate(savedInstancestate);
        setContentView(R.layout.activity_main);

        e2 = (EditText) findViewById(R.id.e2);
        b2 = (Button) findViewById(R.id.b2);
        t2 = (TextView) findViewById(R.id.t2);

        b2.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String st = e2.getText().toString();
                t2.setText("Hello " + st);
            }
        });
    }} 




    


