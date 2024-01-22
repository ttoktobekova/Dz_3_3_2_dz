package com.example.dz_3_3_2_dz;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class FirstFragment extends Fragment {
    private RecyclerView rvFlower;
    private ArrayList<String> flowerList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvFlower = requireActivity().findViewById(R.id.rv_flower);
        FlowerAdapter adapter = new FlowerAdapter(flowerList);
        rvFlower.setAdapter(adapter);
        loadData();

    }

    private void loadData() {
        flowerList.add("Роза");
        flowerList.add("Тюльпан");
        flowerList.add("Гвоздика");
        flowerList.add("Подсолнуха");
        flowerList.add("Ромашка");
        flowerList.add("Орхидея");
        flowerList.add("Пион");
        flowerList.add("Лилия");
        flowerList.add("Астра");
        flowerList.add("Ирис");
        flowerList.add("Лотос");
        flowerList.add("Калла");
        flowerList.add("Дельфиниум");
        flowerList.add("Анемона");
        flowerList.add("Эхинацея");
        flowerList.add("Лаванда");

    }
}