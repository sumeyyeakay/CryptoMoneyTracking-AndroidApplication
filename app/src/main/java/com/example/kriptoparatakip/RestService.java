package com.example.kriptoparatakip;

import com.example.kriptoparatakip.model.BaseResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RestService {

    @GET("/v1/public/coins")
    Call<BaseResponse> getInformations();
}
