package com.codehub.academy.course5;

import java.util.Date;
import java.util.Objects;

public class UserModel {

    private String firstName;
    private String lastName;
    private String password;
    private String bio;
    private Date dob;

    public UserModel(String firstName, String lastName,String password, String bio, Date dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.bio = bio;
        this.dob = dob;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBio() {
        return bio;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        UserModel userModel = (UserModel) o;

        return firstName.equals(userModel.firstName) &&
                lastName.equals(userModel.lastName) &&
                Objects.equals(dob, userModel.dob);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, dob);
    }

    @Override
    public String toString() {
        return "UserModel{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", bio='" + bio + '\'' +
                ", dob=" + dob +
                '}';
    }
}
