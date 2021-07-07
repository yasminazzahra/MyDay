package com.example.bismillah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //Deklarisasi Button
    Button Viewbtn ,Countbtn, Closebtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Pendefinisian Button
        Viewbtn = findViewById(R.id.btnlist);
        Countbtn = findViewById(R.id.btncount);
        Closebtn = findViewById(R.id.btnclose);

        //Untuk mengaktifkan Viewbtn, dengan metode menyentuh lama tombol
        Viewbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent Explicit, digunakan untuk pindah dari MainActivity ke Kelas PaketLiburan
                Intent i = new Intent(MainActivity.this, PaketLiburan.class);
                //Untuk Menjalankan Activity
                startActivity(i);
            }
        });

        //Untuk mengaktifkan Countbtn, dengan metode menyentuh lama tombol
        Countbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Intent Explicit , digunakan untuk pindah dari MainActivity ke Kelas Budget
                Intent intent = new Intent(MainActivity.this, Budget.class);
                //Untuk Menjalankan Activity
                startActivity(intent);
            }
        });

        //Untuk mengaktifkan Closebtn, dengan metode menyentuh lama tombol
        Closebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Clean Exit, status 0 menunjukkan penghentian aplikasi yang berhasil
                System.exit(0);
            }
        });
    }
}