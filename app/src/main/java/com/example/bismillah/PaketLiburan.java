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

public class PaketLiburan extends AppCompatActivity {
    Button btnCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paket_liburan);
        btnCount = findViewById(R.id.btncount);
        btnCount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PaketLiburan.this, Budget.class);
                startActivity(intent);
            }
        });
        final ListView list = findViewById(R.id.list);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("KOREAN: " + "Rp.250.000/Night");
        arrayList.add("JAPAN: " + "Rp.300.000/Night");
        arrayList.add("BALI INDONESIA: " + "Rp.150.000/Night");
        arrayList.add("LABUAN BAJO INDONESIA: " + "Rp.275.000/Night");
        arrayList.add("LOMBOK INDONESIA: " + "Rp.100.000/Night");
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayList);
        list.setAdapter(arrayAdapter);
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String clickedItem=(String) list.getItemAtPosition(position);
                Toast.makeText(PaketLiburan.this,clickedItem,Toast.LENGTH_LONG).show();
            }
        });
    }
}