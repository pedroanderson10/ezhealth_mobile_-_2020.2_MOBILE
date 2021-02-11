package com.example.ezhealth_mobile;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<ViewHolder>{

    ArrayList<ObjectDefault> list;

    public RecyclerViewAdapter(ArrayList<ObjectDefault> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.exemple_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        ObjectDefault obj = list.get(position);
        holder.setPosition(position);
        holder.setTitle(obj.getName());
        holder.setQuantity(obj.getQuantity());
        holder.setQuantityMeasure(obj.getQuantityMeasure());
        holder.setKcal(obj.getKcal());
    }

    @Override
    public int getItemCount() {
        return this.list.size();
    }
}
