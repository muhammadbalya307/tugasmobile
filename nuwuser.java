package com.example.praktikummobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class nuwuser extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nuwuser);
    }
    public void Konfirmasi(View view) {
        Intent intent = new Intent(this, home.class);
        startActivity(intent);
    }
}
