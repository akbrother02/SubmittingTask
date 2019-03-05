package com.example.aasheesh.network;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiServices {

    public static Retrofit retrofit=null;
    public static String Base_Url="https://dev.indiawealth.in/";
//    https://dev.indiawealth.in/api/v2/funds/getList/?limit=16&offset=0
    public static Retrofit getClient()
    {
        if(retrofit==null)
        {
            retrofit=new Retrofit.Builder()
                    .baseUrl(Base_Url)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}