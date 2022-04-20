package PageObjects;

import org.openqa.selenium.By;

import static BaseFramework.BaseClass.driver;

public class AddBenificiary {

//------------------------------------------------------------------------------------------------------------------------
//**************************ELEMENT DECLARATION START******************************************
//------------------------------------------------------------------------------------------------------------------------

    static By FirstName = By.name("beneficiaryFirstName");
    static By Surname = By.xpath("(//input[@bbf_type='simple:addBenNameShort'])[2]");
    static By NickName = By.name("beneficiaryNickname");
    static By CellPhoneNumber = By.xpath("(//input[@name='cellphoneNumber'])[2]");
    static By MyReference = By.name("myRef");
    static By NextBtninAddBen = By.xpath("//button[@type='submit']//div");
    static By ResetBtninAddBen = By.xpath("//div[@id='g86']/div[1]/div[1]/div[1]/div[3]/div[5]/div[1]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/div[4]/div[1]/button[1]/div[1]");
    static By CancelBtninAddBen = By.xpath("(//div[text()='Cancel'])[3]");
//------------------------------------------------------------------------------------------------------------------------
//**************************ELEMENT DECLARATION END******************************************
//------------------------------------------------------------------------------------------------------------------------

//------------------------------------------------------------------------------------------------------------------------
//**************************ACTIONS DECLARATION START******************************************
//------------------------------------------------------------------------------------------------------------------------

    public static void CreateBeneficiary(String Firstname, String surname,String Nickname,String CellphoneNumber,String Reference)
    {
        driver.findElement(FirstName).sendKeys(Firstname);
        driver.findElement(Surname).sendKeys(surname);
        driver.findElement(NickName).sendKeys(Nickname);
        driver.findElement(CellPhoneNumber).sendKeys(CellphoneNumber);
        driver.findElement(MyReference).sendKeys(Reference);


    }
    public static void ClickNextinAddBen(String Firstname, String surname,String Nickname,String CellphoneNumber,String Reference)
    {
        driver.findElement(NextBtninAddBen).click();

    }

    public static void ClickCancelinAddBen(String Firstname, String surname,String Nickname,String CellphoneNumber,String Reference)
    {
        driver.findElement(CancelBtninAddBen).click();

    }

    public static void ClickResetinAddBen(String Firstname, String surname,String Nickname,String CellphoneNumber,String Reference)
    {
        driver.findElement(ResetBtninAddBen).click();

    }
 //------------------------------------------------------------------------------------------------------------------------
//**************************ACTIONS DECLARATION END******************************************
//------------------------------------------------------------------------------------------------------------------------
}
