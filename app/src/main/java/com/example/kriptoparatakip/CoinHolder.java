package com.example.kriptoparatakip;

import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class CoinHolder extends RecyclerView.ViewHolder{
    public WebView coinImage;
    public TextView coinName, coinPrice;
    public ConstraintLayout coinRoot;
    public CoinHolder(@NonNull View itemView) {
        super(itemView);
        this.coinImage=(WebView) itemView.findViewById(R.id.coinImage);
        this.coinName=(TextView)itemView.findViewById(R.id.coinName);
        this.coinPrice=(TextView)itemView.findViewById(R.id.coinPrice);
        this.coinRoot=(ConstraintLayout)itemView.findViewById(R.id.coinRoot);
    }
}
