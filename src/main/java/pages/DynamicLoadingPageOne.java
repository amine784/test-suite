package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DynamicLoadingPageOne {

    private WebDriver driver;
    private By startButton =  By.cssSelector("#start button");
    /*private By startButton =  By.cssSelector("#start button");*/
    private By loadingIndicator = By.id("loading");
    private By loadedText =  By.id("finish");

    public DynamicLoadingPageOne(WebDriver driver) {
        this.driver = driver;
    }


    public  void clickStartButton() {
        driver.findElement(startButton).click();
        WebDriverWait waiting = new WebDriverWait(driver, 5);
        waiting.until(ExpectedConditions.invisibilityOf(
                driver.findElement(loadingIndicator)));
    }


    public String getLoadedTextFromPage(){
        return(driver.findElement(loadedText).getText());
    }

}
