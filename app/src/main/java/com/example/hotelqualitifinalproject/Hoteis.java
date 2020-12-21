package com.example.hotelqualitifinalproject;

import java.util.Date;

public class Hoteis {

    private String nameHotel;
    private String dateCheckIn;
    private String dateCheckOut;
    private Double totalStay;
    private Integer imageView7;

    public Hoteis() {
    }

    public String getNameHotel() {
        return nameHotel;
    }

    public void setNameHotel(String nameHotel) {
        this.nameHotel = nameHotel;
    }

    public String getDateCheckIn() {
        return dateCheckIn;
    }

    public void setDateCheckIn(String dateCheckIn) {
        this.dateCheckIn = dateCheckIn;
    }

    public String getDateCheckOut() {
        return dateCheckOut;
    }

    public void setDateCheckOut(String dateCheckOut) {
        this.dateCheckOut = dateCheckOut;
    }

    public Double getTotalStay() {
        return totalStay;
    }

    public void setTotalStay(Double totalStay) {
        this.totalStay = totalStay;
    }

    public Integer getImageView7() {
        return imageView7;
    }

    public void setImageView7(Integer imageView7) {
        this.imageView7 = imageView7;
    }

    public Hoteis(String nameHotel, String dateCheckIn, String dateCheckOut, Double totalStay, Integer imageView7) {
        this.nameHotel = nameHotel;
        this.dateCheckIn = dateCheckIn;
        this.dateCheckOut = dateCheckOut;
        this.totalStay = totalStay;
        this.imageView7 = imageView7;

    }

    @Override
    public String toString(){
        return nameHotel;
    }


}

