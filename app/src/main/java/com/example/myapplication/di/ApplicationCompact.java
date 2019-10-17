package com.example.myapplication.di;

import com.example.myapplication.ApplicationModule;
import com.example.myapplication.ui.LoginActivity;

import dagger.Component;

@Component(modules = {LoginModule.class, ApplicationModule.class})
public interface ApplicationCompact {

    void inject(LoginActivity loginActivity);
}
