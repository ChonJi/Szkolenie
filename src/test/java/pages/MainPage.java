package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static core.SetUp.browser;
import static core.SetUp.wait;
import static org.openqa.selenium.support.ui.ExpectedConditions.elementToBeClickable;

public class MainPage {

    @FindBy(id = "lst-ib")
    private WebElement element;

    @FindBy(xpath = "//input[@value='Szczęśliwy traf']")
    private WebElement luckyShot;

    public MainPage() {
        PageFactory.initElements(browser, this);
    }

    public void searchByKeys(final String text) {
        element.sendKeys(text);
    }

    public void clearSearchInput(String text) {
        for (int i = 1; i <= text.length(); i++) {
            element.sendKeys(Keys.BACK_SPACE);
        }
        element.sendKeys(Keys.ESCAPE);
    }

    public DoodlePage goToDoodlePage() {
        wait.until(elementToBeClickable(luckyShot)).click();
        wait.until(browser -> browser.getCurrentUrl().equals("https://www.google.com/doodles/"));
        return new DoodlePage();
    }

}
