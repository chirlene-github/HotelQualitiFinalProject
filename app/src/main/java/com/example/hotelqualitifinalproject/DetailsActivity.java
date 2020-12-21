package com.example.hotelqualitifinalproject;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.hotelqualitifinalproject.model.RecentHotelsData;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        RecentHotelsData hotel = (RecentHotelsData) getIntent().getSerializableExtra("identificadorHotel");
        TextView tv_title = findViewById(R.id.titlehotel);
        tv_title.setText(hotel.getNomeHotel());

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void telaDeReserva(View view){
        Intent intent = new Intent(this, ReservationScreen.class);
        startActivity(intent);
    }
}