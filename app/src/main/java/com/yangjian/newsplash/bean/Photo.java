package com.yangjian.newsplash.bean;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by Yang on 2018/6/29.
 * Function：
 */

public class Photo implements Serializable {

    @SerializedName("id")
    private int id;

    @SerializedName("likes")
    private int likes;

    @SerializedName("views")
    private int views;

    @SerializedName("comments")
    private int comments;

    @SerializedName("downloads")
    private int downloads;

    @SerializedName("previewURL")
    private String previewURL;

    @SerializedName("webformatURL")
    private String webformatURL;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getComments() {
        return comments;
    }

    public void setComments(int comments) {
        this.comments = comments;
    }

    public int getDownloads() {
        return downloads;
    }

    public void setDownloads(int downloads) {
        this.downloads = downloads;
    }

    public String getPreviewURL() {
        return previewURL;
    }

    public void setPreviewURL(String previewURL) {
        this.previewURL = previewURL;
    }

    public String getWebformatURL() {
        return webformatURL;
    }

    public void setWebformatURL(String webformatURL) {
        this.webformatURL = webformatURL;
    }
}
