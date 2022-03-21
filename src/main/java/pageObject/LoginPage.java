package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    public static WebDriver driver;
    By Login_menu = By.xpath("//*[@id=\"header\"]/section/div/div/div[3]/a[2]");
    By Login_user = By.xpath("//*[@id=\"PolarisTextField1\"]");
    By Login_password = By.xpath("//*[@id=\"PolarisTextField2\"]");
    By Login_Button = By.xpath("//*[@id=\"gatsby-focus-wrapper\"]/div/div/div[1]/div/div/div/form[1]/div[2]/div[2]/button");
    public void click_loginMenu(){
        click(Login_menu);
    }
    public void input_loginName(String loginName){
        type(Login_user,loginName);
    }
    public void input_loginPwd(String loginPwd){
        type(Login_password,loginPwd);
    }
    public void click_loginBtn(){
        click(Login_Button);
    }
}
