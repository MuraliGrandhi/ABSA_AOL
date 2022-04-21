package TestJourneys;

import BaseFramework.BaseClass;
import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.PaymentsPage;
import PageObjects.passwordpage;
import org.testng.annotations.Listeners;

import java.io.IOException;

@Listeners(Utilities.ExtentList.class)
public class ImmediatePayment extends BaseClass {

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
    public void MyBeneficiariesLink() throws InterruptedException {
        PaymentsPage.ClickMyBnfcrLink();
        Thread.sleep(3000);
    }
    @org.testng.annotations.Test(priority = 9)
    public void MySingleBeneficiaryLink() throws InterruptedException {
        PaymentsPage.MyBnfcr_Click_Single_Bnfcr_Link();
        Thread.sleep(3000);
    }
    @org.testng.annotations.Test(priority = 10)
    public void EnterBeneficaryAcNo() throws InterruptedException {
        PaymentsPage.MyBnfcr_EnterBeneficiaryACCNo("62001541061");
        Thread.sleep(1000);
    }
    @org.testng.annotations.Test(priority = 11)
    public void SelectFromAccNo() throws InterruptedException {
        PaymentsPage.MyBnfcr_ClickFromAccDD();
        PaymentsPage.MyBnfcr_SelectFromAcc("4048405107");
        Thread.sleep(1000);
    }
    @org.testng.annotations.Test(priority = 12)
    public void EnterAmount() throws InterruptedException {
       PaymentsPage.MyBnfcr_EnterAmount("1000");
    }
    @org.testng.annotations.Test(priority = 13)
    public void SelectImmediatePymtYesOption() throws InterruptedException {
        PaymentsPage.MyBnfcr_Click_Immediate_pymt_Yes_Option();
    }
    @org.testng.annotations.Test(priority = 14)
    public void ClickNextbtn() throws InterruptedException {
        PaymentsPage.MyBnfcr_ClickNextbtn();
    }
    @org.testng.annotations.Test(priority = 15)
    public void ClickCnfm2Paybtn() throws InterruptedException {
        PaymentsPage.MyBnfcr_Click_Cnfm2_pay_btn();
        Thread.sleep(15000);
    }
    @org.testng.annotations.Test(priority = 16)
    public void VerifyTransactionStatus() throws InterruptedException, IOException {
        PaymentsPage.MyBnfcr_Checktranscationstatus();
        BaseClass.getScreenshot();
        Thread.sleep(5000);
    }

    @org.testng.annotations.Test(priority = 300)
    public void Closebrowser() {
        driver.quit();
    }


}
