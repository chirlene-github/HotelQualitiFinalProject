package com.example.hotelqualitifinalproject.adapter;

import android.content.Context;
import android.content.Intent;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.hotelqualitifinalproject.DetailsActivity;
import com.example.hotelqualitifinalproject.R;
import com.example.hotelqualitifinalproject.model.RecentHotelsData;
import java.util.List;

public class RecentHotelsAdapter extends RecyclerView.Adapter<RecentHotelsAdapter.RecentsViewHolder> {

    Context context;

    public RecentHotelsAdapter(Context context, List<RecentHotelsData> recentHotelsDataList) {
        this.context = context;
        this.recentHotelsDataList = recentHotelsDataList;
    }

    List<RecentHotelsData> recentHotelsDataList;

    @NonNull
    @Override
    public RecentsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.recents_row_item, parent, false);

        //recyclerview
        return new RecentsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecentsViewHolder holder, int position) {

        holder.nomeHotel.setText(recentHotelsDataList.get(position).getNomeHotel());
        holder.cidadeHotel.setText(recentHotelsDataList.get(position).getCidadeHotel());
        holder.precoDesde.setText(recentHotelsDataList.get(position).getPrecoDesde());
        holder.placeImage.setImageResource(recentHotelsDataList.get(position).getImageUrl());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(context, DetailsActivity.class);
                i.putExtra("identificadorHotel", recentHotelsDataList.get(position));
                context.startActivity(i);
            }
        });
    }

    @Override
    public int getItemCount() {
        return recentHotelsDataList.size();
    }


    public static final class RecentsViewHolder extends RecyclerView.ViewHolder{

        ImageView placeImage;
        TextView nomeHotel, cidadeHotel, precoDesde;

        public RecentsViewHolder(@NonNull View itemView) {
            super(itemView);

            placeImage = itemView.findViewById(R.id.place_image);
            nomeHotel = itemView.findViewById(R.id.nome_hotel);
            cidadeHotel = itemView.findViewById(R.id.cidade_hotel);
            precoDesde = itemView.findViewById(R.id.preco_desde);
        }
    }
}
