package com.codehub.academy.recyclerview;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.codehub.academy.R;
import com.codehub.academy.recyclerview.model.Model;
import com.codehub.academy.recyclerview.model.Model1;
import com.codehub.academy.recyclerview.model.Model2;

import java.util.ArrayList;
import java.util.List;

public class RecyclerActivity extends AppCompatActivity {

    private final String APIKey = "9bb33d52c77a0f94a17eafe4c83b4988";
    private final String configURL = "https://api.themoviedb.org/3/configuration?api_key=" + APIKey;
    private final String popularURL = "https://api.themoviedb.org/3/movie/popular?api_key=" + APIKey;

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

    private List<RecyclerModel> getMockData() {
        List<RecyclerModel> array = new ArrayList<RecyclerModel>();

        array.add(new RecyclerModel("A", "https://image.tmdb.org/t/p/w300/bmemsraCG1kIthY74NjDnnLRT2Q.jpg"));
        array.add(new RecyclerModel("B", "https://image.tmdb.org/t/p/w300/dWSnsAGTfc8U27bWsy2RfwZs0Bs.jpg"));
        array.add(new RecyclerModel("C", "https://image.tmdb.org/t/p/w300/6XYLiMxHAaCsoyrVo38LBWMw2p8.jpg"));
        array.add(new RecyclerModel("D", "https://image.tmdb.org/t/p/w300/c7VlGCCgM9GZivKSzBgzuOVxQn7.jpg"));
        array.add(new RecyclerModel("E", "https://image.tmdb.org/t/p/w300/b2shaNA4F8zNIwoRYr33lPTiFfl.jpg"));
        array.add(new RecyclerModel("F", "https://image.tmdb.org/t/p/w300/13B6onhL6FzSN2KaNeQeMML05pS.jpg"));

        return array;
    }

    private List<Model> getMockData2() {
        List<Model> array = new ArrayList();

        array.add(new Model1("A", "B"));
        array.add(new Model2(0, 1));

        return array;
    }
}