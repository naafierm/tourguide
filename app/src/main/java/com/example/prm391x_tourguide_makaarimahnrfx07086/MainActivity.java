package com.example.prm391x_tourguide_makaarimahnrfx07086;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends FragmentActivity {
    MainFragmanet mainFragmanet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainFragmanet = new MainFragmanet();
        FragmentTransaction ft = getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, mainFragmanet);
        ft.commit();


    }

    @Override
    public void onBackPressed() {
        if(mainFragmanet != null && mainFragmanet.isVisible()){
            finish();
        }else{
            mainFragmanet = new MainFragmanet();
            FragmentTransaction ft = getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, mainFragmanet);
            ft.commit();
        }
    }
}