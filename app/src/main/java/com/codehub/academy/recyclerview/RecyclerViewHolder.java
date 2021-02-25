package com.codehub.academy.recyclerview;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.codehub.academy.R;

public class RecyclerViewHolder extends RecyclerView.ViewHolder {

    private ImageView imageView;
    private TextView textView;

    public RecyclerViewHolder(@NonNull View itemView) {
        super(itemView);

        imageView = itemView.findViewById(R.id.holder_image);
        textView = itemView.findViewById(R.id.holder_title);
    }

    public void bind(RecyclerModel data) {

        textView.setText(data.getTitle());
        Glide.with(itemView.getContext()).load(data.getImage()).into(imageView);

    }
}
