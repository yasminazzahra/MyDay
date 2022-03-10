package com.example.bismillah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * MainActivity adalah class untuk mainpage
 */
public class MainActivity extends AppCompatActivity {
    /**
     * deklarasi tombol yang akan digunakan yaitu Viewbtn, Countbtn, Closebtn
     */
    Button Viewbtn ,Countbtn, Closebtn;

    /**
     * method ini untuk menginisialisasi button
     * @param savedInstanceState untuk memulai ulang saat penghentian sistem
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /**
         * @param btnlist untuk menyambungkan button ke halaman paket liburan
         * @param btncount untuk menyambungkan button ke halaman budget
         * @param btnclose untuk menutup aplikasi
         */
        Viewbtn = findViewById(R.id.btnlist);
        Countbtn = findViewById(R.id.btncount);
        Closebtn = findViewById(R.id.btnclose);

        /**
         * Method untuk mengaktifkan viewbtn
         */
        Viewbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /**
                 * Intent Explicit, digunakan untuk pindah dari MainActivity ke Kelas PaketLiburan
                 */
                Intent i = new Intent(MainActivity.this, PaketLiburan.class);
                /**
                 * Untuk Menjalankan Activity
                 */
                startActivity(i);
            }
        });

        /**
         * Method untuk mengaktifkan Countbtn, dengan metode menyentuh lama tombol
         */
        Countbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /**
                 * Intent Explicit , digunakan untuk pindah dari MainActivity ke Kelas Budget
                 */
                Intent intent = new Intent(MainActivity.this, Budget.class);
                /**
                 * Untuk Menjalankan Activity
                 */
                startActivity(intent);
            }
        });

        /**
         * Untuk mengaktifkan Closebtn, dengan metode menyentuh lama tombol
         */
        Closebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /**
                 * Clean Exit, status 0 menunjukkan penghentian aplikasi yang berhasil
                 */
                System.exit(0);
            }
        });
    }
}