package com.example.myapplication;

import android.app.Application;

import com.example.myapplication.di.ApplicationCompact;
import com.example.myapplication.di.DaggerApplicationCompact;
import com.example.myapplication.di.LoginModule;

public class MyApp extends Application {

    private ApplicationCompact applicationCompact;

    @Override
    public void onCreate() {
        super.onCreate();

        applicationCompact = DaggerApplicationCompact.builder()
                .applicationModule(new ApplicationModule(this))
                .loginModule(new LoginModule())
                .build();
    }

    public ApplicationCompact getApplicationCompact() {
        return applicationCompact;
    }
}
