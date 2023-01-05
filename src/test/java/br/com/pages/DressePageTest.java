package br.com.pages;

import Pages.DressesPage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DressePageTest {
    private DressesPage dressesPage;
    private final String URL = "https://automationexercise.com/";

    @BeforeEach
    void setUp(){
      this.dressesPage = new DressesPage();
      this.dressesPage.visit(this.URL);
    }

    @AfterEach
    void tearDown(){
    this.dressesPage.quitWebDriver();
    }

    @Test
    void Test(){
        //when
        this.dressesPage.viewCasualDressesPage();
        //then
        Assertions.assertEquals("WOMEN - DRESS PRODUCTS", this.dressesPage.getTitlePage());
        Assertions.assertFalse(this.URL.equals(dressesPage.getCurrentUrl()));
    }
}
