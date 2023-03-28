package testStend;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class StendTest extends AbstractAutoTest {
    @Test
    @Order(1)
    @DisplayName("Авторизация валидные значения")
    @Description("username- Use password- ad8783089f")
    @Severity(SeverityLevel.CRITICAL)
            void login(){
    WebElement userName = getDriver().findElement(By.xpath(".//input[@type=\"text\"]"));
    userName.sendKeys("Use");
    WebElement password = getDriver().findElement(By.xpath("//input[@type=\"password\"]"));
    password.sendKeys("ad8783089f");
    WebElement button = getDriver().findElement(By.xpath("//button[@type=\"submit\"]"));
    button.click();
    Assertions.assertNotNull(getDriver().findElement(By.xpath(".//a[@class=\"logo svelte-1rc85o5\"]")));
}

    @Test
    @Order(2)
    @DisplayName("Авторизация не валидные значения")
    @Description("username- U1 password- f89412c11b")
    @Severity(SeverityLevel.CRITICAL)
    void login2(){
        WebElement userName = getDriver().findElement(By.xpath(".//input[@type=\"text\"]"));
        userName.sendKeys("U1");
        WebElement password = getDriver().findElement(By.xpath("//input[@type=\"password\"]"));
        password.sendKeys("f89412c11b");
        WebElement button = getDriver().findElement(By.xpath("//button[@type=\"submit\"]"));
        button.click();
        Assertions.assertNull(getDriver().findElement(By.xpath(".//a[@class=\"logo svelte-1rc85o5\"]")));
    }
    @Test
    @Order(3)
    @DisplayName("Авторизация не валидные значения")
    @Description("username- Vasiliev@!%^&*()_+=- password- 7bcd847f04")
    @Severity(SeverityLevel.CRITICAL)
    void login20(){
        WebElement userName = getDriver().findElement(By.xpath(".//input[@type=\"text\"]"));
        userName.sendKeys("Vasiliev@!%^&*()_+=-");
        WebElement password = getDriver().findElement(By.xpath("//input[@type=\"password\"]"));
        password.sendKeys("7bcd847f04");
        WebElement button = getDriver().findElement(By.xpath("//button[@type=\"submit\"]"));
        button.click();
        Assertions.assertNull(getDriver().findElement(By.xpath(".//a[@class=\"logo svelte-1rc85o5\"]")));
    }
    @Test
    @Order(4)
    @DisplayName("Авторизация не валидные значения")
    @Description("username- Vova29292836546709876 password- 7bcd847f04")
    @Severity(SeverityLevel.CRITICAL)
    void login21(){
        WebElement userName = getDriver().findElement(By.xpath(".//input[@type=\"text\"]"));
        userName.sendKeys("Vova29292836546709876");
        WebElement password = getDriver().findElement(By.xpath("//input[@type=\"password\"]"));
        password.sendKeys("6f7f0a52ac");
        WebElement button = getDriver().findElement(By.xpath("//button[@type=\"submit\"]"));
        button.click();
        Assertions.assertNull(getDriver().findElement(By.xpath(".//a[@class=\"logo svelte-1rc85o5\"]")));
    }

}
