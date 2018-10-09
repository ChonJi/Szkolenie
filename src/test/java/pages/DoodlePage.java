package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DoodlePage extends Page {

    @FindBy(className = "s20header")
    private WebElement header;

    public void waitForPageToLoad() {
        wait.until(browser -> browser.getCurrentUrl().equals("https://www.google.com/doodles"));
    }

    public String getHeaderText() {
        return header.getText();
    }

}
