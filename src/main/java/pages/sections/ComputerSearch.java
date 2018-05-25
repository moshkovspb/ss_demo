package pages.sections;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Utils;

import java.util.List;

public class ComputerSearch {

    @FindBy(css = "#f_o_8_min")
    private WebElement minPrice;
    @FindBy(css = "#f_o_8_max")
    private WebElement maxPrice;
    @FindBy(css = "#f_o_116")
    private WebElement processor;
    @FindBy(css = "#f_o_115_min")
    private WebElement minGhz;
    @FindBy(css = "#f_o_115_min")
    private WebElement maxGhz;
    @FindBy(css = "#f_o_12_min")
    private WebElement minRAM;
    @FindBy(css = "#f_o_12_max")
    private WebElement maxRAM;
    @FindBy(css = "#f_o_13_min")
    private WebElement minHDD;
    @FindBy(css = "#f_o_13_max")
    private WebElement maxHDD;
    @FindBy(css = "#f_o_352")
    private WebElement condition;
    @FindBy(css = "input[type='submit']")
    private WebElement btnSearch;
    @FindBy(css = "select[name='sid']")
    private WebElement dealType;
    @FindBy(css = ".a18")
    private List<WebElement> sortTable;

    public ComputerSearch(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public ComputerSearch setMinPrice(String price) {
        minPrice.sendKeys(price);
        return this;
    }

    public ComputerSearch setMaxPrice(String price) {
        maxPrice.sendKeys(price);
        return this;
    }

    public ComputerSearch setProcessor(String value) {
        processor.sendKeys(value);
        return this;
    }

    public ComputerSearch setMinGhz(String ghz) {
        minGhz.sendKeys(ghz);
        return this;
    }

    public ComputerSearch setMaxGhz(String ghz) {
        maxGhz.sendKeys(ghz);
        return this;
    }

    public ComputerSearch setMinRAM(String ram) {
        minRAM.sendKeys(ram);
        return this;
    }

    public ComputerSearch setMaxRAM(String ram) {
        maxRAM.sendKeys(ram);
        return this;
    }

    public ComputerSearch setMinHDD(String hdd) {
        minHDD.sendKeys(hdd);
        return this;
    }

    public ComputerSearch setMaxHDD(String hdd) {
        maxHDD.sendKeys(hdd);
        return this;
    }

    public ComputerSearch selectCondition(String cond) {
        Utils.selectFromDropListByText(cond, condition);
        return this;
    }

    public ComputerSearch selectDealType(String type) {
        Utils.selectFromDropListByText(type, dealType);
        return this;
    }

    public void clickSearchBtn() {
        btnSearch.click();
    }

    public void sort(String header) {
        sortTable.stream().filter(h -> header.equals(h.getText())).findFirst().get().click();
    }
}
