package com.checkit;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.junit5.TextReportExtension;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.logevents.SelenideLogger.*;

@ExtendWith({TextReportExtension.class})
class SampleTest {
    @BeforeAll
    static void setupAllureReports() {
        addListener("AllureSelenide", new AllureSelenide());

    }
    @Test
    void sampleSelenide() {
        Selenide.open("https://boardgamegeek.com/");
        $(".menu-logo-symbol").shouldBe(Condition.visible);
    }
}
