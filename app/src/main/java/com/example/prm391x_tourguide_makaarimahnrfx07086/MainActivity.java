package com.example.prm391x_tourguide_makaarimahnrfx07086;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends FragmentActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView btnatm, btngas, btnhosp, btnhotel;
        atmFragment imageatm;
        gasFragment imagegas;
        hospFragment imagehosp;
        hotelFragment imagehotel;

        btnatm = findViewById(R.id.btnatm);
        btngas = findViewById(R.id.btngas);
        btnhosp = findViewById(R.id.btnhosp);
        btnhotel = findViewById(R.id.btnhotel);

        btnatm.setOnClickListener(this);
        btngas.setOnClickListener(this);
        btnhosp.setOnClickListener(this);
        btnhotel.setOnClickListener(this);
    }

    void matm(){
        imageatm = new atmFragment();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction().replace(R.id.container, imageatm);
        ft.commit();
    }
    void mgas(){
        imagegas = new gasFragment();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction().replace(R.id.container, imagegas);
        ft.commit();
    }
    void mhosp(){
        imagehosp = new gasFragment();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction().replace(R.id.container, imagehosp);
        ft.commit();
    }
    void mhotel(){
        imagehotel = new gasFragment();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction().replace(R.id.container, imagehotel);
        ft.commit();
    }


    public void onClick(View view){
        if (view == btnatm){
            matm();
        }
        if (view == btngas){
            mgas();
        }
        if (view == btnhosp){
            mhosp();
        }
        if (view == btnhotel){
            mhotel();
        }
    }
}