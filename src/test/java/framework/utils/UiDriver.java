package framework.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class UiDriver {

    private WebDriver webDriver;

    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "C:/Program Files/WebDrivers/Chrome/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("user-data-dir=C:\\Users\\BlackFox232\\Desktop\\ChromeUserDataCopy");
        webDriver = new ChromeDriver(options);
    }

    public void tearDown(){
        webDriver.quit();
    }

    public WebDriver getDriver(){
        return webDriver;
    }
}
