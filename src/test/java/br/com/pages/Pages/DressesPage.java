package br.com.pages.Pages;

import org.openqa.selenium.By;

public class DressesPage extends BasePage {
    //Locators
    private By menuWomemLocato = By.cssSelector("#accordian > div:nth-child(1) > div.panel-heading > h4 > a");
    private By submenuDressesLocato = By.cssSelector("#Women > div > ul > li:nth-child(1) > a");
    private  By titlePageDressesProdutLocato = By.cssSelector("body > section > div > div.breadcrumbs > ol > li:nth-child(1) > a");

    public void viewCasualDressesPage(){
        if (super.isDisplayed(menuWomemLocato)){
            super.actionMoveToElementClickPerform(menuWomemLocato);
            super.actionMoveToElementPerform(submenuDressesLocato);
            super.actionMoveToElementClickPerform(submenuDressesLocato);

        }else {
            System.out.println("menu dresses was not found");
        }
    }
    //pega o elemento
    public String geteTitlePage(){
        return super.getTexte(titlePageDressesProdutLocato);
    }

}
