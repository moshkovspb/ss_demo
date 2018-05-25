import base.TestBase;
import enums.*;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.*;
import pages.sections.ComputerSearch;
import pages.sections.Header;

import static utils.TargetProperties.getTestProperty;

public class DemoTest extends TestBase {

    private MainPage mainPage;
    private MainSearchPage mainSearchPage;
    private Header header;
    private CategoryPage categoryPage;
    private ComputerSearch computerSearch;
    private ComputerSearchPage computerSearchPage;
    private SearchResultPage searchResultPage;
    private SelectedPage selectedPage;

    @BeforeClass
    public void setUpPages() {
        mainPage = new MainPage(driver);
        mainSearchPage = new MainSearchPage(driver);
        header = new Header(driver);
        categoryPage = new CategoryPage(driver);
        computerSearch = new ComputerSearch(driver);
        computerSearchPage = new ComputerSearchPage(driver);
        searchResultPage = new SearchResultPage(driver);
        selectedPage = new SelectedPage(driver);
    }

    @Test
    public void demoTest() {
        SoftAssert sa = new SoftAssert();
        sa.assertEquals(getTestProperty("url"), driver.getCurrentUrl(),
                String.format("The %s page is not opened", getTestProperty("url")));
        header.selectRUlang();
        mainPage.selectHeader(MenuHeaders.ELECTRONICS.text);
        categoryPage.selectSubCategoryByText(Electronics.PC.text);
        computerSearch.setMinPrice("20")
                .setMaxPrice("2000")
                .setProcessor("Intel")
                .setMinGhz("0")
                .setMaxGhz("6000")
                .setMinRAM("1")
                .setMaxRAM("64")
                .setMinHDD("0")
                .setMaxHDD("3000")
                .selectCondition(Condition.USED.text)
                .selectDealType(DealType.SELL.text)
                .clickSearchBtn();
        computerSearch.sort(SortBy.PRICE.text);
        header.selectHeaderItem(HeaderMenu.SEARCH.text);
        computerSearchPage.setMinPrice("0").setMaxPrice("300").clickSearchBtn();
        searchResultPage.randomSelect(3).addToBookmarks().showSelected();
        searchResultPage.selectedItems.forEach(i -> {
            sa.assertTrue(selectedPage.rows.contains(i), String.format("Selected list do not contains [%s]", i));
        });
    }
}
