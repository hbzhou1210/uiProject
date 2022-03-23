package businessFlow;

import pageObject.Nebula.SubscribePage;

public class SubscribeFlow {
    private String emailName;
    // 有参构造，初始化
    public SubscribeFlow(String emailName){
        this.emailName = emailName;
    }
    //订阅
    public void Subscribe(){
        SubscribePage subscribePage = new SubscribePage();
        subscribePage.input_EMAIL_ADDRESS(emailName);
        subscribePage.click_CHECK_AGREEMENT();
        subscribePage.click_SUBSCRIBE_BUTTON();
    }
}
