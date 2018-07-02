package com.yangjian.newsplash.api;

import com.yangjian.newsplash.bean.PhotoResult;
import com.yangjian.newsplash.bean.VideoResult;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by Yang on 2018/6/29.
 * Function：Api接口类
 */

public interface ApiService {

    // 首页获取图片的api
    @GET("/api/?key=9401697-56064723098c84bd77462524a&image_type=photo&pretty=true&page={page}")
    Observable<PhotoResult> getPhoto(
            @Path("page") int page
    );

    // 获取视频的api
    @GET("/api/data/休息视频/10/{page}")
    Observable<VideoResult> getVideo(
            @Path("page") int page
    );

    
}

