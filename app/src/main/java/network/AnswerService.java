package network;

import entity.answerDelete.AnswerDeleteResponse;
import entity.answerInsert.AnswerInsertResponse;
import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

public interface AnswerService {

    @FormUrlEncoded
    @POST("v1/questions/{questionId}/answers/")
    Call<AnswerInsertResponse> getAnswerInsertList(
            @Header( "Authorization" ) String Token,
            @Path( "questionId" ) int questionId,
            @Field( "content" ) String content
    );

    @DELETE("v1/questions/{questionId}/answers/{id}")
    Call<AnswerDeleteResponse> getAnswerDeleteList(
            @Header( "Authorization" ) String token,
            @Path("questionId") int questionId,
            @Path("id") int id
    );

    @FormUrlEncoded
    @PUT("v1/questions/{questionId}/answers/{id}")
    Call<AnswerDeleteResponse> getAnswerUpdateList(
            @Header( "Authorization" ) String token,
            @Path("questionId") int questionId,
            @Path("id") int id,
            @Field("content") String content
    );

}
