package com.codehub.academy.shared_preference;

import android.os.AsyncTask;

import java.util.ArrayList;

public class AyncVoid extends AsyncTask<String,String,Boolean> {

    private UserEntityListener listener;

    @Override
    protected Boolean doInBackground(String... strings) {
        return true;
    }

    @Override
    protected void onPostExecute(Boolean aVoid) {
        super.onPostExecute(aVoid);
        listener.onSuccessResult(new ArrayList<>());
    }
}
