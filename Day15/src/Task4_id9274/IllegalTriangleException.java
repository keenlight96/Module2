package Task4_id9274;

public class IllegalTriangleException extends Exception{
    @Override
    public String getMessage() {
        return "Not 3 sides of a triangle";
    }
}
