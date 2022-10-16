package com.example.practice2;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MenuViewHolder extends RecyclerView.ViewHolder {
    private TextView menuTextView;

    public MenuViewHolder(@NonNull View itemView) {
        super(itemView);
        menuTextView = itemView.findViewById(R.id.text_menu);
    }

    public void bind2(String menu) {
        menuTextView.setText(menu);
    }
}
