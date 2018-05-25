package utils;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Utils {
    public static void selectFromDropListByText(String text, WebElement element) {
        new Select(element).selectByVisibleText(text);
    }

    public static void selectFromListByText(String text, List<WebElement> elements) {
            for (WebElement option: elements){
                if (option.getText().equals(text)) {
                    option.click();
                    break;
                }
            }
        }

    public static void waitFor(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
