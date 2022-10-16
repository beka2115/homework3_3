package com.example.practice2;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CountryViewHolder extends RecyclerView.ViewHolder {
    private TextView countryTextView;

    public CountryViewHolder(@NonNull View itemView) {
        super(itemView);
        countryTextView = itemView.findViewById(R.id.text_country);
    }

    public void bind3(String country) {
        countryTextView.setText(country);
    }
}
