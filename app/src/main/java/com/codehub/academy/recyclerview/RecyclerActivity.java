package com.codehub.academy.recyclerview;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.codehub.academy.R;
import com.codehub.academy.recyclerview.model.Model;
import com.codehub.academy.recyclerview.model.Model1;
import com.codehub.academy.recyclerview.model.Model2;

import java.util.ArrayList;
import java.util.List;

public class RecyclerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);

        RecyclerAdapter adapter = new RecyclerAdapter(getMockData());

        recyclerView.setAdapter(adapter);
    }

    private List<String> getMockData(){
        List<String> array = new ArrayList<String>();

        array.add("A");
        array.add("B");
        array.add("C");
        array.add("D");
        array.add("E");

        return array;
    }

    private List<Model> getMockData2(){
        List<Model> array = new ArrayList();

        array.add(new Model1("A","B"));
        array.add(new Model2(0,1));

        return array;
    }
}