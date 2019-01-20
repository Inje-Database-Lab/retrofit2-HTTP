package com.seok.seok.myapplication;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;


public interface RetrofitInterface {

    @GET("file.json")
    public Call<List<ApiObject>> getAllPost();

}