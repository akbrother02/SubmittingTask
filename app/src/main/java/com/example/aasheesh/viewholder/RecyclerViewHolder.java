package com.example.aasheesh.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.aasheesh.R;

public class RecyclerViewHolder extends RecyclerView.ViewHolder implements RecyclerView.OnClickListener{

    public TextView name, rating,textreturns,textAum,textExpense;
    LinearLayout linearLayout;

    public RecyclerViewHolder(View itemView) {
        super(itemView);
        linearLayout=(LinearLayout)itemView.findViewById(R.id.linearrating) ;
        name= (TextView) itemView.findViewById(R.id.name);
        rating=(TextView)itemView.findViewById(R.id.textrating);
        textreturns=(TextView)itemView.findViewById(R.id.textReturnsValue);
        textAum=(TextView)itemView.findViewById(R.id.textAUMvalue);
        textExpense=(TextView)itemView.findViewById(R.id.textExpensevalue);
    }

    @Override
    public void onClick(View view) {

    }
}