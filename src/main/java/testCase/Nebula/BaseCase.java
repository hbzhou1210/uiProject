package testCase.Nebula;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import utils.WebDriverUtils;

import static testDatas.Constant.LOGIN_URL;
import static utils.WebDriverUtils.driver;

public class BaseCase {
    @Parameters({"browserName"})
    @BeforeMethod
    public void setupMethod(String browserName){
        WebDriverUtils.openBrowser(browserName);
        driver.get(LOGIN_URL);
    }

    @AfterMethod
    public void teardownMethod(){
        driver.quit();
    }
}
