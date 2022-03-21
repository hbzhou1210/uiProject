package testDatas;

import org.testng.annotations.DataProvider;

public class LoginDatas {
    @DataProvider
    public Object[][] Login_Success_Datas(){
        Object[][] datas={{"anita.zhou@anker.io","HH19921210."}};
        return datas;
    }

}
