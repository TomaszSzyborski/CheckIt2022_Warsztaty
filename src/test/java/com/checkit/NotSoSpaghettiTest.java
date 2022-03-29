package com.checkit;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.junit5.TextReportExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

@ExtendWith({TextReportExtension.class})
class NotSoSpaghettiTest extends BaseTest {

    private final SelenideElement signInButton = $(byText("Sign In"));
    private final SelenideElement usernameInput = $("#inputUsername");
    private final SelenideElement passwordInput = $("#inputPassword");
    private final SelenideElement signInOnModalButton = $("gg-login-form .btn-primary");
    private final SelenideElement usernameDropdown = $(".mygeek-dropdown-username");

    @Test
    void shouldBeLoggedIn() {
        signInButton.click();
        usernameInput.setValue("some username");
        passwordInput.setValue("some password");
        signInOnModalButton.click();
        usernameDropdown.shouldBe(Condition.visible);
    }
}
