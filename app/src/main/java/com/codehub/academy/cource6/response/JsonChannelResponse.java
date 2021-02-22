package com.codehub.academy.cource6.response;

import java.util.List;
import java.util.Objects;

public class JsonChannelResponse {
    private List<JsonShowResponse> shows;
    private String channelName;

    public List<JsonShowResponse> getShows() {
        return shows;
    }

    public void setShows(List<JsonShowResponse> shows) {
        this.shows = shows;
    }

    public String getChannelName() {
        return channelName;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JsonChannelResponse that = (JsonChannelResponse) o;
        return Objects.equals(shows, that.shows) &&
                Objects.equals(channelName, that.channelName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shows, channelName);
    }

    @Override
    public String toString() {
        return "JsonChannelResponse{" +
                "shows=" + shows +
                ", channelName='" + channelName + '\'' +
                '}';
    }
}
