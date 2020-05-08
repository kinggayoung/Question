package com.example.questionapp.network;

import entity.userSearch.UserResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;

public interface UserService {
    @GET("v1/users?")
    Call<UserResponse> getUserList(
            @Header("Authorization") String token
            //  @Query("title") String title
    );

}
