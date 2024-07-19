package lesson_13;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;


public class PaySectionTest {
    static WebDriver driver;
    public static String PAGE_URL = "http://mts.by";
    private final By paySectionTitle = By.cssSelector("section.pay h2");
    private static final By cookieCancelBtn = By.cssSelector("div.cookie.show button.cookie__cancel");
    private final By link = By.xpath("//section[@class='pay']//a[contains(text(),'Подробнее о сервисе')]");
    private final By phoneField = By.cssSelector("#connection-phone");
    private final By sumField = By.cssSelector("#connection-sum");
    private static final By payBtn = By.cssSelector("section.pay button[type='submit']");
    private static final By payFrame = By.cssSelector("iframe.bepaid-iframe");

    public static void clickCookieCancelBtn() throws NoSuchElementException {
        driver.findElement(cookieCancelBtn).click();
    }

    public String getPaySectionTitle() throws NoSuchElementException {
        return driver.findElement(paySectionTitle).getText().replaceAll("\n|\r\n", " ");
    }

    public String getLinkUrl() throws NoSuchElementException {
        return driver.findElement(link).getAttribute("href");
    }

    public int getResCode(String urlLink) throws MalformedURLException, IOException {
        URL url = new URL(urlLink);
        HttpURLConnection httpURLConnect = (HttpURLConnection) url.openConnection();
        httpURLConnect.setConnectTimeout(5000);
        httpURLConnect.connect();
        return httpURLConnect.getResponseCode();
    }

    public void setPhoneField(String phoneNumber) throws NoSuchElementException {
        driver.findElement(phoneField).sendKeys(phoneNumber);
    }

    private void setSumField(String sum) throws NoSuchElementException {
        driver.findElement(sumField).sendKeys(sum);
    }

    public static void clickPayBtn() throws NoSuchElementException {
        driver.findElement(payBtn).click();
    }

    public String getFrameLink() throws NoSuchElementException {
        return driver.findElement(payFrame).getAttribute("src");
    }

    @BeforeAll
    static void init() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
        driver.get(PAGE_URL);
        clickCookieCancelBtn();
    }

    @AfterAll
    static void tearDown() {
        driver.quit();
    }

    @Test
    void title() {
        System.out.print("Тест 1: ");
        try {
            assertEquals(getPaySectionTitle(), "Онлайн пополнение без комиссии", "Заголовок не соответствует");
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
            assertTrue(driver
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
            urlLink = getLinkUrl();
            int linkResponseCode = getResCode(urlLink);
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
            setPhoneField("297777777");
            setSumField("77");
            clickPayBtn();
            String frameLink = getFrameLink();
            assertEquals(frameLink, "https://checkout.bepaid.by/widget_v2/index.html", "Окно оплаты не открылось");
            System.out.println("Окно оплаты открылось");
        } catch (NoSuchElementException e) {
            System.err.println("Элемент не найден");
        }
    }
}
