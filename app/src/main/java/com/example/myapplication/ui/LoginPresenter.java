package com.example.myapplication.ui;

public class LoginPresenter implements LoginContract.Presenter, LoginContract.Model.ModelListener {

    private LoginContract.View view;
    private LoginContract.Model loginModel;

    public LoginPresenter(LoginContract.Model model) {
        this.loginModel = model;
    }

    @Override
    public void setView(LoginContract.View view) {
        this.view = view;
    }

    @Override
    public void getEmailAndPassword(String email, String password) {
        if (email.equals("") || password.equals("")) {
            view.onFailure();
        } else {
            loginModel.getUserDetails(email, password, this);
        }
    }

    @Override
    public String getUserSuccessful() {
        view.onSuccess("Success");
        return "";
    }
}
