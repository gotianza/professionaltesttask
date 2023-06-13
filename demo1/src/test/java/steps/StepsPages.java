package steps;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.page;


public class StepsPages {
    private static WebDriver driver;
    public static void checkPresentOfLogo() {
        assert(driver.findElement(page.logo)).isDisplayed();
    }
    public static void checkPresentOfTextArea() {
        assert(driver.findElement(page.textArea)).isDisplayed();
    }
    public static void insertAText(String text){
        WebElement inputArea = (WebElement) page.textArea;
        inputArea.sendKeys(text);
    }
}
