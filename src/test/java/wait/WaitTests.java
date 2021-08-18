package wait;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class WaitTests extends BaseTests {

    @Test
    public void testWaitUntilHidden(){
        var lodingPage=  homePage.clickDynamicLoading().clickExampleOne();
        lodingPage.clickStartButton();

        assertEquals(lodingPage.getLoadedTextFromPage(),"Hello World!",lodingPage.getLoadedTextFromPage());
    }
}
