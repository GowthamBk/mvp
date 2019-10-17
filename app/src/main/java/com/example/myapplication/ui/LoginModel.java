package com.example.myapplication.ui;

import com.example.myapplication.data.Api;
import com.example.myapplication.data.ApiClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginModel implements LoginContract.Model{

    Api api = ApiClient.getClient().create(Api.class);

    @Override
    public void getUserDetails(String email, String password,final ModelListener modelListener) {
        Call<Void> loginSuccess = api.userLogin(email, password);

        loginSuccess.enqueue(new Callback<Void>() {
            @Override
            public void onResponse(Call<Void> call, Response<Void> response) {
                modelListener.getUserSuccessful();
            }

            @Override
            public void onFailure(Call<Void> call, Throwable t) {

            }
        });
    }
}
