package com.example.kriptoparatakip;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.model.StreamEncoder;
import com.example.kriptoparatakip.model.Coins;

import java.util.List;

public class CoinAdapter extends RecyclerView.Adapter<CoinHolder>{
    public List<Coins> coinList;

    public CoinAdapter(List<Coins> coinList){
        this.coinList=coinList;
    }

    @NonNull
    @Override
    public CoinHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CoinHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_coin_list, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CoinHolder holder, int position) {
        Coins coin = coinList.get(position);

        holder.coinImage.setInitialScale(1);
        holder.coinImage.getSettings().setLoadWithOverviewMode(true);
        holder.coinImage.getSettings().setUseWideViewPort(true);
        holder.coinImage.loadUrl(coin.getIconUrl());

        holder.coinName.setText(coin.getSymbol());
        holder.coinPrice.setText(coin.getPrice());

        if(coin.getColor()!=null){
            if(coin.getColor().length()==4){
                StringBuilder stringBuilder=new StringBuilder();
                stringBuilder.append("#");
                for(int index=1;index<coin.getColor().length();index++){
                    stringBuilder.append(coin.getColor().charAt(index));
                    stringBuilder.append(coin.getColor().charAt(index));
                }
                coin.setColor(stringBuilder.toString());
            }
            holder.coinName.setTextColor(Color.parseColor(coin.getColor()));
            holder.coinPrice.setTextColor(Color.parseColor(coin.getColor()));
        }

        holder.coinRoot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                holder.coinRoot.getContext().startActivity(
                        new Intent(holder.coinRoot.getContext(), DetailActivity.class).putExtra("Coin",coin));
            }
        });
    }

    @Override
    public int getItemCount() {
        return this.coinList.size();
    }
}
