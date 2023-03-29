package testStend;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class StendAutoTest extends AbstractAutoTest {
    @Test
    @Order(1)
    @DisplayName("Авторизация валидные значения")
            void login()throws InterruptedException{
        Thread.sleep(2000);
    WebElement userName = getDriver().findElement(By.xpath(".//input[@type=\"text\"]"));
    userName.sendKeys("Use");
    WebElement password = getDriver().findElement(By.xpath("//input[@type=\"password\"]"));
    password.sendKeys("ad8783089f");
        Thread.sleep(2000);
    WebElement button = getDriver().findElement(By.xpath("//button[@type=\"submit\"]"));
    button.click();
        Thread.sleep(3000);
    Assertions.assertNotNull(getDriver().findElement(By.xpath(".//a[@class=\"logo svelte-1rc85o5\"]")));
}

    @Test
    @Order(2)
    @DisplayName("Авторизация не валидные значения")
    void login2()throws InterruptedException{
        Thread.sleep(2000);
        WebElement userName = getDriver().findElement(By.xpath(".//input[@type=\"text\"]"));
        userName.sendKeys("U1");
        WebElement password = getDriver().findElement(By.xpath("//input[@type=\"password\"]"));
        password.sendKeys("f89412c11b");
        Thread.sleep(2000);
        WebElement button = getDriver().findElement(By.xpath("//button[@type=\"submit\"]"));
        button.click();
        Thread.sleep(3000);
        Assertions.assertNotNull(getDriver().findElement(By.xpath("//p[contains(text(),\"Неправильный логиню. Может быть не мение 3 и не болие 20 символов\")]")));
    }
    @Test
    @Order(3)
    @DisplayName("Авторизация не валидные значения")
    void login20()throws InterruptedException{
        Thread.sleep(2000);
        WebElement userName = getDriver().findElement(By.xpath(".//input[@type=\"text\"]"));
        userName.sendKeys("Vasiliev@!%^&*()_+=-");
        WebElement password = getDriver().findElement(By.xpath("//input[@type=\"password\"]"));
        password.sendKeys("7bcd847f04");
        Thread.sleep(2000);
        WebElement button = getDriver().findElement(By.xpath("//button[@type=\"submit\"]"));
        button.click();
        Thread.sleep(2000);
        Assertions.assertNotNull(getDriver().findElement(By.xpath("//p[contains(text(),\"Неправильный логин. Может состоять только из латинских букв и цифр, без спецсимволов\")]")));
    }
    @Test
    @Order(4)
    @DisplayName("Авторизация не валидные значения")
    void login21()throws InterruptedException{
        Thread.sleep(2000);
        WebElement userName = getDriver().findElement(By.xpath(".//input[@type=\"text\"]"));
        userName.sendKeys("Vova29292836546709876");
        WebElement password = getDriver().findElement(By.xpath("//input[@type=\"password\"]"));
        password.sendKeys("6f7f0a52ac");
        Thread.sleep(2000);
        WebElement button = getDriver().findElement(By.xpath("//button[@type=\"submit\"]"));
        button.click();
        Thread.sleep(2000);
        Assertions.assertNotNull(getDriver().findElement(By.xpath("//p[contains(text(),\"Неправильный логиню. Может быть не мение 3 и не болие 20 символов\")]")));
    }
    @Test
    @Order(5)
    @DisplayName("Авторизация не валидные значения")
    void loginKirill()throws InterruptedException {
        Thread.sleep(2000);
        WebElement userName = getDriver().findElement(By.xpath(".//input[@type=\"text\"]"));
        userName.sendKeys("КириллКиряя");
        WebElement password = getDriver().findElement(By.xpath("//input[@type=\"password\"]"));
        password.sendKeys("7e8b7954d0");
        Thread.sleep(2000);
        WebElement button = getDriver().findElement(By.xpath("//button[@type=\"submit\"]"));
        button.click();
        Thread.sleep(2000);
        Assertions.assertNotNull(getDriver().findElement(By.xpath("//p[contains(text(),\"Неправильный логин. Может состоять только из латинских букв и цифр, без спецсимволов\")]")));
    }
    @Test
    @Order(6)
    @DisplayName("Авторизация не валидные значения")
    void loginEmpty()throws InterruptedException {
        Thread.sleep(2000);
        WebElement userName = getDriver().findElement(By.xpath(".//input[@type=\"text\"]"));
        userName.sendKeys("Vasiapupki");
        Thread.sleep(2000);
        WebElement button = getDriver().findElement(By.xpath("//button[@type=\"submit\"]"));
        button.click();
        Thread.sleep(2000);
        Assertions.assertNotNull(getDriver().findElement(By.xpath("//p[contains(text(),\"Поле не может быть пустым\")]")));
    }
    @Test
    @Order(7)
    @DisplayName("Авторизация не валидные значения")
    void loginPasswordEmpty()throws InterruptedException {

        Thread.sleep(2000);
        WebElement button = getDriver().findElement(By.xpath("//button[@type=\"submit\"]"));
        button.click();
        Thread.sleep(2000);
        Assertions.assertNotNull(getDriver().findElement(By.xpath("//p[contains(text(),\"Поле не может быть пустым\")]")));
    }

}
