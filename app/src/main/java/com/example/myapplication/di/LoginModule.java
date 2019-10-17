package com.example.myapplication.di;

import com.example.myapplication.ui.LoginContract;
import com.example.myapplication.ui.LoginModel;
import com.example.myapplication.ui.LoginPresenter;

import dagger.Module;
import dagger.Provides;

@Module
public class LoginModule {

    @Provides
    public LoginContract.Presenter providePresenter(LoginContract.Model model){
        return new LoginPresenter(model);
    }

    @Provides
    public LoginContract.Model provideModel(){
        return new LoginModel();
    }

}
