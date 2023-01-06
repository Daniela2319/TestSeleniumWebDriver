package br.com.pages;

import br.com.pages.Pages.LoginPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LoginPageTest {

    private LoginPage loginPage;
    private final String URL = "https://automationexercise.com/login";

    @BeforeEach
    void setUp(){
        loginPage = new LoginPage();
        loginPage.visit(this.URL);
    }

    @AfterEach
    void tearDown(){
        loginPage.quitWebDriver();
    }

    @Test
    void test(){
        //Whem: tradução quando
        loginPage.signin();

        //then: tradução então
        Assertions.assertFalse(this.loginPage.getAutomationExecirse().equals("Automation"));
        Assertions.assertFalse(this.loginPage.getCurrentUrl().equals(this.URL));
    }
}
