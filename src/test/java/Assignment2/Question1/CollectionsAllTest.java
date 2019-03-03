package Assignment2.Question1;

import Assignment2.Question1.CollectionsAll;
import org.junit.Assert;
import org.junit.Test;

public class CollectionsAllTest {

    @Test
    public void displaySize() {
        CollectionsAll c = new CollectionsAll();
        int result = c.displaySize(5,6);
        Assert.assertEquals(2,result);
    }

    @Test
    public void searchFor() {
        CollectionsAll c = new CollectionsAll();
        String result = c.searchFor("Hello","World");
        Assert.assertEquals("Hello",result);
    }

    @Test
    public void obtainVaule() {
        CollectionsAll c = new CollectionsAll();
        String result = c.obtainVaule("dean","february");
        Assert.assertEquals("dean",result);

    }
}