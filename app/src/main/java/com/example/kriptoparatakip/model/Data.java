package com.example.kriptoparatakip.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

public class Data implements Serializable {
    @SerializedName("coins") @Expose
    private List<Coins> coins;

    public Data(List<Coins> coins) {
        this.coins = coins;
    }

    public List<Coins> getCoins() {
        return coins;
    }

    public void setCoins(List<Coins> coins) {
        this.coins = coins;
    }
}
