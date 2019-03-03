package Assignment2.Question2;

import org.junit.Assert;
import org.junit.Test;

public class ObjectsTest {

    @Test
    public void setColour() {
        Objects o = new Objects();
        String result = o.setColour("Green");
        Assert.assertEquals("Green",result);
    }
}