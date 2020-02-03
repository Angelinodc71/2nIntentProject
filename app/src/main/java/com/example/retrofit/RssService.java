package com.example.retrofit;

import com.example.retrofit.RssFeed;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface RssService {
    @GET("{pata}")
    Call<RssFeed> getFeed(@Path("pata") String path);
}
