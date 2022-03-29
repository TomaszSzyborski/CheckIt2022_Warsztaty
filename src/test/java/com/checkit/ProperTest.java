package com.checkit;

import com.codeborne.selenide.junit5.TextReportExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith({TextReportExtension.class})
class ProperTest extends BaseTest {
    private final HomePage homePage = new HomePage();
    private final SignInModal signInModal = new SignInModal();

    private final String username = "some username";
    private final String password = "some password";

    @Test
    void userShouldBeLoggedIn(){
        homePage.openSignInModal();
        signInModal.logInWith(username, password);
        assertThat(homePage.getLoggedInUsername())
                .isEqualTo(username);
    }
}
