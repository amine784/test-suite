package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertPage {
    private WebDriver driver;
    private By triggerAlertButton   =  By.xpath(".//button[text()='Click for JS Alert']");
    private By triggerConfirmButton =  By.xpath(".//button[text()='Click for JS Confirm']");
    private By triggerPromptButton  =  By.xpath(".//button[text()='Click for JS Prompt']");

    private By result = By.id("result");

    public AlertPage(WebDriver driver) {
        this.driver = driver;
    }



    public void  setTriggerAlert(){
        driver.findElement(triggerAlertButton).click();
    }

    public void  setTriggerConfirm(){
        driver.findElement(triggerConfirmButton).click();
    }
    public void  setTriggerPrompt(){
        driver.findElement(triggerPromptButton).click();
    }



    public void  acceptAlert(){
        driver.switchTo().alert().accept();
    }
    public String getResult(){
        return (driver.findElement(result).getText());
    }


    public void alert_clickToAccept(){
        driver.switchTo().alert().accept();
    }
    public void alert_clickToDismiss(){
        driver.switchTo().alert().dismiss();
    }
    public String alert_getText_Alert_Confirm(){
        return (driver.switchTo().alert().getText());
    }


    public void alertSetInput(String text){
        driver.switchTo().alert().sendKeys(text);
    }

}
