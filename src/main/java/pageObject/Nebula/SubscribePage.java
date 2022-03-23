package pageObject.Nebula;

import org.openqa.selenium.By;
import pageObject.BasePage;

public class SubscribePage extends BasePage {
    By EMAIL_ADDRESS = By.xpath("//*[@id=\"newsletter_form\"]/div[1]/div[1]/div/input");
    By CHECK_AGREEMENT = By.xpath("//*[@id=\"newsletter_form\"]/div[2]/label/span[1]/input");
    By SUBSCRIBE_BUTTON = By.xpath("//*[@id=\"newsletter_form\"]/div[1]/div[2]/div/button");
    public void input_EMAIL_ADDRESS (String email_address){
        type(EMAIL_ADDRESS,email_address);
    }
    public void click_CHECK_AGREEMENT(){
        click(CHECK_AGREEMENT);
    }
    public void click_SUBSCRIBE_BUTTON(){
        click(SUBSCRIBE_BUTTON);
    }
}
