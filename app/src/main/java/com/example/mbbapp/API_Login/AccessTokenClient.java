package com.example.mbbapp.API_Login;

import com.example.mbbapp.Model.AccessTokenModel;
import com.example.mbbapp.Model.LoginModel;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

public interface AccessTokenClient {
    @POST("/api/users/login")
    Call<AccessTokenModel> Login(@Body LoginModel loginModel);

}
