package PageObjects;

import BaseFramework.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

import static BaseFramework.BaseClass.driver;

public class passwordpage extends BaseClass {
//------------------------------------------------------------------------------------------------------------------------
//**************************ELEMENT DECLARATION START******************************************
//------------------------------------------------------------------------------------------------------------------------

//------------------------------------------------------------------------------------------------------------------------
//**************************ELEMENT DECLARATION END******************************************
//------------------------------------------------------------------------------------------------------------------------

//------------------------------------------------------------------------------------------------------------------------
//**************************ACTIONS DECLARATION START******************************************
//------------------------------------------------------------------------------------------------------------------------

    public static void EnterPassword() throws InterruptedException {


        //Entering Security SurePhrase
        List<WebElement> elements = driver.findElements(By.xpath("//input[contains(@class, 'pf pf2')]"));
        for (int i = 0; i < elements.size(); i++) {
            String value = elements.get(i).getAttribute("num");
            if ("1".equals(value)) {
                elements.get(i).sendKeys("p");
            } else if ("2".equals(value)) {
                elements.get(i).sendKeys("a");
            } else if ("3".equals(value)) {
                elements.get(i).sendKeys("s");
            } else if ("4".equals(value)) {
                elements.get(i).sendKeys("s");
            } else if ("5".equals(value)) {
                elements.get(i).sendKeys("w");
            } else if ("6".equals(value)) {
                elements.get(i).sendKeys("o");
            } else if ("7".equals(value)) {
                elements.get(i).sendKeys("r");
            } else if ("8".equals(value)) {
                elements.get(i).sendKeys("d");
            } else if ("9".equals(value)) {
                elements.get(i).sendKeys("1");
            } else {
                throw new Error("no value found");
            }
        }

    }

    public static void clickLogon(){

        WebElement LogonBtn = driver.findElement(By.xpath("(//div[text()='Logon'])[3]"));

        LogonBtn.click();
    }

//------------------------------------------------------------------------------------------------------------------------
//**************************ACTIONS DECLARATION END******************************************
//------------------------------------------------------------------------------------------------------------------------
}
