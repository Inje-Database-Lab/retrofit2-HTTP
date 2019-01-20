package com.seok.seok.myapplication;

public class ApiUtil {
    private static final String BASE_URL = "http://203.241.228.121/";

    public static RetrofitInterface getServiceClass(){
        return RetrofitAPI.getRetrofit(BASE_URL).create(RetrofitInterface.class);
    }
}
