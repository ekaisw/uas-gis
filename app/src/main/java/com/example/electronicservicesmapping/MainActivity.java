package com.example.electronicservicesmapping;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void maps1(View v) {
        Intent pindahpeta = new Intent(MainActivity.this, MapsActivityPc.class);
        startActivity(pindahpeta);
    }

    public void maps2(View v) {
        Intent pindahpeta2 = new Intent(MainActivity.this, MapsActivityPhone.class);
        startActivity(pindahpeta2);
    }

    public void maps3(View v) {
        Intent pindahpeta3 = new Intent(MainActivity.this, MapsActivityCamera.class);
        startActivity(pindahpeta3);
    }
}
