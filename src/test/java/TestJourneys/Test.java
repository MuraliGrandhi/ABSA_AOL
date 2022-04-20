package TestJourneys;

import BaseFramework.BaseClass;
import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.passwordpage;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Listeners;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

@Listeners(Utilities.ExtentList.class)

public class Test  extends BaseClass {

 LoginPage lp = new LoginPage();
 passwordpage pg =new passwordpage();
    HomePage hp = new HomePage();

    @org.testng.annotations.Test(priority = 1)
    public void LaunchBrowser() throws InterruptedException {
        launchBrowser("chrome", "https://onlinebankinguat2.absa.co.za/absa-online/login.jsp");
        Thread.sleep(5000);
    }
    @org.testng.annotations.Test(priority = 2)
    public void EnterCredentials() throws InterruptedException {

        lp.EnterAcNo("4048405107");
        lp.EnterPinNo("05107");
    }

    @org.testng.annotations.Test(priority = 3)
    public void ClickNextBtn() throws InterruptedException {
        lp.ClickNextbtn();
        Thread.sleep(5000);
    }
    @org.testng.annotations.Test(priority = 4)
    public void HandlePassword() throws InterruptedException {
        pg.EnterPassword();
    }
    @org.testng.annotations.Test(priority = 5)
    public void ClickLogon() {
        pg.clickLogon();
    }
    @org.testng.annotations.Test(priority = 6)
    public void HandlePopup() throws InterruptedException, IOException {
        hp.ClickPopupclsbtn();
        Thread.sleep(5000);
        BaseClass.getScreenshot();
    }
    @org.testng.annotations.Test(priority = 200)
    public void Closebrowser() {
        driver.quit();
    }

    }



