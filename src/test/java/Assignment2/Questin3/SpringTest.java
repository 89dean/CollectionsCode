package Assignment2.Questin3;

import Assignment2.Question2.BallInterface;
import Assignment2.Qustion3.Spring;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringTest {

    @Test
    public void getService() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Spring.class);
        BallInterface ballInterface = (BallInterface) applicationContext.getBean("hybrid");


        String result = ballInterface.Bounce("Down");
        Assert.assertEquals("Down",result);
    }
}