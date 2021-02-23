package com.codehub.academy.shared_preference;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import androidx.room.Room;

public class UserEntityAsyncTask extends AsyncTask<UserEntity, UserEntity, Boolean> {
    UserDatabase userDatabase;

    public UserEntityAsyncTask(Context context) {
        userDatabase = Room.databaseBuilder(context, UserDatabase.class, "codehub-db").build();
    }

    @Override
    protected Boolean doInBackground(UserEntity... entities) {
        Log.d("Database", "Start");
        userDatabase.getUserDao().insert(entities);
        Log.d("Database", String.valueOf(entities));
        return true;
    }

    @Override
    protected void onPostExecute(Boolean aBoolean) {
        super.onPostExecute(aBoolean);
    }
}
