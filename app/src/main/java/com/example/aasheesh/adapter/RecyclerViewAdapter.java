package com.example.aasheesh.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.aasheesh.OnLoadMoreListener;
import com.example.aasheesh.R;
import com.example.aasheesh.model.Datum;
import com.example.aasheesh.viewholder.RecyclerViewHolder;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {
    private final int VIEW_ITEM = 1;
    private final int VIEW_PROG = 0;
    List<Datum> datalist;
    private Context context;
    private int visibleThreshold = 5;
    private int lastVisibleItem, totalItemCount;
    private boolean loading;
    private OnLoadMoreListener onLoadMoreListener;

    public RecyclerViewAdapter(List<Datum> data, Context context, RecyclerView recyclerView) {
        this.datalist = data;
        this.context = context;
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, null);
        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(view);
        return recyclerViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        holder.name.setText(datalist.get(position).getName());
        if(datalist.get(position).getRating()!=0)
        holder.rating.setText(datalist.get(position).getRating() + "");
        if(datalist.get(position).getReturns().getOneYear()!=0)
        holder.textreturns.setText(datalist.get(position).getReturns().getOneYear() + "%");
        holder.textAum.setText(datalist.get(position).getAum()  + "Cr");
        holder.textExpense.setText(datalist.get(position).getExpenseRatio() + "%");
    }

    @Override
    public int getItemCount() {
        return this.datalist.size();
    }
}