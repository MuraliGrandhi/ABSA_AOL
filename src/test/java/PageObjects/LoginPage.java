package PageObjects;


import BaseFramework.BaseClass;
import org.openqa.selenium.By;

public class LoginPage extends BaseClass {

//------------------------------------------------------------------------------------------------------------------------
//**************************ELEMENT DECLARATION START******************************************
//------------------------------------------------------------------------------------------------------------------------

static By AcNo = By.id("j_username");
static By Pin = By.xpath("//*[@id='j_pin']");
static By Nextbtn = By.xpath("//div[text()='Next']");

//------------------------------------------------------------------------------------------------------------------------
//**************************ELEMENT DECLARATION END******************************************
//------------------------------------------------------------------------------------------------------------------------


//------------------------------------------------------------------------------------------------------------------------
//**************************ACTIONS DECLARATION START******************************************
//------------------------------------------------------------------------------------------------------------------------
    public static void EnterAcNo(String AccNo)
    {
        driver.findElement(AcNo).sendKeys(AccNo);

    }

    public static void EnterPinNo(String Pinno)
    {
        driver.findElement(Pin).sendKeys(Pinno);

    }

    public static void ClickNextbtn()

    {
        driver.findElement(Nextbtn).click();
    }
//------------------------------------------------------------------------------------------------------------------------
//**************************ACTIONS DECLARATION END******************************************
//------------------------------------------------------------------------------------------------------------------------
}
