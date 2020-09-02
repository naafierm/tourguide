package com.example.prm391x_tourguide_makaarimahnrfx07086;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MainFragmanet#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MainFragmanet extends Fragment {
    ImageView btnatm, btngas, btnhosp, btnhotel;
    atmFragment imageatm;
    gasFragment imagegas;
    hospFragment imagehosp;
    hotelFragment imagehotel;
    public MainFragmanet() {
        // Required empty public constructor
    }

    public static MainFragmanet newInstance() {
        MainFragmanet fragment = new MainFragmanet();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
      View view =  inflater.inflate(R.layout.fragment_main_fragmanet, container, false);

        btnatm = view.findViewById(R.id.btnatm);
        btngas = view.findViewById(R.id.btngas);
        btnhosp = view.findViewById(R.id.btnhosp);
        btnhotel = view.findViewById(R.id.btnhotel);

        btnatm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                matm();
            }
        });
        btngas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mgas();
            }
        });
        btnhosp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mhosp();
            }
        });
        btnhotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mhotel();
            }
        });

        return view;
    }

    void matm(){
        imageatm = new atmFragment();
        FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, imageatm);
        ft.commit();
    }
    void mgas(){
        imagegas = new gasFragment();
        FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, imagegas);
        ft.commit();
    }
    void mhosp(){
        imagehosp = new hospFragment();
        FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, imagehosp);
        ft.commit();
    }
    void mhotel(){
        imagehotel = new hotelFragment();
        FragmentTransaction ft = getActivity().getSupportFragmentManager().beginTransaction()
                .replace(R.id.container, imagehotel);
        ft.commit();
    }

}