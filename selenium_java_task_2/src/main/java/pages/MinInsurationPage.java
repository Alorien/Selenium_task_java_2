package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import java.util.ArrayList;
;


public class MinInsurationPage extends BasePage{




    public MinInsurationPage(WebDriver driver){
        PageFactory.initElements(driver, this);
        this.driver = driver;
        //Получение массива вкладок
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        //Переход на новую вкладку
        driver.switchTo().window(tabs.get(1));
    }
    public void selectMinIsuration(String itemName){
        driver.findElement(By.xpath("//div[contains(text(),'"+itemName+"')]")).click();
    }
    public void selectRegItem(String itemName){
        driver.findElement(By.xpath("//span[@ng-click='save()' and contains(text(),'"+itemName+"')]")).click();
    }



}