package com.checkit;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.junit5.TextReportExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

@ExtendWith({TextReportExtension.class})
class SpaghettiTest extends BaseTest {

    @Test
    void shouldBeLoggedIn() {
        $(byText("Sign In")).click();
        $("#inputUsername").setValue("some username");
        $("#inputPassword").setValue("some password");
        $("gg-login-form .btn-primary").click();
        $(".mygeek-dropdown-username").shouldBe(Condition.visible);
    }
}
