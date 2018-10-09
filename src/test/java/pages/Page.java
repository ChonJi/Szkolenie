package pages;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import static core.SetUp.browser;

abstract class Page {

    WebDriverWait wait;

    protected Page() {
        PageFactory.initElements(browser, this);
        wait = new WebDriverWait(browser, 30);
    }

}
