package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static core.SetUp.browser;
import static core.SetUp.wait;

public class DoodlePage {

    @FindBy(className = "s20header")
    private WebElement header;

    public DoodlePage() {
        PageFactory.initElements(browser, this);
    }

    public void waitForPageToLoad() {
        wait.until(browser -> browser.getCurrentUrl().equals("https://www.google.com/doodles"));
    }

    public String getHeaderText() {
        return header.getText();
    }

}
