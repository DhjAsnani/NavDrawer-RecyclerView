package com.example.gohan.navcyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Freeware Sys on 6/14/2016.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.RecyclerViewHolder> {
    ArrayList<String> arrayList = new ArrayList<String>();
    public RecyclerAdapter(ArrayList<String> arrayList)
    {
        this.arrayList = arrayList;
    }
    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_layout,parent,false) ;
        RecyclerViewHolder viewHolder =new  RecyclerViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {

        holder.textView.setText(arrayList.get(position));
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
    // create view holder class
    public  static  class RecyclerViewHolder extends RecyclerView.ViewHolder
    {
        TextView textView;
        public RecyclerViewHolder(View view)
        {

                super(view);
            textView = (TextView) view.findViewById(R.id.tx_item);
        }
    }
}

