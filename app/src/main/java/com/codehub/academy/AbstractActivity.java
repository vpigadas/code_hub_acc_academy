package com.codehub.academy;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public abstract class AbstractActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        setupValuesToUI();
    }

    @Override
    protected void onResume() {
        super.onResume();
        startOperations();
    }

    @Override
    protected void onPause() {
        super.onPause();
        stopOperations();
    }

    abstract int getLayout();

    abstract void setupValuesToUI();

    abstract void startOperations();

    abstract void stopOperations();
}
