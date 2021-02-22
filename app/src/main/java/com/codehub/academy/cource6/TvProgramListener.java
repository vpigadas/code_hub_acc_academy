package com.codehub.academy.cource6;

import com.codehub.academy.cource6.response.JsonResponse;

public interface TvProgramListener {

    void onSuccessResponse(JsonResponse data);

    void onErrorResponse(String data);
}
