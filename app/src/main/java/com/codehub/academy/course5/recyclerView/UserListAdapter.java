package com.codehub.academy.course5.recyclerView;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.codehub.academy.R;
import com.codehub.academy.course5.UserModel;

import java.util.List;

public class UserListAdapter extends RecyclerView.Adapter<UserListViewHolder> {

    @NonNull
    private List<UserModel> array;

    public UserListAdapter(@NonNull List<UserModel> array) {
        this.array = array;
    }

    @NonNull
    @Override
    public UserListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.holder_card, parent, false);
        return new UserListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserListViewHolder holder, int position) {
        UserModel userModel = array.get(position);
        holder.bind(userModel);
    }

    @Override
    public int getItemCount() {
        return array.size();
    }
}
