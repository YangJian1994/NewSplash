package com.yangjian.newsplash.bean;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Yang on 2018/6/29.
 * Function：
 */

public class VideoResult implements Serializable {

    @SerializedName("error")
    private boolean error;

    @SerializedName("results")
    private List<Video> videos;

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public List<Video> getVideos() {
        return videos;
    }

    public void setVideos(List<Video> videos) {
        this.videos = videos;
    }

    @Override
    public String toString() {
        return "VideoResult{" +
                "error=" + error +
                ", videos=" + videos +
                "}";
    }
}
