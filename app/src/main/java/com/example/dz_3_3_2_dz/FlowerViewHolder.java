package com.example.dz_3_3_2_dz;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class FlowerViewHolder extends RecyclerView.ViewHolder {
    private TextView tvFlower;

    public FlowerViewHolder(@NonNull View itemView) {
        super(itemView);
        tvFlower = itemView.findViewById(R.id.tv_flower);
    }

    public void onBind(String flower) {
        tvFlower.setText(flower);

    }
}
