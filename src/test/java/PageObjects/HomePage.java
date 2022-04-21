package PageObjects;

import BaseFramework.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static BaseFramework.BaseClass.driver;

public class HomePage {

//------------------------------------------------------------------------------------------------------------------------
//**************************ELEMENT DECLARATION START******************************************
//------------------------------------------------------------------------------------------------------------------------

    static By popUpClsBtn = By.xpath("//body[@id='ap-page-body']/div[43]/div[1]/div[1]/form[1]/div[3]/button[1]/div[1]/div[1]/div[1]");
    static By PaymentspageLink = By.xpath("(//div[@class='ap-tab-title'])[2]");
    static By RemindMeLater_Btn = By.xpath("//div[text()='Remind me later']");
    static By Confirmation_Chk_Box = By.xpath("//input[@messageref='.ui-form-field-errorMessage']");
    static By IAgreetoUpgradeLater_Btn = By.xpath("//div[text()='I agree to upgrade later']");

//------------------------------------------------------------------------------------------------------------------------
//**************************ELEMENT DECLARATION END******************************************
//------------------------------------------------------------------------------------------------------------------------

//------------------------------------------------------------------------------------------------------------------------
//**************************ACTIONS DECLARATION START******************************************
//------------------------------------------------------------------------------------------------------------------------

    public static void ClickPopupclsbtn() throws InterruptedException {

       /* Boolean closebtn = BaseClass.driver.findElement(popUpClsBtn).isDisplayed();
        if (closebtn==true) {

            driver.findElement(popUpClsBtn).click();
            Thread.sleep(2000);
        }*/
        Boolean RemindMeLater= BaseClass.driver.findElement(RemindMeLater_Btn).isDisplayed();
        if (RemindMeLater==true) {

            driver.findElement(RemindMeLater_Btn).click();
            Thread.sleep(2000);
        }
        Boolean ConfirmationChkBox= BaseClass.driver.findElement(Confirmation_Chk_Box).isDisplayed();
        if (ConfirmationChkBox==true) {

            driver.findElement(Confirmation_Chk_Box).click();
            Thread.sleep(2000);
        }

        Boolean IAgreetoUpgradeLater= BaseClass.driver.findElement(IAgreetoUpgradeLater_Btn).isDisplayed();
        if (IAgreetoUpgradeLater==true) {

            driver.findElement(IAgreetoUpgradeLater_Btn).click();
            Thread.sleep(2000);
        }
    }
    public static void GotoPaymentsPage()
    {
        driver.findElement(PaymentspageLink).click();

    }
 //------------------------------------------------------------------------------------------------------------------------
//**************************ACTIONS DECLARATION END******************************************
//------------------------------------------------------------------------------------------------------------------------
}
