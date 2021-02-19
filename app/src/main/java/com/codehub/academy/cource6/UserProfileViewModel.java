package com.codehub.academy.cource6;

import androidx.lifecycle.ViewModel;

import com.codehub.academy.course5.UserModel;

import java.util.Date;

public class UserProfileViewModel extends ViewModel {
    private UserModel userModel = new UserModel("","","","",new Date(System.currentTimeMillis()));

    public String getUserName() {
        return userModel.getFirstName();
    }

    public void setUserName(String userName) {
        this.userModel.setFirstName(userName);
    }

    public String getPassword() {
        return userModel.getPassword();
    }

    public void updatePassword(String password) {
        this.userModel.setPassword(password);
    }

    public boolean checkPassword(String password) {
        return this.userModel.getFirstName().equals(password);
    }

    public void retrieveData(){

    }
}
