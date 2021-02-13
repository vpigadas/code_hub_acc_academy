package com.codehub.academy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        Button btOne = findViewById(R.id.btn_one);
        Button btTwo = findViewById(R.id.btn_two);
        Button btThree = findViewById(R.id.btn_three);

        btOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        btTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity2.this, "Message to screen!!!", Toast.LENGTH_SHORT).show();
            }
        });

        btTwo.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                buttonFunction2(null);
                buttonFunction2("");
                return true;
            }
        });

        btThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                buttonFunction();
            }
        });
    }

    private void buttonFunction() {
        Intent intent = new Intent(MainActivity2.this, MainActivity3.class);

        Bundle parameter = new Bundle();
        parameter.putInt("keyInt", 1000);
        parameter.putString("keyString", "Vassilis");

        intent.putExtras(parameter);
        startActivity(intent);
    }

    private void buttonFunction2(@NonNull String name) {


        Intent intent = new Intent(MainActivity2.this, MainActivity3.class);
        startActivityForResult(intent, 5001);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == 5001) {
            if (resultCode == Activity.RESULT_OK) {
//                Bundle parameter = data.getExtras();
//
//                parameter.getString("keyString");

                if (data != null) {
                    String str = data.getStringExtra("keyString");
                    Log.d("Act", str);
                }

            } else if (resultCode == Activity.RESULT_CANCELED) {

            }
        }
    }
}