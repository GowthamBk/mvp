package com.example.myapplication.ui;

public interface LoginContract {

    interface View {

        void onSuccess(String userSuccessful);

        void onFailure();

    }

    interface Presenter {

        void setView(LoginContract.View view);

        void getEmailAndPassword(String email, String password);

    }

    interface Model {

        void getUserDetails(String email, String password, ModelListener modelListener);

        interface ModelListener {

            String getUserSuccessful();

        }


    }

}
