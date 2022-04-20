package BaseFramework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseClass {

    public static WebDriver driver;

    static File file;
    static Properties prop;
    static FileInputStream fip;

    public static void initializeprop(String filepath)
    {
        file = new File(filepath);
        try {
            fip = new FileInputStream(file);
            prop = new Properties();
            prop.load(fip);

        } catch (FileNotFoundException e) {
            System.out.println("IOException found in initializeprop :"+e.getMessage());
        }catch (IOException e1) {
            System.out.println("FileNotFoundException found in initializeprop :"+e1.getMessage());
        }

    }


    public static void getScreenshot() throws IOException {
        Date Current = new Date();
        String currentdate = Current.toString().replace(" ","-").replace(":","-");
        TakesScreenshot Getcapture = ((TakesScreenshot) driver);
        File Screenshotfile=Getcapture.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(Screenshotfile,new File(System.getProperty("user.dir")+"//Screenshots//"+currentdate+".png"));
    }

    public static String readProperty(String property)
    {
        return prop.getProperty(property);
    }
    @SuppressWarnings("deprecation")
    public static void launchBrowser(String BrowserName, String Url)
    {

        if(BrowserName == "chrome") {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.get(Url);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

        }
        if(BrowserName == "firefox") {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
            driver.get(Url);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

        }
        if(BrowserName == "opera") {
            WebDriverManager.operadriver().setup();
            driver = new OperaDriver();
            driver.get(Url);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

        }
        if(BrowserName == "edge") {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
            driver.get(Url);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);

        }
    }

    public static void closeBrowser()
    {
        driver.quit();


    }



}
