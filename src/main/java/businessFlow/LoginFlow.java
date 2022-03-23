package businessFlow;
import pageObject.Nebula.LoginPage;

public class LoginFlow{
    private String loginName;
    private String loginPwd;
    // 有参构造，初始化
    public LoginFlow(String loginName , String loginPwd){
        this.loginName=loginName;
        this.loginPwd = loginPwd;
    }
    //登录业务
    public void login(){
        LoginPage loginPage = new LoginPage();
        loginPage.click_loginMenu();
        loginPage.input_loginName(loginName);
        loginPage.input_loginPwd(loginPwd);
        loginPage.click_loginBtn();
    }
}
