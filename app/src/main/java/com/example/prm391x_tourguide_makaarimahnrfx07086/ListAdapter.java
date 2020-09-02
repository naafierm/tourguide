package com.example.prm391x_tourguide_makaarimahnrfx07086;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class ListAdapter  extends ArrayAdapter<GeneralDataModel> implements View.OnClickListener{

    // INi Global variabel
    private ArrayList<GeneralDataModel> dataSet;
    Context mContext;

    /**
     * Disini constructor si adapter
     * @param data berisi data yang akan ditampilkan
     * @param context buat jaga jga
     */
    public ListAdapter( ArrayList<GeneralDataModel> data, Context context){
        super(context, R.layout.general_item,data);
        this.dataSet = data;
        this.mContext = context;
    }

    // Pake alt+insert terus pilih override trs cari getItem
    // Get View akan ditampilkan pada setiap item
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        // Ini ngambil data sesuai dengan posisi
        GeneralDataModel hotel = dataSet.get(position);
        // Nah ini yang menentukan mau pakai tampilan apa
        ViewHolder viewHolder;
        final View result;
        if(hotel != null){
            if(convertView == null){
                // bikin view holder baru
                viewHolder = new ViewHolder();

                // INI YANG PENTING, ini dia memilih layout mana yang akan di pakai
                LayoutInflater inflater = LayoutInflater.from(getContext());
                convertView = inflater.inflate(R.layout.general_item, parent, false);

                // Terus ini mencari mana view yang bersangkutan
                viewHolder.nama = convertView.findViewById(R.id.card_item_nama);
                viewHolder.alamat = convertView.findViewById(R.id.card_item_alamat);


                result = convertView;
                convertView.setTag(viewHolder);
            } else {
                viewHolder = (ViewHolder) convertView.getTag();
                result=convertView;
            }

            // Ini nge set Tampilan nya
            viewHolder.nama.setText(hotel.getNama());
            viewHolder.alamat.setText(hotel.getAlamat());
        }

        // NAh semua setting tadi di return disini, di tampilkan
        return convertView;
    }

    @Override
    public void onClick(View view) {

    }

    // ini berisi kayak holder, jadi nanti ada text view, ada image view, dll di tampung disini
    // ini isinya harus sesuai sama yang ada di layout nya
    private static class ViewHolder{
        TextView nama;
        TextView alamat;
    }
}
