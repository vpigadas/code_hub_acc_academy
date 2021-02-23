package com.codehub.academy.shared_preference;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import androidx.room.Room;

import java.util.List;

public class UserGetEntityAsyncTask extends AsyncTask<UserEntity, UserEntity, List<UserEntity>> {
    UserDatabase userDatabase;
    UserEntityListener listener;
    String name;

    public UserGetEntityAsyncTask(Context context, UserEntityListener listener) {
        userDatabase = Room.databaseBuilder(context, UserDatabase.class, "codehub-db").build();
        this.listener = listener;
        name = "Vassilis";
    }

    @Override
    protected List<UserEntity> doInBackground(UserEntity... entities) {
        Log.d("Database", "Start");
        return userDatabase.getUserDao().getEntity();
    }

    @Override
    protected void onPostExecute(List<UserEntity> results) {
        super.onPostExecute(results);
        listener.onSuccessResult(results);
    }
}
