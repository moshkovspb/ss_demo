package pages.sections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Utils;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static utils.TargetProperties.getTestProperty;

public class Header {

    @FindBy(css = "b.menu_main a")
    private List<WebElement> headerMenu;

    @FindBy(css = "span.menu_lang")
    private WebElement language;

    public Header(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void selectRUlang() {
        assertEquals(getTestProperty("ru.language"), language.getText(), "Language for selection is not RU");
        language.click();
    }

    public void selectHeaderItem(String item) {
        Utils.selectFromListByText(item, headerMenu);
    }
}
