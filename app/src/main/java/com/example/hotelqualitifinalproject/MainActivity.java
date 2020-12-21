package com.example.hotelqualitifinalproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Spinner;
import com.example.hotelqualitifinalproject.adapter.RecentHotelsAdapter;
import com.example.hotelqualitifinalproject.model.RecentHotelsData;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RecursiveAction;

public class MainActivity extends AppCompatActivity {

    RecyclerView recentHotel;
    RecentHotelsAdapter recentHotelsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<RecentHotelsData> recentHotelsDataList = new ArrayList<>();
        recentHotelsDataList.add(new RecentHotelsData("Mar Atlântico", "Tamandaré, PE", "Desde R$50 p/ noite", R.drawable.maratlantico));
        recentHotelsDataList.add(new RecentHotelsData("Jardim Botânico", "Gravatá, PE", "Desde R$60 p/ noite", R.drawable.jardimbotanico));
        recentHotelsDataList.add(new RecentHotelsData("Parque das Flores", "Natal, RN", "Desde R$55 p/ noite", R.drawable.parquedasflores));
        recentHotelsDataList.add(new RecentHotelsData("Qualiti Premium", "Dubai, EAU", "Desde R$100 p/ noite", R.drawable.qualitipremium));

        setRecentHotel(recentHotelsDataList);

        ArrayAdapter<CharSequence> staticAdapter = ArrayAdapter
                .createFromResource(this, R.array.static_spinner,
                        android.R.layout.simple_spinner_item);

    }

        private void setRecentHotel(List<RecentHotelsData> recentHotelsDataList){

            recentHotel = findViewById(R.id.recent_recycler);
            RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
            recentHotel.setLayoutManager(layoutManager);
            recentHotelsAdapter = new RecentHotelsAdapter(this, recentHotelsDataList);
            recentHotel.setAdapter(recentHotelsAdapter);
        }

        public void setDateIn(View view){
            startActivity(new Intent(MainActivity.this, ReservationScreen.class));
    }

    ImageButton imageButton;
    public void profileButton(View view){
    imageButton = (ImageButton) findViewById(R.id.imageButton);
        Intent intent = new Intent(MainActivity.this, EditProfile.class);
        startActivity(intent);

    }




}