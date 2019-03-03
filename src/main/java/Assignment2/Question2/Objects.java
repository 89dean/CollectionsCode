package Assignment2.Question2;

public class Objects implements ObjectsInterface {
    String colour;
    @Override
    public String setColour(String colour) {
        this.colour=colour;
        return colour;
    }
}
