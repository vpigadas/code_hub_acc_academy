package com.codehub.academy.course5;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.RecyclerView;

import com.codehub.academy.R;
import com.codehub.academy.course5.recyclerView.UserListAdapterV2;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
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

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

//        recyclerView.setAdapter(new UserList2Adapter(getMockUserList()));


        UserListAdapterV2 adapterV2 = new UserListAdapterV2();
        recyclerView.setAdapter(adapterV2);

        adapterV2.submitList(getMockUserList());

    }

    private List<UserModel> getMockUserList() {
        List<UserModel> array = new ArrayList<UserModel>();

        array.add(new UserModel("Vassilis", "Pigadas", "blablablablablabla", "", new Date(System.currentTimeMillis())));
        array.add(new UserModel("Markos", "Pigadas", "", "blablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablabla", new Date(System.currentTimeMillis())));
        array.add(new UserModel("Orfeas", "Pigadas", "", "blablablablablabla", new Date(System.currentTimeMillis())));
        array.add(new UserModel("Nikos", "Pigadas", "", "blabla", new Date(System.currentTimeMillis())));
        array.add(new UserModel("Christos", "Emmanouil", "", "blabla", new Date(System.currentTimeMillis())));
        array.add(new UserModel("Vassilis", "Pigadas", "", "blablablablablabla", new Date(System.currentTimeMillis())));
        array.add(new UserModel("Markos", "Pigadas", "", "blablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablabla", new Date(System.currentTimeMillis())));
        array.add(new UserModel("Orfeas", "Pigadas", "", "blablablablablabla", new Date(System.currentTimeMillis())));
        array.add(new UserModel("Nikos", "Pigadas", "", "blabla", new Date(System.currentTimeMillis())));
        array.add(new UserModel("Christos", "Emmanouil", "", "blabla", new Date(System.currentTimeMillis())));
        array.add(new UserModel("Vassilis", "Pigadas", "", "blablablablablabla", new Date(System.currentTimeMillis())));
        array.add(new UserModel("Markos", "Pigadas", "", "blablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablablabla", new Date(System.currentTimeMillis())));
        array.add(new UserModel("Orfeas", "Pigadas", "", "blablablablablabla", new Date(System.currentTimeMillis())));
        array.add(new UserModel("Nikos", "Pigadas", "", "blabla", new Date(System.currentTimeMillis())));
        array.add(new UserModel("Christos", "Emmanouil", "", "blabla", new Date(System.currentTimeMillis())));

        return array;
    }
}