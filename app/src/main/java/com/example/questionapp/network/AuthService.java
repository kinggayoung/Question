package com.example.questionapp.network;

import entity.auth.AuthResponse;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface AuthService {

    @FormUrlEncoded
    @POST("v1/auth/LoginActivity/")
    Call<AuthResponse> getAuthList(
            @Field("nickname") String nickname,
            @Field("password") String password
    );

}
