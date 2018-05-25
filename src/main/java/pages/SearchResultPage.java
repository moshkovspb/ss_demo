package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Utils;

import java.util.*;

import static org.testng.Assert.assertTrue;

public class SearchResultPage {

    @FindBy(css = "input[name=\'mid[]\']")
    private List<WebElement> adsCheckboxes;

    @FindBy(css = "#a_fav_sel")
    private WebElement addToBookmarks;

    @FindBy(css = "#head_line~tr>.msg2 .d1")
    private List<WebElement> rows;

    @FindBy(css = "#alert_ok")
    private WebElement okButton;

    @FindBy(css = "#show_selected_a")
    private WebElement selectedButton;

    public Set<String> selectedItems = new HashSet<>();

    public SearchResultPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public SearchResultPage randomSelect(int count) {
        Random random = new Random();
        int adSize = adsCheckboxes.size();
        assertTrue(adSize >= count, String.format("Result ads list < %s", count));
        for (int i = 0; i < count; i++) {
            int num = random.nextInt(adSize - 1);
            adsCheckboxes.get(num).click();
            selectedItems.add(rows.get(num).getText());
        }
        return this;
    }

    public SearchResultPage addToBookmarks() {
        addToBookmarks.click();
        Utils.waitFor(1000);
        okButton.click();
        return this;
    }

    public void showSelected() {
        selectedButton.click();
    }

}
