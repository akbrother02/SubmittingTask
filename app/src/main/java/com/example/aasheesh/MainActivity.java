package com.example.aasheesh;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.TextView;

import com.example.aasheesh.adapter.RecyclerViewAdapter;
import com.example.aasheesh.model.Datum;
import com.example.aasheesh.model.Example;
import com.example.aasheesh.network.ApiServices;
import com.example.aasheesh.services.ApiInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    LinearLayoutManager linearLayoutManager;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.textCount);
        getUserData();
    }

    private void getUserData() {

        ApiInterface apiInterface = ApiServices.getClient().create(ApiInterface.class);
        Call<Example> wallpaperCall = apiInterface.getWallpaperList();
        wallpaperCall.enqueue(new Callback<Example>() {
            @Override
            public void onResponse(Call<Example> call, Response<Example> response) {
                List<Datum> datumList = response.body().getData();
                textView.setText("Showing " + response.body().getCount() + " funds");
                for (int i = 0; i < datumList.size(); i++) {
                    linearLayoutManager = new LinearLayoutManager(MainActivity.this);
                    RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerview);
                    recyclerView.setLayoutManager(linearLayoutManager);
                    RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(datumList, MainActivity.this, recyclerView);
                    recyclerView.setAdapter(recyclerViewAdapter);
                }
            }

            @Override
            public void onFailure(Call<Example> call, Throwable t) {
                Log.d("Error", t.toString());

            }
        });

    }
}