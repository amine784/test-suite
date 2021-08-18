package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DynamicLoadingPage {

    private WebDriver driver;
    private By link_ExampleOne = By.xpath(".//a[contains(text(),'Example 1')]");

    public DynamicLoadingPage(WebDriver driver) {
        this.driver = driver;
    }

    public DynamicLoadingPageOne clickExampleOne(){
        driver.findElement(link_ExampleOne).click();
        return (new DynamicLoadingPageOne(driver));
    }

}
