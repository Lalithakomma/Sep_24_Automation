package AdminManagementTests;

import Core.model.Common;
import Core.test.BaseTest;
import Pages.Admin.JobTitlePage;
import Pages.Admin.PayGrade;
import Pages.Admin.PayGradePage;
import Pages.Admin.UserManagementPage;
import Pages.DashBoardPage;
import Pages.LoginPage;
import org.testng.annotations.Test;

public class PayGradesTest extends BaseTest {

    @Test(testName = "click on dropdown button")
    public void Headermenu() throws InterruptedException {
        LoginPage loginPage = launchApplication(LoginPage.class);
        DashBoardPage dashBoardPage = loginPage.loginToApplication(Common.getEnvData("username"), Common.getEnvData("password"));
        UserManagementPage userManagementPage = dashBoardPage.selectMenuOption("Admin", UserManagementPage.class);
        PayGrade payGrade = userManagementPage.headmenu("Job ", "Pay Grades", PayGrade.class);
        payGrade.ClickAddButton();
        payGrade.AddPayGrade();
        payGrade.save();
        payGrade.checkbox();
        payGrade.deleted();
        payGrade.edit();
    }
}