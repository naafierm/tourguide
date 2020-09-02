package com.example.prm391x_tourguide_makaarimahnrfx07086;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link atmFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class atmFragment extends Fragment {
    // Pertama init variabel
    ListView atmList;
    ArrayList<GeneralDataModel> atms = new ArrayList<>();

    //Kedua Isi Data
    private void initData(){
        atms.add(new GeneralDataModel("ATM Mandiri", "Jl. Colombo"));
        atms.add(new GeneralDataModel("ATM BCA", "Jl. Gejayan"));
    }

    public atmFragment() {
        // Required empty public constructor
    }


    public static atmFragment newInstance() {
        atmFragment fragment = new atmFragment();

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
       View view = inflater.inflate(R.layout.fragment_atm, container, false);
       // ketiga panggil init data
        initData();
        // Ke empat, init list view
        atmList = view.findViewById(R.id.atm_list);
        ListAdapter adapter = new ListAdapter(atms, getActivity());

        //Ke lima set adapternyaaa
        atmList.setAdapter(adapter);

        //Ke enam, kasi on click kalo perlu
        atmList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(getActivity(), atms.get(i).getNama(), Toast.LENGTH_SHORT).show();
            }
        });
       return view;
    }


}