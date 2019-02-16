package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;

public class GoogleSearchPage {
    WebDriver driver=null;
    By textBox_googleSearch = By.name("q");
    By button_serach = By.name("btnk");

    public GoogleSearchPage(WebDriver webdriver)
    {
        driver=webdriver;
    }

    public void enterTxt(String searchTerm){
        driver.findElement(textBox_googleSearch).sendKeys(searchTerm);
    }
    public void clickSearchButton(){
        driver.findElement(textBox_googleSearch).sendKeys(Keys.ENTER);
    }



}
