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

public class MenuFragment extends Fragment {
    private RecyclerView recyclerView;
    private ArrayList<String> menuList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_menu, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.recycler_menu);
        menuList.add("Shorpo");
        menuList.add("Pizza");
        menuList.add("Shaurma");
        menuList.add("Lagman");
        menuList.add("Burger");
        menuList.add("Plov");
        menuList.add("Goroh");
        menuList.add("Grechka");
        menuList.add("Hencaly");
        menuList.add("Chay");
        menuList.add("Coffee");
        menuList.add("Samsa");
        menuList.add("Samsa with Sir");
        MenuAdapter adapter = new MenuAdapter(menuList);
        recyclerView.setAdapter(adapter);
    }
}