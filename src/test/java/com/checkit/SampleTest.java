package com.checkit;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.junit5.TextReportExtension;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.logevents.SelenideLogger.*;

@ExtendWith({TextReportExtension.class})
class SampleTest extends BaseTest {

    private final SelenideElement signInButton = $(byText("Sign In"));
    private final SelenideElement usernameInput = $("#inputUsername");

    @Test
    void shouldBeLoggedIn() {
        signInButton.click();
        usernameInput.setValue("some username");
        $("#inputPassword").setValue("some username");
        $("gg-login-form .btn-primary").click();
    }
}
