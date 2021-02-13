package com.codehub.academy;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        Bundle parameters = getIntent().getExtras();

        if(parameters != null){
            int integer = parameters.getInt("keyInt");
            String str = parameters.getString("keyString");

            Log.d("Act",String.valueOf(integer));
            Log.d("Act",str);
        }

        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = getIntent();

                Bundle parameter = new Bundle();
                parameter.putString("keyString","Markos");

                intent.putExtras(parameter);

                setResult(Activity.RESULT_OK,intent);
                finish();
            }
        });
    }
}