package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class MainPage extends BasePage{

    @FindBy(xpath = "//div[@class='lg-menu']")
    WebElement menuItems;



    public MainPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    public void selectMenuItem(String itemName){
        menuItems.findElement(By.xpath(".//span[contains(text(),'"+itemName+"')]")).click();
    }

    public void selectInsuranceItem(String itemName){
        driver.findElement(By.xpath("//a[@class='lg-menu__sub-link'][contains(text(),'"+itemName+"')]")).click();

    }

}