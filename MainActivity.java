package com.example.gisnusadua;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ImageView map, profile, tentang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        map= findViewById(R.id.btnmap);
        profile= findViewById(R.id.btnprofile);
        tentang= findViewById(R.id.btntentang);

        map.setOnClickListener(this);
        profile.setOnClickListener(this);
        tentang.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnmap:
                Intent pindahpeta = new Intent(MainActivity.this,MapsActivity.class);
                startActivity(pindahpeta);
                break;
            case R.id.btnprofile:
                Intent data = new Intent(MainActivity.this,ProfileActivity.class);
                startActivity(data);
                break;
            case R.id.btntentang:
                Intent isi = new Intent(MainActivity.this, TentangActivity.class);
                startActivity(isi);
                break;
        }
    }
}