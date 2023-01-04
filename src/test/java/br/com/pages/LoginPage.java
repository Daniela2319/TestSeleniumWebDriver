package br.com.pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage {
    //Locators
    private By emailAddressLocator = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/input[2]");
    private By passwordLocator = By.name("password");
    private By submitBtnLocator = By.xpath("//*[@id=\"form\"]/div/div/div[1]/div/form/button");

    private By tagAutomationExercirse = By.tagName("h1");

    public void signin(){
        if (super.isDisplayed(emailAddressLocator)){
            super.type("frankvt04@gmail.com", emailAddressLocator);
            super.type("N4dTKi66LMa", passwordLocator);
            super.click(submitBtnLocator);



        }else {
            System.out.println("email texto da caixa não está presente!");
        }
    }

    public String getAutomationExecirse(){
        return super.getText(tagAutomationExercirse);
    }
}
