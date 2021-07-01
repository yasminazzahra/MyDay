package com.example.bismillah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button Viewbtn ,Countbtn, Closebtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Viewbtn = findViewById(R.id.btnlist);
        Countbtn = findViewById(R.id.btncount);
        Closebtn = findViewById(R.id.btnclose);

        Viewbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, PaketLiburan.class);
                startActivity(i);
            }
        });

        Countbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Budget.class);
                startActivity(intent);
            }
        });

        Closebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Clean Exit
                System.exit(0);
            }
        });
    }
}