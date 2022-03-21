package testCase;

import businessFlow.LoginFlow;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import testDatas.LoginDatas;
import utils.WebDriverUtils;

import static testDatas.Constant.LOGIN_URL;
import static utils.WebDriverUtils.driver;

public class LoginCase {
    @Parameters({"browserName"})
    @BeforeMethod
    public void setupMethod(String browserName){
        WebDriverUtils.openBrowser(browserName);
        driver.get(LOGIN_URL);
    }

    @Test(dataProviderClass = LoginDatas.class,dataProvider = "Login_Success_Datas")
    public void login_succeed(String loginName ,String loginPwd){
        //业务流程写法
        LoginFlow loginFlow = new LoginFlow(loginName,loginPwd);
        loginFlow.login();
//        Thread.sleep(1000);
//        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"position_city\"]")).isDisplayed());
    }
//    @Test(dataProviderClass = LoginDatas.class,dataProvider = "Login_Fail_Datas")
//    public void login_Fail(String loginName,String loginPwd,String ErrorMessage) throws InterruptedException {
//        //业务流程写法
//        LoginFlow loginFlow = new LoginFlow(loginName,loginPwd);
//        loginFlow.login();
//        Thread.sleep(1000);
//        Assert.assertTrue(driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div/div[2]/button/span")).isDisplayed());
//    }
    @AfterMethod
    public void teardownMethod(){
        driver.quit();
    }
}
