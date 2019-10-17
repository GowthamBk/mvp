package com.example.myapplication.data;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface Api {

    @FormUrlEncoded
    @POST("login")
    Call<Void> userLogin(@Field("email") String email,
                   @Field("password") String password);

}
