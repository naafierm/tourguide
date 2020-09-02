package com.example.prm391x_tourguide_makaarimahnrfx07086;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class hotelFragment extends Fragment {
    ListView hotelList;
    ArrayList<GeneralDataModel> hotels = new ArrayList<>();

    public hotelFragment() {
        // Required empty public constructor
    }

    public static hotelFragment newInstance() {
        hotelFragment fragment = new hotelFragment();

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
        View view = inflater.inflate(R.layout.fragment_hotel, container, false);
        hotelList = view.findViewById(R.id.fragment_hotel_list);
        initData();

        ListAdapter adapter = new ListAdapter(hotels, getActivity());

        hotelList.setAdapter(adapter);

        hotelList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getActivity(), hotels.get(i).getNama(),Toast.LENGTH_SHORT).show();
            }
        });

        return view;
    }

    void initData(){
        hotels.add(new GeneralDataModel("Melia Purosani","Jl. Mataram"));
        hotels.add(new GeneralDataModel("Gramd Quality","Jl. Solo"));
        hotels.add(new GeneralDataModel("Melia Purosani","Jl. Mataram"));
        hotels.add(new GeneralDataModel("Melia Purosani","Jl. Mataram"));
        hotels.add(new GeneralDataModel("Melia Purosani","Jl. Mataram"));
    }
}