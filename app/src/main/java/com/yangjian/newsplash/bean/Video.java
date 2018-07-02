package com.yangjian.newsplash.bean;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Created by Yang on 2018/6/29.
 * Function：
 */

public class Video implements Serializable {

    @SerializedName("_id")
    private String id;

    @SerializedName("createdAt")
    private String createdAt;

    @SerializedName("desc")
    private String desc;

    @SerializedName("url")
    private String url;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
