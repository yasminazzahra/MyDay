package com.example.bismillah;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Budget adalah kelas untuk menentukan berapa jumlah hari dan akan dilakukan operasi aritmatika
 * Terdapat text yang dapat diinputkan yaitu hari dan budget
 * Terdapat button yang digunakan untuk menjalankan program aritmatikan dan menghapus
 * Terdapat textview yang akan menampilkan hasil
 *
 * @author Kelompok A2
 */
public class Budget extends AppCompatActivity {


    /**
     * Deklarisasi EditText, Button dan TextView
     */
    EditText hari, budget;
    Button kali, bersihkan;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_budget);

        /**
         * Pendefinisian edittext untuk hari dan budget
         * @param hari untuk memasukkan jumlah hari
         * @param budget untuk memasukkan jumlah budget
         */
        hari = (EditText) findViewById(R.id.hari);
        budget = (EditText) findViewById(R.id.budget);

        /**
         * Pendefinisian button untuk kali dan bersihkan
         * @param kali untuk melakukan operasi aritmatika dari hari dan budget
         * @param bersihkan untuk menghapus hari dan budget
         */
        kali = (Button)findViewById(R.id.kali);
        bersihkan = (Button) findViewById(R.id.bersihkan);

        /**
         * Pendefinisian textview untuk hasil dari operasi aritmatika hari dan budget
         * @return <code>true</code> kalo udah loaded maka akan muncul hasil
         */
        hasil = findViewById(R.id.textView1);

        /**
         * Untuk mengatifkan button kali
         * @param view untuk menampilkan hasil setelah tombol ditekan
         */
        kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /**
                 * Method ini untuk memberikan kondisi saat tombol ditekan
                 * @see #create (double, double)
                 * @see Component#getText(hari)
                 * @see Component#getText(budget)
                 * @param angka1 untuk deklarasi hari dan dikonversi ke double
                 * @param angka2 untuk deklarasi bugdet dan dikonversi ke double
                 * @param result untuk pengoprasian aritmatika
                 * @return hasil dari aritmatika angka1*angka2
                 */
                if((hari.getText().length()>0) && (budget.getText().length()>0))
                {
                    /**
                     * Mendapatkan teks dari EditText lalu dikonversi ke integers
                     */
                    double angka1 = Double.parseDouble(hari.getText().toString());
                    double angka2 = Double.parseDouble(budget.getText().toString());
                    /**
                     * Untuk metode aritmatika
                     */
                    double result = angka1 * angka2;
                    /**
                     * Untuk mendapatkan hasil dari result
                     */
                    hasil.setText(Double.toString(result));
                }
                /**
                 * Untuk kondisi lain apabila kondisi if tidak sesuai
                 */
                else {
                    /**
                     * Memberikan warning apabila ada yang belum terpenuhi atau diisi
                     */
                    Toast toast = Toast.makeText(Budget.this, "Mohon Masukkan Hari", Toast.LENGTH_LONG);
                    /**
                     * Menampilkan toast atau popup warning
                     */
                    toast.show();
                }
            }
        });

        /**
         * Method ini digunakan untuk menghapus hari dan hasil
         * @see Component#setText(hari)
         * @see Component#setText(hasil)
         * @return maka akan terhapus data pada hari dan hasil
         */
        bersihkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /**
                 * Untuk mendapatkan hasil dan hari terhapus
                 */
                hari.setText("");
                hasil.setText("0");
                hari.requestFocus();
            }
        });
    }
}