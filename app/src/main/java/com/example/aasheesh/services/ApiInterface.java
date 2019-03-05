package com.example.aasheesh.services;

import com.example.aasheesh.model.Example;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;

public interface ApiInterface {
    @Headers("Authorization: Bearer eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJ1c2VyX2lkIjoxMDI3LCJ1c2VybmFtZSI6Ijk4MTE4ODU5ODkiLCJleHAiOjE1NTE4NjQ5NzAsImVtYWlsIjoia2xzYWRqbGFAYXNkLmFjb20iLCJtb2JpbGUiOiI5ODExODg1OTg5In0.a6PRLi5C04Mygpldi3NYbDAxeRwdDv7s5ZhUxO2zEx0")
    @GET("api/v2/funds/getList/?limit=16&offset=0")
    Call<Example> getWallpaperList();

}