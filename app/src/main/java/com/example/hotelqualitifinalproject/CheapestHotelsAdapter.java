package com.example.hotelqualitifinalproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.Date;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class CheapestHotelsAdapter extends ArrayAdapter<Hoteis> {

    private Context context;
    private ArrayList<Hoteis> hoteisArrayList;
    private int layout;


    public CheapestHotelsAdapter(@NonNull Context context, int layout, ArrayList<Hoteis> hoteisArrayList) {
        super(context, layout, hoteisArrayList);

        this.context = context;
        this.hoteisArrayList = hoteisArrayList;
        this.layout = layout;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View itemView = convertView;
        if (itemView == null) {
            itemView = LayoutInflater.from(context).inflate(R.layout.item_view, parent, false);
        }

        Hoteis hotel = hoteisArrayList.get(position);

        TextView nameHotel = itemView.findViewById(R.id.namehotel);
        nameHotel.setText(String.valueOf(hotel.getNameHotel()));

        TextView dateCheckIn = itemView.findViewById(R.id.dateCheckIn);
        dateCheckIn.setText(String.valueOf(hotel.getDateCheckIn()));

        TextView dateCheckOut = itemView.findViewById(R.id.dateCheckOut);
        dateCheckOut.setText(String.valueOf(hotel.getDateCheckOut()));

        TextView totalStay = itemView.findViewById(R.id.totalStay);
        totalStay.setText(String.valueOf(hotel.getTotalStay()));

        ImageView imageView7 = itemView.findViewById(R.id.imageView7);
        imageView7.setImageResource(hotel.getImageView7());

        //Button button4 = itemView.findViewById(R.id.button4);
        //button4.setOnClickListener(CheapestHotel.this, ReservationScreen.class);

        return itemView;

    }


}
