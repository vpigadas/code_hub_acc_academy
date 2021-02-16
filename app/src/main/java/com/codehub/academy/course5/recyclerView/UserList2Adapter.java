package com.codehub.academy.course5.recyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.codehub.academy.R;
import com.codehub.academy.course5.UserModel;
import com.codehub.academy.course5.recyclerView.viewholders.UserArrayViewHolder;
import com.codehub.academy.course5.recyclerView.viewholders.UserDataViewHolder;
import com.codehub.academy.course5.recyclerView.viewholders.UserViewHolder;

import java.util.List;

public class UserList2Adapter extends RecyclerView.Adapter<UserViewHolder> {
    private List<UserModel> array;

    public UserList2Adapter(List<UserModel> array) {
        this.array = array;
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
        UserModel userModel = array.get(position);

        holder.bind(userModel);
    }

    @Override
    public int getItemCount() {
        return array.size();
    }

    @Override
    public int getItemViewType(int position) {
        if(position % 2 == 0){
            return 1;
        }else {
            return 0;
        }
    }
}
