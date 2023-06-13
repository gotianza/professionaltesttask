package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import steps.StepsPages;

public class BaseTest {
    private WebDriver driver;


    public void setup() {
        System.setProperty("webdriver.chrome.driver", "/Users/santiago.ferreira/IdeaProjects/demo1/src/test/resources/chromedriver"); /*path that I use to execute the chromedriver*/
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.com/search?q=1");
        StepsPages.checkPresentOfLogo();
        StepsPages.checkPresentOfTextArea();
        StepsPages.insertAText("Text to enter");

        /* Last step I did not understand*/
    }
    public static void main(String args[]){
        BaseTest test = new BaseTest();
        test.setup();
    }

}
