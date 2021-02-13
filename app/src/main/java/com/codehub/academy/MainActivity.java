package com.codehub.academy;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        Button btn = findViewById(R.id.btn_login);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.out.println("Button click");
                Log.d("DemoApplication","Button click!!!");
            }
        });

        TextView txn = findViewById(R.id.txt_login);

        if(txn != null){
            txn.setText("Vassilis");
            txn.setText(getString(R.string.app_name));
        }

    }

    @Override
    protected void onPostResume() {
        super.onPostResume();

        Button btn = findViewById(R.id.btn_login);

    }
}