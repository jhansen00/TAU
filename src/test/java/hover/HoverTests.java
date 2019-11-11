package hover;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.HoversPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class HoverTests extends BaseTest {

    @Test
    public void testHoverUser1(){
        HoversPage hoverspage = homepage.clickHovers();
        HoversPage.FigureCaption caption = hoverspage.hoverOverFigure(1);
        assertTrue(caption.isCaptionDisblayed(), "Caption not displayed");
        assertEquals(caption.getTitle(), "name: user1", "Caption title incorrect");
        assertEquals(caption.getLinkText(), "View profile", "Caption link text incorrect");
        assertTrue(caption.getLink().endsWith("/users/1"), "Link incorrect");
    }
}
