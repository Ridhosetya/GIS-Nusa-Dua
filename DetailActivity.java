package com.example.gisnusadua;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
TextView tvnama, tvalamat, tvjumlahkeluarga, tvpekerjaan;
public static String nama, alamat, jumlahkeluarga, pekerjaan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        tvnama=findViewById(R.id.txtnama);
        tvalamat=findViewById(R.id.txtalamat);
        tvjumlahkeluarga=findViewById(R.id.txtjumlahkeluarga);
        tvpekerjaan=findViewById(R.id.txtpekerjaan);

        tvnama.setText(nama);
        tvalamat.setText(alamat);
        tvjumlahkeluarga.setText(jumlahkeluarga);
        tvpekerjaan.setText(pekerjaan);
    }
}