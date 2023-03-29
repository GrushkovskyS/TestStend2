package testStend;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class StendTest extends AbstractTest {
    @Test
    @Order(1)
    @DisplayName("Переход от своей страници с постами ASC вперёд")
    void ascGoToNext()throws InterruptedException{
        getDriver().navigate().to("https://test-stand.gb.ru/?sort=createdAt&order=ASC");
        Thread.sleep(2000);
        WebElement nextPage = getDriver().findElement(By.xpath(".//a[@class=\"svelte-d01pfs\"]"));
        nextPage.click();
        Assertions.assertNotNull(getDriver().findElement(By.xpath("//h2[contains(text(),\"New post 3\")]")));
    }
    @Test
    @Order(2)
    @DisplayName("Переход от своей страници с постами ASC вперёд и назад")
    void ascGoToNextPrev()throws InterruptedException{
        getDriver().navigate().to("https://test-stand.gb.ru/?sort=createdAt&order=ASC");
        Thread.sleep(2000);
        WebElement nextPage = getDriver().findElement(By.xpath(".//a[@class=\"svelte-d01pfs\"]"));
        nextPage.click();
        Thread.sleep(2000);
        WebElement prevPage = getDriver().findElement(By.xpath(".//a[@class=\"svelte-d01pfs\"]"));
        prevPage.click();
        Thread.sleep(2000);
        Assertions.assertNotNull(getDriver().findElement(By.xpath(".//h2[contains(text(),\"New Post 7\")]")));
    }
    @Test
    @Order(3)
    @DisplayName("Переход от своей страници с постами ASC к чужим постам")
    void ascNotMe()throws InterruptedException{
        getDriver().navigate().to("https://test-stand.gb.ru/?sort=createdAt&order=ASC");
        Thread.sleep(2000);
        WebElement switchr = getDriver().findElement(By.xpath(".//div[@class=\"mdc-switch__icons\"]"));
        switchr.click();
        Thread.sleep(2000);
        Assertions.assertNotNull(getDriver().findElement(By.xpath(".//h2[contains(text(),\"жареные сосиски\")]")));
    }
    @Test
    @Order(4)
    @DisplayName("Проверка сортировки ASC и DESC чужих постов")
    void NotMeФысВуыс()throws InterruptedException{
        WebElement switchr = getDriver().findElement(By.xpath(".//div[@class=\"mdc-switch__icons\"]"));
        switchr.click();
        Thread.sleep(2000);
        WebElement button = getDriver().findElement(By.xpath(".//i[@class=\"material-icons rotate-180 mdc-icon-button__icon\"]"));
        button.click();
        Thread.sleep(2000);
        Assertions.assertNotNull(getDriver().findElement(By.xpath(".//h1[contains(text(),\"Blog\")]")));
    }


}
