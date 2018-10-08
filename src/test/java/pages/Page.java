package pages;

import org.openqa.selenium.support.PageFactory;

import static core.SetUp.browser;

abstract class Page {

    protected Page() {
        PageFactory.initElements(browser, this);
    }

}
