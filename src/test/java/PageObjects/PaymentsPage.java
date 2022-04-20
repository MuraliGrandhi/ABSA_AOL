package PageObjects;

import BaseFramework.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import static BaseFramework.BaseClass.driver;

public class PaymentsPage extends BaseClass {

//------------------------------------------------------------------------------------------------------------------------
//**************************ELEMENT DECLARATION START******************************************
//------------------------------------------------------------------------------------------------------------------------

    static By My_Benificiaries_Link = By.xpath("//div[text()='My beneficiaries - new and existing']");
    static By Authorisations_Link = By.xpath("//div[text()='Authorisations']");
    static By Purchase_PrePaid_Link = By.xpath("//div[text()='Purchase PrePaid']");
    static By Once_off_payment_Link = By.xpath("//div[text()='Once-off payment']");
    static By Manage_future_dated_transactions_Link = By.xpath("(//div[text()='Manage future-dated transactions']");
    static By Stop_payment_and_Debit_order_reversal_Link = By.xpath("//div[text()='Stop payment and Debit order reversal']");
    static By Recurring_payments_Link = By.xpath("//div[text()='Recurring payments']");
    static By Pay_traffic_fines_Link = By.xpath("//div[text()='Pay traffic fines']");
    static By Contactless_payments_Link = By.xpath("//div[text()='Contactless payments']");
    static By International_funds_transfer_Link = By.xpath("//div[text()='International funds transfer']");
    static By Account_Verification_Service_Link = By.xpath("//div[text()='Account Verification Service']");

//--------------------------CASH_SEND ELEMENTS START---------------------------------------------------------------
    static By Cash_Send_Link = By.xpath("//div[text()='CashSend™']");
    static By Send_Single_Cashsend = By.xpath("//li[text()='Send single']");
    static By From_Acc_DD=By.id("cashSendSingle-fromAccountNo");
    static By BenificiaryAc=By.id("ap-cashSendSingle-beneficiary");
    static By Amount_to_Send=By.id("ap-cashSendSingle-amount");
    static By Access_Code=By.id("ap-cashSendSingle-accessCode");
    static By Confirm_Access_Code=By.id("ap-cashSendSingle-confirmAccessCode");
    static By My_Reference=By.id("ap-cashSendSingle-statementDescription");
    static By NextBtn=By.xpath("(//div[text()='Next'])[2]");
    static By CancelBtn=By.xpath("(//div[text()='Cancel'])[2]");
    static By ResetBtn=By.xpath("(//div[text()='Reset'])[2]");
    static By Confm2SendBtn=By.xpath("(//div[text()='Send'])[2]");
    static By Confm2CancelBtn=By.xpath("(//div[text()='Cancel'])[3]");
    static By Confm2BackBtn=By.xpath("//div[text()='Back']");
    static By Confm3NextBtn=By.xpath("(//div[text()='Next'])[3]");
    static By CashSendTrnxMessage=By.xpath("//div[@class='ui-message-body']//span[1]");

//-------------------------CASH_SEND ELEMENTS END--------------------------------------------

//--------------------------CASH_SEND_Plus ELEMENTS START---------------------------------------------------------------
static By Cash_Send_Plus_Link = By.xpath("//div[text()='CashSend™ Plus']");
static By Cash_send_plus_From_Acc_DD=By.id("cashSendPlusSingle-fromAccountNo");
static By Cash_send_plus_Message=By.xpath("//div[@id='g69']/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/div[3]/div[1]/div[1]/div[1]/div[4]/div[3]/div[1]");
//-------------------------CASH_SEND_Plus ELEMENTS END--------------------------------------------


