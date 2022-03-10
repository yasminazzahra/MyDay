package com.example.bismillah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;
import android.view.MotionEvent;
import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * PaketLiburan adalah Class untuk menampilkan paket liburan apa saja yang ada
 * terdapat juga operasi aritmatika didalamnya
 */
public class PaketLiburan extends AppCompatActivity {
    /**
     * @param btnCount tombol untuk melakukan operasi aritmatika
     */
    Button btnCount;

    /**
     * Method ini untuk menginisialisasi button
     * @param savedInstanceState untuk memulai ulang saat penghentian sistem
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paket_liburan);
        /**
         * @param btnCount untuk mengaktifkan button hitung
         */
        btnCount = findViewById(R.id.btncount);
        /**
         * Untuk Mengatifkan Button Count, dengan metode menyentuh lama
         */
        btnCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /**
                 * Intent Explicit , digunakan untuk pindah dari MainActivity ke Kelas Budget
                 */
                Intent intent = new Intent(PaketLiburan.this, Budget.class);
                /**
                 * Untuk menjalankan activity
                 */
                startActivity(intent);
            }
        });
        /**
         * Membuat List View didalam  list
         */
        final ListView list = findViewById(R.id.list);
        /**
         * Inisialiasi ArrayList
         */
        ArrayList<String> arrayList = new ArrayList<>();
        /**
         * Menambah Array list
         */
        arrayList.add("KOREAN: " + "Rp.250.000/Night");
        arrayList.add("JAPAN: " + "Rp.300.000/Night");
        arrayList.add("BALI INDONESIA: " + "Rp.150.000/Night");
        arrayList.add("LABUAN BAJO INDONESIA: " + "Rp.275.000/Night");
        arrayList.add("LOMBOK INDONESIA: " + "Rp.100.000/Night");
        /**
         * Inisialisasi Array Adapter
         */
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayList);
        /**
         * Menset arrayadapter
         */
        list.setAdapter(arrayAdapter);
        /**
         * Menset apabila menekan list maka akan keluar popup
         */
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                /**
                 * Menset item yang diklik
                 */
                String clickedItem=(String) list.getItemAtPosition(position);
                /**
                 * Untuk set popup nya
                 */
                Toast.makeText(PaketLiburan.this,clickedItem,Toast.LENGTH_LONG).show();
            }
        });
    }
}