package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Utils;

import java.util.List;

public class MainPage {

    @FindBy(css = "div.main_head2 a.a1")
    private List<WebElement> menuHeaders;

    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void selectHeader(String header) {
        Utils.selectFromListByText(header, menuHeaders);
    }

}
