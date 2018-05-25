package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ComputerSearchPage {

    @FindBy(css = "input[name='topt[115][min]']")
    private WebElement minPrice;

    @FindBy(css = "input[name='topt[115][max]']")
    private WebElement maxPrice;

    @FindBy(css = "#sbtn")
    private WebElement btnSearch;

    public ComputerSearchPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public ComputerSearchPage setMinPrice(String price) {
        minPrice.sendKeys(price);
        return this;
    }

    public ComputerSearchPage setMaxPrice(String price) {
        maxPrice.sendKeys(price);
        return this;
    }

    public ComputerSearchPage clickSearchBtn() {
        btnSearch.click();
        return this;
    }
}
