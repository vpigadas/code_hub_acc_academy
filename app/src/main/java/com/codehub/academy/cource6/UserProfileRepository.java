package com.codehub.academy.cource6;

import com.codehub.academy.course5.UserModel;

public class UserProfileRepository {

    private UserModel userModel;

    public UserModel getUserModel() {
        return userModel;
    }

    public void setUserModel(UserModel userModel) {
        this.userModel = userModel;
    }

    public boolean update(UserModel userModel) {
        this.userModel = userModel;
        return true;
    }

    public boolean update(String name) {
        String[] splitted = name.split(" ");
        this.userModel.setFirstName(splitted[0]);
        this.userModel.setLastName(splitted[1]);
        return true;
    }
}
