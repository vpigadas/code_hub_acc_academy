package com.codehub.academy;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.codehub.academy.viewpager.BlankFragment1;
import com.codehub.academy.viewpager.BlankFragment3;
import com.codehub.academy.viewpager.CustomViewPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);
    }

    @Override
    protected void onPostCreate(@Nullable Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);

        ViewPager viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(new CustomViewPagerAdapter(getSupportFragmentManager(),getList()));
    }

    private List<Fragment> getList() {
        List<Fragment> arrayList = new ArrayList<Fragment>();

        arrayList.add(BlankFragment1.newInstance());
        arrayList.add(BlankFragment3.newInstance());
        arrayList.add(BlankFragment3.newInstance());
        arrayList.add(BlankFragment1.newInstance());
        arrayList.add(BlankFragment1.newInstance());
        arrayList.add(BlankFragment3.newInstance());

        return arrayList;
    }
}