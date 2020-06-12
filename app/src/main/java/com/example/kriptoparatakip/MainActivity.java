package com.example.kriptoparatakip;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.kriptoparatakip.model.BaseResponse;

import retrofit2.Call;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getViews();
        getList();
    }

    private void getViews(){
        recyclerView=(RecyclerView)findViewById(R.id.recyclerView);
    }

    private void getList(){
        BaseRetrofit.getRetrofit().create(RestService.class)
                .getInformations().enqueue(new retrofit2.Callback<BaseResponse>(){

            @Override
            public void onResponse(Call<BaseResponse> call, Response<BaseResponse> response) {
                if(response.isSuccessful()){
                    recyclerView.setLayoutManager(new LinearLayoutManager(getBaseContext()));//
                    CoinAdapter coinAdapter=new CoinAdapter(response.body().getData().getCoins());
                    recyclerView.setAdapter(coinAdapter);
                }else{
                    // Hatalar
                }
            }

            @Override
            public void onFailure(Call<BaseResponse> call, Throwable t) {
                // Hatalar
            }
        });
    }
}
