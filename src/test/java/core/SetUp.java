package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages.MainPage;

import java.io.IOException;

import static org.assertj.core.api.Assertions.assertThat;

public class SetUp {

    private static final int SECONDS = 30;
    public static WebDriver browser;
    public static WebDriverWait wait;

    @BeforeSuite
    public void setUp() throws IOException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        browser = new ChromeDriver();
        wait = new WebDriverWait(browser, SECONDS);
    }

    public MainPage openMainPage() {
        browser.get("https://www.google.com");
        browser.manage().window().maximize();
        assertThat(browser.getCurrentUrl()).isEqualTo("https://www.google.com/");
        return new MainPage();
    }

    @AfterSuite
    public void quit() {
        browser.quit();
    }


}
