package pageObject.Nebula;

import org.openqa.selenium.By;
import pageObject.BasePage;

public class ShopPage extends BasePage {
    By NAVIGATION_BUTTON = By.xpath("//*[@id=\"header\"]/section/div[2]/div/div[2]/nav/div[2]/a");
    By PRODUCT = By.xpath("//*[@id=\"shopify-section-Go_Anywhere_Series\"]/div[2]/div/div[2]/div[1]/a/img");
    By BUY_BUTTON = By.xpath("//*[@id=\"product_form_6162425708719\"]/div[3]/div[3]/div");
    By EMAIL_TYPE = By.xpath("//*[@id=\"checkout_email\"]");
    By FIRST_NAME_TYPE = By.xpath ("//*[@id=\"checkout_shipping_address_first_name\"]");
    By LAST_NAME_TYPE = By.xpath("//*[@id=\"checkout_shipping_address_last_name\"]");
    By ADDRESS_TYPE = By.xpath("//*[@id=\"checkout_shipping_address_address1\"]");
    By APARTMENT_TYPE = By.xpath("//*[@id=\"checkout_shipping_address_address2\"]");
    By CITY_TYPE = By.xpath("//*[@id=\"checkout_shipping_address_city\"]");
    By ZIP_CODE_TYPE= By.xpath("//*[@id=\"checkout_shipping_address_zip\"]");
    By PHONE_TYPE = By.xpath("//*[@id=\"checkout_shipping_address_phone\"]");
    By SHIPPING_BUTTON = By.xpath("//*[@id=\"continue_button\"]");
    public void click_NAVIGATION_BUTTON(){
        click(NAVIGATION_BUTTON);
    }
    public void click_PRODUCT(){
        click(PRODUCT);
    }
    public void click_BUY_BUTTON(){
        click(BUY_BUTTON);
    }
    public void type_EMAIL_TYPE(String email){
        type(EMAIL_TYPE,email);
    }
    public void type_FIRST_NAME_TYPE(String firstName){type(FIRST_NAME_TYPE,firstName);}
    public void type_LAST_NAME_TYPE(String lastName){type(LAST_NAME_TYPE,lastName);}
    public void type_ADDRESS_TYPE(String address){type(ADDRESS_TYPE,address);}
    public void type_APARTMENT_TYPE(String apartment){type(APARTMENT_TYPE,apartment);}
    public void type_CITY_TYPE(String city){type(CITY_TYPE,city);}
    public void type_ZIP_CODE_TYPE(String zipCode){type(ZIP_CODE_TYPE,zipCode);}
    public void type_PHONE_TYPE(String phone){type(PHONE_TYPE,phone);}
    public void click_SHIPPING_BUTTON(){click(SHIPPING_BUTTON);}
}
