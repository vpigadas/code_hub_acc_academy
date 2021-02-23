package com.codehub.academy.cource6;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.codehub.academy.cource6.response.JsonResponse;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;

public class TvProgramViewModel extends AndroidViewModel {
    private final String url = "https://tv-zapping.herokuapp.com/v2/tv";
    private final String urlSport = "https://tv-zapping.herokuapp.com/v2/sport";
    private final String urlGoogle = "https://www.google.com/";

    @NonNull
    private RequestQueue queue;

    public TvProgramViewModel(@NonNull Application application) {
        super(application);
        queue = Volley.newRequestQueue(application);
    }

    void retrieveProgram(TvProgramListener callback) {
        // Request a string response from the provided URL.
        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {

                        Gson gson = new Gson();

                        JsonResponse response1 = gson.fromJson(response, JsonResponse.class);
                        String strResponse = gson.toJson(response1);

                        callback.onSuccessResponse(response1);
                        // Display the first 500 characters of the response string.
                        //textView.setText("Response is: " + response.substring(0, 500));
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        callback.onErrorResponse("That didn't work!");
                        //textView.setText("That didn't work!");
                    }
                });

        // Add the request to the RequestQueue.
        queue.add(stringRequest);
    }

    void retrieveSportProgram(TvProgramListener callback) {
        // Request a string response from the provided URL.
        StringRequest stringRequest = new StringRequest(Request.Method.GET, urlSport,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
//                        callback.onSuccessResponse(response);
                        // Display the first 500 characters of the response string.
                        //textView.setText("Response is: " + response.substring(0, 500));
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        callback.onErrorResponse("That didn't work!");
                        //textView.setText("That didn't work!");
                    }
                });

        // Add the request to the RequestQueue.
        queue.add(stringRequest);
    }

    @Override
    protected void onCleared() {
        super.onCleared();
    }
}
