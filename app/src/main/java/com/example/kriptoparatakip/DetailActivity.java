package com.example.kriptoparatakip;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.kriptoparatakip.model.Coins;

public class DetailActivity extends AppCompatActivity {
    public Coins coin;

    public ImageView backButton;
    public WebView coinIcon;
    public TextView coinSymbol, coinName, coinPrice, coinDescription;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        try{
            coin= (Coins) getIntent().getSerializableExtra("Coin");
        }catch(Exception exception){
            Toast.makeText(this, "Hata", Toast.LENGTH_SHORT);
            onBackPressed();
        }

        getViews();
        setViews();
    }

    private void getViews(){
        backButton=(ImageView)findViewById(R.id.backButton);
        coinIcon=(WebView)findViewById(R.id.coinIcon);
        coinIcon.setInitialScale(1);
        coinIcon.getSettings().setLoadWithOverviewMode(true);
        coinIcon.getSettings().setUseWideViewPort(true);

        coinSymbol=(TextView)findViewById(R.id.coinSymbol);
        coinName=(TextView)findViewById(R.id.coinName);
        coinPrice=(TextView)findViewById(R.id.coinPrice);
        coinDescription=(TextView)findViewById(R.id.coinDescription);
    }

    private void setViews(){
        backButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        coinIcon.loadUrl(coin.getIconUrl());
        coinSymbol.setText(coin.getSymbol());
        coinName.setText(coin.getName());
        coinPrice.setText(coin.getPrice());
        coinDescription.setText(coin.getDescription());
    }

    private int getScale(){
        Display display = ((WindowManager) getSystemService(Context.WINDOW_SERVICE)).getDefaultDisplay();
        int width = display.getWidth();
        Double val = new Double(width)/new Double(100);
        val = val * 100d;
        return val.intValue();
    }
}
