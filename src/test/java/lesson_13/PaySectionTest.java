package lesson_13;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;


public class PaySectionTest {
    static WebDriver driver;

    @BeforeAll
    static void init() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
        driver.get("http://mts.by");
        driver.findElement(By.cssSelector("div.cookie.show button.cookie__cancel")).click();
    }

    @AfterAll
    static void teardown() {
        driver.quit();
    }

    @Test
    void title() {
        System.out.print("Тест 1: ");
        try {
            String title = driver.findElement(By.cssSelector("section.pay h2")).getText().replaceAll("\n|\r\n", " ");
            Assertions.assertEquals(title, "Онлайн пополнение без комиссии", "Заголовок не соответствует");
            System.out.println("Заголовок соответствует");
        } catch (NoSuchElementException e) {
            System.err.println("Нет заголовка");
        }
    }

    @ParameterizedTest
    @ValueSource(strings = {"visa.svg", "visa-verified.svg", "mastercard.svg", "mastercard-secure.svg", "belkart.svg"})
    void payPics(String src) {
        System.out.print("Тест 2: ");
        try {
            Assertions.assertTrue(driver
                            .findElement(By.xpath("//section[@class='pay']//img[contains(@src, '" + src + "')]"))
                            .isDisplayed()
                    , "Картинка " + src + " не отображается");
            System.out.println("Картинка " + src + " отображается");
        } catch (NoSuchElementException e) {
            System.err.println("Картинка " + src + " не найдена");
        }
    }

    @Test
    void detailLink() {
        System.out.print("Тест 3: ");
        String urlLink = null;
        try {
            WebElement link = driver.findElement(By.xpath("//section[@class='pay']//a[contains(text(),'Подробнее о сервисе')]"));
            urlLink = link.getAttribute("href");
            URL url = new URL(urlLink);
            HttpURLConnection httpURLConnect = (HttpURLConnection) url.openConnection();
            httpURLConnect.setConnectTimeout(5000);
            httpURLConnect.connect();
            int linkResponseCode = httpURLConnect.getResponseCode();
            Assertions.assertTrue(linkResponseCode < 400, "Ссылка " + urlLink + " битая (код: " + linkResponseCode + ")");
            System.out.println("Ссылка " + urlLink + " рабочая (код: " + linkResponseCode + ")");
        } catch (NoSuchElementException e) {
            System.err.println("Нет ссылки");
        } catch (MalformedURLException e) {
            System.err.println("Не корректный url: " + urlLink);
        } catch (IOException e) {
            System.err.println("Проблема с соединением");
        }
    }

    @Test
    void payForm() {
        System.out.print("Тест 4: ");
        try {
            driver.findElement(By.cssSelector("#connection-phone")).sendKeys("297777777");
            driver.findElement(By.cssSelector("#connection-sum")).sendKeys("77");
            driver.findElement(By.cssSelector("section.pay button[type='submit']")).click();
            WebElement payFrame = driver.findElement(By.name("ya-frame-09188458"));
            driver.switchTo().frame(payFrame);
            String frameLink = payFrame.getAttribute("src");
            driver.switchTo().defaultContent();
            Assertions.assertEquals(frameLink, "https://checkout.bepaid.by/widget_v2/index.html", "Окно оплаты не открылось");
            System.out.println("Окно оплаты открылось");
        } catch (NoSuchElementException e) {
            System.err.println("Элемент не найден");
        }

    }
}
