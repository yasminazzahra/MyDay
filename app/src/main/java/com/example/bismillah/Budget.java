package com.example.bismillah;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Budget extends AppCompatActivity {

    EditText hari, budget;
    Button kali, bersihkan;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_budget);

        hari = (EditText) findViewById(R.id.hari);
        budget = (EditText) findViewById(R.id.budget);

     
        kali = (Button)findViewById(R.id.kali);
        bersihkan = (Button) findViewById(R.id.bersihkan);
        hasil = findViewById(R.id.textView1);

        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((hari.getText().length()>0) && (budget.getText().length()>0))
                {
                    double angka1 = Double.parseDouble(hari.getText().toString());
                    double angka2 = Double.parseDouble(budget.getText().toString());
                    double result = angka1 * angka2;
                    hasil.setText(Double.toString(result));
                }
                else {
                    Toast toast = Toast.makeText(Budget.this, "Mohon Masukkan Hari", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        bersihkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hari.setText("");
                hasil.setText("0");
                hari.requestFocus();
            }
        });
    }
}