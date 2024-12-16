package Pages.Admin;

import Pages.OrangeCommon;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;


public class PayGradePage extends OrangeCommon {
    public PayGradePage() {
    }

    public PayGradePage(WebDriver driver) {
        super(driver);
    }

    // Method override to verify page load
    @Override
    protected void verifyPageLoad() {
        Assert.assertTrue(getElement(lblTitle).getText().contains("Pay Grades"), "Job page not loaded");
    }

    //locaters
    By name = By.xpath("//label[text()='Name']//parent::div/following-sibling::div/input");
    By save = By.xpath("//button[@type='submit']");
    By Successfully = By.xpath("//p[text()='Successfully Updated']");
    By checkbox = By.xpath("//div[text()='Grade 1']/parent::div/preceding-sibling::div//input");
    By deleted = By.xpath("//div[text()='Grade 2']/parent::div/following-sibling::div//button/i[@class='oxd-icon bi-trash']");
    By yesdeleted = By.xpath("//button[text()=' Yes, Delete ']");
    By succesfullydeleted = By.xpath("//p[text()='Successfully Deleted']");
    By payRecordsFoundafterdelete = By.xpath("//span[text()=' (6) Records Found']");
    By edit = By.xpath("//div[text()='Grade 3']/parent::div/following-sibling::div//button/i[@class='oxd-icon bi-pencil-fill']");
    private By addbutton = By.xpath("//button[contains(.,'Add')]/parent::div");

//    public void clickAdd() {
//        clickElement(addbutton, "Add");
//    }

    public void ClickAddButton(){
    clickElement(addbutton,"Add Button");
    }

    public void AddPayGrade() {
        String text = getRandomString(5);
        getElement(name).sendKeys(text);
    }

    public void save() {
        clickElement(save, "save");
    }

//    public void successfullysaved() {
//
//    }

    public void checkbox() {
        clickElement(checkbox , "checkbox");
    }

    public void deleted() {
        clickElement(deleted, "deleted ");
        clickElement(yesdeleted, "yesdeleted ");
    }

    private int payRecordsFoundafterdelete() {
        List<WebElement> userList = getElements(payRecordsFoundafterdelete);
        return userList.size();
    }

    public void edit() {
        clickElement(edit, "edit");
        clearText(edit, "paygradetextbox");
        String text = getRandomString(3);
        getElement(edit).sendKeys(text);
        clickElement(save, "save");
    }

}