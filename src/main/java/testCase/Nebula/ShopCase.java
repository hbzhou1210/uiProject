package testCase.Nebula;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObject.Nebula.ShopPage;
import testDatas.TestDatas;
import static utils.WebDriverUtils.logger;

public class ShopCase extends BaseCase {
    @Test(dataProviderClass = TestDatas.class,dataProvider = "Shop_Datas")
    public void Shop(String email,String firstName,String lastNam,String address,String apartment,
                     String city,String zipCode,String phone){
        ShopPage shopPage = new ShopPage();
        shopPage.click_NAVIGATION_BUTTON();
        shopPage.click_PRODUCT();
        shopPage.click_BUY_BUTTON();
        shopPage.type_EMAIL_TYPE(email);
        shopPage.type_FIRST_NAME_TYPE(firstName);
        shopPage.type_LAST_NAME_TYPE(lastNam);
        shopPage.type_ADDRESS_TYPE(address);
        shopPage.type_APARTMENT_TYPE(apartment);
        shopPage.type_CITY_TYPE(city);
        shopPage.type_ZIP_CODE_TYPE(zipCode);
        shopPage.type_PHONE_TYPE(phone);
        shopPage.click_SHIPPING_BUTTON();
        // 断言
        String result = shopPage.getElementText(By.xpath("//*[@id=\"continue_button\"]"));
        Assert.assertEquals(result,"Continue to payment");
        logger.info("实际结果："+result+"，预期结果："+"Continue to payment");
    }
}
