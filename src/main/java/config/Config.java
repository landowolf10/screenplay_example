package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Config
{
    private WebDriver driver;

    public WebDriver setUp()
    {
        System.setProperty("webdriver.chrome.driver", "src/test/drivers/chromedriver");
        driver = new ChromeDriver();

        driver.manage().window().maximize();

        return driver;
    }
}
