package com.example.counterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    Button inc , dec , res;
    int counter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView =(TextView) findViewById(R.id.textView);
        inc = (Button) findViewById(R.id.button3);
        dec = (Button) findViewById(R.id.button2);
        res = (Button) findViewById(R.id.button);
        inc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter ++;
                textView.setText(Integer.toString(counter));

            }
        });
        dec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter --;
                textView.setText(Integer.toString(counter));

            }
        });
        res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter =0;
                textView.setText(Integer.toString(counter));

            }
        });
    }
}