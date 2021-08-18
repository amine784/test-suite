package alerts;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class AlertTests extends BaseTests {

    @Test
    public void testAcceptAlert(){
        var alertsPage = homePage.clickJavaScriptAlerts();
        alertsPage.setTriggerAlert();
        alertsPage.acceptAlert();


        assertEquals(alertsPage.getResult(),"You successfully clicked an alert",alertsPage.getResult());
    }

    @Test
    public void testGetTextFrmAlert(){
        var alertPage =  homePage.clickJavaScriptAlerts();
        alertPage.setTriggerConfirm();
        String text_response = alertPage.alert_getText_Alert_Confirm();
        alertPage.alert_clickToDismiss();


        assertEquals(text_response,"I am a JS Confirm",text_response);
    }

    @Test
    public void testSetInputAlert(){
        var alertPage = homePage.clickJavaScriptAlerts();
        alertPage.setTriggerPrompt();
        alertPage.alertSetInput("test automation prompt input");
        alertPage.alert_clickToAccept();

        assertEquals(alertPage.getResult(),"You entered: test automation prompt input",alertPage.getResult());
    }

}
