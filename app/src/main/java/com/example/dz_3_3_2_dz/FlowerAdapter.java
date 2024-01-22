package com.example.dz_3_3_2_dz;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FlowerAdapter extends RecyclerView.Adapter<FlowerViewHolder> {
    private ArrayList<String> flowerList;

    public FlowerAdapter(ArrayList<String> flowerList) {
        this.flowerList = flowerList;
    }

    @NonNull
    @Override
    public FlowerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new FlowerViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_flowers, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull FlowerViewHolder holder, int position) {
        holder.onBind(flowerList.get(position));
    }

    @Override
    public int getItemCount()        {
        return flowerList.size();
    }
}
