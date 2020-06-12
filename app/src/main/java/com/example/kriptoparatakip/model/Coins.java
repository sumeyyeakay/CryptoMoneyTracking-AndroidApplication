package com.example.kriptoparatakip.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public class Coins implements Serializable {
    @SerializedName("id") @Expose private Long id;
    @SerializedName("symbol") @Expose private String symbol;
    @SerializedName("name") @Expose private String name;
    @SerializedName("description") @Expose private String description;
    @SerializedName("color") @Expose private String color;
    @SerializedName("iconUrl") @Expose private String iconUrl;
    @SerializedName("price") @Expose private String price;

    public Coins(Long id, String symbol, String name, String description, String color, String iconUrl, String price) {
        this.id = id;
        this.symbol = symbol;
        this.name = name;
        this.description = description;
        this.color = color;
        this.iconUrl = iconUrl;
        this.price=price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getIconUrl() {
        return iconUrl;
    }

    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public String getPrice() {
        double priceDouble=Double.parseDouble(price);
        return String.format("%.2f",priceDouble);
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
