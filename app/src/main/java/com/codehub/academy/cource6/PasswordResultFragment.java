package com.codehub.academy.cource6;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.codehub.academy.R;

public class PasswordResultFragment extends Fragment {

    private UserProfileViewModel viewFragment;

    public PasswordResultFragment() {
        // Required empty public constructor
    }

    public static PasswordResultFragment newInstance(String param1, String param2) {
        PasswordResultFragment fragment = new PasswordResultFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        viewFragment = new ViewModelProvider(getActivity()).get(UserProfileViewModel.class);
        viewFragment.setUserName("Vassilis");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_password_result, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        TextView textView = view.findViewById(R.id.txt);

    }
}