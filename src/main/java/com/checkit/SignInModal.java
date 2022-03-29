package com.checkit;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class SignInModal {

    private final SelenideElement usernameInput = $("#inputUsername");
    private final SelenideElement passwordInput = $("#inputPassword");
    private final SelenideElement signInButton = $("gg-login-form .btn-primary");

    public void logInWith(String username, String password){
        usernameInput.setValue(username);
        passwordInput.setValue(password);
        signInButton.click();
    }
}
