package TestJourneys;

import BaseFramework.BaseClass;
import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.PaymentsPage;
import PageObjects.passwordpage;
import org.testng.annotations.Listeners;

import java.io.IOException;

@Listeners(Utilities.ExtentList.class)
public class InterAccountTransfer extends BaseClass {

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
    public void EnterCredentials()  {

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
    public void ClickInterAccTransfrLink() throws InterruptedException {
        PaymentsPage.ClickInterAccTrnsfrLink();
        Thread.sleep(5000);
    }
    @org.testng.annotations.Test(priority = 9)
    public void SelectAccountNofromDD() throws InterruptedException {
        PaymentsPage.ClickFromAccDDInterAcctrnsfrSingle();
        PaymentsPage.SelectFromInterAcctrnsfrSingle("4048405107");

    }
    @org.testng.annotations.Test(priority = 10)
    public void EnterFromAccRef() throws InterruptedException {
        PaymentsPage.InterAccTrnsfrEnterFromAccRef("Test-Murali");
        Thread.sleep(2000);
    }
    @org.testng.annotations.Test(priority = 11)
    public void EnterToAccRef() throws InterruptedException {
        PaymentsPage.InterAccTrnsfrEnterToAccRef("Test-Murali");
        Thread.sleep(2000);
    }
    @org.testng.annotations.Test(priority = 12)
    public void EnterAmount() throws InterruptedException {
        PaymentsPage.InterAccTrnsfrEnterAmount("50");
        Thread.sleep(2000);
    }
    @org.testng.annotations.Test(priority = 13)
    public void ClickNext() throws InterruptedException {
        PaymentsPage.Inter_account_ClickNextbtn();
        Thread.sleep(5000);
    }
    @org.testng.annotations.Test(priority = 14)
    public void ClickTransfer() throws InterruptedException{
        PaymentsPage.Inter_account_ClickTrnsfrbtn();
        Thread.sleep(15000);
    }
    @org.testng.annotations.Test(priority = 15)
    public void CheckTransactionStatus() throws IOException {
        PaymentsPage.InterAccTrnsfrChecktranscationstatus();
        BaseClass.getScreenshot();
    }
    @org.testng.annotations.Test(priority = 300)
    public void Closebrowser() {
        driver.quit();
    }


}
