package com.codehub.academy.course5.recyclerView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.DiffUtil;

import com.codehub.academy.course5.UserModel;

public class DiffUtilsItems extends DiffUtil.ItemCallback<UserModel> {
    @Override
    public boolean areItemsTheSame(@NonNull UserModel oldItem, @NonNull UserModel newItem) {
        return oldItem == newItem;
    }

    @Override
    public boolean areContentsTheSame(@NonNull UserModel oldItem, @NonNull UserModel newItem) {
        return oldItem.equals(newItem);
    }
}
