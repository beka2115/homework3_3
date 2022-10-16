package com.example.practice2;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class MainFragment extends Fragment {
    private Button btn_country, btn_food, btn_car, btn_stuff;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        btn_car = view.findViewById(R.id.btn_car);
        btn_country = view.findViewById(R.id.btn_country);
        btn_food = view.findViewById(R.id.btn_menu);
        btn_country.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CountryFragment countryFragment = new CountryFragment();
                requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.main_fragment, countryFragment)
                        .addToBackStack(null).commit();
            }
        });

        btn_car.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CarFragment carFragment = new CarFragment();
                requireActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.main_fragment, carFragment).addToBackStack(null).commit();

            }
        });
        btn_food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MenuFragment menuFragment = new MenuFragment();
                requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.main_fragment, menuFragment).
                        addToBackStack(null).commit();
            }
        });

    }
}