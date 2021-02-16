package com.codehub.academy.course5.recyclerView.viewholders;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.codehub.academy.R;
import com.codehub.academy.course5.UserModel;

public abstract class UserViewHolder extends RecyclerView.ViewHolder {

    public UserViewHolder(@NonNull View itemView) {
        super(itemView);
    }

    public abstract void bind(UserModel userModel);
}
