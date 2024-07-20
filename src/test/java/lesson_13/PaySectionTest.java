package lesson_13;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

public class PaySectionTest {
    public static MtsHomePage mtsHomePage;
    public static WebDriver driver;
    public static String PAGE_URL = "http://mts.by";

    @BeforeAll
    static void before() {
        driver = new ChromeDriver();
        mtsHomePage = new MtsHomePage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(PAGE_URL);
        MtsHomePage.clickCookieCancelBtn();
    }

    @AfterAll
    static void after() {
        driver.quit();
    }

    @Test
    public void title() {
        System.out.print("Тест 1: ");
        try {
            assertEquals(MtsHomePage.getPaySectionTitle(), "Онлайн пополнение без комиссии", "Заголовок не соответствует");
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
            assertTrue(MtsHomePage.isDisplayedImg(src), "Картинка " + src + " не отображается");
//          assertTrue(driver
//                            .findElement(By.xpath("//section[@class='pay']//img[contains(@src, '" + src + "')]"))
//                            .isDisplayed()
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
            urlLink = MtsHomePage.getLinkUrl();
            int linkResponseCode = MtsHomePage.getRespCode(urlLink);
            assertTrue(linkResponseCode < 400, "Ссылка " + urlLink + " битая (код: " + linkResponseCode + ")");
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
            MtsHomePage.setPhoneField("297777777");
            MtsHomePage.setSumField("77");
            MtsHomePage.clickPayBtn();
            String frameLink = MtsHomePage.getFrameLink();
            assertEquals(frameLink, "https://checkout.bepaid.by/widget_v2/index.html", "Окно оплаты не открылось");
            System.out.println("Окно оплаты открылось");
        } catch (NoSuchElementException e) {
            System.err.println("Элемент не найден");
        }
    }
}
