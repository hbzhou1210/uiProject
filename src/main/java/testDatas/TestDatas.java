package testDatas;

import org.testng.annotations.DataProvider;
import utils.CreateCode;

public class TestDatas {
    @DataProvider
    public Object[][] Login_Datas(){
        Object[][] datas={{"anita.zhou@anker.io","HH19921210."}};
        return datas;
    }
    @DataProvider
    public Object[][] Subscribe_Datas(){
        Object [][] datas= {{CreateCode.gerCharAndNumb(6)+"@anker.io"}};
        return datas;
    }
    @DataProvider
    public Object[][] Shop_Datas(){
        Object[][] datas={{CreateCode.gerCharAndNumb(6)+"@anker.io",CreateCode.gerCharAndNumb(6),
                CreateCode.gerCharAndNumb(6),CreateCode.gerCharAndNumb(6),
                CreateCode.gerCharAndNumb(6),CreateCode.gerCharAndNumb(6),
                "21201","111111"}};
        return datas;
    }
}
