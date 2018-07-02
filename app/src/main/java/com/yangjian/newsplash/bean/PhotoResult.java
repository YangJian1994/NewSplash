package com.yangjian.newsplash.bean;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Yang on 2018/6/29.
 * Function：
 */

public class PhotoResult implements Serializable {

    @SerializedName("hits")
    private List<Photo> photos;

    public List<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }

    @Override
    public String toString() {
        return "PhotoResult{" +
                "photos=" + photos +
                "}";
    }
}
