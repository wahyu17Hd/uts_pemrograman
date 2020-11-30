package com.example.organtubuh;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

import com.example.organtubuh.model.Organ;


public class GaleriActivity extends AppCompatActivity {

    List<Organ> organs;
    int indeksTampil = 0;
    String jenisOrgan;
    Button btnPertama,btnTerakhir,btnSebelumnya,btnBerikutnya;
    TextView txLetak,txDeskripsi,txJudul,txNama;
    ImageView ivFotoOrgan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activiry_profile_nama);
        Intent intent = getIntent();
        jenisOrgan= intent.getStringExtra(MainActivity.JENIS_GALERI_KEY);
        organs = DataProvider.getOrgansByTipe(this, jenisOrgan);
        inisialisasiView();
        tampilkanProfil();
    }

    private void inisialisasiView() {
        btnPertama = findViewById(R.id.btnPertama);
        btnSebelumnya = findViewById(R.id.btnSebelumnya);
        btnBerikutnya = findViewById(R.id.btnBerikutnya);
        btnTerakhir = findViewById(R.id.btnTerakhir);

        btnPertama.setOnClickListener(view -> organPertama());
        btnTerakhir.setOnClickListener(view -> organTerakhir());
        btnSebelumnya.setOnClickListener(view -> organSebelumnya());
        btnBerikutnya.setOnClickListener(view -> organBerikutnya());

        txNama = findViewById(R.id.txNama);
        txLetak = findViewById(R.id.txLetak);
        txDeskripsi = findViewById(R.id.txDeskripsi);
        ivFotoOrgan = findViewById(R.id.gambarOrgan);

        txJudul = findViewById(R.id.txJudul);
        txJudul.setText("Berbagai Macam Nama "+jenisOrgan);
    }

    private void tampilkanProfil() {
        Organ p = organs.get(indeksTampil);
        Log.d("Pencernaan","Menampilkan pencernaan"+p.getJenis());
        txLetak.setText(p.getLetak());
        txNama.setText(p.getNama());
        txDeskripsi.setText(p.getDeskripsi());
        ivFotoOrgan.setImageDrawable(this.getDrawable(p.getDrawableRes()));
    }

    private void organPertama() {
        int posAwal = 0;
        if (indeksTampil == posAwal) {
            Toast.makeText(this,"Sudah di posisi pertama",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil = posAwal;
            tampilkanProfil();
        }
    }

    private void organTerakhir() {
        int posAkhir = organs.size() - 1;
        if (indeksTampil == posAkhir) {
            Toast.makeText(this,"Sudah di posisi_terakhir",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil = posAkhir;
            tampilkanProfil();
        }
    }

    private void organBerikutnya() {
        if (indeksTampil == organs.size() - 1) {
            Toast.makeText(this,"Sudah di posisi terakhir",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil++;
            tampilkanProfil();
        }
    }

    private void organSebelumnya() {
        if (indeksTampil == 0) {
            Toast.makeText(this,"Sudah di posisi pertama",Toast.LENGTH_SHORT).show();
            return;
        } else {
            indeksTampil--;
            tampilkanProfil();
        }
    }
}