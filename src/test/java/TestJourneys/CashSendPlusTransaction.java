package TestJourneys;

import BaseFramework.BaseClass;
import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.PaymentsPage;
import PageObjects.passwordpage;
import org.testng.annotations.Listeners;

import java.io.IOException;

@Listeners(Utilities.ExtentList.class)
public class CashSendPlusTransaction extends BaseClass {

   /* Used PageObjects
    LoginPage
    passwordpage
    HomePage
    PaymentsPage
    */

    @org.testng.annotations.Test(priority = 1)
    public void LaunchBrowser() throws InterruptedException {
        launchBrowser("chrome", "https://onlinebankinguat2.absa.co.za/absa-online/login.jsp");
        Thread.sleep(5000);
    }
    @org.testng.annotations.Test(priority = 2)
    public void EnterCredentials() throws InterruptedException {

        LoginPage.EnterAcNo("4048405107");
        LoginPage.EnterPinNo("05107");
    }
    @org.testng.annotations.Test(priority = 3)
    public void ClickNextBtn() throws InterruptedException {
        LoginPage.ClickNextbtn();
        Thread.sleep(5000);
    }
    @org.testng.annotations.Test(priority = 4)
    public void HandlePassword() throws InterruptedException {
        passwordpage.EnterPassword();

    }
    @org.testng.annotations.Test(priority = 5)
    public void ClickLogon() {
        passwordpage.clickLogon();
    }
    @org.testng.annotations.Test(priority = 6)
    public void HandlePopup() throws InterruptedException {
        HomePage.ClickPopupclsbtn();
        Thread.sleep(5000);
    }
    @org.testng.annotations.Test(priority = 7)
    public void NavigatetoPaymentsPage() throws InterruptedException {
        HomePage.GotoPaymentsPage();
        Thread.sleep(5000);
    }
    @org.testng.annotations.Test(priority = 8)
    public void ClickCashsend() throws InterruptedException {

        PaymentsPage.ClickCashSendPlusLink();
    }
    @org.testng.annotations.Test(priority = 9)
    public void ClicksendSingle_Cashsend() throws InterruptedException {

        PaymentsPage.ClickSendSingleCashSend();
        Thread.sleep(5000);
    }
    @org.testng.annotations.Test(priority = 10)
    public void SelectAccountNofromDD() throws InterruptedException {
        PaymentsPage.ClickFromAccDDCashsendPlusSingle();
        PaymentsPage.SelectFromAccCashsendPlusSingle("4048405107");

    }
    @org.testng.annotations.Test(priority = 11)
    public void EnterBenficiaryAcc() throws InterruptedException {
        PaymentsPage.EnterBeneficiaryACCNo("0758678787");
        Thread.sleep(2000);
    }
    @org.testng.annotations.Test(priority = 12)
    public void EnterAmount() throws InterruptedException {
        PaymentsPage.EnterAmount("50");
        Thread.sleep(2000);
    }
    @org.testng.annotations.Test(priority = 13)
    public void EnterAccessCode() throws InterruptedException {
        PaymentsPage.EnterAccessCode("123456");
        Thread.sleep(2000);
    }
    @org.testng.annotations.Test(priority = 14)
    public void ConfirmAccessCode() throws InterruptedException {
        PaymentsPage.EnterConfirmAccessCode("123456");
        Thread.sleep(2000);
    }
    @org.testng.annotations.Test(priority = 15)
    public void EnterMyreference() throws InterruptedException {
        PaymentsPage.EnterMyReference("Test-Murali");
        Thread.sleep(2000);
    }
    @org.testng.annotations.Test(priority = 16)
    public void ClickNextBtninCashsendsingle() throws InterruptedException {
        PaymentsPage.ClickNextbtn();
        Thread.sleep(5000);
    }
    @org.testng.annotations.Test(priority = 17)
    public void ClickSendBtnincnfm2() throws InterruptedException, IOException {
        PaymentsPage.ClickCnfm2sendbtn();
        Thread.sleep(15000);
   }
    @org.testng.annotations.Test(priority = 18)
    public void VerifyTransactionStatus() throws InterruptedException, IOException {
        BaseClass.getScreenshot();
        PaymentsPage.CheckCashSendPlustranscationstatus();

    }



    @org.testng.annotations.Test(priority = 300)
    public void Closebrowser() {
        driver.quit();
    }


}
