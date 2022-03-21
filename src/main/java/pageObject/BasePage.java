package pageObject;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.WebDriverUtils;

import java.util.Set;

public class BasePage {
    //实例化日志对象
    private Logger logger =Logger.getLogger(BasePage.class);
    /**
     * 等待元素可见
     * @param by
     * @return
     */
    public WebElement waitElementVisible(By by){
        WebDriverWait webDriverWait = new WebDriverWait(WebDriverUtils.driver,5);
        WebElement webElement = webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(by));
        return webElement;
    }

    /**
     * 等待元素可点击
     * @param by
     * @return
     */
    public WebElement waitElementClickable(By by){
        WebDriverWait webDriverWait = new WebDriverWait(WebDriverUtils.driver,5);
        WebElement webElement = webDriverWait.until(ExpectedConditions.elementToBeClickable(by));
        return webElement;
    }

    /**
     * 点击元素
     * @param by
     */
    public void click(By by){
        waitElementClickable(by).click();
        logger.info("点击元素【"+by+"】");
    }

    /**
     * 输入数据
     * @param by
     * @param inputData
     */
    public void type(By by,String inputData){
        waitElementClickable(by).sendKeys(inputData);
        // 添加日志
        logger.info("给元素【"+by+"】输入数据【"+inputData+"】");
    }

    /**
     * 等待iframe可用并且切换iframe
     * @param by
     */
    public void waitIframeAndSwitch(By by){
        logger.info("切换iframe【"+by+"】");
        WebDriverWait webDriverWait = new WebDriverWait(WebDriverUtils.driver,6);
        webDriverWait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(by));
    }

    /**
     * 切换窗口
     * @param title
     */
    public void switchWindow(String title){
        Set<String> handles = WebDriverUtils.driver.getWindowHandles();
        // 切换窗口的方式--循环变量handles集合
        for(String handle: handles){
            // 判断是哪一个页面的句柄，根据title判断
            if (WebDriverUtils.driver.getTitle().equals(title)){
                break;
            }else {
                // 切换窗口，根据窗口标识来识别
                WebDriverUtils.driver.switchTo().window(handle);
            }
        }
    }
    /**
     * 滚动到指定元素上的方法
     * @param by
     */
    public void scrollIntoElement(By by){
        WebElement webElement = waitElementVisible(by);
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) WebDriverUtils.driver;
        javascriptExecutor.executeScript("arguments[0].scrollIntoView(0);",webElement);
    }

    /**
     * 判断元素是否存在
     * @param by
     * @return
     */
    public boolean isElementExist(By by){
        boolean isExist = waitElementVisible(by).isDisplayed();
        logger.info("元素【"+by+"】存在【"+isExist+"】");
        return isExist;
    }

    /**
     * 获取元素文本
     * @param by
     * @return
     */
    public String getElementText(By by){
        String text = waitElementVisible(by).getText();
        logger.info("获取元素【"+by+"】文本值为【"+text+"】");
        return waitElementVisible(by).getText();
    }

    /**
     * 获取元素属性
     * @param by
     * @param attributeName
     * @return
     */
    public String getElementAttributeValue(By by,String attributeName){
        String attributeValue = waitElementVisible(by).getAttribute(attributeName);
        logger.info("获取元素【"+by+"】属性【"+attributeName+"属性值为【"+attributeValue+"】");
        return waitElementVisible(by).getAttribute(attributeName);
    }
}
