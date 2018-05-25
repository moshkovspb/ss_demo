package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Utils;

import java.util.List;

public class CategoryPage {

    @FindBy(css = ".category a")
    private List<WebElement> subCategories;

    public CategoryPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void selectSubCategoryByText (String text){
        Utils.selectFromListByText(text, subCategories);
    }
}
