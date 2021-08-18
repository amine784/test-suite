package hover;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertEquals;

public class HoverTests extends BaseTests {
    @Test
    public void testHoverUserOne(){
        var hoversPage = homePage.clickHovers();
        var caption = hoversPage.hoverOverFigure(1);

        assertTrue(caption.isCaptionDisplayed(),"caption not displayed");
        assertEquals(caption.getTitle(), "name: user1", caption.getTitle());
        assertEquals(caption.getLinkText(), "View profile",caption.getLinkText());

        assertTrue(caption.getLink().endsWith("/users/1"),"Link error");
    }
}
