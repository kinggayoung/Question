package com.example.questionapp.network;

import entity.question.QuestionResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

public interface QuestionService {

    @GET("v1/questions?")
    Call<QuestionResponse> getQuestionList(
            @Header("Authorization") String token,
            @Query("title") String title
    );
}
