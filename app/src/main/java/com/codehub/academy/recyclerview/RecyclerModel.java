package com.codehub.academy.recyclerview;

import java.util.Objects;

public class RecyclerModel {

    private String image;
    private String title;

    public RecyclerModel(String title,String image) {
        this.image = image;
        this.title = title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecyclerModel that = (RecyclerModel) o;
        return Objects.equals(image, that.image) &&
                Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(image, title);
    }

    @Override
    public String toString() {
        return "RecyclerModel{" +
                "image='" + image + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
