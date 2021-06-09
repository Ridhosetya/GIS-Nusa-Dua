package com.example.gisnusadua;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class TentangActivity extends AppCompatActivity {
ImageView elvi, tina, ridho;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tentang);

        elvi=findViewById(R.id.imgelvi);
        tina=findViewById(R.id.imgtina);
        ridho=findViewById(R.id.imgridho);

    }
}