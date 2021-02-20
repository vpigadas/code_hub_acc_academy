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
    private TvProgramViewModel viewModel;

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

        viewModel = new ViewModelProvider(this).get(TvProgramViewModel.class);
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

        viewModel.retrieveProgram(new TvProgramListener() {
            @Override
            public void onSuccessResponse(String data) {
                textView.setText(data);
            }

            @Override
            public void onErrorResponse(String data) {
                textView.setText(data);
            }
        });

//        // Instantiate the RequestQueue.
//        RequestQueue queue = Volley.newRequestQueue(getContext());
//        String url = "https://tv-zapping.herokuapp.com/v2/tv";
//
//// Request a string response from the provided URL.
//        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
//                new Response.Listener<String>() {
//                    @Override
//                    public void onResponse(String response) {
//                        // Display the first 500 characters of the response string.
//                        textView.setText("Response is: " + response.substring(0, 500));
//                    }
//                }, new Response.ErrorListener() {
//            @Override
//            public void onErrorResponse(VolleyError error) {
//                textView.setText("That didn't work!");
//            }
//        });
//
//        // Add the request to the RequestQueue.
//        queue.add(stringRequest);
    }
}