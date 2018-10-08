package tests;

import core.SetUp;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.DoodlePage;
import pages.MainPage;

import static data.SearchTestData.DOODLE_HEADER;
import static data.SearchTestData.SEARCH_PHASE;
import static org.assertj.core.api.Assertions.assertThat;

public class SearchTest extends SetUp {

    private MainPage mainPage;
    private DoodlePage doodlePage;

    @BeforeClass
    private void run() {
        mainPage = openMainPage();
    }

    @Test()
    private void shouldSendTextToSearchBox() {
        mainPage.searchByKeys(SEARCH_PHASE);
        mainPage.clearSearchInput(SEARCH_PHASE);
    }

    @Test(dependsOnMethods = "shouldSendTextToSearchBox")
    private void shouldGoToDoodlePage() {
        doodlePage = mainPage.goToDoodlePage();
        assertThat(doodlePage.getHeaderText()).isEqualTo(DOODLE_HEADER);
    }

}
