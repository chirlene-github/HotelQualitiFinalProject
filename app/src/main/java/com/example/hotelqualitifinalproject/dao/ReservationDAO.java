package com.example.hotelqualitifinalproject.dao;

import androidx.room.Dao;
import androidx.room.Query;
import androidx.room.Insert;

import com.example.hotelqualitifinalproject.ReservationScreenTwo;

public interface ReservationDAO {

    @Query("SELECT * FROM activity_reservation_screen_two")
    public List<ReservationScreenTwo> getAll();

        public void insertAll(List<ReservationScreenTwo> reservationScreenTwoList);

}
