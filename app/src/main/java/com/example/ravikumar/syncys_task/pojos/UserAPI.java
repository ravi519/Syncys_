package com.example.ravikumar.syncys_task.pojos;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface UserAPI {



        @GET("users")
       Call<User> getusers();


  /*  @GET("users/{username}")
    void getUser(@Path("username") String username, Callback<User> cb);

    @GET("group/{id}/users")
    void groupList(@Path("id") int groupId, @Query("sort") String sort, Callback<List<User>> cb);

    @POST("users/new")
    void createUser(@Body User user, Callback<User> cb);*/

}
