package com.checkit;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.logevents.SelenideLogger.addListener;

public class BaseTest {

    private final SelenideElement logo = $(".menu-logo-symbol");

    @BeforeAll
    static void setupAllureReports() {
        addListener("AllureSelenide", new AllureSelenide());
    }

    @BeforeEach
    void openBrowser(){
        open("https://boardgamegeek.com/");
        logo.shouldBe(visible);
    }
}
