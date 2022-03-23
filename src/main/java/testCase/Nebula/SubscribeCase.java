package testCase.Nebula;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.Nebula.SubscribePage;
import testDatas.TestDatas;
import static utils.WebDriverUtils.logger;

public class SubscribeCase extends BaseCase {
    //订阅
    @Test(dataProviderClass = TestDatas.class,dataProvider = "Subscribe_Datas")
    public void Subscribe(String emailName){
        SubscribePage subscribePage = new SubscribePage();
        subscribePage.input_EMAIL_ADDRESS(emailName);
        subscribePage.click_CHECK_AGREEMENT();
        subscribePage.click_SUBSCRIBE_BUTTON();
        String result =  subscribePage.getElementText(By.xpath("//*[@id=\"newsletter_form\"]/div[3]/div[2]/p"));
        Assert.assertEquals(result,"Welcome to Nebula! The 10% off code will be sent to your email!");
        logger.info("实际结果："+result+"，预期结果："+"Welcome to Nebula! The 10% off code will be sent to your email!");
    }
}
