package com.example.bismillah;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Budget extends AppCompatActivity {
    //Deklarisasi EditText, Button dan TextView
    EditText hari, budget;
    Button kali, bersihkan;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_budget);

        //Pendefinisian EditText
        hari = (EditText) findViewById(R.id.hari);
        budget = (EditText) findViewById(R.id.budget);

        //Pendefinisan Button
        kali = (Button)findViewById(R.id.kali);
        bersihkan = (Button) findViewById(R.id.bersihkan);

        //Pendefinisan TextView
        hasil = findViewById(R.id.textView1);

        //Untuk Mengatifkan Button Count, dengan metode menyentuh lama
        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Memberikan Kondisi
                if((hari.getText().length()>0) && (budget.getText().length()>0))
                {
                    //Mendapatkan teks dari EditText lalu dikonversi ke integers
                    double angka1 = Double.parseDouble(hari.getText().toString());
                    double angka2 = Double.parseDouble(budget.getText().toString());
                    //Untuk kalkulasi
                    double result = angka1 * angka2;
                    //Atur nilai untuk diTextView
                    hasil.setText(Double.toString(result));
                }
                else {
                    //Memberikan Popup kecil
                    Toast toast = Toast.makeText(Budget.this, "Mohon Masukkan Hari", Toast.LENGTH_LONG);
                    //Menampilkan Toast
                    toast.show();
                }
            }
        });

        //Untuk mengaktifkan Clean Button, dengan metode menyentuh lama
        bersihkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //menSet hari dan hasil agar kosong
                hari.setText("");
                hasil.setText("0");
                hari.requestFocus();
            }
        });
    }
}