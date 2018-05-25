package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Utils;


public class MainSearchPage {

    @FindBy(css = ".in1")
    private WebElement searchWord;

    @FindBy(xpath = "//input[@class='in3'][1]")
    private WebElement minPrice;

    @FindBy(xpath = "//input[@class='in3'][2]")
    private WebElement maxPrice;

    @FindBy(css = "select[name='sid']")
    private WebElement subHeading;

    @FindBy(css = "#s_region_select")
    private WebElement cityDistrict;

    @FindBy(css = "select[name='pr']")
    private WebElement searchPeriod;

    @FindBy(css = "select[name='sort']")
    private WebElement sortBy;

    @FindBy(css = "#sbtn")
    private WebElement btnSearch;

    public MainSearchPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void selectSubHeading(String text) {
        Utils.selectFromDropListByText(text, subHeading);
    }

    public void selectCityDistrict(String text) {
        Utils.selectFromDropListByText(text, cityDistrict);
    }

    public void selectSearchPeriod(String text) {
        Utils.selectFromDropListByText(text, searchPeriod);
    }

    public void selectSortType(String text) {
        Utils.selectFromDropListByText(text, sortBy);
    }

    public void setPhrase(String text) {
        searchWord.sendKeys(text);
    }

    public void setMinPrice (String price){
        minPrice.sendKeys(price);
    }

    public void setMaxPrice (String price){
        maxPrice.sendKeys(price);
    }

    public void clickSearchBtn(){
        btnSearch.click();
    }
}
