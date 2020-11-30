package com.example.organtubuh;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btnPernapasan,btnPencernaan,btnPeredarandarah;
    public static final String JENIS_GALERI_KEY = "JENIS_GALERI";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();

    }

    private void inisialisasiView() {
        btnPernapasan= findViewById(R.id.btn_buka_nama_pernapasan);
        btnPencernaan= findViewById(R.id.btn_buka_nama_pencernaan);
        btnPeredarandarah = findViewById(R.id.btn_buka_nama_peredarandarah);
        btnPernapasan.setOnClickListener(view -> bukaGaleri("Pernapasan"));
        btnPencernaan.setOnClickListener(view -> bukaGaleri("Pencernaan"));
        btnPeredarandarah.setOnClickListener(view -> bukaGaleri("Peredarandarah"));
    }

    private void bukaGaleri(String jenisOrgan) {
        Log.d("MAIN","Buka activity Pernapasan");
        Intent intent = new Intent(this, GaleriActivity.class);
        intent.putExtra(JENIS_GALERI_KEY, jenisOrgan);
        startActivity(intent);
    }

}