package utils;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.concurrent.TimeUnit;

public class WebDriverUtils {
    public static WebDriver driver;
    //因为openBrowser是静态方法，所以日志对象也需要定义成静态的
    public static Logger logger = Logger.getLogger(WebDriverUtils.class);
    public static void openBrowser(String browserName){
        if(browserName.equals("chrome")){
            System.setProperty("webdriver.chrome.driver","/Users/anker/IdeaProjects/interPop_UI/src/main/resources/chromedriver");
            driver = new ChromeDriver();
            logger.info("打开chrome浏览器");
            driver.manage().window().maximize();
            logger.info("浏览器窗口最大化");
            // 设置10s的隐式等待
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }else if(browserName.equals("firefox")){
            System.setProperty("webdriver.gecko.driver","C:\\DriverFolder\\geckodriver.exe");
            driver = new FirefoxDriver();
            logger.info("打开Firefox浏览器");
            driver.manage().window().maximize();
            logger.info("浏览器窗口最大化");
            // 设置10s的隐式等待
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }else if(browserName.equals("ie")){
            DesiredCapabilities capabilities = new DesiredCapabilities();
            //取消IE安全设置（忽略IE的Protected Mode的设置）
            capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
            //忽略浏览器缩放设置的
            capabilities.setCapability(InternetExplorerDriver.IGNORE_ZOOM_SETTING, true);
            System.setProperty("webdriver.ie.driver","src/test/resources/IEDriverServer.exe");
            InternetExplorerDriver ieDriver = new InternetExplorerDriver();
            driver =  ieDriver;
            logger.info("打开IE浏览器");
            driver.manage().window().maximize();
            logger.info("浏览器窗口最大化");
            // 设置10s的隐式等待
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }else if (browserName.equals("chrome_headless")) {
            //设置本地chromedriver地址
            System.setProperty("webdriver.chrome.driver", "/Users/anker/IdeaProjects/interPop_UI/src/main/resources/chromedriver");
            //创建无Chrome无头参数
            ChromeOptions chromeOptions=new ChromeOptions();
            chromeOptions.addArguments("-headless");
            //创建Drive实例
            driver = new ChromeDriver(chromeOptions);
            logger.info("chrome浏览器无头模式");
            // 设置10s的隐式等待
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        }else{
            System.out.println("浏览器暂时不支持");
        }
    }
}
