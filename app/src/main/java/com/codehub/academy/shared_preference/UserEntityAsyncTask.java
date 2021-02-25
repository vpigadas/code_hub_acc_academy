package com.codehub.academy.shared_preference;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;

import androidx.room.Room;

public class UserEntityAsyncTask extends AsyncTask<UserEntity, UserEntity, Void> {
    UserDatabase userDatabase;

    public UserEntityAsyncTask(Context context,UserDatabase userDatabase) {
        this.userDatabase = userDatabase;
    }


    @Override
    protected Void doInBackground(UserEntity... entities) {
        Log.d("Database", "Start");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        userDatabase.getUserDao().insert(entities);
        Log.d("Database", String.valueOf(entities));

        return null;
    }

    @Override
    protected void onPostExecute(Void aBoolean) {
        super.onPostExecute(aBoolean);
    }
}
