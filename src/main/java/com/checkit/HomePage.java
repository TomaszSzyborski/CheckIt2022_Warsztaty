package com.checkit;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class HomePage {
    private final SelenideElement signInButton = $(byText("Sign In"));
    private final SelenideElement usernameDropdown = $(".mygeek-dropdown-username");

    public void openSignInModal(){
        signInButton.click();
    }

    public String getLoggedInUsername(){
        return usernameDropdown.text();
    }
}
