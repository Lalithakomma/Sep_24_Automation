package Pages.Admin;

import Pages.OrangeCommon;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class PayGrade extends OrangeCommon {
    public PayGrade(){}

    public PayGrade(WebDriver driver){
        super(driver);
    }
    //method override
    @Override
    protected void verifyPageLoad() {
        Assert.assertTrue(getElement(lblTitle).getText().contains("Job"), "Job page not loaded");
    }
  //locators
    private By addbutton = By.xpath("//button[contains(.,'Add')]/parent::div");
    private By name = By.xpath("//label[text()='Name']//parent::div/following-sibling::div/input");
    private By save = By.xpath("//button[@type='submit']");
    private By Successfully = By.xpath("//p[text()='Successfully Updated']");
    private By checkbox = By.xpath("//div[text()='Grade 1']/parent::div/preceding-sibling::div//input");
    private By deleted = By.xpath("//div[@class='oxd-table-body']//div[@role='cell'][2]/div");
    private By yesdeleted = By.xpath("//button[text()=' Yes, Delete ']");
    private By succesfullydeleted = By.xpath("//p[text()='Successfully Deleted']");
    private By payRecordsFoundafterdelete = By.xpath("//span[text()=' (6) Records Found']");
    private By edit = By.xpath("//div[text()='Grade 3']/parent::div/following-sibling::div//button/i[@class='oxd-icon bi-pencil-fill']");
    By cancel = By.xpath("//button[text()=' Cancel ']");

    public void ClickAddButton(){
        clickElement(addbutton,"Add Button");
    }

String text;
    public void AddPayGrade() {
         text = getRandomString(5);
        getElement(name).sendKeys(text);
    }

    public void save() {
        clickElement(save, "save");
        clickElement(cancel, "Cancel");
    }

    public void checkbox() {
        clickElement(checkbox , "check box");
    }

    public void deleted() {
        clickElement(deleted, "deleted ");
        clickElement(yesdeleted, "yes deleted ");
        String nametodeleted = text;
        List<WebElement>rows = getElement(deleted);

    public void edit() {
        clickElement(edit, "edit");
        clearText(edit, "paygradetextbox");
        String text = getRandomString(3);
        getElement(edit).sendKeys(text);
        clickElement(save, "save");
    }
}
