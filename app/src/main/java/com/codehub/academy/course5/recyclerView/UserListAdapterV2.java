package com.codehub.academy.course5.recyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.ListAdapter;

import com.codehub.academy.R;
import com.codehub.academy.course5.UserModel;
import com.codehub.academy.course5.recyclerView.viewholders.UserArrayViewHolder;
import com.codehub.academy.course5.recyclerView.viewholders.UserDataViewHolder;
import com.codehub.academy.course5.recyclerView.viewholders.UserViewHolder;

public class UserListAdapterV2 extends ListAdapter<UserModel, UserViewHolder> {

    public UserListAdapterV2() {
        super(new DiffUtilsItems());
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == 0) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.holder_card, parent, false);
            return new UserArrayViewHolder(view);
        } else {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.holder_card_two, parent, false);
            return new UserDataViewHolder(view);
        }
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        UserModel userModel = getItem(position);

        holder.bind(userModel);
    }
}