    //--------------------------Inter-Account Transfer ELEMENTS START---------------------------------------------------------------
    static By Inter_account_transfers_Link = By.xpath("//div[text()='Inter-account transfers']");
    static By InterAccTrnsfrFrom_Acc_DD=By.id("interAccounTransfer-fromAccount");
    static By Inter_account_FrmAccRef = By.xpath("//input[@name='fromAccountRef']");
    static By Inter_account_ToAccRef = By.xpath("//input[@name='toAccountRef']");
    static By Inter_account_Amount = By.xpath("//input[@name='amount']");
    static By Inter_account_Nextbtn = By.xpath("//div[text()='Next']");
    static By Inter_account_Cancelbtn = By.xpath("//div[text()='Cancel']");
    static By Inter_account_Resetbtn = By.xpath("//div[text()='Reset']");
    static By Inter_account_Trnsfrtbtn = By.xpath("//div[text()='Transfer']");
    static By Inter_account_TrnsfrTrnxMessage=By.xpath("//span[text()='Transfer successful']");

//-------------------------Inter-Account Transfer ELEMENTS END--------------------------------------------

//------------------------------------------------------------------------------------------------------------------------
//**************************ELEMENT DECLARATION END******************************************
//------------------------------------------------------------------------------------------------------------------------




//------------------------------------------------------------------------------------------------------------------------
//**************************ACTIONS DECLARATION START******************************************
//------------------------------------------------------------------------------------------------------------------------

// -----------------------CASH_SEND ACTIONS START----------------------------------------------------------
    public static void ClickCashSendLink() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(Cash_Send_Link).click();

    }

    public static void ClickSendSingleCashSend()
    {
        driver.findElement(Send_Single_Cashsend).click();
    }
    public static void ClickFromAccDDCashsendSingle() throws InterruptedException {
        driver.findElement(From_Acc_DD).click();
        Thread.sleep(1000);
    }
    public static void SelectFromAccCashsendSingle(String AccNo) throws InterruptedException {
        driver.findElement(By.xpath("//option[@value="+AccNo+"]")).click();
        Thread.sleep(1000);
    }

    public static void EnterBeneficiaryACCNo(String BeneficiaryAcc) throws InterruptedException {
        driver.findElement(BenificiaryAc).sendKeys(BeneficiaryAcc);
        Thread.sleep(1000);
        driver.findElement(BenificiaryAc).sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(1000);
        driver.findElement(BenificiaryAc).sendKeys(Keys.ENTER);
        Thread.sleep(1000);
    }

    public static void EnterAmount(String Amount)
    {
        driver.findElement(Amount_to_Send).sendKeys(Amount);
    }

    public static void EnterAccessCode(String AccessCode)
    {
        driver.findElement(Access_Code).sendKeys(AccessCode);
    }

    public static void EnterConfirmAccessCode(String ConfirmAccessCode)
    {
        driver.findElement(Confirm_Access_Code).sendKeys(ConfirmAccessCode);
    }

    public static void EnterMyReference(String MyReference)
    {
        driver.findElement(My_Reference).sendKeys(MyReference);
    }

    public static void ClickNextbtn()
    {
        driver.findElement(NextBtn).click();
    }
    public static void ClickCancelbtn()
    {
        driver.findElement(CancelBtn).click();
    }

    public static void ClickResetbtn()
    {
        driver.findElement(ResetBtn).click();
    }

    public static void ClickCnfm2sendbtn()
    {
        driver.findElement(Confm2SendBtn).click();
    }

    public static void ClickCnfm2Canclebtn()
    {
        driver.findElement(Confm2CancelBtn).click();
    }


    public static void ClickCnfm3nextbtn()
    {
        driver.findElement(Confm3NextBtn).click();
    }

    public static void Checktranscationstatus()
    {
        String resultexpected="CashSend transaction successful.";
        String resultActual = driver.findElement(CashSendTrnxMessage).getText();
        Assert.assertEquals(resultexpected,resultActual);
    }
    public static void ClickCnfm2Backebtn()
    {
        driver.findElement(Confm2BackBtn).click();
    }


//----------------------------CASH_SEND ACTIONS END----------------------------------------------------------


// -----------------------CASH_SEND_Plus ACTIONS START----------------------------------------------------------

    public static void ClickCashSendPlusLink() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(Cash_Send_Plus_Link).click();

    }

    public static void SelectFromAccCashsendPlusSingle(String AccNo) throws InterruptedException {
        driver.findElement(By.xpath("//option[@value="+AccNo+"]")).click();
        Thread.sleep(1000);
    }

    public static void ClickFromAccDDCashsendPlusSingle() throws InterruptedException {
        driver.findElement(Cash_send_plus_From_Acc_DD).click();
        Thread.sleep(1000);
    }

    public static void CheckCashSendPlustranscationstatus()
    {
        String resultexpected="CashSend Plus transaction scheduled";
        String resultActual = driver.findElement(Cash_send_plus_Message).getText();
        Boolean Result = resultActual.contains(resultexpected);

        Assert.assertEquals(Result,Boolean.TRUE);
    }
//----------------------------CASH_SEND_Plus ACTIONS END----------------------------------------------------------
// -----------------------Inter-Account Transfer ACTIONS START----------------------------------------------------------

    public static void ClickInterAccTrnsfrLink() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(Inter_account_transfers_Link).click();
    }

    public static void SelectFromInterAcctrnsfrSingle(String AccNo) throws InterruptedException {
        driver.findElement(By.xpath("//option[@value="+AccNo+"]")).click();
        Thread.sleep(1000);
    }

    public static void ClickFromAccDDInterAcctrnsfrSingle() throws InterruptedException {
        driver.findElement(InterAccTrnsfrFrom_Acc_DD).click();
        Thread.sleep(1000);
    }

    public static void InterAccTrnsfrEnterAmount(String InterAccTrnsfrAmount)
    {
        driver.findElement(Inter_account_Amount).sendKeys(InterAccTrnsfrAmount);
    }

    public static void InterAccTrnsfrEnterFromAccRef(String fromaccref)
    {
        //((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",driver.findElement(Inter_account_ToAccDD));

        driver.findElement(Inter_account_FrmAccRef).sendKeys(fromaccref);
    }
    public static void InterAccTrnsfrEnterToAccRef(String toaccref)
    {
        driver.findElement(Inter_account_ToAccRef).sendKeys(toaccref);
    }

    public static void Inter_account_ClickNextbtn()
    {
        driver.findElement(Inter_account_Nextbtn).click();
    }
    public static void Inter_account_ClickCancelbtn()
    {
        driver.findElement(Inter_account_Cancelbtn).click();
    }

    public static void Inter_account_ClickResetbtn()
    {
        driver.findElement(Inter_account_Resetbtn).click();
    }

    public static void Inter_account_ClickTrnsfrbtn()
    {
        driver.findElement(Inter_account_Trnsfrtbtn).click();
    }

    public static void InterAccTrnsfrChecktranscationstatus()
    {
        System.out.println(driver.findElement(Inter_account_TrnsfrTrnxMessage).getText());
        String resultexpected="Transfer successful";
        String resultActual = driver.findElement(Inter_account_TrnsfrTrnxMessage).getText();
        Assert.assertEquals(resultexpected,resultActual);
    }
//----------------------------Inter-Account Transfer ACTIONS END----------------------------------------------------------



//------------------------------------------------------------------------------------------------------------------------
//**************************ACTIONS DECLARATION END******************************************
//------------------------------------------------------------------------------------------------------------------------

}
