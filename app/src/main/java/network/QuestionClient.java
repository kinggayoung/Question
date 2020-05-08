package network;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class QuestionClient {
    private static String BASE_URL = "http://question.api-namu.kro.kr:3000/";

    Retrofit retrofit = new Retrofit.Builder()
            .baseUrl( BASE_URL )
            .client( getOkHttpClient() )
            .addConverterFactory( GsonConverterFactory.create() )
            .build();

    public QuestionService getQuestionService() {
        return retrofit
                .create( QuestionService.class );
    }


    public AuthService getAuthService() {
        return retrofit
                .create( AuthService.class );
    }

    public UserService getUserService(){
        return retrofit
                .create( UserService.class );
    }

    public AnswerService getAnswerService(){
        return retrofit
                .create( AnswerService.class );
    }

    public ProfileService getProfileService(){
        return retrofit
                .create( ProfileService.class );
    }


    private OkHttpClient getOkHttpClient() {
        return new OkHttpClient.Builder()
                .addInterceptor(
                        new HttpLoggingInterceptor()
                                .setLevel( HttpLoggingInterceptor.Level.BODY )
                ).build();
    }

}
