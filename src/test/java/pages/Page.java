package pages;

import org.openqa.selenium.support.PageFactory;

import static core.SetUp.browser;

public abstract class Page {

    Page() {
        PageFactory.initElements(browser, this);
    }

}
