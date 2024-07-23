package lesson_14;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PayFrameTest {
    public static WebDriver driver;
    public static MtsHomePage mtsHomePage;
    public static PayFrame payFrame;
    public static final String PAGE_URL = "https://mts.by";
    public static final String TEST_PHONE_NUMBER = "297777777";
    public static final String TEST_SUM = "77.77";

    @BeforeAll
    static void before() {
        driver = new ChromeDriver();
        mtsHomePage = new MtsHomePage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get(PAGE_URL);
        mtsHomePage.clickCookieCancelBtn();
        mtsHomePage.setConnectionPhone(TEST_PHONE_NUMBER);
        mtsHomePage.setСonnectionSum(TEST_SUM);
        mtsHomePage.clickPayBtn();
        payFrame = new PayFrame(driver, mtsHomePage.payFrame);
    }
    @AfterAll
    static void after() {
        driver.quit();
    }
    @Test
    void descriptionCost() {
        String name = "Текст описания суммы в заголовке";
        try {
            String actualValue = payFrame.getPayFrameDescriptionCost();
            assertEquals(TEST_SUM + " BYN", actualValue, name + " не совпадает");
            System.out.println(name + " совпадает: " + payFrame.getPayFrameDescriptionCost());
        } catch (NoSuchElementException e) {
            assertTrue(false, name + " не найден");
        }
    }
    @Test
    void btnText() {
        String name = "Текст кнопки";
        try {
            String actualValue = payFrame.getPayFrameBtnText();
            assertEquals("Оплатить " + TEST_SUM + " BYN", actualValue, name + " не совпадает");
            System.out.println(name + " совпадает: " + actualValue);
        } catch (NoSuchElementException e) {
            assertTrue(false, name + " не найден");
        }
    }
    @Test
    void descriptionPhone() {
        String name = "Номер телефона в заголовке";
        try {
            String actualValue = payFrame.getPayFrameDescriptionPhone();
            assertEquals("Оплата: Услуги связи Номер:375" + TEST_PHONE_NUMBER, actualValue, name + " не совпадает");
            System.out.println(name + " совпадает: " + actualValue);
        } catch (NoSuchElementException e) {
            assertTrue(false, name + " не найден");
        }
    }

    @ParameterizedTest
    @ValueSource(strings = {"mastercard-system.svg", "visa-system.svg", "belkart-system.svg", "mir-system-ru.svg", "maestro-system.svg"})
    void payPics(String src) {
        try {
            assertTrue(payFrame.isDisplayedImg(src), "Картинка " + src + " не отображается");
            System.out.println("Картинка " + src + " отображается");
        } catch (NoSuchElementException e) {
            assertTrue(false, "Картинка " + src + " не найдена");
        }
    }

    @ParameterizedTest
    @CsvSource({
            "Плейсхолдер поля ввода номера карты, Номер карты",
            "Плейсхолдер поля ввода срока действия карты, Срок действия",
            "Плейсхолдер поля ввода CVC, CVC",
            "Плейсхолдер поля ввода имени держателя, Имя держателя (как на карте)"})
    void checkPlaceholders(String name, String expectedPlaceholder) {
        try {
            String actualPlaceholder = "";
            switch (name) {
                case ("Плейсхолдер поля ввода номера карты"):
                    actualPlaceholder = payFrame.getCreditCardPlaceholder();
                    break;
                case ("Плейсхолдер поля ввода срока действия карты"):
                    actualPlaceholder = payFrame.getExpirationDatePlaceholder();
                    break;
                case ("Плейсхолдер поля ввода CVC"):
                    actualPlaceholder = payFrame.getCvcPlaceholder();
                    break;
                case ("Плейсхолдер поля ввода имени держателя"):
                    actualPlaceholder = payFrame.getCardHolderPlaceholder();
                    break;
            }
            assertEquals(expectedPlaceholder, actualPlaceholder, name + " не совпадает");
            System.out.println(name + " совпадает: " + actualPlaceholder);
        } catch (NoSuchElementException e) {
            assertTrue(false, name + " не найден");
        }
    }
}
