package network;

import entity.auth.AuthResponse;
import entity.logout.LogoutResponse;
import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface AuthService {

    @FormUrlEncoded
    @POST("v1/auth/login/")
    Call<AuthResponse> getAuthList(
            @Field("nickname") String nickname,
            @Field("password") String password
    );

    @DELETE("v1/auth/logout")
    Call<LogoutResponse> getLogoutList(
           @Header( "Authorization" ) String token,
           @Query( "nickname" ) String nickname,
           @Query( "password" ) String password
    );

}
