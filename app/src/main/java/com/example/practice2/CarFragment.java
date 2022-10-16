package com.example.practice2;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class CarFragment extends Fragment {
    private RecyclerView recyclerView;
    private ArrayList<String> carList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_car, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.recycler);
        carList.add("BMW");
        carList.add("MERCEDES");
        carList.add("LEXUS");
        carList.add("TOYOTA");
        carList.add("FORD");
        carList.add("Nisan");
        carList.add("BMW X5");
        carList.add("HONDA");
        carList.add("CHEVROLET");
        carList.add("LAMBORGHINI");
        carList.add("PORSCHE");
        carList.add("TESLA");
        carList.add("LADA");
        carList.add("LOTUS");
        CarAdapter carAdapter = new CarAdapter(carList);
        recyclerView.setAdapter(carAdapter);


    }
}