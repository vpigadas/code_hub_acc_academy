package com.codehub.academy;

import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class Demo extends AbstractActivity {

    @Override
    int getLayout() {
        return R.layout.activity_login;
    }

    @Override
    void setupValuesToUI() {
        Log.d("DEMO", "setupValuesToUI");

        TextView text = findViewById(R.id.txt_login);
        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Demo.this, "TextView Clicked!!!", Toast.LENGTH_SHORT).show();
            }
        });


        Button btn = findViewById(R.id.btn_login);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Demo.this, MainActivity2.class);
                startActivity(intent);
                finish();
            }
        });

        btn.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Snackbar.make(v, "Button Long Clicked!!", Snackbar.LENGTH_SHORT).show();
                Toast.makeText(Demo.this, "Button LONG Clicked!!!", Toast.LENGTH_SHORT).show();
                return true;
            }
        });

    }

    @Override
    void startOperations() {
        Log.d("DEMO", "startOperations");
    }

    @Override
    void stopOperations() {
        Log.d("DEMO", "stopOperations");
    }
}
