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

public class CountryFragment extends Fragment {
    private RecyclerView recyclerView;
    private ArrayList countryList = new ArrayList();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_country, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        recyclerView = view.findViewById(R.id.recycler_country);
        countryList.add("KYRGYZSTAN");
        countryList.add("AFGHANISTAN");
        countryList.add("AUSTRIA");
        countryList.add("KAZAKHSTAN");
        countryList.add("RUSSIA");
        countryList.add("KENYA");
        countryList.add("JORDAN");
        countryList.add("MEXICO");
        countryList.add("MONACO");
        countryList.add("NEW ZEALAND");
        countryList.add("TAJIKISTAN");
        countryList.add("USA");
        countryList.add("ITALY");
        countryList.add("UGANDA");
        countryList.add("URUGUAY");
        countryList.add("POLAND");
        countryList.add("PERU");
        CountryAdapter adapter = new CountryAdapter(countryList);
        recyclerView.setAdapter(adapter);

    }
}