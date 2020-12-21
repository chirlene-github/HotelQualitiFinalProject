package com.example.hotelqualitifinalproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ReservationScreenTwo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservation_screen_two);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    public void goToHotelsList (View view){
        Intent intent = new Intent(this, CheapestHotel.class);
        startActivity(intent);
    }

    //public void clickTemporario (View v) {
    //    Intent intent = new Intent(this, loginpage.class);
    //    startActivity(intent);
    //}
}