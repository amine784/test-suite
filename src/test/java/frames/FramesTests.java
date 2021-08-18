package frames;

import base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class FramesTests extends BaseTests {
    @Test
    public void testWysiwyg(){
        var editorPage = homePage.clickWysiwygEditor();
        editorPage.clearTextArea();
        String textPutOne = "hello";
        String textPutTwo = "world";
        editorPage.setTextArea(textPutOne);
        editorPage.decreaseIndention();
        editorPage.setTextArea(textPutTwo);


        assertEquals(editorPage.getTextFromEditor(),textPutOne+textPutTwo,editorPage.getTextFromEditor());
    }
}
