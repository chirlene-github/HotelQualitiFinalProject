package com.example.hotelqualitifinalproject;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.TextView;

public class ReservationScreen extends AppCompatActivity {

    CalendarView calendarView1;
    TextView textView6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reservation_screen);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        calendarView1 = (CalendarView) findViewById(R.id.startDate);
        textView6 = (TextView) findViewById(R.id.textView6);

        calendarView1.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int i, int i1, int i2) {
                String date = (i1 + 1) + "/" + i2 + "/" + i;
                textView6.setText(date);
            }
        });
    }
    public void setDateOut (View v){
        startActivity(new Intent(ReservationScreen.this, ReservationScreenTwo.class));
    }
}