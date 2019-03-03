package Assignment2.Qustion3;

import Assignment2.Question2.Ball;
import Assignment2.Question2.BallInterface;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Spring {

    @Bean(name = "hybrid")
    public BallInterface getService(){
        return new Ball();
    }
}
