package com.example.hotelqualitifinalproject.dao;

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.hotelqualitifinalproject.ReservationScreenTwo
import com.example.hotelqualitifinalproject.ReservationScreen

import java.util.List;

@Dao
public interface ReservationTempDAO {



        @Query("SELECT * FROM ReservationTempDAO")
        public List<ReservationDAO> getAll();

        @Query("SELECT * FROM ")
        public List<ReservationScreenTwo> getAllReservationScreenTwo();

        @Insert(onConflict = OnConflictStrategy.REPLACE)
        public void insertAll(List<ReservationScreenTwo>reservationScreenTwo);

        @Insert(onConflict = OnConflictStrategy.REPLACE)
        public void insertProductOrder(ReservationTempDAO reservationTempDAO);

        @Query("DELETE FROM ReservationTempDAO")
        public void deleteAll();

        @Delete
        public void deleteProduct(ReservationTempDAO reservationTempDAO);
    }
}
