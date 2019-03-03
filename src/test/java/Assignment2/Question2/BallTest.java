package Assignment2.Question2;

import org.junit.Assert;
import org.junit.Test;

public class BallTest {

    @Test
    public void setColour() {
        Ball b = new Ball();
        String result = b.setColour("Red");
        Assert.assertEquals("Red",result);
    }

    @Test
    public void bounce() {
        Ball b = new Ball();
        String result = b.Bounce("Up");
        Assert.assertEquals("Up",result);
    }

}