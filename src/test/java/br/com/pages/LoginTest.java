package br.com.pages;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
    private WebDriver driver;

    @BeforeEach
    void setUp() {
        System.setProperty("webdrive.chrome.driver",
                "C:\\edu.java\\Teste SeleniumWebDrive\\TesteSeleniumWebDriver\\.idea\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://automationexercise.com/login");

    }
    @AfterEach
    void tearDown() {
        driver.quit();
    }

    @Test
    void test(){
        // procurar pelo campo de entrada do site name
        WebElement emailAddressElement = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]"));
        emailAddressElement.sendKeys("frankvt04@gmail.com");

        // campo de senha
        WebElement passawordElement = driver.findElement(By.name("password"));
        passawordElement.sendKeys("N4dTKi66LMa");

        // click entra na página
        WebElement submitBtnElement = driver.findElement(By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button"));
        submitBtnElement.click();

        // quer saber qual texto tem no h1
        WebElement tagAutomationExecirse = driver.findElement(By.tagName("h1"));
        String textTagH1 = tagAutomationExecirse.getText(); //retorna o texto

        Assertions.assertFalse(textTagH1.equals("Automation"));
    }
}
