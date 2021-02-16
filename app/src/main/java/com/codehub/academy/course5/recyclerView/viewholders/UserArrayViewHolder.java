package com.codehub.academy.course5.recyclerView.viewholders;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.codehub.academy.R;
import com.codehub.academy.course5.UserModel;

public class UserArrayViewHolder extends UserViewHolder {

    public UserArrayViewHolder(@NonNull View itemView) {
        super(itemView);
    }

    public void bind(UserModel userModel) {

        TextView textView = itemView.findViewById(R.id.holder_title);
        textView.setText(userModel.getFirstName() + " "+ userModel.getLastName());

        TextView textViewDesc = itemView.findViewById(R.id.holder_dec);
        textViewDesc.setText(userModel.getBio());
    }
}
