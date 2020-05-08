package network;

import entity.userCreate.UserCreateResponse;
import entity.userDelete.UserDeleteResponse;
import entity.userSearch.UserResponse;
import entity.userUpdate.UserUpdateResponse;
import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Query;

public interface UserService {
    // 사용자 조회
    @GET("v1/users?")
    Call<UserResponse> getUserList(
            @Header("Authorization") String token
    );

    // 사용자 생성
    @FormUrlEncoded
    @POST("v1/users?")
    Call<UserCreateResponse> getUserCreateList(
            @Field("nickname") String nickname,
            @Field("password") String password
    );

    // 사용자 삭제
    @DELETE("v1/users/")
    Call<UserDeleteResponse> getUserDeleteList(
            @Header( "Authorization" ) String token
    );

    // 사용자 수정
    @FormUrlEncoded
    @PUT("v1/users/")
    Call<UserUpdateResponse> getUserUpdateList(
            @Header( "Authorization" ) String token,
            @Field( "password" ) String password
    );


}
