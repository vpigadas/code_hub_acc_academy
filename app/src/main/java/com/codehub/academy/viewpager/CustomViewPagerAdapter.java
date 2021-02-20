package com.codehub.academy.viewpager;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.List;

public class CustomViewPagerAdapter extends FragmentStatePagerAdapter {
    private List<Fragment> array;

    public CustomViewPagerAdapter(@NonNull FragmentManager fm, List<Fragment> array) {
        super(fm);
        this.array = array;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return array.get(position);
    }

    @Override
    public int getCount() {
        return array.size();
    }
}
