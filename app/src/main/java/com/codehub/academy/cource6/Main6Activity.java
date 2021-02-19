package com.codehub.academy.cource6;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;

import com.codehub.academy.R;

public class Main6Activity extends AppCompatActivity {

    private UserProfileViewModel viewModelActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        viewModelActivity = new ViewModelProvider(this).get(UserProfileViewModel.class);
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frameLayout, new PasswordResultFragment());
        transaction.commit();

        EditText editText = findViewById(R.id.edittext);

        Button button = findViewById(R.id.btn_check);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String pass = String.valueOf(editText.getText());
                boolean result = viewModelActivity.checkPassword(pass);

            }
        });


        Button btnBack = findViewById(R.id.btn_back);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        Log.d("ViewModel", viewModelActivity.getUserName());
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();

        Log.d("ViewModel", viewModelActivity.getUserName());
    }
}