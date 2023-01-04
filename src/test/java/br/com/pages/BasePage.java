package br.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public abstract class BasePage {
    //atributos driver
    private WebDriver driver;

    //Construtor
    public BasePage(){
        System.setProperty("webdrive.chrome.driver",
                "C:\\edu.java\\Teste SeleniumWebDrive\\TesteSeleniumWebDriver\\.idea\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    //Métodos chama pagina encapsulamento
    public void visit(String url){
        this.driver.get(url);
    }

    public String getCurrentUrl(){ // metodo retorna o url pagina que esta
        return this.driver.getCurrentUrl();
    }

    public void quitWebDriver(){ // método fecha
        this.driver.quit();
    }

    public WebElement findElement(By locator){ // encontrar o elmento
        return this.driver.findElement(locator);
    }

    public void type(String input, By locator){ // método inserir valor no elemento
        this.driver.findElement(locator).sendKeys(input);
    }

    public Boolean isDisplayed(By locator){ // antes e ate o selenium ler a pagina se o elemento esta visivel na pagina
        try{
            return this.driver.findElement(locator).isDisplayed(); // se encontrar o elemento
        } catch (NoSuchElementException e){ // caso não encontra o elemento estoura a exception
            return false;
        }
    }

    public void click(By locator){ // método da o click
        this.driver.findElement(locator).click();
    }

    public String getText(By locator){ // encontra o texto
        return this.driver.findElement(locator).getText();
    }
}
