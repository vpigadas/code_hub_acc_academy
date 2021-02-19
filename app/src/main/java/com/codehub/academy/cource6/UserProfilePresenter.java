package com.codehub.academy.cource6;

import com.codehub.academy.course5.UserModel;

public interface UserProfilePresenter {

    void updateProfile();

    UserModel getUserProfile();

    void backAction();
}
