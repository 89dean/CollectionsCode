package Assignment2.Question2;

public class Ball implements ObjectsInterface,BallInterface {
    String colour;
    @Override
    public String setColour(String colour) {
        this.colour=colour;
        return colour;
    }
    @Override
    public String Bounce(String b) {
        return b;
    }


}
