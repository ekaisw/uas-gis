package com.example.electronicservicesmapping;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class DetailActivity extends AppCompatActivity {

    TextView datanamatempat,datajambuka,datajamtutup,datatelepon;
    Button btnpanggil;
    ImageView datagambar;
    public static String id,nama,jam_buka,jam_tutup,telpn,gambar;
    public static Double latitude,longitude;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        datanamatempat = findViewById(R.id.isi_namaTview);
        datajambuka = findViewById(R.id.isi_jambukaTview);
        datajamtutup = findViewById(R.id.isi_jamtutupTview);
        datatelepon = findViewById(R.id.isi_telpnTview);
        btnpanggil = findViewById(R.id.btn_panggil);
        datagambar = findViewById(R.id.gambarIMGview);

        datanamatempat.setText(nama);
        datajambuka.setText(jam_buka);
        datajamtutup.setText(jam_tutup);
        datatelepon.setText(telpn);
        Picasso.get().load(gambar).into(datagambar);
    }
}
