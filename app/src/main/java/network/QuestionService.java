package network;

import entity.question.QuestionResponse;
import entity.questionDelete.QuestionDeleteResponse;
import entity.questionInsert.QuestionInsertResponse;
import entity.questionUpate.QuestionUpdateResponse;
import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface QuestionService {

    @GET("v1/questions?")
    Call<QuestionResponse> getQuestionList(
            @Header("Authorization") String token,
            @Query("title") String title
    );

    @FormUrlEncoded
    @POST("v1/questions?")
    Call<QuestionInsertResponse> getQuestionInsertList(
            @Header( "Authorization") String token,
            @Field( "title" ) String title,
            @Field( "content" ) String content
    );


    @DELETE("v1/questions/{id}")
    Call<QuestionDeleteResponse> getQuestionDeleteList(
            @Header( "Authorization" ) String token,
            @Path("id") int id
    );

    @FormUrlEncoded
    @PUT("v1/questions/{id}")
    Call<QuestionUpdateResponse> getQuestionUpdateList(
            @Header( "Authorization" ) String token,
            @Path( "id" ) int id,
            @Field( "title" ) String title,
            @Field("content") String content

    );
}
