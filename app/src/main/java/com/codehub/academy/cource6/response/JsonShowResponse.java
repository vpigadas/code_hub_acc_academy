package com.codehub.academy.cource6.response;

import java.util.Objects;

public class JsonShowResponse {
    private int endTime;
    private String title;
    private int startTime;
    private String endTimeCaption;
    private String startTimeCaption;


    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public String getEndTimeCaption() {
        return endTimeCaption;
    }

    public void setEndTimeCaption(String endTimeCaption) {
        this.endTimeCaption = endTimeCaption;
    }

    public String getStartTimeCaption() {
        return startTimeCaption;
    }

    public void setStartTimeCaption(String startTimeCaption) {
        this.startTimeCaption = startTimeCaption;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JsonShowResponse that = (JsonShowResponse) o;
        return endTime == that.endTime &&
                startTime == that.startTime &&
                Objects.equals(title, that.title) &&
                Objects.equals(endTimeCaption, that.endTimeCaption) &&
                Objects.equals(startTimeCaption, that.startTimeCaption);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endTime, title, startTime, endTimeCaption, startTimeCaption);
    }

    @Override
    public String toString() {
        return "JsonShowResponse{" +
                "endTime=" + endTime +
                ", title='" + title + '\'' +
                ", startTime=" + startTime +
                ", endTimeCaption='" + endTimeCaption + '\'' +
                ", startTimeCaption='" + startTimeCaption + '\'' +
                '}';
    }
}