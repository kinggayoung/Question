package com.example.questionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import entity.answerDelete.AnswerDeleteData;
import entity.answerDelete.AnswerDeleteResponse;
import entity.answerInsert.AnswerInsertResponse;
import entity.auth.AuthResponse;
import entity.logout.LogoutResponse;
import entity.profileInit.ProfileInitResponse;
import entity.profileUpdate.ProfileUpdateResponse;
import entity.question.QuestionResponse;
import entity.questionDelete.QuestionDeleteResponse;
import entity.questionInsert.QuestionInsertResponse;
import entity.questionUpate.QuestionUpdateResponse;
import entity.userCreate.UserCreateResponse;
import entity.userDelete.UserDeleteResponse;
import entity.userSearch.UserResponse;
import entity.userUpdate.UserUpdateResponse;
import network.QuestionClient;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    final QuestionClient questionClient = new QuestionClient();

    String Token;

    EditText editName;
    EditText editPw;
    Button btnOk;
    Button btnCancle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_login );

        editName = findViewById( R.id.edit_name );
        editPw = findViewById( R.id.edit_pw );
        btnOk = findViewById( R.id.btn_ok );
        btnCancle = findViewById( R.id.btn_cancel );

        editName.setText( "jinju" );
        editPw.setText( "1q2w" );

        btnOk.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d( TAG, "onClick: ok" );

                AuthClient();
            }
        } );

        btnCancle.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Log.d( TAG, "onClick: cancle" );

                finishAffinity(); // 해당 앱의 루트 액티비티 종료
            }
        } );

    }

    private void AuthClient() {

        questionClient.getAuthService().getAuthList( editName.getText().toString(), editPw.getText().toString() ).enqueue( new Callback<AuthResponse>() {
            @Override
            public void onResponse(Call<AuthResponse> call, Response<AuthResponse> response) {
                Log.d( TAG, "로그인 성공 \nonResponse: response.body() = [" + response.body() + "]" );

                Token = "Bearer " + response.body().getData().getToken();

//                UserClient();
//                UserCreateClient();
//                UserDeleteClient();
//                UserUpdateClient();
//                AnswerInsertClient();
                QuetionsClient();
//                QuestionInsertClient();
//                QuestionDeleteClient();
//                ProfileClient();
//                ProfileInitClient();
//                QuestionUpdateClient();
//                AnswerDeleteClient();
//                AnswerUpdateClient();
//                LogoutClient();

                }

            @Override
            public void onFailure(Call<AuthResponse> call, Throwable t) {
                Log.d( TAG, "로그인 실패\nonResponse: [" + t.toString() + "]" );
            }

        } );


    }

    private void AnswerUpdateClient() {
        questionClient.getAnswerService().getAnswerUpdateList( Token, 69, 71, "edit answer!" ).enqueue( new Callback<AnswerDeleteResponse>() {
            @Override
            public void onResponse(Call<AnswerDeleteResponse> call, Response<AnswerDeleteResponse> response) {
                Log.d( TAG, "성공\nonResponse: response.body() = [" + response.body().toString() + "]" );

            }

            @Override
            public void onFailure(Call<AnswerDeleteResponse> call, Throwable t) {
                Log.d( TAG, "실패\nonResponse: [" + t.toString() + "]" );

            }
        } );
    }

    private void AnswerDeleteClient() {
        questionClient.getAnswerService().getAnswerDeleteList( Token, 95, 70 ).enqueue( new Callback<AnswerDeleteResponse>() {
            @Override
            public void onResponse(Call<AnswerDeleteResponse> call, Response<AnswerDeleteResponse> response) {
                Log.d( TAG, "성공\nonResponse: response.body() = [" + response.body().toString() + "]" );

            }

            @Override
            public void onFailure(Call<AnswerDeleteResponse> call, Throwable t) {
                Log.d( TAG, "실패\nonResponse: [" + t.toString() + "]" );

            }
        } );
    }

    private void QuestionUpdateClient() {
        questionClient.getQuestionService().getQuestionUpdateList( Token, 96 , "edit", "edit").enqueue( new Callback<QuestionUpdateResponse>() {
            @Override
            public void onResponse(Call<QuestionUpdateResponse> call, Response<QuestionUpdateResponse> response) {
                Log.d( TAG, "성공\nonResponse: response.body() = [" + response.body().toString() + "]" );

            }

            @Override
            public void onFailure(Call<QuestionUpdateResponse> call, Throwable t) {
                Log.d( TAG, "실패\nonResponse: [" + t.toString() + "]" );

            }
        } );
    }

    private void ProfileInitClient() {
        questionClient.getProfileService().getProfileInitList( Token ).enqueue( new Callback<ProfileInitResponse>() {
            @Override
            public void onResponse(Call<ProfileInitResponse> call, Response<ProfileInitResponse> response) {
                Log.d( TAG, "성공\nonResponse: response.body() = [" + response.body().toString() + "]" );

            }

            @Override
            public void onFailure(Call<ProfileInitResponse> call, Throwable t) {
                Log.d( TAG, "실패\nonResponse: [" + t.toString() + "]" );
            }
        } );
    }

    private void ProfileClient() {
        questionClient.getProfileService().getProfileUpdateList( Token, "https://google.com", "hello" ).enqueue( new Callback<ProfileUpdateResponse>() {
            @Override
            public void onResponse(Call<ProfileUpdateResponse> call, Response<ProfileUpdateResponse> response) {
                Log.d( TAG, "수정 성공\nonResponse: response.body() = [" + response.body().toString() + "]" );

            }

            @Override
            public void onFailure(Call<ProfileUpdateResponse> call, Throwable t) {
                Log.d( TAG, "수정 실패\nonResponse: [" + t.toString() + "]" );

            }
        } );
    }

    private void UserUpdateClient() {
        questionClient.getUserService().getUserUpdateList( Token, "1234" ).enqueue( new Callback<UserUpdateResponse>() {
            @Override
            public void onResponse(Call<UserUpdateResponse> call, Response<UserUpdateResponse> response) {
                Log.d( TAG, "수정 성공\nonResponse: response.body() = [" + response.body().toString() + "]" );

            }

            @Override
            public void onFailure(Call<UserUpdateResponse> call, Throwable t) {
                Log.d( TAG, "수정 실패\nonResponse: [" + t.toString() + "]" );

            }
        } );
    }

    private void UserDeleteClient() {
        questionClient.getUserService().getUserDeleteList( Token ).enqueue( new Callback<UserDeleteResponse>() {
            @Override
            public void onResponse(Call<UserDeleteResponse> call, Response<UserDeleteResponse> response) {
                Log.d( TAG, "계정삭제 성공\nonResponse: response.body() = [" + response.body().toString() + "]" );

            }

            @Override
            public void onFailure(Call<UserDeleteResponse> call, Throwable t) {
                Log.d( TAG, "계정삭제 실패\nonResponse: [" + t.toString() + "]" );

            }
        } );
    }

    private void LogoutClient() {
        questionClient.getAuthService().getLogoutList( Token, "nickname_5", "password_122" ).enqueue( new Callback<LogoutResponse>() {
            @Override
            public void onResponse(Call<LogoutResponse> call, Response<LogoutResponse> response) {
                Log.d( TAG, "로그아웃 성공\nonResponse: response.body() = [" + response.body().toString() + "]" );

            }

            @Override
            public void onFailure(Call<LogoutResponse> call, Throwable t) {
                Log.d( TAG, "로그아웃 실패\nonResponse: [" + t.toString() + "]" );

            }
        } );
    }

    private void QuestionDeleteClient() {
        questionClient.getQuestionService().getQuestionDeleteList( Token, 8 ).enqueue( new Callback<QuestionDeleteResponse>() {
            @Override
            public void onResponse(Call<QuestionDeleteResponse> call, Response<QuestionDeleteResponse> response) {
                Log.d( TAG, "삭제 성공\nonResponse: response.body() = [" + response.body().toString() + "]" );

            }

            @Override
            public void onFailure(Call<QuestionDeleteResponse> call, Throwable t) {
                Log.d( TAG, "삭제 실패\nonFailure: [" + t.toString() + "]" );

            }
        } );
    }

    private void QuestionInsertClient() {
        questionClient.getQuestionService().getQuestionInsertList( Token, "new", "nonstop" ).enqueue( new Callback<QuestionInsertResponse>() {
            @Override
            public void onResponse(Call<QuestionInsertResponse> call, Response<QuestionInsertResponse> response) {
                Log.d( TAG, "등록 성공\nonResponse: response.body() = [" + response.body().toString() + "]" );
            }

            @Override
            public void onFailure(Call<QuestionInsertResponse> call, Throwable t) {
                Log.d( TAG, "등록 실패\nonFailure: [" + t.toString() + "]" );

            }
        } );
    }

    private void AnswerInsertClient() {
        Log.d( TAG, "AnswerInsertClient: Token = [" + Token + "]");
        questionClient.getAnswerService().getAnswerInsertList( Token, 3, "insert answer" ).enqueue( new Callback<AnswerInsertResponse>() {
            @Override
            public void onResponse(Call<AnswerInsertResponse> call, Response<AnswerInsertResponse> response) {
                Log.d( TAG, "등록 성공\nonResponse: response.body() = [" + response.body().toString() + "]" );
            }

            @Override
            public void onFailure(Call<AnswerInsertResponse> call, Throwable t) {
                Log.d( TAG, "등록 실패\nonFailure: [" + t.toString() + "]" );
            }
        } );
    }

    private void UserCreateClient() {

        questionClient.getUserService().getUserCreateList( "nickname_postman_27", "1234" ).enqueue( new Callback<UserCreateResponse>() {

            @Override
            public void onResponse(Call<UserCreateResponse> call, Response<UserCreateResponse> response) {
                Log.d( TAG, "생성 성공\nonResponse: response.body() = [" + response.body().toString() + "]" );
            }

            @Override
            public void onFailure(Call<UserCreateResponse> call, Throwable t) {
                Log.d( TAG, "생성 실패\nonFailure: [" + t.toString() + "]" );
            }
        } );

    }

    private void UserClient() {
        questionClient.getUserService().getUserList( Token ).enqueue( new Callback<UserResponse>() {
            @Override
            public void onResponse(Call<UserResponse> call, Response<UserResponse> response) {
                Log.d( TAG, "조회 성공\nonResponse: response.body() = [" + response.body().toString() + "]" );
            }

            @Override
            public void onFailure(Call<UserResponse> call, Throwable t) {
                Log.d( TAG, "조회 실패\nonFailure: [" + t.toString() + "]" );
            }
        } );
    }

    private void QuetionsClient() {
        questionClient.getQuestionService().getQuestionList( Token, "" ).enqueue( new Callback<QuestionResponse>() {
            @Override
            public void onResponse(Call<QuestionResponse> call, Response<QuestionResponse> response) {
                QuestionResponse data = response.body();
                Log.d( TAG, "조회 성공\nonResponse: response.body() = [" + response.body().toString() + "]" );


            }

            @Override
            public void onFailure(Call<QuestionResponse> call, Throwable t) {
                Log.d( TAG, "조회 실패\nonResponse: [" + t.toString() + "]" );

            }
        } );
    }
}
