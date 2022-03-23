package report;

import io.qameta.allure.Attachment;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;
import pageObject.BasePage;
import utils.WebDriverUtils;

public class TestFailListener extends TestListenerAdapter {

    @Override
    public void onTestFailure(ITestResult result) {
        takePhoto();
    }

    @Attachment(value = "screen shot",type = "image/png")
    public byte[]  takePhoto(){
        byte[] screenshotAs = ((TakesScreenshot) WebDriverUtils.driver).getScreenshotAs(OutputType.BYTES);
        return screenshotAs;
    }

}