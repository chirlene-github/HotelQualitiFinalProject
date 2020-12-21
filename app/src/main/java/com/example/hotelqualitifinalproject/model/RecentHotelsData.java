package com.example.hotelqualitifinalproject.model;

import androidx.annotation.IntegerRes;

import java.io.Serializable;

public class RecentHotelsData implements Serializable {
    //PESQUISAR!

    String nomeHotel;
    String cidadeHotel;
    String precoDesde;
    Integer imageUrl;

    public Integer getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(Integer imageUrl) {
        this.imageUrl = imageUrl;
    }

    public RecentHotelsData(String nomeHotel, String cidadeHotel, String precoDesde, Integer imageUrl) {
        this.nomeHotel = nomeHotel;
        this.cidadeHotel = cidadeHotel;
        this.precoDesde = precoDesde;
        this.imageUrl = imageUrl;
    }

    public String getNomeHotel() {
        return nomeHotel;
    }
    public void setNomeHotel(String nomeHotel) {
        this.nomeHotel = nomeHotel;
    }
    public String getCidadeHotel() {
        return cidadeHotel;
    }
    public void setCidadeHotel(String cidadeHotel) {
        this.cidadeHotel = cidadeHotel;
    }
    public String getPrecoDesde() {
        return precoDesde;
    }
    public void setPrecoDesde(String precoDesde) {
        this.precoDesde = precoDesde;
    }
}
