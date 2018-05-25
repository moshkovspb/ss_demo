package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SelectedPage {

    @FindBy(css = "#head_line~tr>.msg2 .d1")
    public List<WebElement> rows;

    public SelectedPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

}
