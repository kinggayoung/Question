package network;

import entity.profileInit.ProfileInitResponse;
import entity.profileUpdate.ProfileUpdateResponse;
import retrofit2.Call;
import retrofit2.http.DELETE;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Header;
import retrofit2.http.PUT;

public interface ProfileService {

    @FormUrlEncoded
    @PUT("v1/users/profiles")
    Call<ProfileUpdateResponse> getProfileUpdateList(
            @Header( "Authorization" ) String token,
            @Field( "profileImg" ) String profileImg,
            @Field( "greeting" ) String greeting
    );

    @DELETE("v1/users/profiles")
    Call<ProfileInitResponse> getProfileInitList(
            @Header( "Authorization" ) String token

    );
}
