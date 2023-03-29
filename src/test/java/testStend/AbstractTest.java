package testStend;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class AbstractTest {
    private static WebDriver driver;

    @BeforeAll
    static void init() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        // options.addArguments("--incognito");
        //options.addArguments("--headless");
        options.addArguments("start-maximized");

        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
    }

    @BeforeEach
    void goTo()throws InterruptedException {
        driver.get("https://test-stand.gb.ru/login");
        Thread.sleep(2000);
        WebElement userName = getDriver().findElement(By.xpath(".//input[@type=\"text\"]"));
        userName.sendKeys("Use");
        WebElement password = getDriver().findElement(By.xpath("//input[@type=\"password\"]"));
        password.sendKeys("ad8783089f");
        Thread.sleep(2000);
        WebElement button = getDriver().findElement(By.xpath("//button[@type=\"submit\"]"));
        button.click();
        Thread.sleep(3000);
    }

    @AfterAll
    static void close() {
        driver.quit();
    }

    public static WebDriver getDriver() {

        return driver;
    }
}