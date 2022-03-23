package testCase.Nebula;

import org.testng.annotations.*;
import pageObject.Nebula.LoginPage;
import report.TestFailListener;
import testDatas.TestDatas;

@Listeners({TestFailListener.class})
public class LoginCase extends BaseCase {
    @Test(dataProviderClass = TestDatas.class,dataProvider = "Login_Datas")
    public void login_succeed(String loginName ,String loginPwd){
        LoginPage loginPage = new LoginPage();
        //业务流程写法
        loginPage.click_loginMenu();
        loginPage.input_loginName(loginName);
        loginPage.input_loginPwd(loginPwd);
        loginPage.click_loginBtn();
//        Thread.sleep(1000);
//        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"position_city\"]")).isDisplayed());
    }

}
